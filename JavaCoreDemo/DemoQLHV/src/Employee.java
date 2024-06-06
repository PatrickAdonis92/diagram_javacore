
/**
 * Employee.java
 * 21-05-2024
 */
import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class Employee extends Person {

	private float soNgayLamViec;
	private float luongTheoNgay;

	/**
	 * @return the soNgayLamViec
	 */
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	/**
	 * @param soNgayLamViec the soNgayLamViec to set
	 */
	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	/**
	 * @return the luongTheoNgay
	 */
	public float getLuongTheoNgay() {
		return luongTheoNgay;
	}

	/**
	 * @param luongTheoNgay the luongTheoNgay to set
	 */
	public void setLuongTheoNgay(float luongTheoNgay) {
		this.luongTheoNgay = luongTheoNgay;
	}

	/**
	 * Constructor không tham số.
	 */
	public Employee() {

	}

	/**
	 * Constructor có tham số.
	 * 
	 * @param personId
	 * @param fullName
	 * @param address
	 * @param email
	 * @param soNgayLamViec
	 * @param luongTheoNgay
	 */
	public Employee(String personId, String fullName, String address, String email, float soNgayLamViec,
			float luongTheoNgay) {
		super(personId, fullName, address, email);
		this.soNgayLamViec = soNgayLamViec;
		this.luongTheoNgay = luongTheoNgay;
	}
	
	/**
	 * Phương thức nhập dữ liệu.
	 */
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Số ngày làm việc: ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		
		System.out.println("Lương theo ngày: ");
		this.luongTheoNgay = Float.parseFloat(scan.nextLine());
	}
	
	/**
	 * Phương thức xuất dữ liệu ra desktop
	 */
	@Override
	public void xuat() {
		super.xuat();
		System.out.print("\tSố ngày làm việc: " + this.soNgayLamViec);
		System.out.print("\tLương theo ngày: " + this.luongTheoNgay + "\n");
	}
}
