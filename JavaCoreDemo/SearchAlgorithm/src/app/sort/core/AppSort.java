/**
 * AppSort.java
 * 08-05-2024
 */
package app.sort.core;

import java.util.Scanner;

import array.sort.core.CreatAndShowArray;
import sort.core.SortAlgorithm;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class AppSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = CreatAndShowArray.inputData(scan);
		int arr[] = CreatAndShowArray.createArrayRandom(n);
		System.out.println("Mảng vừa khởi tạo:");
		CreatAndShowArray.showArray(arr);
		arr = SortAlgorithm.selectionSort(arr);
		System.out.println("Mảng sau khi sắp xếp:");
		CreatAndShowArray.showArray(arr);
	}

}
