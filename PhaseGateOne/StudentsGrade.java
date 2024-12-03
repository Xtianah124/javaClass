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
	
	int [] arrays = new int[students];
	int [] array = new int[subjects];

	for(int number = 1; number < students; number++){
		for(int numbers = 1; numbers < subjects; numbers++){
		println("Enter score for student "+number);
		println("Enter score for subject "+numbers);
		int subject = input.nextInt();
		
		println("Saving >>>>>>>>>>>>>>>>>>>>>>");
		println("Saved successfully");
	} 
	}
  public static void println(String enter){
	System.out.println(enter);
  }
  private static int total(){
	total += subject;
	print(total);
  }
  
  private static void reportCard(int subjects, int total){

	
	println("=====================================================");
	println("STUDENTS \tSUB1 \tSUB2 \tSUB3 \tTOT \tAVE \tPOS");
	println("=====================================================");
	println("Student 1  subjects%s, total%s");
	println("Student 2");
	println("Student 3");
	println("Student 4");
	println("====================================================");
	println("====================================================");
	}
	


}