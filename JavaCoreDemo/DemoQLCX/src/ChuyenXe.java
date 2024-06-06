
/**
 * ChuyenXe.java
 * 16-05-2024
 */
import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class ChuyenXe {

	// 1. Các thuộc tính

	private String maSoChuyenXe;
	private String hoTenTaiXe;
	private String soXe;
	private float doanhThu;

	/**
	 * @return the maSoChuyenXe
	 */
	public String getMaSoChuyenXe() {
		return maSoChuyenXe;
	}

	/**
	 * @param maSoChuyenXe the maSoChuyenXe to set
	 */
	public void setMaSoChuyenXe(String maSoChuyenXe) {
		this.maSoChuyenXe = maSoChuyenXe;
	}

	/**
	 * @return the hoTenTaiXe
	 */
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	/**
	 * @param hoTenTaiXe the hoTenTaiXe to set
	 */
	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	/**
	 * @return the soXe
	 */
	public String getSoXe() {
		return soXe;
	}

	/**
	 * @param soXe the soXe to set
	 */
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	/**
	 * @return the doanhThu
	 */
	public float getDoanhThu() {
		return doanhThu;
	}

	/**
	 * @param doanhThu the doanhThu to set
	 */
	public void setDoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}

	/**
	 * 
	 */
	public ChuyenXe() {

	}

	/**
	 * @param maSoChuyenXe
	 * @param hoTenTaiXe
	 * @param soXe
	 */
	public ChuyenXe(String maSoChuyenXe, String hoTenTaiXe, String soXe, float doanhThu) {
		this.maSoChuyenXe = maSoChuyenXe;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	public void nhap(Scanner scan) {
		System.out.println("Mã số Chuyến Xe: ");
		this.maSoChuyenXe = scan.nextLine();

		System.out.println("Họ tên tài xế: ");
		this.hoTenTaiXe = scan.nextLine();

		System.out.println("Số xe: ");
		this.soXe = scan.nextLine();

		System.out.println("Doanh thu:");
		this.doanhThu = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("Chuyến xe - Mã số chuyến xe: " + this.maSoChuyenXe + "\tHọ tên tài xế: " + this.hoTenTaiXe
				+ "\tSố xe: " + this.soXe + "\tDoanh thu: " + this.doanhThu);
	}
}
