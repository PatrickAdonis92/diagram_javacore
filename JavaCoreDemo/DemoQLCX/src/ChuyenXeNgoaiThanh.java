
/**
 * ChuyenXeNgoaiThanh.java
 * 16-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {

	private String noiDen;
	private float soNgayDiDuoc;

	/**
	 * @return the noiDen
	 */
	public String getNoiDen() {
		return noiDen;
	}

	/**
	 * @param noiDen the noiDen to set
	 */
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	/**
	 * @return the soNgayDiDuoc
	 */
	public float getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	/**
	 * @param soNgayDiDuoc the soNgayDiDuoc to set
	 */
	public void setSoNgayDiDuoc(float soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	/**
	 * 
	 */
	public ChuyenXeNgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param maSoChuyenXe
	 * @param hoTenTaiXe
	 * @param soXe
	 * @param doanhThu
	 */
	public ChuyenXeNgoaiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, float doanhThu, String noiDen,
			float soNgayDiDuoc) {
		super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nơi đến: ");
		this.noiDen = scan.nextLine();

		System.out.println("Số ngày đi được: ");
		this.soNgayDiDuoc = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tNơi đến: " + this.noiDen + "\tSố ngày đi được: " + this.soNgayDiDuoc);
	}
}
