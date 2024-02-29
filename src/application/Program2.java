package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {
		// Polimorfismo exemple:
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account x = new Account(1001, "Alex", 1000.0);
		Account y = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		sc.close();

	}

}
