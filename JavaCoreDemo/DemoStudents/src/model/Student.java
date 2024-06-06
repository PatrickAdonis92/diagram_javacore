/**
 * Students.java
 * 10-05-2024
 */
package model;

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class Student {

	private String fullName;
	private String email;
	private int idStudent;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private double diemTB;
	private String rating;

	/**
	 * @return the diemToan
	 */
	public float getDiemToan() {
		return diemToan;
	}

	/**
	 * @param diemToan the diemToan to set
	 */
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	/**
	 * @return the diemLy
	 */
	public float getDiemLy() {
		return diemLy;
	}

	/**
	 * @param diemLy the diemLy to set
	 */
	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	/**
	 * @return the diemHoa
	 */
	public float getDiemHoa() {
		return diemHoa;
	}

	/**
	 * @param diemHoa the diemHoa to set
	 */
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	/**
	 * @return the diemTB
	 */
	public double getDiemTB() {
		return diemTB;
	}

	/**
	 * 
	 * @return
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * Constructor không tham số
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor có tham số
	 * 
	 * @param name
	 * @param mail
	 * @param id
	 * @param diemToan
	 * @param diemLy
	 * @param diemHoa
	 */
	public Student(String name, String mail, int id, float diemToan, float diemLy, float diemHoa, double diemTB,
			String rating) {
		this.fullName = name;
		this.email = mail;
		this.idStudent = id;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.diemTB = diemTB;
		this.rating = rating;

	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the idStudent
	 */
	public int getIdStudent() {
		return idStudent;
	}

	/**
	 * @param idStudent the idStudent to set
	 */
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

}
