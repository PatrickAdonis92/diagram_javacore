/**
 * RunMaxLengthOnArray.java
 * 05-05-2024
 */
package array.core;

/**
 * <p>
 * Tạo ngẫu nhiên mảng một chiều n phần tử nguyên có giá trị chứa trong đoạn [-
 * 100, 100] và xuất mảng. Xuất ra màn hình “run” tăng dài nhất tìm thấy đầu
 * tiên.
 * </p>
 * 
 * <h1>Giải thuật:</h1>
 * 
 * <p>
 * <b>index</b> - chỉ số phần tử đầu của <b>run</b>, được cập nhật là phần tử
 * ngay sau <b>run</b> trước, khi dò tìm <b>run</b> mới. Ban đầu index được khởi
 * tạo bằng 0.
 * </p>
 * 
 * <p>
 * <b>count</b> - chiều dài của <b>run</b>, đếm số phần tử thỏa mãn tính chất
 * trong chuỗi <b>run</b>
 * </p>
 * 
 * <p>
 * Để so sánh giữa các <b>run</b>, dùng 2 biến lưu kết quả dò tìm:
 * </p>
 * 
 * <li><b>maxLength</b> - lưu chiều dài <b>run</b> dài nhất hiện tại, sẽ được
 * cập nhật nếu phát hiện <b>run</b> có chiều dài lớn hơn.</li>
 * 
 * <li><b>maxIndex</b> - lưu chỉ số phần tử <b>index</b> của <b>run</b> dài nhất
 * hiện tại, nghĩa là có chiều dài tương ứng maxLength</li>
 * </ul>
 *
 * @author: Nguyễn Hoàn
 */
public class RunMaxLengthOnArray {

	/**
	 * Hàm in ra dẫy số tăng dài nhất trong mảng
	 * 
	 * @param arr: mảng đã cho
	 */
	public static void printMaxRun(int arr[]) {
		System.out.println(arr.length);
		int index = 0;
		int maxIndex = 0; // vị trí đầu tiên trong chuỗi tăng
		int maxLength = 0;// độ dài của chuỗi tăng
		do {
			// nếu a[i]<a[i+1] thì tăng biến đếm count lên 1 đơn vị, ngược lại thì thoát
			// khỏi vòng for
			int i;
			int count = 1;
			for (i = index; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					count++;
				} else {
					break;
				}

			}

			if (count > maxLength) {
				maxLength = count;
				maxIndex = index;
			}
			index = i + 1;
		} while (index < arr.length);
		System.out.println("Run dài nhất là:");
		for (int i = 0; i < maxLength; i++) {
			System.out.print(arr[maxIndex + i] + "\t");
		}
	}
}
