import java.util.Scanner;

 public class Palindrome{    
   public static void main(String[] args){

  Scanner input = new Scanner(System.in);

   System.out.print("Enter a three digit number: ");
  int userInput = input.nextInt();

  int num1= userInput % 10;
 
  int num2 = userInput % 100;

  int num3 = num2 / 10;

  int num4 = num1 / 100;

  if (num1 == num2) {
   System.out.print("number is a palindrome");
       }else {
    System.out.print("number is not a palindrome");
}
    }
 }