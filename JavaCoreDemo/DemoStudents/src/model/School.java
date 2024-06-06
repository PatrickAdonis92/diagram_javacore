/**
 * School.java
 * 14-05-2024
 */
package model;

import java.util.ArrayList;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class School {

	private ArrayList<Student> listStudents;

	/**
	 * 
	 */
	public School() {
		listStudents = new ArrayList<Student>();
	}

	/**
	 * @return the listStudent
	 */
	public ArrayList<Student> getListStudent() {
		return listStudents;
	}

	/**
	 * @param listStudent the listStudent to set
	 */
	public void setListStudent(ArrayList<Student> listStudents) {
		this.listStudents = listStudents;
	}

}
