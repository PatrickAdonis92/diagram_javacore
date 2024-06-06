/**
 * MenuApp.java
 * 14-05-2024
 */
package view;


import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class MenuApp {

	/**
	 * 
	 */
	public MenuApp() {
		// TODO Auto-generated constructor stub
	}

	private static void printMenu() {
		System.out.println("Vui lòng chọn thực hiện:");
		System.out.println("1. Thêm sinh viên.");
		System.out.println("2. Xuất danh sách sinh viên.");
		System.out.println("3. Xuất danh sách sinh viên theo tên.");
		System.out.println("4. Xuất danh sách sinh viên theo mã sinh viên.");
		System.out.println("5. Xuất danh sách sinh viên có điểm TB cao nhất.");
		System.out.println("6. Xuất danh sách sinh viên theo học lực.");
		System.out.println("7. Xóa sinh viên theo ID.");
		System.out.println("0. Thoát.");
	}

	public static void doMenu(Scanner scan) {
		boolean flag = true;
		do {
			int chose;
			printMenu();
			chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1:
				Student stu = new Student();
				stu.inputStudents(scan);
				listStudents.addStudents(stu);
				break;
			case 2:
				listStudents.tinhDTB();
				listStudents.ratingSV();
				listStudents.printSV();
				break;
			case 3:
				System.exit(0);
			default:
				throw new IllegalArgumentException("Unexpected value: " + chose);
			}
		} while (flag);
	}
}
