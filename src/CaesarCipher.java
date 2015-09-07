import java.util.Scanner;


public class CaesarCipher {

	/**
	 * @param args
	 */
	
	public static void encode(String s){
		char[] encodedMessage = s.toCharArray();
		int changeTo;
		int base = 97;
		for(int i = 0; i < 26; i++){
			System.out.print("n = " + i + ": ");
			for(int x = 0; x < s.length(); x++){
				changeTo = (int) s.charAt(x) - base + i;
				if(changeTo > 25){
					changeTo -= 26;
				}
				encodedMessage[x] = (char) (changeTo + base);
			}
			String finalMessage = new String(encodedMessage);
			System.out.println(finalMessage);
		}
	}
	
	public static void decode(String s){
		char[] decodedMessage = s.toCharArray();
		int changeTo;
		int base = 97;
		for(int i = 0; i < 26; i++){
			System.out.print("n = " + i + ": ");
			for(int x = 0; x < s.length(); x++){
				changeTo = (int) s.charAt(x) - base - i;
				if(changeTo < 0){
					changeTo += 26;
				}
				decodedMessage[x] = (char) (changeTo + base);
			}
			String finalMessage = new String(decodedMessage);
			System.out.println(finalMessage);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program encrypts and decrypts messages using the Caesar Cipher.");
		System.out.print("Would you like to encode or decode a message?  ");
		Scanner read = new Scanner(System.in);
		String message = read.nextLine();
		if(message.equals("encode")){
			System.out.print("Enter the string to encode: ");
			encode(read.nextLine());
		}
		else if(message.equals("decode")) {
			System.out.print("Enter the string to decode: ");
			decode(read.nextLine());
		}
		else
			System.out.println("Invalid input. Valid inputs are \"encode\" or \"decode\"");
		
		read.close();
	}

}
