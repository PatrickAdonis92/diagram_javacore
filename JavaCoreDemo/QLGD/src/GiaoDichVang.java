
/**
 * GiaoDichVang.java
 * 21-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class GiaoDichVang extends GiaoDich {

	private String loaiVang;

	/**
	 * @return the loaiVang
	 */
	public String getLoaiVang() {
		return loaiVang;
	}

	/**
	 * @param loaiVang the loaiVang to set
	 */
	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	/**
	 * Constructor không tham số.
	 */
	public GiaoDichVang() {

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
	public GiaoDichVang(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập loại vàng: ");
		this.loaiVang = scan.nextLine();
	}

	public void xuat() {
		super.xuat();
		System.out.print("\t Loại Vàng: " + this.loaiVang +"\n");
	}

	@Override
	public void tinhTien() {
		this.thanhTien = this.soLuong * this.donGia;
	}
}
