
/**
 * AppStudents.java
 * 10-05-2024
 */
import java.util.ArrayList;
import java.util.Scanner;

import controller.StudentController;
import model.Student;
import view.MenuApp;
import view.StudentsView;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class AppStudents {

	/**
	 * 
	 */
	public AppStudents() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentController stControll = new StudentController();
		stControll.input();
		stControll.printStudents();
		ArrayList<Student> list = new ArrayList<Student>();
		list = stControll.findStudentByRating();
		if (list.size() > 0) {
			StudentsView sv = new StudentsView();
			sv.printByFormat(list);
		} else {
			System.out.println("Không tìm thấy");
		}

//		MenuApp.doMenu(scan, listStudents);
	}

}
