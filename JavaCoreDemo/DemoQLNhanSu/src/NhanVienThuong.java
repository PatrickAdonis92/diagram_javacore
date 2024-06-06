/**
 * NhanVienThuong.java
 * 22-05-2024
 */

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class NhanVienThuong extends NhanSu {

	// Hằng số
	private final int LUONG_NGAY = 100;

	// Attributes
	private TruongPhong truongPhong;

	// Getter - Setter
	/**
	 * @return the truongPhong
	 */
	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	/**
	 * @param truongPhong the truongPhong to set
	 */
	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	// Constructor
	/**
	 * Constructor không tham số.
	 */
	public NhanVienThuong() {
		this.truongPhong = null;
		// Chưa được phân bổ
	}

	/**
	 * Constructor có tham số.
	 * 
	 * @param maSo
	 * @param hoTen
	 * @param soDienThoai
	 * @param soNgayLamViec
	 */
	public NhanVienThuong(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
	}

	// Input - Output method
	@Override
	public void xuat() {
		super.xuat();
		if (this.truongPhong != null) {
			System.out
					.print("\tLương: " + this.luongThang + "\tTên trưởng phòng: " + this.truongPhong.getHoTen() + "\n");
		} else {
			System.out.print("\tLương: " + this.luongThang + "\tChưa phân bổ" + "\n");
		}
	}

	// Business method
	@Override
	public void tinhLuong() {
		this.luongThang = this.soNgayLamViec * LUONG_NGAY;
	}
}
