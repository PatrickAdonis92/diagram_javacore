/**
 * StudentList.java
 * 15-05-2024
 */
package model;

import java.util.ArrayList;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class StudentList {

	private ArrayList<Student> listStudent;

	/**
	 * 
	 */
	public StudentList() {
		this.listStudent = new ArrayList<Student>();
	}

	/**
	 * @return the listStudent
	 */
	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

	/**
	 * @param listStudent the listStudent to set
	 */
	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}

}
