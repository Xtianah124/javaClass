import java.util.Scanner;

public class Meter{
 public static void main(String[] args){

 Scanner input = new Scanner(System.in);

System.out.print("Enter feet number as decimal: ");
double feet = input.nextDouble();
double meter = feet * 0.305;
System.out.printf("%f", meter);






}


}