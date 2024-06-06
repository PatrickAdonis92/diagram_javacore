/**
 * InterchangeSort.java
 * 08-05-2024
 */
package sort.core;

/**
 * <b>InterchangeSort:</b> thuật toán sắp xếp đổi chỗ trực tiếp.
 *
 * @author: Nguyễn Hoàn
 */
public class InterchangeSort {

	/**
	 * <b>interchangeSort:</b> thuật toán sắp xếp đổi chỗ trực tiếp
	 * 
	 * @param arr
	 */
	public static void interchangeSort(int arr[]) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
