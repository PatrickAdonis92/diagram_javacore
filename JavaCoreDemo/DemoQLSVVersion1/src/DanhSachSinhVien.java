
/**
 * DanhSachSinhVien.java
 * 16-05-2024
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class DanhSachSinhVien {

	// 1. Khai báo thuộc tính
	private ArrayList<SinhVien> listSV;

	// 2. Các phương thức Getter và Setter
	/**
	 * @return the listSV
	 */
	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	/**
	 * @param listSV the listSV to set
	 */
	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

	// 3. Constructor
	/**
	 * 
	 */
	public DanhSachSinhVien() {
		setDefault();
	}

	/**
	 * Phương thức khởi động các list và các giá trị mặc định cho class.
	 */
	private void setDefault() {
		listSV = new ArrayList<SinhVien>();
	}

	// 4. Input, output method
	public void nhap(Scanner scan) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(scan);
		}
	}

	public void themSinhVien(SinhVien sv) {
		this.listSV.add(sv);
	}

	public void xuat() {
		for (SinhVien sv : this.listSV) {
			sv.inSinhVien();
		}
	}

	// 5. Business method
	/**
	 * Phương thức tính điểm trung bình cho sinh viên.
	 */
	public void tinhDTB() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDTB();
		}
	}

	/**
	 * Phương thức xếp loại sinh viên dựa theo điểm trung bình.
	 */
	public void xepLoaiSV() {
		for (SinhVien sv : this.listSV) {
			sv.xepLoaiSV();
		}
	}

	/**
	 * Phương thức tìm kiếm các sinh viên có điểm trung bình cao nhất.
	 * <p>
	 * Bước 1: Tạo biến svMax và gán sinh viên đầu tiên trong danh sách giả định là
	 * sinh viên có ĐTB cao nhất cho svMax
	 * <p>
	 * Bước 2: Duyệt danh sách sinh viên
	 * <p>
	 * Bước 3: So sánh ĐTB của sinh viên đang duyệt (svCurrent) với svMax, nếu
	 * svCurrent.getDTB > svMax.getDTB
	 * <p>
	 * Bước 4: Gán lại svMax = svCurrent
	 * <p>
	 * Bước 5: Tìm thấy được sinh viên có ĐTB lớn nhất thật sự trong danh sách //
	 * Duyệt lại danh sách và tìm tất cả SV có ĐTB bằng với ĐTB của svMax và cho vào
	 * danh sách trả về
	 * <p>
	 * Bước 6: Duyệt lại danh sách
	 * <p>
	 * Bước 7: So sánh svCurrent với svMax, nếu svCurrent.getDTB == svMax.getDTB
	 * <p>
	 * Bước 8: Thêm vào danh sách trả về
	 * <p>
	 * Bước 9: Trả về danh sách sinh viên có ĐTB cao nhất
	 * 
	 * @return danh sách các sinh viên có điểm trung bình cao nhất
	 */
	public ArrayList<SinhVien> timDTBMax() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		// Kiểm tra xem list ban đầu có rỗng không, nếu không rỗng mới thực hiện
		if (this.listSV.size() > 0) {
			SinhVien svMax = this.listSV.get(0);
			int indexMaxFirst = 0;
			for (int i = 0; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
					indexMaxFirst = i;
				}
			}
			list.add(svMax);
			// Đã tìm thấy sv có điểm trung bình cao nhất
			for (int i = indexMaxFirst + 1; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurrent);
				}
			}
		}
		return list;
	}

	/**
	 * Phương thức liệt kê các sinh viên xếp loại yếu.
	 * 
	 * @return
	 */
	public ArrayList<SinhVien> listSVYeu() {
		ArrayList<SinhVien> listYeu = new ArrayList<SinhVien>();
		for (SinhVien sv : this.listSV) {
			if (sv.getXepLoai().equalsIgnoreCase("Yếu")) {
				listYeu.add(sv);
			}
		}
		return listYeu;
	}

	/**
	 * Phương thức tìm sinh viên theo tên.
	 * 
	 * @param name
	 * @return
	 */
	public ArrayList<SinhVien> timSVTheoTen(String name) {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		for (SinhVien sv : this.listSV) {
			if (sv.getTenSV().equalsIgnoreCase(name)) {
				list.add(sv);
			}
		}
		return list;
	}

	/**
	 * Phương thức tìm sinh viên theo mã sinh viên.
	 * 
	 * @param id
	 * @return
	 */
	public SinhVien timSVTheoMa(int id) {
		SinhVien sv = null;
		for (SinhVien svCurrent : this.listSV) {
			if (svCurrent.getIdSV() == id) {
				sv = svCurrent;
				break;
			}
		}
		return sv;
	}

	/**
	 * Phương thức xóa sinh viên theo mã sinh viên.
	 * 
	 * @param id
	 * @return
	 */
	public boolean xoaSVTheoMa(int id) {
		boolean deleted = false;
		// Chưa tìm thấy
		for (SinhVien sv : this.listSV) {
			if (sv.getIdSV() == id) {
				// Tìm thấy, xóa bỏ sinh viên, gán biến deleted lại bằng true.
				this.listSV.remove(id);
				deleted = true;
			}
		}
		return deleted;
	}
}
