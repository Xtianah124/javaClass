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

	int[][] studentNumber = new int[students][subjects];
	

	for(int number = 0; number < students; number++){
		for(int numbers = 0; numbers < subjects; numbers++){

		System.out.printf("Enter score for student %d%n", number +1);
		System.out.printf("Enter score for subject %d%n", numbers +1);
		int num = input.nextInt();
		
		println("Saving >>>>>>>>>>>>>>>>>>>>>>");
		println("Saved successfully");
	}
}
		
	println("===========================================================");
	println("STUDENT  \tTOT \tAVE \tPOS" );
	println("===========================================================");
	
	println("==========================================================");
	println("==========================================================");
	

public static void println(String enter){
	System.out.println(enter);
  } 

	
}