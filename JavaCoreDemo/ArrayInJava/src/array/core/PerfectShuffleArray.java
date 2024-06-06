/**
 * PerfectShuffleArray.java
 * 05-05-2024
 */
package array.core;

import java.util.Scanner;

/**
 * <h1>Viết chương trình thực hiện những yêu cầu sau:</h1>
 * 
 * <ol type="a">
 * <li>Tạo ngẫu nhiên mảng một chiều có n phần tử nguyên (n chẵn) có giá trị
 * chứa trong đoạn [-1000,1000] và xuất mảng. Kiểm tra nhập hợp lệ n > 2 và n
 * phải là số chẵn.</li>
 * <li>Viết hàm thực hiện việc trộn hoàn hảo (perfect shuffle) một mảng: sao cho
 * các phần tử của một nửa mảng sau xen kẽ với các phần tử của một nửa mảng đầu.
 * Xuất mảng sau khi trộn.</li>
 * <li>Xác định số lần trộn hoàn hảo để mảng trở về như ban đầu.</li>
 * </ol>
 *
 * @author: Nguyễn Hoàn
 */
public class PerfectShuffleArray {

	/**
	 * Hàm nhập vào từ bàn phím số phần tử của mảng, với điều kiện số phần tử của
	 * mảng lớn hơn 2 và là số chẵn
	 * 
	 * @param scan biến nhận dữ liệu từ bàn phím
	 * @return n: số phần tử của mảng
	 */
	public static int inputN(Scanner scan) {
		while (true) {
			System.out.println("Nhập vào số phần tử của mảng n = ");
			int n = Integer.parseInt(scan.nextLine());
			if (isEven(n)) {
				return n;
			} else {
				System.out.println("Nhập n phải lớn hơn 2 và là số chẵn.");
			}
		}
	}

	/**
	 * Hàm kiểm tra xem số tự nhiên truyền vào có phải là số chẵn không?
	 * 
	 * @param n số tự nhiên
	 * @return true: nếu là số chẵn, false: nếu là số lẻ
	 */
	public static boolean isEven(int n) {
		if (n % 2 == 0 && n > 2) {
			return true;
		}
		return false;
	}

	/**
	 * Hàm thực hiện việc trộn hoàn hảo một mảng
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] shuffleArray(int arr[]) {
		// Tạo mảng tạm để lưu trữ 2 phần của mảng gốc
		// Duyệt vòng lặp index = n/2
		// gán phần tử chẵn mảng tạm là phần tử thứ a[i]
		// gán phần tử lẻ mảng tạm là phần tử từ vị trí index trở đi
		// chép mảng tạm vào mảng gốc
		int temp[] = new int[arr.length];
		int index = arr.length / 2;
		for (int i = 0; i < index; i++) {
			temp[i * 2] = arr[i];
			temp[i * 2 + 1] = arr[index + i];
		}
		arr = temp;
		return arr;
	}

	// Thuận toán xác định số lần trộn hoàn hảo để mảng trở về như ban đầu
	// Viết hàm kiểm tra 2 mảng bằng nhau
	// Duyệt vòng lặp cho đến khi bằng nhau thì dừng, mỗi lần lặp tăng biến đếm

	/**
	 * Hàm so sánh 2 mảng
	 * 
	 * @param arr
	 * @param temp
	 * @return
	 */
	public static boolean isEqual(int arr[], int temp[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != temp[i]) {
				return false;
			}
		}
		return true;
	}

	public static int countShuffleArray(int arr[]) {
		int count = 1;
		int temp[] = new int[arr.length];
		temp = shuffleArray(arr);
		do {
			temp = shuffleArray(temp);
			System.out.println("Temp: ");
			for (int element : temp) {
				System.out.print(element + "\t");
			}
			System.out.println();
			count++;
		} while (!isEqual(arr, temp));
		return count;
	}
}
