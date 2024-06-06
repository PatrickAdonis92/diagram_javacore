/**
 * DeleteElementInArrayByValueX.java
 * 05-05-2024
 */
package array.core;

/**
 * <p>
 * Xóa tất cả các phần tử trong mảng có giá trị trùng với x. x do người dùng
 * nhập vào từ bàn phím
 * 
 * <ol>
 * Thuật toán:
 * 
 * <li>Đếm số lượng phần tử trùng với x để tính lại kích thước cho mảng tạm
 * 
 * <li>Duyệt mảng chính và phần tử nào !=x thì cho vào mảng tạm
 * </ol>
 *
 * @author: Nguyễn Hoàn
 */
public class DeleteElementInArrayByValueX {

	/**
	 * 
	 * @param number
	 * @param x
	 * @return
	 */
	public static boolean checkX(int number, int x) {
		if (number != x) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	public static int countElementByX(int arr[], int x) {
		int countX = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				countX++;
			}
		}
		return countX;
	}

	/**
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	public static int[] deleteElementInArray(int arr[], int x) {
		int countX = countElementByX(arr, x);
		if (countX > 0) {
			int arrTemp[] = new int[arr.length - countX];
			int j = 0;
			for (int i = 0; i < arr.length; i++) {
				if (checkX(arr[i], x) == true) {
					arrTemp[j] = arr[i];
					j++;
				}
			}
			arr = arrTemp;
		} else {
			System.out.println("Không có giá trị nào trong mảng trùng với X = " + x);
		}
		return arr;

	}
}
