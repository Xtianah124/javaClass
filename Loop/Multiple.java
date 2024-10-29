import java.util.Scanner;

public class Multiple{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int sentinelValue = -1;
		
		do{
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			
			if (number % 5 == 0 && number % 11 == 0){
				System.out.print("number is divisible by 5 and 11\n");
			}
			else{
				System.out.print("number is not divisible by 5 and 11\n");
			}
		
                		System.out.print("Enter -1 to end the program or any number to continue");
				sentinelValue = input.nextInt();
	

			}while (sentinelValue != -1);        
	}
}