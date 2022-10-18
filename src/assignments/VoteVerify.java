package assignments;

public class VoteVerify {
	/*A person is elligible to vote if his/her age is greater than or equal to 18.
	 Define a method to find out if he/she is elligible to﻿ vote.
			 */
	public void verifyAgeForVoting(int age) {
		if(age>=18) {
			System.out.println("Eligible for Vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}
	}

	public static void main(String[] args) {
		
		VoteVerify v=new VoteVerify();
		v.verifyAgeForVoting(18);
}
}