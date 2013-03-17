package spring.mvc.analytics.models;

public class UserRole {
	
	public static final String PROPERTY_USERROLE_ID = "userRoleID";
	public static final String PROPERTY_USERROLE_TYPE = "UserRoleType";
	
	private int userRoleID;
	private String UserRoleType;
	
	/**
	 * @param userRoleID the userRoleID to set
	 */
	public void setUserRoleID(int userRoleID) {
		this.userRoleID = userRoleID;
	}
	/**
	 * @return the userRoleID
	 */
	public int getUserRoleID() {
		return userRoleID;
	}
	/**
	 * @param userRoleType the userRoleType to set
	 */
	public void setUserRoleType(String userRoleType) {
		UserRoleType = userRoleType;
	}
	/**
	 * @return the userRoleType
	 */
	public String getUserRoleType() {
		return UserRoleType;
	}
	

}
