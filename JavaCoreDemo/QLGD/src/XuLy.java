
/**
 * XuLy.java
 * 21-05-2024
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
		doMenu();
	}

	private static void inMenu() {
		System.out.println("QUẢN LÝ GIAO DỊCH");
		System.out.println("Mời chọn chức năng:");
		System.out.println("1. Nhập giao dịch.");
		System.out.println("2. Xuất danh sách giao dịch.");
		System.out.println("3. Tổng số lượng giao dịch vàng.");
		System.out.println("4. Tổng số lượng giao dịch tiền tệ");
		System.out.println("5. Trung bình thành tiền của giao dịch tiền tệ.");
		System.out.println("6. Giao dịch có đơn giá có giá trị lớn hơn 1 tỷ.");
		System.out.println("0. Thoát chương trình.");
	}

	private static void doMenu() {
		Scanner scan = new Scanner(System.in);
		DanhSachGiaoDich danhSach = new DanhSachGiaoDich();
		danhSach.dummyData();
		danhSach.tinhTienChoCacGiaoDich();
		;
		boolean flag = true;
		do {
			inMenu();
			int chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1:
				danhSach.nhap(scan);
				break;
			case 2:
				danhSach.xuat();
				break;
			case 3:
				danhSach.tongSoLuongGiaoDichVang();
				System.out.println("Tổng số lượng giao dịch vàng: " + danhSach.getTongSLGDVang());
				break;
			case 4:
				danhSach.tongSoLuongGiaoDichTienTe();
				System.out.println("Tổng số lượng giao dịch tiền tệ: " + danhSach.getTongSLGDTienTe());
				break;
			case 5:
				danhSach.tinhTrungBinhGDTT();
				System.out.println("Trung bình giao dịch tiền tệ: " + danhSach.getTrungBinhGDTienTe());
				break;
			case 6:
				danhSach.xuatGiaoDichLonHon1Ty();
				break;
			case 0:
				System.out.println("Cảm ơn đã sử dụng chương trình.");
				flag = false;
				break;
			}

		} while (flag);
	}
}
