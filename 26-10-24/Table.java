import java.util.Scanner;

public class Table{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number of terms: ");
int number = input.nextInt();

		for (int multiple = 1; multiple <= 5; multiple ++){					int result = multiple * number;
			System.out.printf("%d * %d = %d%n", number,multiple,result);
		}


	}
}