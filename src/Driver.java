import java.util.Scanner;
public class Driver {

	public static BankAccount bankAccount; // reference to BankAccount class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bank Account Information...");
		Scanner input = new Scanner(System.in);
		
		
		
		// Prompt user for Account Number
		System.out.print("Enter your Account Number: ");
		String myAccountNumber = input.nextLine();
		
		// Prompt user for Owner Name
	    System.out.print("Enter your Name: ");
		String myName = input.nextLine();
				
		// Prompt user for withdraw
		int amount = 1000;
	    System.out.printf("You have $%s \n",amount);
		
		
		bankAccount = new BankAccount(myAccountNumber,myName,1000);
		
		bankAccount.setAccountNumber(myAccountNumber);
		bankAccount.setOwnersName(myName);
		
		bankAccount.getAccountInfo();
		
	}

}
