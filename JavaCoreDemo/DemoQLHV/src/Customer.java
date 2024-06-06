
/**
 * Customer.java
 * 21-05-2024
 */
import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class Customer extends Person {

	// Attributes
	private String tenCongty;
	private float giaTriHoaDon;
	private String danhGia;

	// Getter - setter
	/**
	 * @return the tenCongty
	 */
	public String getTenCongty() {
		return tenCongty;
	}

	/**
	 * @param tenCongty the tenCongty to set
	 */
	public void setTenCongty(String tenCongty) {
		this.tenCongty = tenCongty;
	}

	/**
	 * @return the giaTriHoaDon
	 */
	public float getGiaTriHoaDon() {
		return giaTriHoaDon;
	}

	/**
	 * @param giaTriHoaDon the giaTriHoaDon to set
	 */
	public void setGiaTriHoaDon(float giaTriHoaDon) {
		this.giaTriHoaDon = giaTriHoaDon;
	}

	/**
	 * @return the danhGia
	 */
	public String getDanhGia() {
		return danhGia;
	}

	/**
	 * @param danhGia the danhGia to set
	 */
	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	// Constructor
	/**
	 * Constructor không tham số.
	 */
	public Customer() {

	}

	/**
	 * Constructor có tham số.
	 */
	public Customer(String personId, String fullName, String address, String email, String tenCongTy,
			float giaTriHoaDon, String danhGia) {
		super(personId, fullName, address, email);
		this.tenCongty = tenCongTy;
		this.giaTriHoaDon = giaTriHoaDon;
		this.danhGia = danhGia;
	}

	/**
	 * Phương thức nhập dữ liệu.
	 */
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Tên công ty: ");
		this.tenCongty = scan.nextLine();

		System.out.println("Giá trị hóa đơn: ");
		this.giaTriHoaDon = Float.parseFloat(scan.nextLine());

		System.out.println("Đánh giá: ");
		this.danhGia = scan.nextLine();
	}

	/**
	 * Phương thức xuất dữ liệu ra desktop
	 */
	@Override
	public void xuat() {
		super.xuat();
		System.out.print("\tTên công ty: " + this.tenCongty);
		System.out.print("\tGiá trị hóa đơn: " + this.giaTriHoaDon);
		System.out.print("\tĐánh giá: " + this.danhGia + "\n");
	}
}
