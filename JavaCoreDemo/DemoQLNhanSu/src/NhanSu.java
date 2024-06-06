
/**
 * NhanSu.java
 * 22-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class NhanSu {

	// Attributes
	protected String maSo;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected float luongThang;

	// Getter - Setter.
	/**
	 * @return the maSo
	 */
	public String getMaSo() {
		return maSo;
	}

	/**
	 * @param maSo the maSo to set
	 */
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}

	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

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
	 * 
	 * @return the luongThang;
	 */
	public float getLuongThang() {
		return luongThang;
	}

	// Constructor
	/**
	 * Constructor không tham số.
	 */
	public NhanSu() {

	}

	/**
	 * Constructor có tham số.
	 * 
	 * @param maSo
	 * @param hoTen
	 * @param soDienThoai
	 * @param soNgayLamViec
	 */
	public NhanSu(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}

	// Input - Output method.
	/**
	 * Phương thức nhập dữ liệu.
	 * 
	 * @param scan
	 */
	public void nhap(Scanner scan) {
		System.out.println("Mã số: ");
		this.maSo = scan.nextLine();

		System.out.println("Họ tên: ");
		this.hoTen = scan.nextLine();

		System.out.println("Số điện thoại: ");
		this.soDienThoai = scan.nextLine();

		System.out.println("Số ngày làm việc: ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
	}

	/**
	 * Phương thức in thông tin.
	 */
	public void xuat() {
		System.out.print("Mã: " + this.maSo + "\tHọ tên: " + this.hoTen + "\tSĐT: " + this.soDienThoai
				+ "\tSố ngày làm việc: " + this.soNgayLamViec);
	}

	public void xuatMaVaTen() {
		System.out.println("Mã: " + this.maSo + "\tHọ Tên: " + this.hoTen);
	}

	/**
	 * Phương thức tính lương cho nhân viên
	 */
	public void tinhLuong() {
		this.luongThang = 0;
	}
}
