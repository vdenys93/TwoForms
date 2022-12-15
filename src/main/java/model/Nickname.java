package model;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Fall 2022
 * Dec 14, 2022
 */
public class Nickname {
	String userName;

	public Nickname() {
	}

	public Nickname(String userName) {
		this.userName = userName;
		greeting(userName);
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public static String greeting(String userName) {
		return "Hello " +userName +", You are awesome!";
	}

	@Override
	public String toString() {
		return "Nickname [userName=" + userName + "]";
	}
	

}
