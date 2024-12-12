import java.util.Scanner;

public class CreditCardValidator{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int sum = 0;

	System.out.print("Enter your card number: ");
	String userInput = input.nextLine();

	if(userInput.length() < 13 || userInput.length() > 15) System.out.println("Error input the correct numbers: ");

	for(int index = 0; index <= userInput.length(); index+=2){
		int number = (Integer.parseInt(String.valueOf(userInput.charAt(index)))*2);
			System.out.println(number);

		if(number > 9) sum+=number;
	}




}
}