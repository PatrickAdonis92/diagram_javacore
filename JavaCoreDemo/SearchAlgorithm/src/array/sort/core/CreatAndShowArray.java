/**
 * CreatAndShowArray.java
 * 03-05-2024
 */
package array.sort.core;

import java.util.Scanner;

/**
 * <p>
 * <b>CreatAndShowArray:</b>
 * <ul>
 * <li>inputData: nhập vào số phần tử n của mảng
 * <li>validatesData: kiểm tra lỗi của n
 * <li>createArray: tạo mảng có n phần tử với các phần tử được nhập từ bàn phím
 * <li>createArrayRandom: tạo mảng có n phần tử với các phần tử được tạo ngẫu
 * nhiên trong [-1000;1000]
 * <li>showArray: hiển thị mảng vừa mới tạo
 * </ul>
 *
 * @author: Nguyen Hoan
 */
public class CreatAndShowArray {

	private static final int MAX = 1000;
	private static final int MIN = -1000;

	/**
	 * Hàm nhập dữ liệu từ bàn phím
	 * 
	 * @param scan
	 * @return
	 */
	public static int inputData(Scanner scan) {
		String values = "";
		String errors = "";
		int n;
		while (true) {
			System.out.println("Nhập vào số phần tử n của mảng: ");
			values = scan.nextLine();
			errors = validatesData(values);
			if (!errors.equals("")) {
				System.out.println(errors);
				continue;
			} else {
				n = Integer.parseInt(values);
				break;
			}
		}
		return n;
	}

	/**
	 * Hàm kiểu tra độ chuẩn của dữ liệu nhập vào
	 * 
	 * @param values
	 * @return
	 */
	public static String validatesData(String values) {
		String errors = "";
		String digit = "\\d+";
		String spaceChar = "^[ \\\\s]+|[ \\\\s]+$";
		if (values.matches(spaceChar) || values.matches("")) {
			errors += "Hãy nhập giá trị cho n.";
		} else if (!(values.matches(digit)) || Integer.parseInt(values) == 0) {
			errors += "Số phần tử của mảng phải là số và lớn hơn 0.";
		}
		return errors;
	}

	/**
	 * Hàm tạo mảng với các giá trị ngẫu nhiên trong [-1000;1000]
	 * 
	 * @param n
	 * @return
	 */
	public static int[] createArrayRandom(int n) {
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (MIN + Math.random() * ((MAX - MIN) + 1));
		}
		return arr;
	}

	/**
	 * Hàm tạo mảng với các giá trị trong mảng được nhập từ bàn phím
	 * 
	 * @param n
	 * @param scan
	 * @return
	 */
	public static int[] createArray(int n, Scanner scan) {
		int arr[] = new int[n];
		System.out.println("Nhập các giá trị cho phần tử:");
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "] = ");
			arr[i] = Integer.parseInt(scan.nextLine());
		}
		return arr;
	}

	/**
	 * Hàm in mảng ra màn hình
	 * 
	 * @param arr
	 */
	public static void showArray(int arr[]) {
		for (int element : arr) {
			System.out.print(element + "\t");
		}
		System.out.print("\n");
	}

}
