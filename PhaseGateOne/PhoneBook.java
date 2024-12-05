import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class PhoneBook{
	private static List<Contact> contacts= new ArrayList<>();
	public static void main(String[] args){
	phoneBook();
	
}
public static void phoneBook(){
	Scanner input = new Scanner(System.in);
	String menu = """
	1. Add contact
	2. Remove contact
	3. Find contact by phone number
	4. Find contact by first name
	5. Find contact by last name
	6. Edit contact

""";
	print(menu);
	int userChoice = input.nextInt();

	switch(userChoice){
	case 1 -> addContact();
	case 2 -> removeContact();
	/**case 3 -> findContactByPhoneNumber();
	case 4 -> findContactByFirstName();
	case 5 -> findContactByLastName();
	case 6 -> editContact();**/
}
}
public static void print(String enter){
System.out.print(enter);

}
public static void addContact(){
	Scanner input = new Scanner(System.in);
	
	print("Enter first name: ");
	String firstName = input.nextLine();

	print("Enter last name: ");
	String lastName = input.nextLine();
	
	print("Enter phone number:");
	String phoneNumber = input.nextLine();
	Contact contact = new Contact(firstName, lastName, phoneNumber);
	contacts.add(contact);
	

}
public static void removeContact(){
	Scanner input = new Scanner(System.in);

	print("Do you want to remove contact, yes/no: ");
	String enter = input.nextLine();

	
}
}