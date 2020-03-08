package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String answer= JOptionPane.showInputDialog("Are you happy?");
	if(answer.equals("no")) {
		String answer2= JOptionPane.showInputDialog("Do you want to be happy?");
		if(answer2.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		if(answer2.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
	}
	if(answer.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
}
}
