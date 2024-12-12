import java.util.Scanner;

public class cryptography{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter message to be encrypted: ");
	String message = input.nextLine();

	System.out.print("Enter the key: ");
	int key = input.nextInt();

	String encrypted = encrypteWords(message, key);
	decryptedWords(encrypted, key);
	}

	public static String encrypteWords(String message, int key){
	
	String encrypted = "";
	
	for(int index = 0; index < message.length(); index++){
	char temp = message.charAt(index);
	encrypted += (temp += key);
	}
	System.out.println(encrypted);
	return encrypted;
	}
	
	public static void decryptedWords(String encrypted, int key){
	
	String decrypted = "";

	for(int index = 0; index < encrypted.length(); index++){
	char temp = encrypted.charAt(index);
	decrypted += (temp -= key);
	}
	System.out.print(decrypted);
	}
}