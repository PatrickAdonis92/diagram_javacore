
/**
 * Student.java
 * 21-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class Student extends Person {

	// 1. Khai báo thuộc tính
	private float toan;
	private float ly;
	private float hoa;

	// 2. Getter - setter
	/**
	 * @return the toan
	 */
	public float getToan() {
		return toan;
	}

	/**
	 * @param toan the toan to set
	 */
	public void setToan(float toan) {
		this.toan = toan;
	}

	/**
	 * @return the ly
	 */
	public float getLy() {
		return ly;
	}

	/**
	 * @param ly the ly to set
	 */
	public void setLy(float ly) {
		this.ly = ly;
	}

	/**
	 * @return the hoa
	 */
	public float getHoa() {
		return hoa;
	}

	/**
	 * @param hoa the hoa to set
	 */
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}

	// 3. Constructor
	/**
	 * Constructor không tham số.
	 */
	public Student() {
		super();
	}

	/**
	 * Constructor có tham số.
	 * 
	 * @param personId
	 * @param fullName
	 * @param address
	 * @param email
	 * @param toan
	 * @param ly
	 * @param hoa
	 */
	public Student(String personId, String fullName, String address, String email, float toan, float ly, float hoa) {
		super(personId, fullName, address, email);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	/**
	 * Phương thức nhập dữ liệu.
	 */
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Toán: ");
		this.toan = Float.parseFloat(scan.nextLine());

		System.out.println("Lý: ");
		this.ly = Float.parseFloat(scan.nextLine());

		System.out.println("Hóa: ");
		this.hoa = Float.parseFloat(scan.nextLine());
	}

	/**
	 * Phương thức xuất dữ liệu ra desktop.
	 */
	@Override
	public void xuat() {
		super.xuat();
		System.out.print("\tToán: " + this.toan);
		System.out.print("\tLý:" + this.ly);
		System.out.print("\tHóa: " + this.hoa + "\n");
	}
}
