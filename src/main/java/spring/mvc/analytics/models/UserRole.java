package spring.mvc.analytics.models;

public class UserRole {
	
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
