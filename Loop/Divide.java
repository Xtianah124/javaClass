import java.util.Scanner;

public class Divide{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int counter = 1;
	int userInput = 0;
		
		for (userInput = 1; userInput <= 3; userInput++){
			System.out.print("Enter a number: ");
			userInput = input.nextInt();
			System.out.print("Enter a number: ");
			userInput = input.nextInt();
			System.out.print("Enter a number: ");
			userInput = input.nextInt();
			
			
			if (userInput % 5 == 0 && userInput % 11 == 0){
				System.out.print("number is divisible by 5 and 11\n");
			}
			else{
				System.out.print("number is not divisible by 5 and 11\n");
			}
                }
		counter++;
    		 
	}
}

