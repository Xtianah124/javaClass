import java.util.Scanner;

public class Dowhile{
 public static void main(String[] args){

  Scanner input = new Scanner(System.in);
	String again;
   
      
	do {

      	System.out.print("Enter a number: ");
        int num1 = input.nextInt();

     	System.out.print("Enter a number: ");
       	int num2 = input.nextInt();
	
	int sum = num1 + num2;
        System.out.println(sum);

	System.out.print("Do you want to repeat the process again? (Yes/No)");
	again = input.next();

	}while (again.equalsIgnoreCase("yes"));

  }

}