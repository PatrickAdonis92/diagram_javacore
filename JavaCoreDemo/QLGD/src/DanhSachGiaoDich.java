
/**
 * DanhSachGiaoDich.java
 * 21-05-2024
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class DanhSachGiaoDich {

	private ArrayList<GiaoDich> listGD;
	private int tongSLGDVang;
	private int tongSLGDTienTe;
	private float trungBinhGDTienTe;

	/**
	 * @return the listGD
	 */
	public ArrayList<GiaoDich> getListGD() {
		return listGD;
	}

	/**
	 * @param listGD the listGD to set
	 */
	public void setListGD(ArrayList<GiaoDich> listGD) {
		this.listGD = listGD;
	}

	/**
	 * @return the tongSLGDVang
	 */
	public int getTongSLGDVang() {
		return tongSLGDVang;
	}

	/**
	 * @return the tongSLGDTienTe
	 */
	public int getTongSLGDTienTe() {
		return tongSLGDTienTe;
	}

	/**
	 * @return the trungBinhGDTienTe
	 */
	public float getTrungBinhGDTienTe() {
		return trungBinhGDTienTe;
	}

	/**
	 * Constructor không tham số.
	 */
	public DanhSachGiaoDich() {
		listGD = new ArrayList<GiaoDich>();
	}

	/**
	 * Phương thức nhập dữ liệu.
	 * 
	 * @param scan
	 */
	public void nhap(Scanner scan) {
		boolean flag = true;
		GiaoDich giaoDich;
		do {
			System.out.println("Chọn loại giao dịch: ");
			System.out.println("1. Giao dịch tiền tệ.");
			System.out.println("2. Giao dịch vàng.");
			System.out.println("0. Thoát.");
			int chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1:
				giaoDich = new GiaoDichTienTe();
				giaoDich.nhap(scan);
				giaoDich.nhapTiGia();
				giaoDich.tinhTien();
				this.listGD.add(giaoDich);
				break;
			case 2:
				giaoDich = new GiaoDichVang();
				giaoDich.nhap(scan);
				giaoDich.tinhTien();
				this.listGD.add(giaoDich);
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}

	/**
	 * Phương thức xuất dữ liệu.
	 */
	public void xuat() {
		for (GiaoDich gd : this.listGD) {
			gd.xuat();
		}
	}

	/**
	 * Phương thức xuất giao dịch có đơn giá lớn hơn 1 tỷ.
	 * 
	 * @return
	 */
	public void xuatGiaoDichLonHon1Ty() {
		for (GiaoDich gd : this.listGD) {
			if (gd.getDonGia() > 1000000000) {
				gd.xuat();
			}
		}
	}

	public void tongSoLuongGiaoDichTienTe() {
		this.tongSLGDTienTe = 0;
		for (GiaoDich gd : this.listGD) {
			if (gd instanceof GiaoDichTienTe) {
				this.tongSLGDTienTe += gd.soLuong;
			}
		}
	}

	public void tongSoLuongGiaoDichVang() {
		this.tongSLGDVang = 0;
		for (GiaoDich gd : this.listGD) {
			if (gd instanceof GiaoDichVang) {
				this.tongSLGDVang += gd.soLuong;
			}
		}
	}

	public void tinhTrungBinhGDTT() {
		float thanhTien = 0;
		for (GiaoDich gd : this.listGD) {
			if (gd instanceof GiaoDichTienTe) {
				thanhTien += gd.thanhTien;
			}
		}
		this.trungBinhGDTienTe = thanhTien / this.tongSLGDTienTe;
	}

	public void tinhTienChoCacGiaoDich() {
		for (GiaoDich gd : this.listGD) {
			gd.tinhTien();
		}
	}

	public void dummyData() {
		GiaoDich giaoDich = new GiaoDichVang(1, 1, 1, 2020, 4, 5, "SJC");
		this.listGD.add(giaoDich);

		giaoDich = new GiaoDichVang(2, 2, 1, 2020, 5, 10, "SJC");
		this.listGD.add(giaoDich);

		giaoDich = new GiaoDichVang(3, 3, 4, 2020, 12, 11, "9999");
		this.listGD.add(giaoDich);

		giaoDich = new GiaoDichTienTe(4, 5, 5, 2020, 900, 10, "USD");
		giaoDich.nhapTiGia();
		this.listGD.add(giaoDich);

		giaoDich = new GiaoDichTienTe(5, 6, 7, 2020, 4100, 11, "EUR");
		giaoDich.nhapTiGia();
		this.listGD.add(giaoDich);
	}
}
