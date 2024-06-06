/**
 * Manager.java
 * 29-05-2024
 */

/**
 * 
 *
 * @author: Nguyễn Hoàn
 */
public class Manager extends Personnel implements DataInputOutput {

	// Hằng số
	private final static float ONE_DAY = 300;

	// Construtor
	public Manager() {
		super();
	}
	
	public Manager(String personId, String personName) {
		super(personId, personName);
	}

	public Manager(String id, String fullName, int birthday, String mail, String phone, float workDay) {
		super(id, fullName, birthday, mail, phone, workDay);
	}

	// Input - Output method
	@Override
	public void showInformation() {
		super.showInformation();
	}

	// Business method
	@Override
	public void payroll() {
		this.salaryPerson = this.workDay * ONE_DAY;
	}

}
