
/**
XuLyXuLy * XuLy.java
 * 24-05-2024
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class XuLy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		doMenu(scan);
	}

	private static void inMenu() {
		System.out.println("CHƯƠNG TRÌNH QUẢN LÝ NHÂN SỰ");
		System.out.println("1. Nhập thông tin công ty.");
		System.out.println("2. Phân bổ nhân viên.");
		System.out.println("3. Thêm nhân sự.");
		System.out.println("4. Xóa nhân sự.");
		System.out.println("5. Danh sách nhân sự.");
		System.out.println("6. Nhân viên thường có lương cao nhất.");
		System.out.println("7. Trưởng phòng có nhiều nhân viên dưới quyền nhất.");
		System.out.println("8. Sắp xếp nhân viên theo tên ABC.");
		System.out.println("9. Sắp xếp nhân viên theo lương giảm dần.");
		System.out.println("10. Giám đốc có số lượng cổ phần nhiều nhất.");
		System.out.println("11. Thu nhập của mỗi giám đốc.");
		System.out.println("12. Lương tổng công ty.");
		System.out.println("0. Thoát chương trình.");
		System.out.println("Mời chọn chức năng.");
	}

	private static void doMenu(Scanner scan) {
		boolean flag = true;
		CongTy company = new CongTy();
		company.dummyDataCty();
		company.dummyDataNhanSu();
		company.tinhLuong();
		do {
			inMenu();
			int chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1:
				company.nhap(scan);
				break;
			case 2:
				company.phanBoNhanVienThuong(scan);
				company.tinhLuong();
				break;
			case 3:
				company.addNhanSu(scan);
				company.tinhLuong();
				break;
			case 4:
				company.xoaNhanSu(scan);
				company.tinhLuong();
				break;
			case 5:
				company.xuat();
				break;
			case 6:
				ArrayList<NhanVienThuong> listNVT = company.listNhanVienThuongLuongMax();
				for (NhanVienThuong nvt : listNVT) {
					nvt.xuat();
				}
				break;
			case 7:
				ArrayList<TruongPhong> listTP = company.lietKeDSTPCoNhanVienDuoiQuyenNhieuNhat();
				if (listTP.size() != 0) {
					for (TruongPhong tp : listTP) {
						tp.xuat();
					}
				} else {
					System.out.println("Các nhân viên chưa được phân bổ.");
				}
				break;
			case 8:
				company.sortNhanSuByName();
				company.xuat();
				break;
			case 9:
				company.sortNhanSuBySalary();
				company.xuat();
				break;
			case 10:
				ArrayList<GiamDoc> listGDMax = company.lietKeGiamDocCoPhanMax();
				for (GiamDoc gd : listGDMax) {
					gd.xuat();
				}
				break;
			case 11:
				company.salaryOfManager();
				break;
			case 12:
				float sumOfSalary = company.SumOfSalary();
				;
				System.out.println("Lương của toàn bộ nhân viên: " + sumOfSalary);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui lòng chỉ nhập từ 0 - 11.");
			}
		} while (flag);
	}
}
