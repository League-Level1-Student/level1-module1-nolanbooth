package _05_vault;
import javax.swing.JOptionPane;
public class VaultRunner {
public static void main(String[]args) {
	
	Vault safe = new Vault("A Safe");
for (int i = 0; i < 10000; i++) {
if(safe.tryCode(i)) {
	JOptionPane.showMessageDialog(null,  "James Bond guessed the code!!");
}}}}
