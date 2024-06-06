
/**
 * ListPerson.java
 * 21-05-2024
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class ListPerson {

	// Attributes
	private ArrayList<Person> listPerson;

	// Getter - Setter
	/**
	 * @return the listPerson
	 */
	public ArrayList<Person> getListPerson() {
		return listPerson;
	}

	/**
	 * @param listPerson the listPerson to set
	 */
	public void setListPerson(ArrayList<Person> listPerson) {
		this.listPerson = listPerson;
	}

	// Constructor
	/**
	 * Constructor không tham số
	 */
	public ListPerson() {
		setDefault();
	}

	/**
	 * Phương thức cài đặt các thiết lập mặc định.
	 */
	private void setDefault() {
		listPerson = new ArrayList<Person>();
	}

	// Input - Output method
	/**
	 * Phương thức nhập dữ liệu vào list.
	 * 
	 * @param scan
	 */
	public void nhap(Scanner scan) {
		boolean flag = true;
		Person person;
		do {
			System.out.println("Chọn phương thức nhập:");
			System.out.println("1. Student.");
			System.out.println("2. Employee.");
			System.out.println("3. Custormer.");
			System.out.println("0. Thoát.");
			int chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1:
				person = new Student();
				person.nhap(scan);
				this.listPerson.add(person);
				break;
			case 2:
				person = new Employee();
				person.nhap(scan);
				this.listPerson.add(person);
				break;
			case 3:
				person = new Customer();
				person.nhap(scan);
				this.listPerson.add(person);
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}

	public void xuat() {
		System.out.println("Person Information: ");
		for (Person p : this.listPerson) {
			p.xuat();
		}
	}

	// Business method
	/**
	 * Phương thức tạo dữ liệu giả.
	 */
	public void dummyData() {
		Person person;
		person = new Student("1", "long", "92 Tân định", "abc@gmail.com", 8, 4, 9);
		this.listPerson.add(person);

		person = new Student("2", "hùng", "2 Nhà bè", "daabc@gmail.com", 5, 10, 9);
		this.listPerson.add(person);

		person = new Employee("3", "Lan", "4 Phú Tân", "fdaabc@gmail.com", 15, 20);
		this.listPerson.add(person);

		person = new Employee("4", "Việt", "3 Bến Tre", "dgbc@gmail.com", 20, 20);
		this.listPerson.add(person);

		person = new Employee("5", "Ngà", "4 Tiền Giang", "ddgbc@gmail.com", 30, 24);
		this.listPerson.add(person);

		person = new Customer("6", "An", "5 Đà Nẵng", "ddgbc@gmail.com", "CyberLearn", 20, "Good");
		this.listPerson.add(person);

		person = new Customer("7", "Vùng", "8 Đà Nẵng", "rdgbc@gmail.com", "CyberSoft", 25, "Very Good");
		this.listPerson.add(person);

	}

	public boolean deletePersonById(String id) {
		boolean flag = false;
		for (Person p : this.listPerson) {
			if (p.getPersonId().equalsIgnoreCase(id)) {
				this.listPerson.remove(p);
				flag = true;
				break;
			}
		}
		return flag;
	}

	/**
	 * Phương thức sắp xếp theo họ tên.
	 */
	public void sortPersonByName() {
		sortName(listPerson);
	}

	/**
	 * Phương thức sắp xếp danh sách theo họ tên.
	 * @param list
	 */
	public void sortName(ArrayList<Person> list) {
		int i, j;
		for (i = 0; i < list.size() - 1; i++) {
			for (j = i + 1; j < list.size(); j++) {
				Person p1 = list.get(i);
				Person p2 = list.get(j);
				if (p2.getFullName().compareToIgnoreCase(p1.getFullName()) < 0) {
					Collections.swap(list, i, j);
				}
			}
		}
	}
}
