import java.util.Scanner;

public class Greatest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num1 = input.nextInt();

System.out.print("Enter a number: ");
int num2 = input.nextInt();

System.out.print("Enter a number: ");
int num3 = input.nextInt();

if (num1 > num2)(num1 > num3){
  System.out.print("the greatest is num1");
}else if(num2 > num1)(num2 > num3){
  System.out.print("the greatest is num2");
 }else if(num3 > num1)(num3 > num2){
 System.out.print("the greatest is num3");

  }

}