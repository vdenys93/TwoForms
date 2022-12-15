package model;

import java.time.LocalDate;
import java.time.Period;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Fall 2022
 * Dec 14, 2022
 */
public class ComparingAge {
	private int userAge;

	public ComparingAge() {
	}

	public ComparingAge(int userAge) {
		this.userAge = userAge;
		ageDifference(userAge);
	}

	/**
	 * @return the userAge
	 */
	public int getUserAge() {
		return userAge;
	}

	/**
	 * @param userAge the userAge to set
	 */
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public static int calculateMyAge() {
		LocalDate myDOB = LocalDate.parse("1993-08-22");
		LocalDate curDate = LocalDate.now(); 
		return Period.between(myDOB, curDate).getYears(); 
		
	}
	public static String ageDifference(int userAge) {
		if (userAge> calculateMyAge()) {
			return "I`m "+calculateMyAge()+"! You are older than me!"; 
		}
		else if (userAge == calculateMyAge()) {
			return "We are the same age!"; 
		}
		else {
			return "I`m "+calculateMyAge()+"! I`m older than you!"; 
		}
		
	}

	@Override
	public String toString() {
		return "You are " + userAge+" years old.";
	}
	
	

}
