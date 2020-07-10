package _06_duck;

import javax.swing.JOptionPane;

public class Duck {
private String Duckname ;
private String favFood;	
private int numOfFriends;	
public Duck(String Duckname, String favFood, int numOfFriends) {
	JOptionPane.showMessageDialog(null,  "A duck egg has been laid, shipped, and is at your front door.");
		this.favFood = favFood;
		this.numOfFriends = numOfFriends;
		
}void swim(){
	JOptionPane.showMessageDialog(null,  "The duck sees a pond and decides to go for a swim");
	
	
	
	
}void makeAnnoyingNoises(){
JOptionPane.showMessageDialog(null,  "The newborn duck sees a human, and proccedes to bawk, chirp, and squawk at them.");
	
	
	
}
	
				
}

