
/**
 * Person.java
 * 21-05-2024
 */

import java.util.Scanner;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class Person {

	// 1. Khai báo các thuộc tính - attributes
	protected String fullName;
	protected String address;
	protected String personId;
	protected String email;

	// 2. Khai báo các getter và setter
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the personId
	 */
	public String getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(String personId) {
		this.personId = personId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	// 3. Constructor không tham số và có tham số
	/**
	 * Constructor không tham số.
	 */
	public Person() {

	}

	/**
	 * Constructor có tham số.
	 * 
	 * @param name
	 * @param address
	 * @param id
	 * @param mail
	 */
	public Person(String id, String name, String address, String mail) {
		this.personId = id;
		this.fullName = name;
		this.address = address;
		this.email = mail;
	}

	// 4. Các phương thức nhập và xuất - Input and Output method.
	/**
	 * Phương thức nhập dữ liệu.
	 * 
	 * @param scan
	 */
	public void nhap(Scanner scan) {
		System.out.println("Information:");
		System.out.println("Person Indentification: ");
		this.personId = scan.nextLine();

		System.out.println("Fullname: ");
		this.fullName = scan.nextLine();

		System.out.println("Address: ");
		this.address = scan.nextLine();

		System.out.println("Email: ");
		this.email = scan.nextLine();
	}

	public void xuat() {
		System.out.print("ID:" + this.personId);
		System.out.print("\tFullname: " + this.fullName);
		System.out.print("\tAddress: " + this.address);
		System.out.print("\tEmail: " + this.email);
	}
}
