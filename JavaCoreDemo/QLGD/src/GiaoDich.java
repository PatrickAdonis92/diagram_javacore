
/**
 * GiaoDich.java
 * 21-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class GiaoDich {

	protected int maGiaoDich;
	protected int ngay;
	protected int thang;
	protected int nam;
	protected float donGia;
	protected int soLuong;
	protected float thanhTien;

	/**
	 * @return the maGiaoDich
	 */
	public int getMaGiaoDich() {
		return maGiaoDich;
	}

	/**
	 * @param maGiaoDich the maGiaoDich to set
	 */
	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	/**
	 * @return the ngay
	 */
	public int getNgay() {
		return ngay;
	}

	/**
	 * @param ngay the ngay to set
	 */
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	/**
	 * @return the thang
	 */
	public int getThang() {
		return thang;
	}

	/**
	 * @param thang the thang to set
	 */
	public void setThang(int thang) {
		this.thang = thang;
	}

	/**
	 * @return the nam
	 */
	public int getNam() {
		return nam;
	}

	/**
	 * @param nam the nam to set
	 */
	public void setNam(int nam) {
		this.nam = nam;
	}

	/**
	 * @return the donGia
	 */
	public float getDonGia() {
		return donGia;
	}

	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}

	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	/**
	 * @return the thanhTien
	 */
	public float getThanhTien() {
		return thanhTien;
	}

	/**
	 * Constructor không tham số
	 */
	public GiaoDich() {

	}

	/**
	 * @param maGiaoDich
	 * @param ngay
	 * @param thang
	 * @param nam
	 * @param donGia
	 * @param soLuong
	 * @param thanhTien
	 */
	public GiaoDich(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong) {
		this.maGiaoDich = maGiaoDich;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public void nhap(Scanner scan) {
		System.out.println("Nhập mã giao dịch:");
		this.maGiaoDich = Integer.parseInt(scan.nextLine());

		System.out.println("Nhập ngày giao dịch:");
		this.ngay = Integer.parseInt(scan.nextLine());

		System.out.println("Nhập tháng giao dịch:");
		this.thang = Integer.parseInt(scan.nextLine());

		System.out.println("Nhập năm giao dịch:");
		this.nam = Integer.parseInt(scan.nextLine());

		System.out.println("Nhập đơn giá:");
		this.donGia = Float.parseFloat(scan.nextLine());

		System.out.println("Nhập số lượng:");
		this.soLuong = Integer.parseInt(scan.nextLine());
	}

	public void xuat() {
		System.out.println("Giao Dịch:");
		System.out.print("Mã: " + this.maGiaoDich);
		System.out.print("\tThời gian: " + this.ngay + "\\" + this.thang + "\\" + this.nam);
		System.out.print("\tĐơn giá: " + this.donGia);
		System.out.print("\tSố Lượng: " + this.soLuong);
		System.out.print("\tThành Tiền: " + this.thanhTien);
	}

	public void tinhTien() {

	}

	public void nhapTiGia() {

	}
}
