/**
 * AddOneNumberOnArrayInElementX.java
 * 05-05-2024
 */
package array.core;

import java.util.Scanner;

/**
 * Tạo ngẫu nhiên mảng một chiều n phần tử - n do người dùng nhập vào, có giá
 * trị chứa trong đoạn [-100, 100] và xuất mảng. Thêm 1 phần tử x tại vị trí k
 * do người dùng nhập vào.
 *
 * @author: Nguyễn Hoàn
 */
public class AddOneNumberOnArrayInElementX {

	/**
	 * Thêm 1 phần tử x tại vị trí k do người dùng nhập vào
	 * 
	 * @param arr
	 * @param scan
	 * @return
	 */
	public static int[] addElement(int arr[], Scanner scan) {
		int k;
		int x;
		int arrTemp[] = new int[arr.length + 1];
		do {
			System.out.println("Nhập vào vị trí k cần thêm: ");
			k = Integer.parseInt(scan.nextLine());
		} while (k < 0 || k > arr.length);

		for (int i = 0; i < arrTemp.length; i++) {
			if (i < k) {
				arrTemp[i] = arr[i];
			} else if (i == k) {
				System.out.println("Nhập giá trị thêm vào x = ");
				x = Integer.parseInt(scan.nextLine());
				arrTemp[k] = x;
			} else {
				arrTemp[i] = arr[i - 1];
			}
		}
		arr = arrTemp;
		return arr;
	}
}
