/**
 * StudentsView.java
 * 14-05-2024
 */
package view;

import java.util.ArrayList;

import model.Student;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class StudentsView {

	Student stu = new Student();

	private String formatNumCell(Number num) {
		String paddLeft = "%5s";
		String paddRight = "%-8s";
		return String.format(paddLeft, " ") + String.format(paddRight, num) + "|";
	}

	private String formatTextCell(String text) {
		String paddLeft = "%-15s";
		return String.format(paddLeft, " " + text);
	}

	public void printRowFormat() {
		String text;
		text = formatNumCell(stu.getIdStudent());
		text += formatTextCell(stu.getFullName()) + "|";
		text += formatTextCell(stu.getEmail()) + "|";
		text += formatNumCell(stu.getDiemToan()) + "|";
		text += formatNumCell(stu.getDiemLy()) + "|";
		text += formatNumCell(stu.getDiemHoa()) + "|";
		text += formatNumCell(stu.getDiemTB()) + "|";
		text += formatTextCell(stu.getRating()) + "||";
		System.out.println(text);
	}

	private void printLine() {
		System.out.println("===================================================================================");
	}

	private String formatCell(String paddLeft, String tittle, String paddRight) {
		return String.format(paddLeft, " ") + tittle + String.format(paddRight, " ");
	}

	private void printHeader() {
		String paddString1 = "%3s";
		String paddString2 = "%4s";
		String paddString3 = "%5s";
		String paddString4 = "%6s";
		printLine();
		String text;
		text = "||" + formatCell(paddString1, "STT", paddString1);
		text += formatCell(paddString1, "Mã Sinh Viên", paddString1);
		text += formatCell(paddString2, "Họ Tên", paddString2);
		text += formatCell(paddString2, "Email", paddString2);
		text += formatCell(paddString2, "Toán", paddString2);
		text += formatCell(paddString4, "Lý", paddString4);
		text += formatCell(paddString3, "Hóa", paddString3);
		text += formatCell(paddString1, "Trung Bình", paddString1);
		text += formatCell(paddString2, "Xếp Loại", paddString2);
		System.out.println(text);
		printLine();
	}

	private void printCellThuTu(int i) {
		String paddLeft = "%3s";
		String paddRight = "%-6s";
		String text = "||" + String.format(paddLeft, " ") + String.format(paddRight, "" + i) + "|";
		System.out.println(text);
	}

	public void printByFormat(ArrayList<Student> list) {
		printHeader();
		int i = 1;
		for (Student stu : list) {
			printCellThuTu(i);
			printRowFormat();
			i++;
		}
		printLine();
	}
}
