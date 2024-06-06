/**
 * DuplicateOnArray.java
 * 05-05-2024
 */
package array.core;

/**
 * Tạo mảng một chiều n phần tử nguyên có giá trị nhập vào từ bàn phím.Thống kê
 * số lần xuất hiện của các phần tử trong mảng.
 *
 * @author: Nguyễn Hoàn
 */
public class DuplicateOnArray extends CreatAndShowArray {

	/**
	 * Hàm đếm số lần xuất hiện của một phần tử trong mảng
	 * 
	 * @param arr mảng ban đầu
	 * @return trả về một mảng lưu số lần xuất hiện của các phần tử khác nhau của
	 *         mảng ban đầu
	 */
	public static int[] countDuplicateElement(int arr[]) {
		int arrTemp[] = new int[arr.length];
		// chạy 2 vòng lặp for, xét duyệt 2 mảng
		for (int i = 0; i < arr.length; i++) {
			// gán giá trị cho mảng tạm bằng 0
			arrTemp[i] = 0;
			for (int j = 0; j < arr.length; j++) {
				// Nếu xuất hiện phần tử trùng nhau trong mảng ban đầu mà vị trí thứ j < thứ i
				// (tức là chỉ xét mảng về vị trí bên phải)thì lập tức thoát khỏi vòng lặp,
				// ngược lại thì tăng giá trị của arrTemp[i] lên 1 đơn vị
				if (arr[i] == arr[j]) {
					if (j < i) {
						break;
					} else {
						arrTemp[i]++;
					}
				}
			}
		}
		// trả về mảng arrTemp với giá trị là số lần xuất hiện của mỗi phần tử trong
		// mảng đã cho ban đầu
		return arrTemp;
	}

	/**
	 * Hàm in ra số lần xuất hiện của các phần tử khác nhau trong một mảng
	 * 
	 * @param arr mảng chứa các phần tử cần đếm
	 */
	public static void printDuplicateElement(int arr[]) {
		int arrTemp[] = countDuplicateElement(arr);
		showArray(arrTemp);
		for (int i = 0; i < arrTemp.length; i++) {
			if (arrTemp[i] != 0) {
				System.out.println(arr[i] + "[" + arrTemp[i] + "]" + "\t");
			}
		}
	}
}
