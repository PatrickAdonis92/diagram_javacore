
/**
XuLy * XuLy.java
 * 21-05-2024
 */

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
		doMenu();
	}

	private static void inMenu() {
		System.out.println("QUẢN LÝ HỌC VIỆN NGHIÊN CỨU VÀ GIẢNG DẠY");
		System.out.println("1. Thêm");
		System.out.println("2. Xóa theo ID.");
		System.out.println("3. Sắp xếp theo tên.");
		System.out.println("4. Xuất danh sách.");
		System.out.println("0. Thoát");
	}

	private static void doMenu() {
		boolean flag = true;
		ListPerson objList = new ListPerson();
		objList.dummyData();
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			int chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1:
				objList.nhap(scan);
				break;
			case 2:
				System.out.println("Nhập id cần xóa: ");
				String id = scan.nextLine();
				boolean delete = objList.deletePersonById(id);
				if (delete) {
					System.out.println("Đã xóa");
				} else {
					System.out.println(id + " không tồn tại.");
				}
				break;
			case 3:
				objList.sortPersonByName();
				objList.xuat();
				break;
			case 4:
				objList.xuat();
				break;
			case 0:
				System.out.println("Cảm ơn đã sử dụng chương trình.");
				flag = false;
				break;
			}
		} while (flag);
	}
}
