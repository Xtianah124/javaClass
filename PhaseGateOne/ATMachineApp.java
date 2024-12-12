import java.util.Scanner;

public class ATMachineApp{
	public static void main(String[] args){

	displayMenu();
	}


public static void displayMenu(){
	Scanner input = new Scanner(System.in);
	String menu = """

	Welcome dear customer, 
	Enter a number to continue -> 

	1. Create an account
	2. Sign in
	3. Deposit money
	4. Withdraw money
	5. Check account balance
	6. Transfer from one account to another
	7. Change pin
	8. Close account
""";
	print(menu);
	int userInput = input.nextInt();

	switch(userInput){

	case 1 -> createAnAccount();
	case 2 -> signIn();
	case 3 -> depositMoney();
	case 4 -> withdraw();
	case 5 -> checkAccountBalance();
	case 6 -> transferFromOneAccountToAnother();
	case 7 -> changePin();
	case 8 -> closeAccount();
	case 9 -> System.exit(3);
	}
}


public static void print(String enter){
	System.out.print(enter);
	}


public static void createAnAccount(){
	Scanner input = new Scanner(System.in);
	
	print("what's your first name: ");
	String firstName = input.nextLine();

	print("Enter your last name: ");
	String lastName = input.nextLine();

	print("Enter date of birth: ");
	String dateOfBirth = input.nextLine();

	print("Enter your pin: ");
	int pin = input.nextInt();
	displayMenu();
	}


public static void signIn(){
	Scanner input = new Scanner(System.in);
	
	print("what's your first name: ");
	String firstName = input.nextLine();

	print("Enter your last name: ");
	String lastName = input.nextLine();

	print("Enter your pin: ");
	int pin = input.nextInt();
	displayMenu();
	}


public static void depositMoney(){
	Scanner input = new Scanner(System.in);

	print("Enter amount to deposit: ");
	int amount = input.nextInt();

	print("Enter your transaction pin: ");
	int pin = input.nextInt();

	print("Successfully transferred "+amount);


	}


public static void withdraw(){
	Scanner input = new Scanner(System.in);

	print("Enter amount: ");
	int amount = input.nextInt();

	print("Enter transaction pin: ");
	int pin = input.nextInt();

	print("Withdraw successful");
	displayMenu();
}

2
public static void checkAccountBalance(){
	Scanner input = new Scanner(System.in);

	print("Enter your account number: ");
	int number = input.nextInt();

	print("Enter transaction pin: ");
	int pin = input.nextInt();

	print("Your account balance is");
	displayMenu();
}


public static void transferFromOneAccountToAnother(){
	Scanner input = new Scanner(System.in);

	print("Enter account number: ");
	int number = input.nextInt();

	print("Enter amount to transfer: ");
	int amount = input.nextInt();
	
	print("Enter transaction pin: ");
	int pin = input.nextInt();
	
	print("Transaction successful");
	displayMenu();
}

public static void changePin(){
	Scanner input = new Scanner(System.in);

	print("Input current pin: ");
	int pin = input.nextInt();

	print("Input new pin: ");
	int newPin = input.nextInt();

	print("Confirm new pin: ");
	int newPin2 = input.nextInt();

	print("pin successfully changed");


}

	public static void closeAccount(){
		Scanner input = new Scanner(System.in);
	
		print("Dear customer, are you sure you want to close this account, yes/no: ");
		String answer = input.nextLine();
	
		while(true){

			print("provide account details: ");
			String details = input.nextLine();

			print("Transfer funds: ");
			String funds = input.nextLine();

			print("Reasons for closing account: ");
			String close = input.nextLine();
			break;

			System.out.print("
		}
	}

}