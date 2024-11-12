import java.util.Scanner;
import java.util.Arrays;

public class MbtiPersonalityTest{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	
	String[] extroverted = new String[5]; 
	String[] newExtroverted = new String[5];
	String[] sensing = new String[5];
	String[] newSensing = new String[5];
	String[] thinking = new String[5];
	String[] newThinking = new String[5];
	String[] judging = new String[5];
	String[] newJudging = new String[5];	

	System.out.print("What is your name: ");
	String name = scan.nextLine();



	
	extroverted[0] = "flag";
	while(!extroverted[0].equalsIgnoreCase("A") && !extroverted[0].equalsIgnoreCase("B")){
	 
	System.out.print("1. A. expend energy, enjoy groups\t B. conserve energy, enjoy one-on-one\n");
	extroverted[0] = scan.nextLine();
	if(!extroverted[0].equalsIgnoreCase("A") && !extroverted[0].equalsIgnoreCase("B"))
	System.out.print("A or B expected as response\n Error, Please retry again\n");
	
	if (extroverted[0].equalsIgnoreCase("A"))
	newExtroverted[0] = "A. expend energy, enjoy groups";
	
	if (extroverted[0].equalsIgnoreCase("B"))
	newExtroverted[0] = "B. conserve energy, enjoy one-on-one";
}


	
	
	sensing[0] = "flag";
	while(!sensing[0].equalsIgnoreCase("A") && !sensing[0].equalsIgnoreCase("B")){

	System.out.print("1. A. Interpret literally\t B. Look for meaning and possibilities\n");
	sensing[0] = scan.nextLine();
	if(!sensing[0].equalsIgnoreCase("A") && !sensing[0].equalsIgnoreCase("B"))
	System.out.print("A or B expected as response\n Error, Please retry again\n");
	if (sensing[0].equalsIgnoreCase("A"))
	newSensing[0] = "A. Intepret literally";
	
	if (sensing[0].equalsIgnoreCase("B"))
	newSensing[0] = "B. Look for meaning and possibilities";
}


		
	thinking[0] = "flag";
	while(!thinking[0].equalsIgnoreCase("A") && !thinking[0].equalsIgnoreCase("B")){

	System.out.print("1. A. Logical, thinking, questioning\t B. Empathetic, feeling, accomodating\n");
	thinking[0] = scan.nextLine();
	if(!thinking[0].equalsIgnoreCase("A") && !thinking[0].equalsIgnoreCase("B"))
	System.out.print("A or B expected as response\n Error, Please retry again\n");
	if (thinking[0].equalsIgnoreCase("A"))
	newThinking[0] = "A. Logical, thinking, questioning";
	
	if (thinking[0].equalsIgnoreCase("B"))
	newThinking[0] = "B. Empathetic, feeling, accomodating";
}
	


		
	judging[0] = "flag";
	while(!judging[0].equalsIgnoreCase("A") && !judging[0].equalsIgnoreCase("B")){

	System.out.print("1. A. Organized, orderly\t B. Flexible, adaptable\n");
	judging[0] = scan.nextLine();
	if(!judging[0].equalsIgnoreCase("A") && !judging[0].equalsIgnoreCase("B"))
	System.out.print("A or B expected as response\n Error, Please retry again\n");
	if (judging[0].equalsIgnoreCase("A"))
	newJudging[0] = "A. Organized, orderly";
	
	if (judging[0].equalsIgnoreCase("B"))
	newJudging[0] = "B. Flexible, adaptable";
}

	
		
	extroverted[0] = "flag";
	while(!extroverted[0].equalsIgnoreCase("A") && !extroverted[0].equalsIgnoreCase("B")){

	System.out.print("1. A. More outgoing, thinking out loud\t B. More reserved, think to yourself\n");
	extroverted[0] = scan.nextLine();
	if(!extroverted[0].equalsIgnoreCase("A") && !extroverted[0].equalsIgnoreCase("B"))
	System.out.print("A or B expected as response\n Error, Please retry again\n");
	if (extroverted[0].equalsIgnoreCase("A"))
	newExtroverted[0] = "A. More outgoing, thinking out loud";
	if(extroverted[0].equalsIgnoreCase("B"))
	newExtroverted[0] = "B. More reserved, think to yourself";
}

	
		
	sensing[0] = "flag";
	while(!sensing[0].equalsIgnoreCase("A") && !sensing[0].equalsIgnoreCase("B")){

	System.out.print("1. A. Practical, realistic, experimental\t B. Imaginative, innovative, theoretical\n");
	sensing[0] = scan.nextLine();
	if(!sensing[0].equalsIgnoreCase("A") && !sensing[0].equalsIgnoreCase("B"))
	System.out.print("A or B expected as response\n Error, Please retry again\n");
	if (sensing[0].equalsIgnoreCase("A"))
	newSensing[0] = "A. Practical, realistic, experimental";
	
	if (sensing[0].equalsIgnoreCase("B"))
	newSensing[0] = "B. Imaginative, innovative, theoretical";
}


	
	thinking[0] = "flag";
	while(!thinking[0].equalsIgnoreCase("A") && !thinking[0].equalsIgnoreCase("B")){

	System.out.print("1. A. Candid, straight, forward, frank\t B. Tactful, kind, encouraging\n");
	thinking[0] = scan.nextLine();
	if(!thinking[0].equalsIgnoreCase("A") && !thinking[0].equalsIgnoreCase("B"))
	System.out.print("A or B expected as response\n Error, Please retry again\n");
	if (thinking[0].equalsIgnoreCase("A"))
	newThinking[0] = "A. Candid, straight, forward, frank";
	
	if (thinking[0].equalsIgnoreCase("B"))
	newThinking[0] = "B. Tactful, kind, encouraging";
}



	judging[0] = "flag";
	while(!judging[0].equalsIgnoreCase("A") && !judging[0].equalsIgnoreCase("B")){

	System.out.print("1. A. Plan, scheduled\t B. unplanned, spontaneous\n");
	judging[0] = scan.nextLine();
	if(!judging[0].equalsIgnoreCase("A") && !judging[0].equalsIgnoreCase("B"))
	System.out.print("A or B expected as response\n Error, Please retry again\n");
	if (judging[0].equalsIgnoreCase("A"))
	newJudging[0] = "A. Plan, scheduled";
	
	if (judging[0].equalsIgnoreCase("B"))
	newJudging[0] = "B. Unplanned, spontaneous";
}



		
	extroverted[0] = "flag";
	while(!extroverted[0].equalsIgnoreCase("A") && !extroverted[0].equalsIgnoreCase("B")){

	System.out.print("1. A. Seek many activities, public activities,  interaction with others\t B. seek private, solitary activities\n");
	extroverted[0] = scan.nextLine();
	if(!extroverted[0].equalsIgnoreCase("A") && !extroverted[0].equalsIgnoreCase("B"))
	System.out.print("A or B expected as response\n Error, Please retry again\n");
	if (extroverted[0].equalsIgnoreCase("A"))
	newExtroverted[0] = "A. Seek many activities, public activities, interaction with others";
	if(extroverted[0].equalsIgnoreCase("B"))
	newExtroverted[0] = "B. Seek private, solitary activities";
}

	

	sensing[0] = "flag";
	while(!sensing[0].equalsIgnoreCase("A") && !sensing[0].equalsIgnoreCase("B")){

	System.out.print("1. A. Standard, usual, conventional\t B. Different, novel, unique\n");
	sensing[0] = scan.nextLine();
	if(!sensing[0].equalsIgnoreCase("A") && !sensing[0].equalsIgnoreCase("B"))
	System.out.print("A or B expected as response\n Error, Please retry again\n");
	if (sensing[0].equalsIgnoreCase("A"))
	newSensing[0] = "A. Standard, usual, conventional";
	
	if (sensing[0].equalsIgnoreCase("B"))
	newSensing[0] = "B. Differnt, novel, unique";	

}



	thinking[2] = "flag";
	while(!thinking[2].equalsIgnoreCase("A") && !thinking[2].equalsIgnoreCase("B")){
	System.out.print("\n11. A. firm, tend to criticize, hold the line \t B. gentle, tend to appreciate, concilate\n");
	thinking[2] = scan.nextLine();
	if(!thinking[2].equalsIgnoreCase("A") && !thinking[2].equalsIgnoreCase("B"))
	 	System.out.print("Expected A or B as Response\n Error, Please retry again");
	
	if(thinking[2].equalsIgnoreCase("A"))
		newThinking[2] = "A. firm, tend to criticize, hold the line";

	if (thinking[2].equalsIgnoreCase("B"))
		newThinking[2] = "B. gentle, tend to appreciate, concilate";
	}
	
	

	judging[2] = "flag";
	while(!judging[2].equalsIgnoreCase("A") && !judging[2].equalsIgnoreCase("B")){
	System.out.print("\n12. A. regulated, structured \t B. easy-going, live and let live\n");
	judging[2] = scan.nextLine();
	if(!judging[2].equalsIgnoreCase("A") && !judging[2].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n Error, Please retry again");


	if(judging[2].equalsIgnoreCase("A"))
	   newJudging[2] = "A. regulated, structured";

	if(judging[2].equalsIgnoreCase("B"))
	    newJudging[2] = "B. easy-going, live and let live";
	}

	

	extroverted[3] = "flag";
	while(!extroverted[3].equalsIgnoreCase("A") && !extroverted[3].equalsIgnoreCase("B")){	
	System.out.print("\n13. A. external, communicative, express yourself \t B. internal, reticent, keep to yourself\n");
	extroverted[3] = scan.nextLine();
	if(!extroverted[3].equalsIgnoreCase("A") && !extroverted[3].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n Error, Please retry again");	

	if(extroverted[3].equalsIgnoreCase("A"))
		newExtroverted[3] = "A. external, communicative, express yourself";

	if (extroverted[3].equalsIgnoreCase("B"))
		newExtroverted[3] = "B. internal, reticent, keep to yourself";
	}

		  


	sensing[3] = "flag"; 
	while(!sensing[3].equalsIgnoreCase("A") && !sensing[3].equalsIgnoreCase("B")){
	System.out.print("\n14. A. focus on here and now \t B. look to the future, global perspective, big picture\n");
	sensing[3] = scan.nextLine();
	if(!sensing[3].equalsIgnoreCase("A") && !sensing[3].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as response\n Error, Please retry again");
	
	if(sensing[3].equalsIgnoreCase("A"))
		newSensing[3] = "A. focus on here and now ";

	if (sensing[3].equalsIgnoreCase("B"))
		newSensing[3] = "B. look to the future, global perspective, big picture";
	}

		  

	
	thinking[3] = "flag";
	while(!thinking[3].equalsIgnoreCase("A") && !thinking[3].equalsIgnoreCase("B")){
	System.out.print("\n15. A. tough-minded, just \t B. tender-hearted, merciful\n");	
	thinking[3] = scan.nextLine();
	if(!thinking[3].equalsIgnoreCase("A") && !thinking[3].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n Error, Please retry again");

	if (thinking[3].equalsIgnoreCase("A"))
		newThinking[3] = "A. tough-minded, just";

	if (thinking[3].equalsIgnoreCase("B"))
		newThinking[3] = "B. tender-hearted, merciful";
	}

		  
	judging[3] = "flag";
	while(!judging[3].equalsIgnoreCase("A") && !judging[3].equalsIgnoreCase("B")){
	System.out.print("\n16. A. preparation, plan ahead \t B. go with the flow, adapt as you go\n");
	judging[3] = scan.nextLine();
	if(!judging[3].equalsIgnoreCase("A") && !judging[3].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n Error, Please retry again");

	if(judging[3].equalsIgnoreCase("A"))
		newJudging[3] = "A. preparation, plan ahead";

	if (judging[3].equalsIgnoreCase("B"))
		newJudging[3] = "B. go with the flow, adapt as you go";
	}


	extroverted[4] = "flag";
	while(!extroverted[4].equalsIgnoreCase("A") && !extroverted[4].equalsIgnoreCase("B")){
	System.out.print("\n17. A. active, initiate \t B. reflective, deliberate\n");
	extroverted[4] = scan.nextLine();
	if(!extroverted[4].equalsIgnoreCase("A") && !extroverted[4].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n Error, Please retry again");

	if(extroverted[4].equalsIgnoreCase("A"))
	 	newExtroverted[4] = "A. active, initiate ";

	if (extroverted[4].equalsIgnoreCase("B"))
		newExtroverted[4] = "B. reflective, deliberate";
	}
	
	  
	sensing[4] = "flag";
	while(!sensing[4].equalsIgnoreCase("A") && !sensing[4].equalsIgnoreCase("B")){
	System.out.print("\n 18. A. facts, things, what is \t B. ideas, what could be\n");
	sensing[4] = scan.nextLine();
	if(!sensing[4].equalsIgnoreCase("A") && !sensing[4].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n Error, Please retry again");

	if(sensing[4].equalsIgnoreCase("A"))
		newSensing[4] = "A. facts, things, what is ";
	 
	if (sensing[4].equalsIgnoreCase("B"))
		newSensing[4] = "B. ideas, what could be";
	}

	
	thinking[4] = "flag";
	while(!thinking[4].equalsIgnoreCase("A") && !thinking[4].equalsIgnoreCase("B")){
	System.out.print("\n 19. A. matter of fact, issue-oriented \t B. sensitive, people-oriented, compassionate\n");
	thinking[4] = scan.nextLine();
	if(!thinking[4].equalsIgnoreCase("A") && !thinking[4].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n Error, Please retry again");
	
	if(thinking[4].equalsIgnoreCase("A"))
		newThinking[4] = "A. matter of fact, issue-oriented";

	if (thinking[4].equalsIgnoreCase("B"))
		newThinking[4] = "B. sensitive, people-oriented, compassionate";
	}




	judging[4] = "flag";
	while(!judging[4].equalsIgnoreCase("A") && !judging[4].equalsIgnoreCase("B")){
	System.out.print("\n20. A. control, govern \t B. latitude, freedom\n");
	judging[4] = scan.nextLine();
	if(!judging[4].equalsIgnoreCase("A") && !judging[4].equalsIgnoreCase("B"))
		System.out.print("Expected A or B as Response\n Error, Please retry again");

	if(judging[4].equalsIgnoreCase("A"))
		newJudging[4] = "A. control, govern ";

	if (judging[4].equalsIgnoreCase("B"))
		newJudging[4] = "B. latitude, freedom";
	}
	

	

	}


}















