import java.util.Scanner;

public class StudentsGrade{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("How many student do you have: ");
	int students = input.nextInt();

	System.out.print("How many subject do you have: ");
	int subjects = input.nextInt();

	println("Saving >>>>>>>>>>>>>>>>>>>>>>");
	println("Saved successfully");

	for(int number = 1; number < students; number++){
		println("Enter score for student 1");
		println("Enter score for subject "+number);
		int sub1 = input.nextInt();
		
		println("Saving >>>>>>>>>>>>>>>>>>>>>>");
		println("Saved successfully");
	} 
	
	for(int number = 1; number < students; number++){
		println("Enter score for student 2");
		println("Enter score for subject "+number);
		int sub2 = input.nextInt();
		
		println("Saving >>>>>>>>>>>>>>>>>>>>>>");
		println("Saved successfully");

	}
	
	for(int number = 1; number < students; number++){
		println("Enter score for student 3");
		println("Enter score for subject "+number);
		int sub3 = input.nextInt();
		
		println("Saving >>>>>>>>>>>>>>>>>>>>>>");
		println("Saved successfully");
	}
private static void 
	println("============================================");
	println("\tSTUDENT\tSUB1\tSUB2\tSUB3\tTOT\tAVE\tPOS");
	println("============================================");
	println("Student 1");
	println("Student 2");
	println("Student 3");
	println("Student 4");
	println("============================================");
	println("============================================");
	}
	public static void println(String input){
	System.out.println(input);
	}



}