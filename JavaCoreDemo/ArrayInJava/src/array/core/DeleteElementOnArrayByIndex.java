/**
 * DeleteElementOnArrayByIndex.java
 * 05-05-2024
 */
package array.core;

import java.util.Scanner;

/**
 * Tạo ngẫu nhiên mảng một chiều n phần tử nguyên có giá trị chứa trong đoạn
 * [-100, 100] và xuất mảng. Xóa phần tử có chỉ số p (p nhập từ bàn phím) trong
 * mảng. Yêu cầu kiểm tra chỉ số nhập vào hợp lệ
 *
 * @author: Nguyễn Hoàn
 */
public class DeleteElementOnArrayByIndex {

	/**
	 * Hàm xóa phần tử có chỉ số index trong mảng
	 * 
	 * @param arr  : mảng ban đầu
	 * @param scan
	 * @return arr : trả về mảng sau khi đã xóa
	 */
	public static int[] deleteByIndex(int arr[], Scanner scan) {
		int index;
		int arrTemp[] = new int[arr.length - 1];
		do {
			System.out.println("Nhập vào vị trí p cần xóa: ");
			index = Integer.parseInt(scan.nextLine());
		} while (index < 0 || index >= arr.length);
		for (int i = 0; i < arrTemp.length; i++) {
			if (i < index) {
				arrTemp[i] = arr[i];
			} else {
				arrTemp[i] = arr[i + 1];
			}
		}
		arr = arrTemp;
		return arr;
	}

}
