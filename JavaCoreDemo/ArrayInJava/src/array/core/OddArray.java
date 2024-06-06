/**
 * OddArray.java
 * 05-05-2024
 */
package array.core;

/**
 * <ol style="list-style-type:lower-alpha">
 * Viết chương trình thực hiện những yêu cầu sau:
 * <li>Tạo ngẫu nhiên mảng một chiều n phần tử nguyên có giá trị chứa trong đoạn
 * [- 100, 100] và xuất mảng. Đếm số phần tử chia hết cho 4 và có chữ số tận
 * cùng là 6.
 * <li>Thay các phần tử lẻ bằng 2 lần giá trị của nó.
 * </ol>
 * <p>
 * <b>Ghi chú & giải thuật:</b>
 * <ul>
 * <li>nhập số phần tử của mảng – inputN
 * <li>tạo mảng – createArray
 * <li>xuất mảng – printArray
 * <li>tách các chữ số trong một số – seperateNumber
 * <li>kiểm tra số lẻ – isOdd
 * <li>kiểm tra chữ số tận cùng là 6 – isCharFinalSix
 * </ul>
 *
 * @author: Nguyễn Hoàn
 */
public class OddArray {

	/**
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isCharFinalSix(int number) {
		number = Math.abs(number);
		while (number > 10) {
			number = number % 10;
		}
		if (number == 6) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isDivisibleByFour(int number) {
		number = Math.abs(number);
		int division = number % 4;
		if (division == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isOdd(int number) {
		number = Math.abs(number);
		if (number % 2 != 0) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] doubleOddInArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (isOdd(arr[i])) {
				arr[i] = arr[i] * 2;
			}
		}
		return arr;
	}
}
