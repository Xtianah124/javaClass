import java.util.Scanner;

public class Multiplication{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

	for(int multiple = 1; multiple < 10; multiple++){
  		 for(int number = 1; number < 10; number++){
			int result = multiple * number;
			System.out.printf("%d * %d = %d\t", number, multiple, result);
		}
	System.out.println();
	}


 

	}


}