/**
 * SymmetryAndRotateArray.java
 * 05-05-2024
 */
package array.core;

import java.util.Scanner;

/**
 * <p>
 * Viết chương trình thực hiện những yêu cầu sau:
 * </p>
 * <ol type="a">
 * <li>Tạo mảng một chiều có n phần tử nguyên có giá trị nhập vào từ bàn
 * phím.Kiểm tra xem mảng có đối xứng hay không.</li>
 * <li>Hãy dịch trái xoay vòng mảng k lần, k nhập từ bàn phím.</li>
 * </ol>
 *
 * @author: Nguyễn Hoàn
 */
public class SymmetryAndRotateArray {

	/**
	 * Hàm kiểm tra tính đối xứng của mảng
	 * 
	 * @param arr
	 * @return
	 *         <ul>
	 *         <li>true: mảng đối xứng
	 *         <li>false: mảng không đối xứng
	 *         </ul>
	 */
	public static boolean symmetryArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			if (arr[i] != arr[arr.length - i - 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Hàm xoay vòng mảng k lần với k nhập từ bàn phím, sử dụng mảng tạm
	 * 
	 * @param arr
	 * @param scan
	 * @return
	 */
	public static int[] rotateArrayUseTempArray(int arr[], Scanner scan) {
		int n = arr.length;
		int temp[] = new int[n];
		int k;
		do {
			System.out.println("Nhập k lớn hơn 0:  ");
			System.out.println("k = ");
			k = Integer.parseInt(scan.nextLine());
		} while (k < 0);
		k %= n;
		for (int i = 0; i < n; i++) {
			if (i < k) {
				temp[n - k + i] = arr[i];
			} else {
				temp[i - k] = arr[i];
			}
		}
		arr = temp;
		return arr;
	}

	/**
	 * Hàm xoay vòng mảng k lần với k nhập từ bàn phím
	 * 
	 * @param arr
	 * @param scan
	 * @return
	 */
	public static int[] rotateArray(int arr[], Scanner scan) {
		int n = arr.length;// lưu chiều dài mảng
		int k;
		do {
			System.out.println("Nhập số lần muốn xoay vòng mảng: ");
			System.out.println("k = ");
			k = Integer.parseInt(scan.nextLine());
		} while (k < 0);
		int temp;
		for (int i = 0; i < k; i++) {
			temp = arr[0];
			for (int j = 0; j < n - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[n - 1] = temp;
		}
		return arr;
	}
}
