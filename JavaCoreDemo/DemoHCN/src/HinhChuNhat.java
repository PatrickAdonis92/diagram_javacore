
/**
 * HinhChuNhat.java
 * 12-05-2024
 */
import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class HinhChuNhat {

	/**
	 * 
	 */
	public HinhChuNhat() {
		// TODO Auto-generated constructor stub

	}

	private int chieuDai;
	private int chieuRong;
	private int chuVi;
	private int dienTich;

	/**
	 * @return the chieuDai
	 */
	public int getChieuDai() {
		return chieuDai;
	}

	/**
	 * @param chieuDai the chieuDai to set
	 */
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	/**
	 * @return the chieuRong
	 */
	public int getChieuRong() {
		return chieuRong;
	}

	/**
	 * @param chieuRong the chieuRong to set
	 */
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	/**
	 * @return the chuVi
	 */
	public int getChuVi() {
		return chuVi;
	}

	/**
	 * @return the dienTich
	 */
	public int getDienTich() {
		return dienTich;
	}

	public HinhChuNhat(int cDai, int cRong) {
		this.chieuDai = cDai;
		this.chieuRong = cRong;
	}

	public void nhap(Scanner scan) {
		System.out.println("Nhập chiều dài hình chữ nhật: ");
		this.chieuDai = Integer.parseInt(scan.nextLine());

		System.out.println("Nhập chiều rộng hình chữ nhật: ");
		this.chieuRong = Integer.parseInt(scan.nextLine());
	}

	public void xuat() {
		System.out.println("Hình chữ nhật có chiều dài " + chieuDai + " và chiều rộng " + chieuRong + ". Chu vi: "
				+ chuVi + " và diện tích: " + dienTich);
	}

	public void tinhChuVi() {
		this.chuVi = (chieuDai + chieuRong) * 2;
	}

	public void tinhDienTich() {
		this.dienTich = chieuDai * chieuRong;
	}
}
