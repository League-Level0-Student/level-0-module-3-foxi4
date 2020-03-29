
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 22nd";
		String dadsBirthday = "July 22th";
		String myBirthday = "February 23rd";
		String brosBirthday = "October 22nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday= JOptionPane.showInputDialog("What birthday do you want to remember?");
		// 3. Print out what the user typed
		System.out.print(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birthday.equals("mom")) {
			System.out.print(momsBirthday);
		}
		// 5. if user asked for "dad"
		
			// print dad's birthday
		if(birthday.equals("dad")) {
			System.out.print(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		if(birthday.equals("Lauren")) {
			System.out.print(myBirthday);
		}
		if(birthday.contentEquals("Kevin")) {
			System.out.print(brosBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else if(birthday.contentEquals("")) {
	JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday.");
			
		}
	} 
}
