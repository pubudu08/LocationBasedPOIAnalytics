package spring.mvc.analytics.models;

import java.util.Date;
import java.util.Set;

public class User implements IPersistable{

	private static final long serialVersionUID = 8304085149546562458L;
	public static final String PROPERTY_EMPLOYEE_ID="empNo";
    public static final String PROPERTY_EMPLOYEE_FIRST_NAME="firstName";
    public static final String PROPERTY_EMPLOYEE_LAST_NAME="lastName";
    public static final String PROPERTY_EMPLOYEE_DEPARTMENT_NAME = "departments";
    public static final String PROPERTY_EMPLOYEE_DESIGNATION_NAME = "designations";
    public static final String PROPERTY_EMPLOYEE_ACTIVE_STATUS = "active";
	
	private int userNo;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    private String password;
    private Gender gender;
//    private long currentDesignationId;
//    private String currentDepartmentId;
//    private Set designations;
//    private Set departments;
    private UserRole userRole;
    private boolean active = true;
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param empNo the empNo to set
	 */
	public void setEmpNo(int userNo) {
		this.setUserNo(userNo);
	}
	/**
	 * @return the empNo
	 */
	public int getEmpNo() {
		return getUserNo();
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	/**
	 * @return the hireDate
	 */
	public Date getHireDate() {
		return hireDate;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param userRole the userRole to set
	 */
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	/**
	 * @return the userRole
	 */
	public UserRole getUserRole() {
		return userRole;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getUserNo() {
		return userNo;
	}
    
	
 

   
}
