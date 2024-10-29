import java.util.Scanner;

public class Order{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

     int sentinelValue = -2;
     
       do{

	System.out.print("Enter a number: ");
	int num1 = input.nextInt();

	System.out.print("Enter a number: ");
	int num2 = input.nextInt();

	System.out.print("Enter a number: ");
	int num3 = input.nextInt();

		if (num3 > num2 && num2 > num1){
 			System.out.print("the numbers are in increasing order");
		}else{
    			System.out.print("the numbers are in decreasing order");
		}
		System.out.print("Enter -2 to end the program or any number to continue");
		sentinelValue = input.nextInt();
	

	}while (sentinelValue != -2);


}




}