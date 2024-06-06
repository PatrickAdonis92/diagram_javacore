
/**
 * XuLy.java
 * 12-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class XuLy {

	/**
	 * 
	 */
	public XuLy() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HinhChuNhat hcn = new HinhChuNhat();
		Scanner scan = new Scanner(System.in);
		hcn.nhap(scan);
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.xuat();
	}

}
