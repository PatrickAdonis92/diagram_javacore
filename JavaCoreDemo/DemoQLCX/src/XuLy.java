
/**
XuLy * XuLy.java
 * 17-05-2024
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
		System.out.println("Mời chọn chức năng chương trình: ");
		System.out.println("1. Thêm thông tin chuyến xe.");
		System.out.println("2. In thông tin chuyến xe.");
		System.out.println("3. Tính tổng doanh thu.");
		System.out.println("4. Tính tổng doanh thu chuyến xe nội thành.");
		System.out.println("5. Tính tổng doanh thu chuyến xe ngoại thành.");
		System.out.println("6. Tính doanh thu các chuyến xe theo nơi đến.");
		System.out.println("0. Thoát chương trình.");
	}

	private static void doMenu() {
		DanhSachChuyenXe cx = new DanhSachChuyenXe();
		cx.dummyData();
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			inMenu();
			int chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1:
				cx.nhap(scan);
				break;
			case 2:
				cx.xuat();
				break;
			case 3:
				cx.tinhTongDoanhThu();
				break;
			case 4:
				cx.tinhTongDoanhThu();
				break;
			case 5:
				cx.tinhTongDoangThuNgoai();
				break;
			case 6:
				float doanhThu = cx.tinhDTCXBinhThuan(scan);
				System.out.println(doanhThu);
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}
}
