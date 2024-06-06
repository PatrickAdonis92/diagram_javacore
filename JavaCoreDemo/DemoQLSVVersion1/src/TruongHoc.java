
/**
 * TruongHoc.java
 * 16-05-2024
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class TruongHoc {

	private DanhSachSinhVien dssvToanTruong;

	/**
	 * @return the dssvToanTruong
	 */
	public DanhSachSinhVien getDssvToanTruong() {
		return dssvToanTruong;
	}

	/**
	 * @param dssvToanTruong the dssvToanTruong to set
	 */
	public void setDssvToanTruong(DanhSachSinhVien dssvToanTruong) {
		this.dssvToanTruong = dssvToanTruong;
	}

	/**
	 * 
	 */
	public TruongHoc() {
		this.dssvToanTruong = new DanhSachSinhVien();
	}

	public void nhap() {
		SinhVien sv = new SinhVien(1, "Lan", 9.2f, 9, 9);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien(2, "Hùng", 4.2f, 4, 5.3f);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien(3, "Lan", 7.2f, 4, 9);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien(4, "Yến", 3.2f, 4, 4);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien(5, "Toàn", 9.2f, 10, 10);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien(6, "Hữu", 7.2f, 7, 6);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien(7, "Lý", 3.2f, 3, 3);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien(8, "Trung", 9.2f, 10, 10);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien(9, "Quyền", 7.2f, 7, 8);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien(10, "Linh", 5.2f, 5, 6);
		this.dssvToanTruong.themSinhVien(sv);
	}

	public void inSinhVien() {
		this.dssvToanTruong.xuat();
		;
	}

	public void themSinhVien(SinhVien sv) {
		this.dssvToanTruong.themSinhVien(sv);
	}

	public void tinhDTB() {
		this.dssvToanTruong.tinhDTB();
	}

	public void xepLoaiSV() {
		this.dssvToanTruong.xepLoaiSV();
		;
	}

	public ArrayList<SinhVien> timDTBMax() {
		return this.dssvToanTruong.timDTBMax();
	}

	public ArrayList<SinhVien> timSVTheoTen(String name) {
		return this.dssvToanTruong.timSVTheoTen(name);
	}

	public SinhVien timSVTheoId(int id) {
		return this.dssvToanTruong.timSVTheoMa(id);
	}

	public boolean xoaSVTheoId(int id) {
		return this.dssvToanTruong.xoaSVTheoMa(id);
	}

	public ArrayList<SinhVien> lietKeSVYeu() {
		return this.dssvToanTruong.listSVYeu();
	}

	public void xuatHelper(ArrayList<SinhVien> list) {
		for (SinhVien sv : list) {
			sv.inSinhVien();
		}
	}

	private void xuatLine() {
		System.out.println(
				"===================================================================================================================");
	}

	private String formatCell(String paddLeft, String title, String paddRight) {
		return String.format(paddLeft, " ") + title + String.format(paddRight, " ");
	}

	private void xuatRowHeader() {
		String paddString1 = "%3s";
		String paddString2 = "%4s";
		String paddString3 = "%5s";
		String paddString4 = "%6s";

		xuatLine();
		String text;
		text = "||" + formatCell(paddString1, "STT", paddString1) + "|";
		text += formatCell(paddString2, "Mã SV", paddString2) + "|";
		text += formatCell(paddString3, "Tên SV", paddString2) + "|";
		text += formatCell(paddString3, "Toán", paddString2) + "|";
		text += formatCell(paddString3, "Lý", paddString4) + "|";
		text += formatCell(paddString3, "Hóa", paddString3) + "|";
		text += formatCell(paddString3, "ĐTB", paddString3) + "|";
		text += formatCell(paddString2, "Xếp Loại", paddString1) + "||";
		System.out.println(text);
		xuatLine();

	}

	private void xuatCellThuTu(int i) {
		String paddLeft = "%3s";
		String paddRight = "%-6s";
		String text = "||" + String.format(paddLeft, " ") + String.format(paddRight, "" + i) + "|";
		System.out.print(text);
	}

	public void xuatTheoFormat(ArrayList<SinhVien> list) {
		xuatRowHeader();
		int i = 1;
		for (SinhVien sv : list) {
			xuatCellThuTu(i);
			sv.xuatRowFormat();
			i++;
		}
		xuatLine();
	}
}