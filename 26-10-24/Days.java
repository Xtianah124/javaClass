import java.util.Scanner;

public class Days{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a week number: ");
int userInput = input.nextInt();

int number = 0;

if (userInput == 1){
System.out.print("monday");
}else if(userInput == 2){
System.out.print("tuesday");
}else if(userInput == 3){
System.out.print("wednesday");
}else if (userInput == 4){
System.out.print("thursday");
}else if (userInput == 5){
System.out.print("friday");
}else if (userInput == 6){
System.out.print("saturday");
}else if (userInput == 7){
System.out.print("sunday");
}
}

}