
/**
 * DanhSachChuyenXe.java
 * 17-05-2024
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class DanhSachChuyenXe {

	private ArrayList<ChuyenXe> listChuyenXe;
	private float tongDoanhThu;
	private float doanhThuNoi;
	private float doanhThuNgoai;

	/**
	 * @return the dsChuyenXe
	 */
	public ArrayList<ChuyenXe> getListChuyenXe() {
		return listChuyenXe;
	}

	/**
	 * @param dsChuyenXe the dsChuyenXe to set
	 */
	public void setListChuyenXe(ArrayList<ChuyenXe> listChuyenXe) {
		this.listChuyenXe = listChuyenXe;
	}

	/**
	 * @return the tongDoanhThu
	 */
	public float getTongDoanhThu() {
		return tongDoanhThu;
	}

	/**
	 * @return the doanhThuNoi
	 */
	public float getDoanhThuNoi() {
		return doanhThuNoi;
	}

	/**
	 * @return the doanhThuNgoai
	 */
	public float getDoanhThuNgoai() {
		return doanhThuNgoai;
	}

	// 3.Constructor
	public DanhSachChuyenXe() {
		listChuyenXe = new ArrayList<ChuyenXe>();
	}

	public void dummyData() {
		ChuyenXe chuyenXe;
		chuyenXe = new ChuyenXeNoiThanh("1", "nội 1", "02", 1200, "số 12", 35);
		this.listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNoiThanh("2", "nội 2", "03", 1100, "số 14", 5.6f);
		this.listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNgoaiThanh("3", "ngoại 1", "05", 2000, "Bình Thuận", 2);
		this.listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNgoaiThanh("4", "ngoại 2", "07", 3000, "Nha Trang", 2);
		this.listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNoiThanh("6", "nội 3", "06", 2100, "số 15", 8.6f);
		this.listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNgoaiThanh("7", "ngoại 3", "09", 1500, "Bình Thuận", 1.5f);
		this.listChuyenXe.add(chuyenXe);
	}

	public void nhap(Scanner scan) {
		boolean flag = true;
		ChuyenXe cx;
		do {
			System.out.println("Mời chọn nhập: ");
			System.out.println("1. Chuyến xe nội thành.");
			System.out.println("2. Chuyến xe ngoại thành.");
			System.out.println("0. Thoát nhập.");
			int chose = Integer.parseInt(scan.nextLine());

			switch (chose) {
			case 1:
				cx = new ChuyenXeNoiThanh();
				cx.nhap(scan);
				this.listChuyenXe.add(cx);
				break;
			case 2:
				cx = new ChuyenXeNgoaiThanh();
				cx.nhap(scan);
				this.listChuyenXe.add(cx);
				break;
			case 0:
				flag = false;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + chose);
			}
		} while (flag);
	}

	public void xuat() {
		for (ChuyenXe cx : this.listChuyenXe) {
			cx.xuat();
		}
	}

	// 5. Business method
	/**
	 * Phương thức tính tổng doanh thu của tất cả các chuyến xe.
	 */
	public void tinhTongDoanhThu() {
		this.tongDoanhThu = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			this.tongDoanhThu += cx.getDoanhThu();
		}
		System.out.println(this.tongDoanhThu);
	}

	/**
	 * Phương thức tính tổng doanh thu của các chuyến xe ngoại thành.
	 */
	public void tinhTongDoangThuNgoai() {
		this.doanhThuNoi = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			if (cx instanceof ChuyenXeNgoaiThanh) {
				// Kiểm tra xem cx thuộc lớp đối tượng nào or được new ra từ lớp đối tượng nào
				this.doanhThuNgoai += cx.getDoanhThu();
			}
		}
		System.out.println(this.doanhThuNgoai);
	}

	/**
	 * Phương thức tính tổng doanh thu của các chuyến xe nội thành.
	 */
	public void tinhTongDoanhThuNoi() {
		this.doanhThuNoi = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			if (cx instanceof ChuyenXeNoiThanh) {
				this.doanhThuNoi += cx.getDoanhThu();
			}
		}
		System.out.println(this.doanhThuNoi);
	}

	/**
	 * Phương thức tính tổng doanh thu của các xe có nơi đến là Bình Thuận.
	 * 
	 * @return
	 */
	public float tinhDTCXBinhThuan(Scanner scan) {
		System.out.println("Địa chỉ bạn muốn tính doanh thu: ");
		String noiDen = scan.nextLine();
		float doanhThu = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			if (cx instanceof ChuyenXeNgoaiThanh) {
				ChuyenXeNgoaiThanh ngoaiThanh = (ChuyenXeNgoaiThanh) cx;
				if (ngoaiThanh.getNoiDen().equalsIgnoreCase(noiDen)) {
					doanhThu += ngoaiThanh.getDoanhThu();
				}
			}
		}
		return doanhThu;
	}
}
