import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String answer= JOptionPane.showInputDialog("When were you born? (Ex. 11, which means January 1st)");
	int answers= Integer.parseInt(answer);
	if(answers<218&&>120) {
		JOptionPane.showMessageDialog(null, "Congrats! You are an aquarius!");
	}
	
	
	

}
}
