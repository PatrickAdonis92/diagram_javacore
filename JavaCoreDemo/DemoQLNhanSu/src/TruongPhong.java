
/**
 * TruongPhong.java
 * 22-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class TruongPhong extends NhanSu {

	// Hằng số
	private final int LUONG_NGAY = 200;
	private final int PHU_CAP_MOI_NHAN_VIEN_QUAN_LY = 100;

	// Attributes
	private int soNhanVienDuoiQuyen;

	// Getter - Setter
	/**
	 * @return the soNhanVienDuoiQuyen
	 */
	public int getSoNhanVienDuoiQuyen() {
		return soNhanVienDuoiQuyen;
	}

	/**
	 * @param soNhanVienDuoiQuyen the soNhanVienDuoiQuyen to set
	 */
	public void setSoNhanVienDuoiQuyen(int soNhanVienDuoiQuyen) {
		this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
	}

	// Constructor
	/**
	 * Constructor không tham số
	 */
	public TruongPhong() {

	}

	/**
	 * Constructor có tham số.
	 * 
	 * @param maSo
	 * @param hoTen
	 * @param soDienThoai
	 * @param soNgayLamViec
	 * @param soNhanVienDuoiQuyen
	 */
	public TruongPhong(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
	}

	// Input - Output method
	@Override
	public void xuat() {
		super.xuat();
		System.out.print("\tSố nhân viên dưới quyền: " + this.soNhanVienDuoiQuyen + "\tLương: "+this.luongThang +"\n");
	}

	// Business method
	@Override
	public void tinhLuong() {
		this.luongThang = LUONG_NGAY * this.soNgayLamViec + this.soNhanVienDuoiQuyen * PHU_CAP_MOI_NHAN_VIEN_QUAN_LY;
	}

	public void tangNhanVien() {
		this.soNhanVienDuoiQuyen++;
	}

	public void giamNhanVien() {
		this.soNhanVienDuoiQuyen--;
	}
}
