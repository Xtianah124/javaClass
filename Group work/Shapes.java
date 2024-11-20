import java.util.Scanner;

public class Shapes{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

		System.out.print("Enter first length: ");
		int firstlength = input.nextInt();

		System.out.print("Enter second length: ");
		int secondlength = input.nextInt();

		System.out.print("Enter third length: ");
		int thirdlength = input.nextInt();

		if(firstlength == secondlength && secondlength == thirdlength){
		System.out.print("Equilateral Triangle");
		}
	
		if(firstlength == secondlength && firstlength != thirdlength){
		System.out.print("Isosceles Triangle");
		}
		
		if(firstlength != secondlength && secondlength != thirdlength){
		System.out.print("Isosceles Triangle");
		}



}
}