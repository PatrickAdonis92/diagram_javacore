/**
 * OneDimensionalArray.java
 * 05-05-2024
 */
package array.core;

import java.util.Scanner;

import constant.array.core.Constant;

/**
 * <h1>Viết chương trình thực hiện các yêu cầu sau:</h1>
 * <ol type="number">
 * <li>Tạo ngẫu nhiên mảng một chiều có n phần tử nguyên có giá trị chứa trong
 * đoạn [-1000;1000] và xuất mảng.
 * <li>Liệt kê các phần tử có dạng 3^k.Nếu mảng không có giá trị đó thì trả về
 * 0.
 * <li>Viết hàm liệt kê các cặp giá trị gần nhau nhất.
 * <li>Tính tổng các chữ số có số hàng chục là 5.
 * <li>Tính tổng các giá trị lớn hơn giá trị tuyệt đối của giá trị đứng liền sau
 * nó trong mảng.
 * <li>Xóa tất cả số chính phương trong mảng.
 * <li>Dịch phải xoay vòng mảng k lần, với k nhập từ bàn phím.
 * <li>Xuất phần tử xuất hiện nhiều nhất, xuất hiện ít nhất tìm thấy đầu tiên.
 * <li>Đảo ngược mảng ban đầu.
 * </ol>
 *
 * @author: Nguyễn Hoàn
 */
public class OneDimensionalArray extends Constant {
	// TODO finish class

	/**
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkNumber3k(int number) {
		while (number % 3 == 0) {
			number = number / 3;
		}
		if (number != 1) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param arr
	 */
	public static void printIndex3k(int arr[]) {
		int count = 0;
		for (int element : arr) {
			if (checkNumber3k(element)) {
				System.out.println();
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Không có phần tử nào có dạng 3^k.");
		}
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int findMinArray(int arr[]) {
		int mindArray = Math.abs(arr[0] - arr[1]);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (mindArray > Math.abs(arr[i] - arr[j])) {
					mindArray = Math.abs(arr[i] - arr[j]);
				}
			}
		}
		return mindArray;
	}

	/**
	 * 
	 * @param arr
	 */
	public static void showIndexMindArray(int arr[]) {
		int mindArray = findMinArray(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(arr[i] - arr[j]) == mindArray) {
					System.out.print("{" + arr[i] + ";" + arr[j] + "}" + "\t");
				}
			}
		}
		System.out.println();
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkNumberIsFive(int number) {
		number = Math.abs(number);
		number /= 10;
		int hangchuc = number % 10;
		if (hangchuc == 5) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int sumOfFive(int arr[]) {
		int sum = 0;
		for (int element : arr) {
			if (checkNumberIsFive(element)) {
				System.out.print(element + "\t");
				sum += element;
			}
		}
		return sum;
	}

	/**
	 * Tính tổng các giá trị lớn hơn giá trị tuyệt đối của giá trị đứng liền sau nó
	 * trong mảng.
	 * 
	 * @param ar
	 * @return
	 */
	public static int sumAbsArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > Math.abs(arr[i + 1])) {
				sum += arr[i];
			}
		}
		return sum;
	}

	/**
	 * Class kiểm tra một số tự nhiên có phải số chính phương hay không
	 * 
	 * @param x
	 * @return
	 *         <p>
	 *         <b>true:</b> số x là số chính phương
	 *         <p>
	 *         <b>false:</b> số x không phải số chính phương
	 */
	public static boolean checkPerfectSquare(int x) {
		double number = (double) Math.sqrt(x);
		if (number == Math.floor(number)) {
			return true;
		}
		return false;

	}

	/**
	 * Xóa tất cả số chính phương trong mảng.
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] deletePerfectSquareArray(int arr[]) {
		int arrTemp[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!checkPerfectSquare(arr[i])) {
				arrTemp[j++] = arr[i];
			}
		}
		arr = arrTemp;
		return arr;
	}

	/**
	 * Dịch phải xoay vòng mảng k lần, với k nhập từ bàn phím.
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] rotateArrayTurnRight(int arr[], Scanner scan) {
		int k;
		do {
			System.out.println("Nhập số lần dịch phải k = ");
			k = Integer.parseInt(scan.nextLine());
		} while (k < 0);
		k = k % arr.length;
		for (int i = 0; i < k; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
		return arr;
	}

	/**
	 * Reverse One Dimensional Array
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] reverseArray(int arr[]) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n / 2; i++) {
			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
		return arr;
	}

	/**
	 * <b>rotateArray:</b> dịch chuyển mảng sang trái or sang phải k lần với k nhập
	 * từ bàn phím
	 * 
	 * @param arr
	 * @param scan
	 * @return
	 */
	public static int[] rotateArray(int arr[], Scanner scan) {
		int n = arr.length;
		String turnArray = "";
		int k;
		do {
			System.out.println("Nhập số lần dịch chuyển k = ");
			k = Integer.parseInt(scan.nextLine());
		} while (k <= 0);
		k %= n;
		while (true) {
			System.out.println("Turn left or turn right???");
			turnArray = scan.nextLine();
			if (!turnArray.equalsIgnoreCase(TURN_RIGHT) && !turnArray.equalsIgnoreCase(TURN_LEFT)) {
				continue;
			}
			break;
		}
		int temp = 0;
		if (turnArray.equalsIgnoreCase(TURN_RIGHT)) {
			for (int i = 0; i < k; i++) {
				temp = arr[arr.length - 1];
				for (int j = arr.length - 1; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = temp;
			}
		} else {
			for (int i = 0; i < k; i++) {
				temp = arr[0];
				for (int j = 0; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[n - 1] = temp;
			}
		}
		return arr;
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkNumberByZero(int number) {
		if (number != 0) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int countNumberByZero(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (checkNumberByZero(arr[i])) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Xuất phần tử xuất hiện nhiều nhất, xuất hiện ít nhất tìm thấy đầu tiên.
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] maxMinOnArray(int arr[]) {
		int n = arr.length;
		int temp[] = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[j] == arr[i]) {
					if (j < i) {
						break;
					} else {
						temp[i]++;
					}
				}
			}
		}
		return temp;
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] arrayIsNoZero(int arr[]) {
		int n = countNumberByZero(arr);
		int temp[] = new int[n];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (checkNumberByZero(arr[i])) {
				temp[j++] = arr[i];
			}
		}
		return temp;
	}

	/**
	 * 
	 * @param arr
	 */
	public static void printNumberOfTimes(int arr[]) {
		int temp[] = maxMinOnArray(arr);
		for (int i = 0; i < arr.length; i++) {
			if (temp[i] != 0) {
				System.out.print(arr[i] + ":" + temp[i] + "\t");
			}
		}
		System.out.println();
	}

	/**
	 * 
	 * @param arr
	 */
	public static void printIndexMinMax(int arr[]) {
		int temp[] = maxMinOnArray(arr);
		int max = findMax(temp);
		for (int i = 0; i < arr.length; i++) {
			if (temp[i] == max) {
				System.out.println("Phần tử xuất hiện nhiều nhất là arr[" + i + "] = " + arr[i] + " với " + temp[i]
						+ " xuất hiện.");
				break;
			}
		}
		int tempMin[] = arrayIsNoZero(temp);
		int min = findMin(tempMin);
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == min) {
				System.out.println(
						"Phần tử xuất hiện ít nhất là arr[" + i + "] = " + arr[i] + " với " + temp[i] + " xuất hiện.");
				break;
			}
		}
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int findMin(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int findMax(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
