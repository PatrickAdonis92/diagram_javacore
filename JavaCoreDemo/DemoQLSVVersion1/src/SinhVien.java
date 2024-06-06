
/**
 * SinhVien.java
 * 16-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class SinhVien {

	// Khai báo các thuộc tính
	private int idSV;
	private String tenSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;

	// Các phương thức Getter và Setter
	/**
	 * @return the idSV
	 */
	public int getIdSV() {
		return idSV;
	}

	/**
	 * @param idSV the idSV to set
	 */
	public void setIdSV(int idSV) {
		this.idSV = idSV;
	}

	/**
	 * @return the tenSV
	 */
	public String getTenSV() {
		return tenSV;
	}

	/**
	 * @param tenSV the tenSV to set
	 */
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	/**
	 * @return the diemToan
	 */
	public float getDiemToan() {
		return diemToan;
	}

	/**
	 * @param diemToan the diemToan to set
	 */
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	/**
	 * @return the diemLy
	 */
	public float getDiemLy() {
		return diemLy;
	}

	/**
	 * @param diemLy the diemLy to set
	 */
	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	/**
	 * @return the diemHoa
	 */
	public float getDiemHoa() {
		return diemHoa;
	}

	/**
	 * @param diemHoa the diemHoa to set
	 */
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	/**
	 * @return the diemTB
	 */
	public float getDiemTB() {
		return diemTB;
	}

	/**
	 * @return the xepLoai
	 */
	public String getXepLoai() {
		return xepLoai;
	}

	// Constructor không đối số và có đối số
	/**
	 * 
	 */
	public SinhVien() {

	}

	/**
	 * @param idSV
	 * @param tenSV
	 * @param diemToan
	 * @param diemLy
	 * @param diemHoa
	 * @param diemTB
	 * @param xepLoai
	 */
	public SinhVien(int idSV, String tenSV, float diemToan, float diemLy, float diemHoa) {
		this.idSV = idSV;
		this.tenSV = tenSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	// Các phương thức xử lý
	/**
	 * Phương thức nhập thông tin sinh viên.
	 * 
	 * @param scan
	 */
	public void nhap(Scanner scan) {
		System.out.println("Nhập mã:");
		this.idSV = Integer.parseInt(scan.nextLine());

		System.out.println("Tên sinh viên: ");
		this.tenSV = scan.nextLine();

		System.out.println("Nhập điểm toán: ");
		this.diemToan = Float.parseFloat(scan.nextLine());

		System.out.println("Nhập điểm lý: ");
		this.diemLy = Float.parseFloat(scan.nextLine());

		System.out.println("Nhập điểm hóa: ");
		this.diemHoa = Float.parseFloat(scan.nextLine());

	}

	/**
	 * Phương thức xuất thông tin sinh viên.
	 */
	public void inSinhVien() {
		System.out.println("Sinh viên - Mã: " + this.idSV + "\tTên:" + this.tenSV + "\tToán: " + this.diemToan
				+ "\tLý: " + this.diemLy + "\tHóa: " + this.diemHoa + "\tĐTBTB: " + this.diemTB + "\tXếp Loại: "
				+ this.xepLoai);
	}

	/**
	 * Phương thức tính điểm trung bình của sinh viên.
	 */
	public void tinhDTB() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa) / 3;
	}

	/**
	 * Phương thức xếp loại sinh viên dựa theo điểm trung bình.
	 */
	public void xepLoaiSV() {
		if (this.diemTB >= 9) {
			this.xepLoai = "Xuất Sắc";
		} else if (this.diemTB >= 8) {
			this.xepLoai = "Giỏi";
		} else if (this.diemTB >= 7) {
			this.xepLoai = "Khá";
		} else if (this.diemTB >= 6) {
			this.xepLoai = "Trung bình Khá";
		} else if (this.diemTB >= 5) {
			this.xepLoai = "Trung Bình";
		} else {
			this.xepLoai = "Yếu";
		}
	}

	private String formatNumCell(Number num) {
		String paddLeft = "%5s";
		String paddRight = "%-8s";
		return String.format(paddLeft, " ") + String.format(paddRight, num) + "|";
	}

	private String formatTextCell(String text) {
		String paddLeft = "%-15s";
		return String.format(paddLeft, " " + text);
	}

	public void xuatRowFormat() {
		String text;
		text = formatNumCell(this.idSV);
		text += formatTextCell(this.tenSV) + "|";
		text += formatNumCell(this.diemToan);
		text += formatNumCell(this.diemLy);
		text += formatNumCell(this.diemHoa);

		double dtb = Math.round(this.diemTB * 100.0) / 100.0; // lam tron den 2 chu so phan thap phan
		text += formatNumCell(dtb);
		text += formatTextCell(this.xepLoai) + "||";
		System.out.println(text);

	}
}
