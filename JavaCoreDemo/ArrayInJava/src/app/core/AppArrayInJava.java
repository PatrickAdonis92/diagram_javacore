/**
 * AppArrayInJava.java
 * 2024-05-03
 */
package app.core;

import java.util.Scanner;

import array.core.CreatAndShowArray;
import array.core.OneDimensionalArray;
import array.core.SymmetryAndRotateArray;

/**
 * Class chứa hàm <b>main</b> để thực thi chương trình
 *
 * @author: Nguyen Hoan
 */
public class AppArrayInJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = CreatAndShowArray.inputData(scan);
		int arr[] = CreatAndShowArray.createArray(n, scan);
//		int arrTemp[];
		System.out.println("Mảng vừa tạo:");
		CreatAndShowArray.showArray(arr);
		OneDimensionalArray.rotateArray(arr, scan);
		OneDimensionalArray.printNumberOfTimes(arr);
		OneDimensionalArray.printIndexMinMax(arr);
	}

}
