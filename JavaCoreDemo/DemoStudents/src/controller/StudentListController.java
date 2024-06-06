/**
 * StudentListController.java
 * 15-05-2024
 */
package controller;

import java.util.ArrayList;

import model.Student;
import model.StudentList;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class StudentListController {
	StudentList list = new StudentList();
	StudentController sc = new StudentController();

	public void input() {
		for (Student stu : list.getListStudent()) {
			stu = sc.inputStudent();
		}
	}

	public void addStudent(Student stu) {
		list.getListStudent().add(stu);
	}

	/**
	 * Phương thức tìm kiếm sinh viên theo xếp loại
	 * 
	 * @param scan
	 * @return
	 */
	public ArrayList<Student> findStudentByRating() {
		ArrayList<Student> listSVRating = new ArrayList<Student>();
		String ratingStudent = "";
		System.out.println("Nhập vào xếp loại cần lọc: ");
		ratingStudent = scan.nextLine();
		for (Student stu : student.getListSV()) {
			if (stu.getRating().equalsIgnoreCase(ratingStudent)) {
				listSVRating.add(stu);
			}
		}
		return listSVRating;
	}

	/**
	 * Phương thức tìm kiếm sinh viên theo tên
	 * 
	 * @param scan
	 * @return
	 */
	public ArrayList<Student> findStudentByName() {
		ArrayList<Student> listSVName = new ArrayList<Student>();
		String name = "";
		System.out.println("Nhập vào tên sinh viên cần lọc: ");
		name = scan.nextLine();
		for (Student stu : student.getListSV()) {
			if (stu.getFullName().equalsIgnoreCase(name)) {
				listSVName.add(stu);
			}
		}
		return listSVName;
	}

	/**
	 * Phương thức tìm kiếm sinh viên theo mã sinh viên
	 * 
	 * @param scan
	 * @return
	 */
	public ArrayList<Student> findStudentById() {
		ArrayList<Student> listSVRating = new ArrayList<Student>();
		int id;
		System.out.println("Nhập vào mã sinh viên cần tìm: ");
		id = Integer.parseInt(scan.nextLine());
		for (Student stu : list.getListStudent()) {
			if (stu.getIdStudent() == id) {
				listSVRating.add(stu);
				break;
			}
		}
		return listSVRating;
	}

	/**
	 * Phương thức xóa sinh viên theo mã sinh viên
	 * 
	 * @param scan
	 * @return
	 */
	public boolean deleteById() {
		boolean flag = true;
		int id = 0;
		System.out.println("Nhập mã sinh viên cần xóa:");
		id = Integer.parseInt(scan.nextLine());
		for (Student stu : listlist.getListStudent()) {
			if (stu.getIdStudent() == id) {
				list.getListStudent().remove(stu);
				break;
			} else {
				flag = false;
			}
		}
		return flag;
	}
}