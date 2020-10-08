package application;

import java.security.DomainLoadStoreParameter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double deposit = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		System.out.println();

		Account account = new Account(number, holder, deposit, withdrawLimit);

		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();

		try {
			account.withdraw(amount);
			System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();
	}

}
