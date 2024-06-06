
/**
 * GiamDoc.java
 * 22-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class GiamDoc extends NhanSu {

	// Hằng số
	private final int LUONG_NGAY = 300;

	// Attributes
	private float soCoPhan;

	// Getter - Setter
	/**
	 * @return the soCoPhan
	 */
	public float getSoCoPhan() {
		return soCoPhan;
	}

	/**
	 * @param soCoPhan the soCoPhan to set
	 */
	public void setSoCoPhan(float soCoPhan) {
		this.soCoPhan = soCoPhan;
	}

	// Constructor
	/**
	 * Constructor không tham số.
	 */
	public GiamDoc() {

	}

	/**
	 * Constructor có tham số.
	 * 
	 * @param maSo
	 * @param hoTen
	 * @param soDienThoai
	 * @param soNgayLamViec
	 * @param soCoPhan
	 */
	public GiamDoc(String maSo, String hoTen, String soDienThoai, float soNgayLamViec, float soCoPhan) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		this.soCoPhan = soCoPhan;
	}

	// Input - Output method
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Số cổ phần sở hữu:");
		this.soCoPhan = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.print("\tSố cổ phần: " + this.soCoPhan + "\tLương: " + this.luongThang + "\n");
	}

	// Business method
	@Override
	public void tinhLuong() {
		this.luongThang = this.soNgayLamViec * LUONG_NGAY;
	}
}
