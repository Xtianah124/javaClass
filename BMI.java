import java.util.Scanner;

 public class BMI{
  public static void main(String[] args){

 Scanner input = new Scanner(System.in);

 System.out.print("Enter weight in kilogram: ");
 double weight = input.nextDouble();

 System.out.print("Enter height in meters: ");
 double height = input.nextDouble();
 double heightSquared = height * height;
 double bmi = weight / heightSquared;

 System.out.print(bmi);
 



}



}