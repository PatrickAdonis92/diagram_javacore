
/**
 * CongTy.java
 * 22-05-2024
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class CongTy {

	// 1. Attributes
	private String tenCongTy;
	private String maSoThue;
	private float doanhThuThang;
	private DanhSachNhanSu objDanhSach;

	// 2. Getter - Setter
	/**
	 * @return the tenCongTy
	 */
	public String getTenCongTy() {
		return tenCongTy;
	}

	/**
	 * @param tenCongTy the tenCongTy to set
	 */
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	/**
	 * @return the maSoThue
	 */
	public String getMaSoThue() {
		return maSoThue;
	}

	/**
	 * @param maSoThue the maSoThue to set
	 */
	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	/**
	 * @return the doanhThuThang
	 */
	public float getDoanhThuThang() {
		return doanhThuThang;
	}

	/**
	 * @param doanhThuThang the doanhThuThang to set
	 */
	public void setDoanhThuThang(float doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	/**
	 * @return the objDanhSach
	 */
	public DanhSachNhanSu getObjDanhSach() {
		return objDanhSach;
	}

	/**
	 * @param objDanhSach the objDanhSach to set
	 */
	public void setObjDanhSach(DanhSachNhanSu objDanhSach) {
		this.objDanhSach = objDanhSach;
	}

	// 3. Constructor
	/**
	 * Constructor không tham số.
	 */
	public CongTy() {
		objDanhSach = new DanhSachNhanSu();
	}

	// 4. Input - Output method
	public void nhap(Scanner scan) {
		System.out.println("Tên công ty: ");
		this.tenCongTy = scan.nextLine();

		System.out.println("Mã số thuế: ");
		this.maSoThue = scan.nextLine();

		System.out.println("Doanh thu tháng: ");
		this.doanhThuThang = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("<============== THÔNG TIN CÔNG TY ===============>");
		System.out.println("Công Ty: " + this.tenCongTy);
		System.out.println("Mã Số Thuế: " + this.maSoThue);
		System.out.println("Doanh thu: " + this.doanhThuThang);
		System.out.println("<============== DANH SÁCH NHÂN SỰ ===============>");
		this.objDanhSach.xuat();
	}

	public void dummyDataCty() {
		this.tenCongTy = "CyberSoft-CyberLearn";
		this.maSoThue = "01292332";
		this.doanhThuThang = 435334f;
	}

	public void dummyDataNhanSu() {
		NhanSu ns = new NhanSu();
		ns = new TruongPhong("13", "TP Bổ sung 1", "098233", 24);
		objDanhSach.themNhanSu(ns);
		ns = new TruongPhong("14", "TP Bổ sung 2", "091833", 21);
		objDanhSach.themNhanSu(ns);
		ns = new NhanVienThuong("1", "Lan", "09832", 20);
		objDanhSach.themNhanSu(ns);
		ns = new NhanVienThuong("2", "Hưng", "098232", 23);
		objDanhSach.themNhanSu(ns);
		ns = new NhanVienThuong("3", "Việt", "098132", 31);
		objDanhSach.themNhanSu(ns);
		ns = new NhanVienThuong("4", "An", "091832", 25);
		objDanhSach.themNhanSu(ns);
		ns = new NhanVienThuong("5", "Tuyết", "098432", 23);
		objDanhSach.themNhanSu(ns);
		ns = new NhanVienThuong("6", "Mỹ", "092832", 31);
		objDanhSach.themNhanSu(ns);

		ns = new TruongPhong("8", "TP Mai", "098233", 24);
		objDanhSach.themNhanSu(ns);
		ns = new TruongPhong("9", "TP Luân", "091833", 21);
		objDanhSach.themNhanSu(ns);
		ns = new TruongPhong("10", "TP Kiệt", "091833", 23);
		objDanhSach.themNhanSu(ns);

		ns = new GiamDoc("11", "GD Tiên", "0981", 19, 10);
		objDanhSach.themNhanSu(ns);
		ns = new GiamDoc("12", "GD Huệ", "09181", 21, 15);
		objDanhSach.themNhanSu(ns);
		ns = new GiamDoc("15", "GD Hoàn", "0991", 19, 20);
		objDanhSach.themNhanSu(ns);
		ns = new GiamDoc("16", "GD Hải", "091812", 21, 15);
		objDanhSach.themNhanSu(ns);
		ns = new GiamDoc("17", "GD Liên", "09813", 19, 20);
		objDanhSach.themNhanSu(ns);
		ns = new GiamDoc("18", "GD Huyền", "091818", 21, 20);
		objDanhSach.themNhanSu(ns);

		ns = new NhanVienThuong("19", "Thơm", "0928329", 30);
		objDanhSach.themNhanSu(ns);
		ns = new NhanVienThuong("20", "Thuận", "0928532", 31);
		objDanhSach.themNhanSu(ns);
		ns = new NhanVienThuong("21", "Long", "0921832", 31);
		objDanhSach.themNhanSu(ns);
		ns = new NhanVienThuong("6", "Nhàn", "0928832", 31);
		objDanhSach.themNhanSu(ns);
	}

	// 5. Business method
	public void tinhLuong() {
		this.objDanhSach.tinhLuong();
	}

	/**
	 * Phân bổ nhân viên về phòng ban, hay có nghĩa là chỉ định trưởng phòng cho
	 * nhân viên thường.
	 * <p>
	 * Bước 1: Duyệt danh sách và kiểm tra nếu là NhanVienThuong
	 * <p>
	 * Bước 2: Show danh sách trưởng phòng (Tên và mã)
	 * <p>
	 * Bước 3: Có muốn phân bổ hay không. Chon "Y" để phân bổ, chọn "N" để đi tiếp.
	 * <p>
	 * Bước 4: Nếu "N" đi tiếp đến nhân viên tiếp theo.
	 * <p>
	 * Bước 5: Nếu "Y", Yêu cầu nhập mã trưởng phòng đã liệt kê ở bước 2.
	 * <p>
	 * Bước 6: Kiểm tra mã đã nhập ở bước 5 có nằm trong danh sách liệt kê ở bước 2
	 * hay không.
	 * <p>
	 * Bước 7: Nếu có: lấy trưởng phòng với mã đã chọn ở Bước 5 => Lấy ra Object
	 * trưởng phòng.
	 * <p>
	 * Bước 8: Gán trưởng phòng ở Bước 7 cho Trưởng phòng của Nhân Viên đang duyệt.
	 * <p>
	 * Bước 9: Nếu không, lặp lại bước 5.
	 */
	/**
	 * Phương thức liệt kê mã nhân viên và tên trưởng phòng.
	 */
	/**
	 * Phương thức liệt kê danh sách các trưởng phòng.
	 * 
	 * @param list
	 */
	private void lietKeDSTruongPhong(ArrayList<TruongPhong> list) {
		System.out.println("<=============== Danh Sách Trưởng Phòng ===============>");
		for (NhanSu ns : list) {
			ns.xuatMaVaTen();
		}
	}

	/**
	 * Phương thức tìm kiếm một trưởng phòng.
	 * 
	 * @param maTP
	 * @return
	 */
	private TruongPhong timTruongPhongTheoMa(String maTP) {
		TruongPhong truongPhong = null;
		for (NhanSu ns : this.objDanhSach.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				if (ns.getMaSo().equalsIgnoreCase(maTP)) {
					truongPhong = (TruongPhong) ns;
				}
			}
		}
		return truongPhong;
	}

	/**
	 * Phương thức lấy ra danh sách các trưởng phòng.
	 * 
	 * @return
	 */
	private ArrayList<TruongPhong> getListTP() {
		ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
		for (NhanSu ns : this.objDanhSach.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				list.add((TruongPhong) ns);
			}
		}
		return list;
	}

	/**
	 * Phương thức phân bổ nhân viên thường về các phòng ban.
	 * 
	 * @param scan
	 */
	public void phanBoNhanVienThuong(Scanner scan) {
		for (NhanSu ns : this.objDanhSach.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				System.out.println("Đang phân bổ cho nhân viên:");
				ns.xuatMaVaTen();
				phanBoMotNhanSu(scan, ns);
			}
		}
	}

	/**
	 * Phương thức phân bổ một nhân sự
	 * 
	 * @param scan
	 * @param ns
	 */
	private void phanBoMotNhanSu(Scanner scan, NhanSu ns) {
		boolean flag = true;
		ArrayList<TruongPhong> list = getListTP();
		lietKeDSTruongPhong(list);
		do {
			System.out.println("Chọn Yes để phân bổ, No để đi tiếp");
			String chose = scan.nextLine();
			if (chose.equalsIgnoreCase("Yes") || chose.equalsIgnoreCase("No")) {
				if (chose.equalsIgnoreCase("Yes")) {
					TruongPhong truongPhong = chonTruongPhong(scan);
					((NhanVienThuong) ns).setTruongPhong(truongPhong);
					truongPhong.tangNhanVien();
				}
				flag = false;
			} else {
				System.out.println("Chỉ nhập Yes hoặc No.");
				flag = true;
			}
		} while (flag);
	}

	/**
	 * Phương thức chọn trưởng phòng theo mã trưởng phòng
	 * 
	 * @param scan
	 * @return
	 */
	private TruongPhong chonTruongPhong(Scanner scan) {
		TruongPhong truongPhong = null;
		do {
			System.out.println("Vui lòng nhập mã Trưởng phòng đã liệt kê ở trên:");
			String maTP = scan.nextLine();
			truongPhong = timTruongPhongTheoMa(maTP);
		} while (truongPhong == null);
		return truongPhong;
	}

	/**
	 * Phương thức thêm nhân sự vào danh sách.
	 * 
	 * @param scan
	 */
	public void addNhanSu(Scanner scan) {
		ArrayList<NhanSu> listMember = this.objDanhSach.nhap(scan);
		if (listMember.size() != 0) {
			for (NhanSu ns : listMember) {
				phanBoMotNhanSu(scan, ns);
			}
		}
	}

	/**
	 * Phương thức xóa một nhân sự khỏi danh sách.
	 * 
	 * @param scan
	 * @return
	 */
	public boolean xoaNhanSu(Scanner scan) {
		boolean deleted = false;
		System.out.println("Nhập vào mã nhân sự cần xóa: ");
		String ma = scan.nextLine();
		NhanSu ns = timNhanSuTheoMa(ma);
		if (ns != null) {
			if (ns instanceof TruongPhong) {
				deleted = xoaTruongPhong((TruongPhong) ns);
			} else if (ns instanceof NhanVienThuong) {
				deleted = xoaNhanVienThuong((NhanVienThuong) ns);
			} else {
				this.objDanhSach.getListNhanSu().remove(ns);
				deleted = true;
			}
		} else {
			System.out.println("Mã vừa nhập không có trong danh sách.");
		}
		return deleted;
	}

	/**
	 * Phương thức tìm nhân sự theo mã.
	 * 
	 * @param ma
	 * @return
	 */
	private NhanSu timNhanSuTheoMa(String ma) {
		NhanSu nhanSu = null;
		for (NhanSu ns : this.objDanhSach.getListNhanSu()) {
			if (ns.getMaSo().equalsIgnoreCase(ma)) {
				nhanSu = ns;
				break;
			}
		}
		return nhanSu;
	}

	/**
	 * Phương thức xóa một trưởng phòng ra khỏi danh sách.
	 * 
	 * @param tp
	 * @return
	 */
	private boolean xoaTruongPhong(TruongPhong tp) {
		boolean deleted = false;
		for (NhanSu ns : this.objDanhSach.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				TruongPhong tpNhanVien = ((NhanVienThuong) ns).getTruongPhong();
				if (tpNhanVien != null) {
					if (tp.getMaSo().equalsIgnoreCase(tpNhanVien.getMaSo())) {
						((NhanVienThuong) ns).setTruongPhong(null);
					}
				}
			}
		}
		this.objDanhSach.getListNhanSu().remove(tp);
		deleted = true;
		return deleted;
	}

	/**
	 * Phương thức xóa một nhân viên thường khỏi danh sách.
	 * 
	 * @param nvt
	 * @return
	 */
	private boolean xoaNhanVienThuong(NhanVienThuong nvt) {
		boolean deleted = false;
		TruongPhong tp = nvt.getTruongPhong();
		if (tp != null) {
			tp.giamNhanVien();
		}
		this.objDanhSach.getListNhanSu().remove(nvt);
		deleted = true;
		return deleted;
	}

	/**
	 * Phương thức liệt kê danh sách nhân viên thường có lương cao nhất.
	 * 
	 * @return list - danh sách các nhân viên thường.
	 */
	public ArrayList<NhanVienThuong> listNhanVienThuongLuongMax() {
		ArrayList<NhanVienThuong> listMax = new ArrayList<NhanVienThuong>();
		NhanVienThuong nvt = null;
		int indexMax = 0;
		for (NhanSu ns : this.objDanhSach.getListNhanSu()) {
			// Tìm ra vị trí nhân viên thường đầu tiên.
			indexMax++;
			if (ns instanceof NhanVienThuong) {
				nvt = (NhanVienThuong) ns;
				break;
			}
		}
		if (nvt != null) {
			for (int i = indexMax - 1; i < this.objDanhSach.getListNhanSu().size(); i++) {
				// Tìm vị trí nhân viên thường có lương cao nhất xuất hiện đầu tiên
				NhanSu ns = this.objDanhSach.getListNhanSu().get(i);
				if (ns instanceof NhanVienThuong) {
					if (ns.getLuongThang() > nvt.getLuongThang()) {
						nvt = (NhanVienThuong) ns;
						indexMax++;
					}
				}
			}
			for (int i = indexMax - 1; i < this.objDanhSach.getListNhanSu().size(); i++) {
				// Liệt kê danh sách các nhân viên thường có lương cao nhất.
				NhanSu ns = this.objDanhSach.getListNhanSu().get(i);
				if (ns instanceof NhanVienThuong) {
					if (ns.getLuongThang() == nvt.getLuongThang()) {
						listMax.add((NhanVienThuong) ns);
					}
				}
			}
		}
		return listMax;
	}

	/**
	 * Phương thức tính tổng số lương cho toàn bộ nhân viên trong công ty.
	 * 
	 * @return sumSalay - tổng lương nhân viên.
	 */
	public float SumOfSalary() {
		float sumSalary = 0;
		for (NhanSu ns : this.objDanhSach.getListNhanSu()) {
			sumSalary += ns.getLuongThang();
		}
		return sumSalary;
	}

	/**
	 * Phương thức liệt kê danh sách trưởng phòng có số nhân viên nhiều nhất.
	 * 
	 * @return listTPMax - danh sách các trưởng phòng.
	 */
	public ArrayList<TruongPhong> lietKeDSTPCoNhanVienDuoiQuyenNhieuNhat() {
		ArrayList<TruongPhong> listTP = getListTP();
		ArrayList<TruongPhong> listTPMax = new ArrayList<TruongPhong>();
		TruongPhong truongPhong = null;
		int indexTPMax = 0;
		if (listTP.size() > 0) {
			for (TruongPhong tp : listTP) {
				indexTPMax++;
				if (tp.getSoNhanVienDuoiQuyen() != 0) {
					truongPhong = tp;
					break;
				}
			}
		}
		if (truongPhong != null) {
			for (int i = indexTPMax - 1; i < listTP.size(); i++) {
				TruongPhong tp = listTP.get(i);
				if (tp.getSoNhanVienDuoiQuyen() > truongPhong.getSoNhanVienDuoiQuyen()) {
					truongPhong = tp;
					indexTPMax++;
				}
			}
			for (int i = indexTPMax - 1; i < listTP.size(); i++) {
				TruongPhong tp = listTP.get(i);
				if (tp.getSoNhanVienDuoiQuyen() == truongPhong.getSoNhanVienDuoiQuyen()) {
					listTPMax.add(tp);
				}
			}
		}
		return listTPMax;
	}

	/**
	 * Phương thức sắp xếp theo tên theo thứ tự ABC
	 * 
	 * @param listNhanSu - danh sách các nhân sự
	 */
	private void sortName(ArrayList<NhanSu> listNhanSu) {
		int i, j;
		for (i = 0; i < listNhanSu.size(); i++) {
			for (j = i + 1; j < listNhanSu.size() - 1; j++) {
				NhanSu ns1 = listNhanSu.get(i);
				NhanSu ns2 = listNhanSu.get(j);
				if (ns2.getHoTen().compareToIgnoreCase(ns1.getHoTen()) < 0) {
					Collections.swap(listNhanSu, i, j);
				}
			}
		}
	}

	/**
	 * Phương thức sắp xếp danh sách nhân sự theo tên thứ tự ABC.
	 */
	public void sortNhanSuByName() {
		sortName(this.objDanhSach.getListNhanSu());
	}

	/**
	 * Phương thức sắp xếp theo lương giảm dần.
	 * 
	 * @param listNhanSu
	 */
	private void sortSalary(ArrayList<NhanSu> listNhanSu) {
		int i, j;
		for (i = 0; i < listNhanSu.size(); i++) {
			for (j = i + 1; j < listNhanSu.size() - 1; j++) {
				NhanSu ns1 = listNhanSu.get(i);
				NhanSu ns2 = listNhanSu.get(j);
				if (ns2.getLuongThang() > ns1.getLuongThang()) {
					Collections.swap(listNhanSu, i, j);
				}
			}
		}
	}

	/**
	 * Phương thức sắp xếp danh sách nhân sự theo thứ tự lương giảm dần.
	 */
	public void sortNhanSuBySalary() {
		sortSalary(this.objDanhSach.getListNhanSu());
	}

	/**
	 * Phương thức liệt kê giám đốc có số cổ phần cao nhất.
	 * 
	 * @return danh sách giám đốc.
	 */
	public ArrayList<GiamDoc> lietKeGiamDocCoPhanMax() {
		ArrayList<GiamDoc> listManagerMax = new ArrayList<GiamDoc>();
		GiamDoc giamDoc = null;
		int sizeNhanSu = this.objDanhSach.getListNhanSu().size();
		int indexMax = 0;
		for (NhanSu ns : this.objDanhSach.getListNhanSu()) {
			indexMax++;
			if (ns instanceof GiamDoc) {
				giamDoc = (GiamDoc) ns;
				break;
			}
		}
		if (giamDoc != null) {
			for (int i = indexMax - 1; i < sizeNhanSu; i++) {
				NhanSu ns = this.objDanhSach.getListNhanSu().get(i);
				if (ns instanceof GiamDoc) {
					if (((GiamDoc) ns).getSoCoPhan() > giamDoc.getSoCoPhan()) {
						giamDoc = (GiamDoc) ns;
						indexMax++;
					}
				}
			}
			for (int i = indexMax - 1; i < sizeNhanSu; i++) {
				NhanSu ns = this.objDanhSach.getListNhanSu().get(i);
				if (ns instanceof GiamDoc) {
					if (((GiamDoc) ns).getSoCoPhan() == giamDoc.getSoCoPhan()) {
						listManagerMax.add((GiamDoc) ns);
					}
				}
			}
		}
		return listManagerMax;
	}

	/**
	 * Phương thức tính thu nhập của giám đốc.
	 * 
	 * @return thu nhập của một giám đốc
	 */
	public void salaryOfManager() {
		float incomeOfManager = 0;
		float profits = profitOfCompany();
		for (NhanSu ns : this.objDanhSach.getListNhanSu()) {
			if (ns instanceof GiamDoc) {
				GiamDoc gd = (GiamDoc) ns;
				gd.xuat();
				incomeOfManager = gd.getLuongThang() + (gd.getSoCoPhan() * profits / 100);
				System.out.println("Thu nhập: " + incomeOfManager);
			}
		}
	}

	/**
	 * Phương thức tính doanh thu công ty trong một tháng.
	 * 
	 * @return
	 */
	private float profitOfCompany() {
		float profit = 0;
		float sumOfSalary = SumOfSalary();
		profit = this.doanhThuThang - sumOfSalary;
		return profit;
	}

	/**
	 * Phương thức kiểm tra xem mã id của người dùng nhập vào có trùng với id đã có
	 * sẵn trong danh sách hay không.
	 * 
	 * @param id - mã id truyền vào.
	 * @return
	 *         <p>
	 *         true - nếu mã id đã tồn tại trong danh sách.
	 *         <p>
	 *         false - nếu mã id không tồn tại trong danh sách.
	 */
	private boolean checkID(String id) {
		boolean checked = false;
		for (NhanSu ns : this.objDanhSach.getListNhanSu()) {
			if (ns.getMaSo().equalsIgnoreCase(id)) {
				checked = true;
				break;
			}
		}
		return checked;
	}
}
