package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BusinessAccount;
import entities.PersonalAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//User options
		System.out.print("1- Deposit\n2- Withdraw\n3- Convert\n4- Balance\nSelect some operation: ");
		int userInput = sc.nextInt();

		PersonalAccount pc = new PersonalAccount();
		BusinessAccount ba = new BusinessAccount();
		
		while(userInput != 0) {
			switch (userInput) {
				case 1: 
					//Deposit option
					System.out.print("Enter much you want to deposit: $");
					double deposit = sc.nextDouble();
					
					//Account type specification
					System.out.print("PS(personal account) or BA(business account): ");
					sc.nextLine();
					String accountType = sc.nextLine();
					if(accountType.equals("PS")) {
						pc.deposit(deposit);
					}
					if(accountType.equals("BA")) {
						ba.deposit(deposit);
					}
					//New operation
					System.out.print("Select some operation: ");
					userInput = sc.nextInt();
					break;
				case 2: 
					//Withdraw option
					System.out.print("Enter how much you want to withdraw: $");
					double withdraw = sc.nextDouble();
					
					//Account type specification
					System.out.print("PS(personal account) pr BA(business account): ");
					sc.nextLine();
					accountType = sc.nextLine();
					if(accountType.equals("PS")) {
						pc.withdraw(withdraw);
					}
					if(accountType.equals("BA")) {
						ba.withdraw(withdraw);
					}
					//New operation
					System.out.print("Select some operation: ");
					userInput = sc.nextInt();
					break;
				case 3:
					//Balance of accounts
					System.out.println("Your balance PS is $" + String.format("%.2f", pc.getBalance()));
					System.out.println("Your balance BA is $" + String.format("%.2f", ba.getBalance()));
					//New operation
					System.out.print("Select some operation: ");
					userInput = sc.nextInt();
					break;
				default: 
					System.out.print("Invalid operation, try again: ");
					userInput = sc.nextInt();
			}
		}
		
		System.out.println("Terminated!");

		sc.close();
	}

}
