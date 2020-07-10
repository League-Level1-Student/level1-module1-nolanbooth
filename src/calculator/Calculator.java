package calculator;
import javax.swing.JOptionPane;
public class Calculator {
public static void main(String[]args) {
	int powerAnswer = 0;
	JOptionPane.showMessageDialog(null,  "This is a calculator.");
	int opChoice = JOptionPane.showOptionDialog(null, "Which Operation?", "Calculator", 0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Addition", "Subtraction", "Multiplication", "Division" }, null);
	String number1 = JOptionPane.showInputDialog(null, "Enter a number");
	String number2 = JOptionPane.showInputDialog(null, "Enter a second number");
	int realNumber1 = Integer.parseInt(number1);
	int realNumber2 = Integer.parseInt(number2);
	if(opChoice == 0) {
		//addition
int addAnswer = realNumber1+realNumber2;
	JOptionPane.showMessageDialog(null,  "The answer is "+addAnswer);
	}if(opChoice == 1) {
		//subtraction
		int subAnswer = realNumber1-realNumber2;
		JOptionPane.showMessageDialog(null,  "The answer is "+subAnswer);
	}if(opChoice == 2) {
		//multiplication
		int multiAnswer = realNumber1*realNumber2;
		JOptionPane.showMessageDialog(null,  "The answer is "+multiAnswer );
	}if(opChoice == 3) {
		int divAnswer = realNumber1/realNumber2;
		JOptionPane.showMessageDialog(null, "The answer is "+divAnswer+" (the answer will not be exact if there is a decimal, it rounds)");
	}if(opChoice == 4) {
		//powers(work in progress)
		for(int i = realNumber2; i == 0; i--) {
		powerAnswer = realNumber1*realNumber1;
		}
		JOptionPane.showMessageDialog(null, "The answer is "+powerAnswer);
		
	}

}	
}
