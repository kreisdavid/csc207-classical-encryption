import java.util.Scanner;

//Acknowledgments
///Much of main was based on code I had written for CaesarCipher, another program done for this homework

public class VigenereCipher {

	/**
	 * @param args
	 */
	public static void encode(String s, Scanner scan){
		System.out.println("Enter the key: ");
		String key = scan.nextLine();
		char[] encodedMessage = s.toCharArray();
		int changeTo;
		int base = 97;
		int keyIndex = 0; //to know which letter of key is being added
		for(int i = 0; i < s.length(); i++){
			changeTo = (int) s.charAt(i) - base + ((int) key.charAt(keyIndex) - base);
			if(changeTo > 25){
				changeTo -= 26;
			}
			encodedMessage[i] = (char) (changeTo + base);
			keyIndex++;
			if(keyIndex == key.length()){
				keyIndex = 0;
			}
		}
		String finalMessage = new String(encodedMessage);
		System.out.println(finalMessage);
	}
	
	
	public static void decode(String s, Scanner scan){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program encrypts and decrypts messages using the Caesar Cipher.");
		System.out.print("Would you like to encode or decode a message?  ");
		Scanner read = new Scanner(System.in);
		String message = read.nextLine();
		
		if(message.equals("encode")){
			System.out.print("Enter the string to encode: ");
			encode(read.nextLine(), read);
		}
		else if(message.equals("decode")) {
			System.out.print("Enter the string to decode: ");
			decode(read.nextLine(), read);
		}
		else
			System.out.println("Invalid input. Valid inputs are \"encode\" or \"decode\"");
		
		read.close();
	}

}
