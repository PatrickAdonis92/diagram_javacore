
/**
 * ChuyenXeNoiThanh.java
 * 16-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class ChuyenXeNoiThanh extends ChuyenXe {

	private String soTuyen;
	private float soKm;

	/**
	 * @return the soTuyen
	 */
	public String getSoTuyen() {
		return soTuyen;
	}

	/**
	 * @param soTuyen the soTuyen to set
	 */
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	/**
	 * @return the soKm
	 */
	public float getSoKm() {
		return soKm;
	}

	/**
	 * @param soKm the soKm to set
	 */
	public void setSoKm(float soKm) {
		this.soKm = soKm;
	}

	/**
	 * 
	 */
	public ChuyenXeNoiThanh() {
		super();
	}

	/**
	 * @param maSoChuyenXe
	 * @param hoTenTaiXe
	 * @param soXe
	 */
	public ChuyenXeNoiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, float doanhThu, String soTuyen,
			float soKm) {
		super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Số tuyến: ");
		this.soTuyen = scan.nextLine();

		System.out.println("Số km: ");
		this.soKm = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tSố tuyến: " + this.soTuyen + "\t SốKM: " + this.soKm);
	}

}
