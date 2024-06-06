
/**
 * XuLy.java
 * 16-05-2024
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
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		doMenu(truong);
	}

	private static void inMenu() {
		System.out.println("Chọn chức năng: ");
		System.out.println("1. Thêm sinh viên.");
		System.out.println("2. In thông tin sinh viên.");
		System.out.println("3. Liệt kê danh sách sinh viên yếu.");
		System.out.println("4. Tìm kiếm sinh viên theo tên.");
		System.out.println("5. Tìm kiếm sinh viên theo mã sinh viên.");
		System.out.println("6. Xóa sinh viên theo mã sinh viên.");
		System.out.println("7. Liệt kê sinh viên có điểm trung bình cao nhất.");
		System.out.println("0. Thoát chương trình.");
	}

	private static void doMenu(TruongHoc truong) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			inMenu();
			int chose;
			chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				truong.themSinhVien(sv);
				break;
			case 2:
				truong.tinhDTB();
				truong.xepLoaiSV();
				truong.xuatTheoFormat(truong.getDssvToanTruong().getListSV());
				break;
			case 3:
				ArrayList<SinhVien> listYeu = truong.lietKeSVYeu();
				truong.xuatTheoFormat(listYeu);
				break;
			case 4:
				System.out.println("Nhập vào tên sinh viên cần tìm:");
				String name = scan.nextLine();
				ArrayList<SinhVien> listByName = truong.timSVTheoTen(name);
				if (listByName.size() > 0) {
					truong.xuatTheoFormat(listByName);
				} else {
					System.out.println("Không có sinh viên có tên " + name);
				}
				break;
			case 5:
				System.out.println("Nhập mã sinh viên cần tìm: ");
				int id = Integer.parseInt(scan.nextLine());
				SinhVien svId = truong.timSVTheoId(id);
				ArrayList<SinhVien> listId = new ArrayList<SinhVien>();
				if (svId != null) {
					listId.add(svId);
					truong.xuatTheoFormat(listId);
				} else {
					System.out.println("Không có sinh viên có mã " + id);
				}
				break;
			case 6:
				System.out.println("Nhập mã sinh viên cần xóa: ");
				int idDelete = Integer.parseInt(scan.nextLine());
				boolean deleted = truong.xoaSVTheoId(idDelete);
				if (deleted) {
					System.out.println("Đã xóa sinh viên!");
				} else {
					System.out.println("Không tìm thấy sinh viên có mã " + idDelete);
				}
				break;
			case 7:
				ArrayList<SinhVien> listDTBMax = truong.timDTBMax();
				truong.xuatTheoFormat(listDTBMax);
				break;
			case 0:
				System.exit(0);
			default:
				throw new IllegalArgumentException("Unexpected value: " + chose);
			}

		} while (flag);
	}
}
