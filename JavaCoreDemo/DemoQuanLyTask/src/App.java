
/**
 * App.java
 * 29-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class App {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Company com = new Company();
		com.creatData(scan);
		System.out.println("Khởi tạo thành công!");
		com.companySize();
//		com.chiDinhTruongPhong(scan);
//		com.phanBoNhanSu(scan);
		com.showInformation();
		com.showDepart();
		System.out.println("List Task:");
		com.showTask();
		com.phongCoNhanVienTreNhat();
//		com.phanTask(scan);
//		com.showTask();
		com.nhanVienCoTaskNhieuNhat();
//		com.saveData(scan);
	}

	private static void doMenu() {
		boolean flag = true;
		do {
			int chose = Integer.parseInt(scan.nextLine());
			inMenu();
		} while (flag);
	}

	private static void inMenu() {
		System.out.println("ỨNG DỤNG QUẢN LÝ TASK");
		System.out.println("1. LOAD DATA");
		System.out.println("2. NHẬP DỮ LIỆU");
		System.out.println("3. PHÂN BỔ NHÂN VIÊN.");
		System.out.println("4. CHỈ ĐỊNH TRƯỞNG PHÒNG");
		System.out.println("5. PHÂN BỔ TASK");
		System.out.println("6. XÓA NHÂN SỰ");
		System.out.println("0. THOÁT ỨNG DỤNG");
	}
}
