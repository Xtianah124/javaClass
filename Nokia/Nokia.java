import java.util.Scanner;

public class Nokia{
 
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	

 	String Menu = """
    	
	Welcome dear customer,press

	1. phonebook
	2. Messages
	3. Chat
	4. Call Register
	5. Tones
	6. Settings
	7. Call Divert
	8. Games
	9. Calculator
	10. Remainder
	11. Clock
	12. Profiles
	13. Sim Services
""";


System.out.println(Menu);


String phoneBook = """
	1: Search
	2: Service Nos.
	3: Add name
	4: Erase
	5: Edit 
	6: Assign tone
	7: Send b'card
	8: Options
	9: Speed dials
	10: Voice tags

""";


String options = """
	1. Type of view
	2. Memory status
""";


String messages = """
	1. Write messages
	2. Inbox
	3. Outbox 
	4. Picture messages
	5. Templates
	6. Smileys
	7. Message settings
	8. Info service
	9. Voice mailbox number
	10. Service command editor
""";



String messageSettings = """
	1. Set
	2. Common
	
""";


String set = """
	1. Messages centre number
	2. Messages sent as 
	3. Messages validity
""";

String common = """
	1. Delivery reports
	2. Reply via same centre
	3. Character support
""";

String callRegister = """
	1. Missed calls
	2. Received calls
	3. Dialled numbers
	4. Erase recent call lists
	5. Show call duration
	6. Call cost settings
	7. Call cost settings
	8. Prepaid credit
""";


System.out.println("Enter Option");
	int answer = input.nextInt();


	switch (answer){

        case 1 ->
	 System.out.println(phoneBook);	

	}


System.out.println("Enter option");
	int next1 = input.nextInt();


	switch (next1) {
	
	case 8 -> 
	     System.out.println(options);
	  

	}

System.out.println("Enter option");
	int next2 = input.nextInt();

         switch (next2){

	case 2 -> 
	   System.out.println(messages);
 
        }

System.out.println("Enter option");
	int next3 = input.nextInt();

	switch (next3){

	case 7 ->
	   System.out.println(messageSettings);

}

System.out.println("Enter option");
	int next4 = input.nextInt();

	switch (next4){

	case 1 ->
	 System.out.println("Message centre number");
	case 2 ->
	 System.out.println("Messages Sent As"); 
	case 3 ->
	 System.out.println("Message Validity");
	
	}

System.out.println("Enter option");
	int next5 = input.nextInt();

	switch (next5){

	case 1 ->
	 System.out.println("Delivery reports");
	case 2 ->
	 System.out.println("Reply via same centre "); 
	case 3 ->
	 System.out.println("Character support");
	
	}

System.out.println("Enter option");
	int next6 = input.nextInt();
	
	switch (next6){

	case 1 -> 
	  System.out.println("Last call duration");
	case 2 ->
	  System.out.println("All calls' duration");
	case 3 ->
	 System.out.println("Received calls' duration");
	case 4 ->
	 System.out.println("Dialled calls' duration");
	case 5 ->
	 System.out.println("Clear timers");
}
	 
System.out.println("Enter option");
	int next7 =input.nextInt();

	switch (next7){
	case 1 ->
	 System.out.println("Last call cost");
	case 2 ->
	 System.out.println("All calls' cost");
	case 3 ->
	 System.out.println("Clear counters");
}
System.out.println("Enter option")
	int next8 = input.nextInt();

	switch (next8){
	case 1 ->
        System.out.println("Call cost limit");
	case 2 ->
	System.out.print("Show costs in");
}











}
}





