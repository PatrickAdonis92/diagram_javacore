/**
 * StudentController.java
 * 14-05-2024
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import model.Student;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class StudentController {

	Student student = new Student();
	Scanner scan = new Scanner(System.in);

	/**
	 * 
	 */
	public StudentController() {
		// TODO Auto-generated constructor stub
	}

	public Student inputStudent() {
		System.out.println("Nhập tên sinh viên: ");
		String fullName = scan.nextLine();

		System.out.println("Nhập mã sinh viên: ");
		int id = Integer.parseInt(scan.nextLine());

		System.out.println("Nhập email: ");
		String email = scan.nextLine();

		System.out.println("Nhập điểm toán: ");
		float diemToan = Float.parseFloat(scan.nextLine());

		System.out.println("Nhập điểm Lý: ");
		float diemLy = Float.parseFloat(scan.nextLine());

		System.out.println("Nhập điểm Hóa: ");
		float diemHoa = Float.parseFloat(scan.nextLine());

		double diemTB = tinhDTB(diemToan, diemLy, diemHoa);

		String rating = ratingStudents(diemTB);

		student = new Student(fullName, email, id, diemToan, diemLy, diemHoa, diemTB, rating);
		return student;
	}

	/**
	 * Phương thức tính điểm trung bình của sinh viên.
	 * 
	 * @param diemToan
	 * @param diemLy
	 * @param diemHoa
	 * @return
	 */
	private double tinhDTB(float diemToan, float diemLy, float diemHoa) {
		float diemTB;
		diemTB = (diemToan + diemLy + diemHoa) / 3;
		double dTB = Math.round(diemTB * 100.0) / 100.0;
		return dTB;
	}

	/**
	 * Phương thức xếp loại học lực sinh viên.
	 * 
	 * @param diemTB
	 * @return
	 */
	private String ratingStudents(double diemTB) {
		String rating = "";
		if (diemTB >= 9) {
			rating = "Xuất Sắc";
		} else if (diemTB < 9 && diemTB >= 8) {
			rating = "Giỏi";
		} else if (diemTB < 8 && diemTB >= 7) {
			rating = "Khá";
		} else if (diemTB < 7 && diemTB >= 6) {
			rating = "Trung Bình Khá";
		} else if (diemTB < 6 && diemTB >= 5) {
			rating = "Trung Bình";
		} else {
			rating = "Yếu";
		}
		return rating;
	}

	/**
	 * Phương thức xuất thông tin sinh viên ra màn hình.
	 */
	public void printStudents() {
		System.out.println("Sinh viên - Mã: " + student.getIdStudent() + "\tHọ tên: " + student.getFullName()
				+ "\tEmail: " + student.getEmail() + "\tĐiểm toán: " + student.getDiemToan() + "\tĐiểm lý:"
				+ student.getDiemLy() + "\tĐiểm hóa: " + student.getDiemHoa() + "\tĐiểm trung bình: "
				+ student.getDiemTB() + "\tXếp loại: " + student.getRating());
	}

}
