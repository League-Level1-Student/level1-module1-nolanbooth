package _04_popcorn;
import javax.swing.JOptionPane;
public class PopcornRunner {
public static void main(String[]args) {
String flavor =	JOptionPane.showInputDialog(null, "What flavor of popcorn?");
	String time = JOptionPane.showInputDialog(null, "How long to cook?");
	int time2 = Integer.parseInt(time);
	Microwave b = new Microwave();
Popcorn c = new Popcorn(flavor);
	b.putInMicrowave(c);
	
	b.setTime(time2);
	b.startMicrowave();
c.applyHeat();
c.eat();
}
}
