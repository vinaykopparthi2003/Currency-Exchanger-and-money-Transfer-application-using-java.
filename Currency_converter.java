import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter { // Main class for program
	public static void main(String[] args) {

		System.out.println("1 Ruppe"); // To Exchange Rupees
		System.out.println("2 Dollar"); // To Exchange Dollars
		System.out.println("3 Euro"); // To Exchange Euros
		System.out.println("4 Pound"); // To Exchange Pounds
		System.out.println("5 Money Transfer"); // To Transfer Money

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the currency");
		int choice = sc.nextInt(); // To Take Input of Currency Type
		System.out.println("Enter the amount");
		double amount;
		try {
			amount = sc.nextDouble(); // To take input of Currency Amount
		} catch (InputMismatchException e) {
			System.out.println("Enter correct amount");
			return;
		}
		if (amount <= 10000) { // convert the amount
			switch (choice) {
			case 1:
				Ruppe_to_other(amount);
				break;
			case 2:
				Dollar_to_other(amount);
				break;
			case 3:
				Euro_to_other(amount);
				break;
			case 4:
				Pound_to_other(amount);
				break;
			case 5:
				transferMoney(amount); // To Transfer Money
				break;
			default:
				System.out.println("Invalid choice");
			}
		} else {
			System.out.println("LinitExceedes");
		}

	}

	public static void Ruppe_to_other(double amt) {

		double dollarRate = 0.013;
		double euroRate = 0.012;
		double poundRate = 0.0095;
		double commissionPercentage;
		if (amt <= 5000) {
			commissionPercentage = 0.08; // 8% commission for amounts <= 5000
		} else {
			commissionPercentage = 0.10; // 10% commission for amounts > 5000
		}

		System.out.println("1 Ruppe = " + 0.013 + " Dollar");

		System.out.println(amt + " Ruppe = " + (amt * 0.013) + " Dollars (Before Comission)");

		double dollarAmount = amt * dollarRate * (1 - commissionPercentage);

		System.out.println(amt + " Rupee = " + dollarAmount + " Dollar (After Commission)\n");

		System.out.println("1 Ruppe = " + 0.012 + " Euro");

		System.out.println(amt + " Ruppe = " + (amt * 0.012) + " Euro (Before Comission)");

		double euroAmount = amt * euroRate * (1 - commissionPercentage);

		System.out.println(amt + " Rupee = " + euroAmount + " Euro (After Commission)\n");

		System.out.println("1 Ruppe = " + 0.0095 + " Pounds");

		System.out.println(amt + " Ruppe = " + (amt * 0.0095) + " Pounds (Before Comission)");

		double poundAmount = amt * poundRate * (1 - commissionPercentage);

		System.out.println(amt + " Rupee = " + poundAmount + " pounds (After Commission)\n");

	}

	public static void Dollar_to_other(double amt) {

		double rupeeRate = 79.37;
		double euroRate = 0.98;
		double poundRate = 0.79;
		double commissionPercentage;
		if (amt <= 5000) {
			commissionPercentage = 0.10; // 10% commission for amounts <= 5000
		} else {
			commissionPercentage = 0.13; // 13% commission for amounts > 5000
		}

		System.out.println("1 Dollar = " + 79.37 + " Ruppe");

		System.out.println(amt + " Dollar = " + (amt * 79.37) + " Ruppe (Before Comission)");

		double rupeeAmount = amt * rupeeRate * (1 - commissionPercentage);

		System.out.println(amt + " Dollar = " + rupeeAmount + " Rupee (After Commission)\n");

		System.out.println("1 Dollar= " + 0.98 + " Euro");

		System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro (Before Comission)");

		double euroAmount = amt * euroRate * (1 - commissionPercentage);

		System.out.println(amt + " Dollar = " + euroAmount + "Euro (After Commission)\n");

		System.out.println("1 Dollar= " + 0.79 + " Pound");

		System.out.println(amt + " Dollar = " + (amt * 0.79) + " Pound (Before Comission)");

		double poundAmount = amt * poundRate * (1 - commissionPercentage);

		System.out.println(amt + " Dollar = " + poundAmount + "pound (After Commission)\n");

	}

	public static void Euro_to_other(double amt) {

		double rupeeRate = 80.85;
		double dollarRate = 1.02;
		double poundRate = 0.86;
		double commissionPercentage;
		if (amt <= 5000) {
			commissionPercentage = 0.12; // 12% commission for amounts <= 5000
		} else {
			commissionPercentage = 0.15; // 15% commission for amounts > 5000
		}

		System.out.println("1 Euro = " + 80.85 + " Ruppe");

		System.out.println(amt + " Euro = " + (amt * 80.85) + " Ruppe (Before Comission)");

		double rupeeAmount = amt * rupeeRate * (1 - commissionPercentage);

		System.out.println(amt + " Euro = " + rupeeAmount + " Rupee (After Commission)\n");

		System.out.println("1 Euro = " + 1.02 + " Dollar");

		System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar (Before Comission)");

		double dollarAmount = amt * dollarRate * (1 - commissionPercentage);

		System.out.printf(amt + "Euro = " + (dollarAmount) + " Dollar (After Commission)\n");
		System.out.println();

		System.out.println("1 Euro = " + 0.86 + " Pound");

		System.out.println(amt + " Euro = " + (amt * 0.86) + " Pound (Before Comission)");

		double poundAmount = amt * poundRate * (1 - commissionPercentage);

		System.out.printf(amt + "Euro = " + (poundAmount) + " pounds (After Commission)\n");

	}

	public static void Pound_to_other(double amt) {

		double rupeeRate = 105.24;
		double euroRate = 1.17;
		double dollarRate = 1.26;
		double commissionPercentage;
		if (amt <= 5000) {
			commissionPercentage = 0.05; // 5% commission for amounts <= 5000
		} else {
			commissionPercentage = 0.06; // 6% commission for amounts > 5000
		}

		System.out.println("1 Pound = " + 105.24 + " Rupees");

		System.out.println(amt + " Pound = " + (amt * 105.24) + " Rupees (Before Comission)");

		double rupeeAmount = amt * rupeeRate * (1 - commissionPercentage);

		System.out.printf(amt + "Pounds = " + (rupeeAmount) + " Rupees (After Commission)\n");

		System.out.println("1 Pound = " + 1.17 + " Euro\n");

		System.out.println(amt + " Pound = " + (amt * 1.17) + " Euro (Before Comission)");

		double euroAmount = amt * euroRate * (1 - commissionPercentage);

		System.out.printf(amt + "Pounds = " + (euroAmount) + " Euros (After Commission)\n");
		System.out.println();

		System.out.println("1 Pound = " + 1.26 + " Dollars");

		System.out.println(amt + " Pound = " + (amt * 1.26) + " Dollars (Before Comission)");

		double dollarAmount = amt * dollarRate * (1 - commissionPercentage);

		System.out.printf(amt + "Pounds = " + (dollarAmount) + " Euros (After Commission)\n");

	}

	public static void transferMoney(double amt) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Transfer Money to Bank Account");
		System.out.println("Enter Bank Account Number:");
		String accountNumber = sc.nextLine();

		System.out.println("Enter Account Holder Name:");
		String accountHolderName = sc.nextLine();

		System.out.println("Enter Bank Name:");
		String bankName = sc.nextLine();

		System.out.println("Enter Branch Name:");
		String branchName = sc.nextLine();

		System.out.println("Enter IFSC Code:");
		String ifscCode = sc.nextLine();

		// Perform money transfer operation using the provided bank account details

		System.out.println("Money transfer initiated to the following bank account:");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Branch Name: " + branchName);
		System.out.println("IFSC Code: " + ifscCode);
		System.out.println("Amount Transferd: " + amt);
		System.out.println("Money transferred successfully.");
	}
}
