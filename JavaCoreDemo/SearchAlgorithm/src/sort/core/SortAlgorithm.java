/**
 * SortAlgorithm.java
 * 09-05-2024
 */
package sort.core;

/**
 * Tổng hợp các thuật toán sắp xếp
 *
 * @author: Nguyễn Hoàn
 */
public class SortAlgorithm {

	/**
	 * <b>interchangeSort:</b> thuật toán sắp xếp đổi chỗ trực tiếp
	 * 
	 * @param arr
	 */
	public static int[] interchangeSort(int arr[]) {
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
		return arr;
	}

	/**
	 * <b>bubbleSort:</b> thuật toán sắp xếp nổi bọt.
	 * <p>
	 * <h2>Giải thuật:</h2>
	 * <ul>
	 * <li>Bước 1: i = 0
	 * <li>Bước 2: j = n - 1
	 * <p>
	 * Trong khi (j > i) thực hiện:
	 * <p>
	 * Nếu arr[j] < arr[j-1]: hoán vị arr[j] và arr[j-1]
	 * <li>Bước 3: i = i + 1
	 * <p>
	 * Nếu i = n : dừng
	 * <p>
	 * Ngược lại: lặp lại bước 2
	 * </ul>
	 * 
	 * @param arr
	 */
	public static int[] bubbleSort(int arr[]) {
		int i;
		int j;
		for (i = 0; i < arr.length; i++) {
			for (j = arr.length - 1; j > 0; j--) {
				if (j > i) {
					if (arr[j] < arr[j - 1]) {
						int temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
				}
			}
		}
		return arr;
	}

	/**
	 * Tìm vị trí của phần tử nhỏ nhất của mảng
	 * 
	 * @param arr
	 * @param index
	 * @return
	 */
	public static int findIndexMin(int arr[], int index) {
		int indexMin = index;
		for (int i = index + 1; i < arr.length; i++) {
			if (arr[i] < arr[indexMin]) {
				indexMin = i;
			}
		}
		return indexMin;
	}

	/**
	 * <b>selectionSort:</b> thuật toán sắp xếp chọn trực tiếp.
	 * <h2>Giải thuật</h2>
	 * <ul>
	 * <li>Bước 1: i = 1
	 * <li>Bước 2: Tìm phần tử arr[indexMin] nhỏ nhất trong dãy hiện hành từ arr[i]
	 * đến arr[N]
	 * <li>Bước 3: Hoán vị arr[indexMin] và arr[i]
	 * <li>Bước 4: i = i + 1
	 * <p>
	 * Nếu i < N thì lặp lại bước 2
	 * <p>
	 * Ngược lại: dừng vòng lặp
	 * </ul>
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] selectionSort(int arr[]) {
		int indexMin;
		for (int i = 0; i < arr.length - 1; i++) {
			indexMin = findIndexMin(arr, i);
			System.out.println(indexMin);
			int temp = arr[i];
			arr[i] = arr[indexMin];
			arr[indexMin] = temp;
		}
		return arr;
	}

	/**
	 * <b>insertionSort</b>: thuật toán sắp xếp chèn trực tiếp.
	 * <h2>Giải thuật:</h2>
	 * <ul>
	 * <li>Bước 1: i = 1 //Giả sử có đoạn arr[0] đã được sắp xếp
	 * <li>Bước 2: temp = arr[i];
	 * <p>
	 * Tìm vị trí thích hợp trong đoạn [1...i] để chèn arr[i] vào.
	 * <li>Bước 3: Dời chỗ các phần tử từ pos đến i-1 sang phải 1 vị trí để dành chỗ
	 * cho arr[i].
	 * <li>Bước 4: arr[pos] = temp //có đoạn arr[0]...arr[i] đã được sắp xếp.
	 * <li>BƯớc 5: i = i+ 1;
	 * <p>
	 * Nếu i =< (arr.length - 1): lặp lại bước 2
	 * <p>
	 * Ngược lại: dừng vòng lặp
	 * </ul>
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] insertionSort(int arr[]) {
		int pos;
		int temp;
		for (int i = 1; i < arr.length - 1; i++) {
			temp = arr[i];// phần tử đang cần chèn
			pos = i - 1;// vị trí trước phần tử cần chèn
			while ((pos >= 0) && (arr[pos] > temp)) {
				arr[pos + 1] = arr[pos];// dời về sau
				pos--;
			}
			arr[pos + 1] = temp;// chèn vào vị trí đúng thứ tựtự
		}
		return arr;
	}

	public static int[] quickSort(int arr[], int left, int right) {
		int i, j, x;
		x = arr[(left + right) / 2];
		i = left;
		j = right;
		do { // phân hoạch
			while (arr[i] < x) { // chạy nửa bên trái
				i++;
			}
			while (arr[j] > x) { // chạy nửa bên phảiphải
				j--;
			}
			if (i < j) { // hoán vị nếu sai vị trí
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = arr[i];
				i++;
				j--;
			}
		} while (i < j);
		if (left < j) {
			quickSort(arr, left, j); // đệ quy các đoạn bên trái
		}
		if (right > i) {
			quickSort(arr, i, right); // đệ quy các đoạn bên phải
		}

		return arr;
	}
}
