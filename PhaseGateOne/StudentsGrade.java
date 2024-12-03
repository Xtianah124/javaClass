import java.util.Scanner;

public class StudentsGrade{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int [] numbers = new int[2];
	int [] subjects = new int[2];

	print("How many student do you have: ");
	int students = input.nextInt();

	print("How many subject do you have: ");
	int subject = input.nextInt();

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully");

	for(int number = 0; number < numbers.length; number++){
		System.out.println("Enter score for student: ");
		int studentScores = input.nextInt();
	
		System.out.println("Enter score for subject: ");
		int subjectScores = input.nextInt();
		
		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
	} 

		System.out.print("========================================================================"


	}
	public static void print(String input){
	System.out.print(input);
	}
	public static int total(){
	


}