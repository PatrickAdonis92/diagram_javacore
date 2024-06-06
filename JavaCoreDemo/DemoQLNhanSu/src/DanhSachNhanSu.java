
/**
 * DanhSachNhanSu.java
 * 22-05-2024
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class DanhSachNhanSu {

	// Attributes
	private ArrayList<NhanSu> listNhanSu;

	// Getter - Setter
	/**
	 * @return the listNhanSu
	 */
	public ArrayList<NhanSu> getListNhanSu() {
		return listNhanSu;
	}

	/**
	 * @param listNhanSu the listNhanSu to set
	 */
	public void setListNhanSu(ArrayList<NhanSu> listNhanSu) {
		this.listNhanSu = listNhanSu;
	}

	// Constructor
	/**
	 * Constructor không tham số.
	 */
	public DanhSachNhanSu() {
		setDefault();
	}

	/**
	 * Phương thức cài đặt cái thiết lập mặc định.
	 */
	private void setDefault() {
		listNhanSu = new ArrayList<NhanSu>();
	}

	// Input - Output method

	private void inMenu() {
		System.out.println("Chức năng nhập thông tin nhân sự:");
		System.out.println("1. Nhập nhân viên thường.");
		System.out.println("2. Nhập trưởng phòng.");
		System.out.println("3. Nhập giám đốc.");
		System.out.println("0. Thoát.");
	}

	public ArrayList<NhanSu> nhap(Scanner scan) {
		boolean flag = true;
		ArrayList<NhanSu> listNewMember = new ArrayList<NhanSu>();
		NhanSu nhanSu = null;
		do {
			inMenu();
			int chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1:
				nhanSu = new NhanVienThuong();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				this.themNhanSu(nhanSu);
				NhanVienThuong nvt = (NhanVienThuong) nhanSu;
				listNewMember.add(nvt);
				break;
			case 2:
				nhanSu = new TruongPhong();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				this.themNhanSu(nhanSu);
				break;
			case 3:
				nhanSu = new GiamDoc();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				this.themNhanSu(nhanSu);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Chỉ chọn từ 1 - 3.");
			}
		} while (flag);
		return listNewMember;
	}

	public void xuat() {
		for (NhanSu ns : this.listNhanSu) {
			ns.xuat();
		}
	}

	public void themNhanSu(NhanSu ns) {
		this.listNhanSu.add(ns);
	}

	// Business method
	public void tinhLuong() {
		for (NhanSu ns : this.listNhanSu) {
			ns.tinhLuong();
		}
	}
}
