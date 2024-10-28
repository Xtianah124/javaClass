import java.util.Scanner;

public class Leap{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a year: ");
int year = input.nextInt();

if (year % 4 == 0){
System.out.print("It is a leap year");
}
else if (year % 4 != 0){
System.out.print("It is not a leap year");
}

}


}