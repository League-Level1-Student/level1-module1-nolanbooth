package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	int number = new Random().nextInt(10000);
	private int password;
	private String vaultType;

	public Vault(String vaultType) {
		JOptionPane.showMessageDialog(null, vaultType + " has been made, shipped, and delivered.");
		System.out.println(number);

	}

	public boolean tryCode(int password) {
		if (password == number) {
			return true;
		}
		return false;

	}

}
