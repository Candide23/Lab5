import java.util.Scanner;

public class CountLetter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your  Letter");
		
		String letter = input.next();
		
		System.out.println("Number of Occurrence of your input is " + countLetter(letter));
		

	}
	
	public static int countLetter(String letter) {
		
		int count = 0;
		
		
		
		char[]arr = letter.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			if((Character.toLowerCase(arr[i]) == Character.toLowerCase(arr[i]))) {
				count++;
			}
		}
		
		return count;
		
		
	}

}
