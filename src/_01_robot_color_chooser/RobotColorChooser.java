//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//2/23/20- I'm officially 12! Hooray.
	for(int i = 0; i<1000000;i++) {
		int red;
		int orange;
		int yellow;
		int green;
		int blue;
		int purple;
		//1. Create a new Robot
		Robot U2=new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color=JOptionPane.showInputDialog("What color do you want your robot to be? (choose from the rainbow)");
		//5. Use an if/else statement to set the pen color that the user requested

		if(color.equals("red")) {
	U2.setPenColor(Color.red);
}
else
if(color.equals("orange")) {
	U2.setPenColor(Color.orange);

}else if(color.equals("yellow")) {
	U2.setPenColor(Color.yellow);
}else if(color.equals("green")) {
	U2.setPenColor(Color.green);
}else if(color.equals("blue")) {
	U2.setPenColor(Color.blue);
}else if(color.equals("purple")) {
	U2.setPenColor(Color.magenta);
}
else {
U2.setRandomPenColor();
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		U2.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		U2.penDown();
		U2.setSpeed(80);
		U2.move(100);
U2.turn(90);
U2.move(100);
U2.turn(90);
U2.move(100);
U2.turn(90);
U2.move(100);

	}
	}
}
