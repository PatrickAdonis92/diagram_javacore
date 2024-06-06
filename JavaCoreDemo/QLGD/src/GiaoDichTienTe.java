
/**
 * GiaoDichTienTe.java
 * 21-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class GiaoDichTienTe extends GiaoDich {

	private float tiGia;
	private String loaiTien;

	/**
	 * @return the tiGia
	 */
	public float getTiGia() {
		return tiGia;
	}

	/**
	 * @return the loaiTien
	 */
	public String getLoaiTien() {
		return loaiTien;
	}

	/**
	 * @param loaiTien the loaiTien to set
	 */
	public void setLoaiTien(String loaiTien) {
		this.loaiTien = loaiTien;
	}

	/**
	 * Constructor không tham số.
	 */
	public GiaoDichTienTe() {

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
	public GiaoDichTienTe(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, String loaiTien) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.loaiTien = loaiTien;
	}

	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập loại tiền: ");
		this.loaiTien = scan.nextLine();
	}

	@Override
	public void nhapTiGia() {
		if (this.loaiTien.equalsIgnoreCase("VND")) {
			this.tiGia = 1;
		} else if (this.loaiTien.equalsIgnoreCase("USD")) {
			this.tiGia = 25000;
		} else if (this.loaiTien.equalsIgnoreCase("EUR")) {
			this.tiGia = 32000;
		}
	}

	@Override
	public void tinhTien() {
		this.thanhTien = this.soLuong * this.donGia * this.tiGia;
	}
	
	public void xuat() {
		super.xuat();
		System.out.print("\tLoại Tiền: " + this.loaiTien);
		System.out.print("\tTỉ Giá: " + this.tiGia + "\n");
	}


}
