import java.util.Scanner;

public class WhiteSpace {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your sentence");
		String sentence = input.nextLine();
		
		System.out.println(removeSpace(sentence));
		

	}
	
	public static String removeSpace(String sentence) {
		
		String remove = "";
		
		
		char[]a = sentence.toCharArray();
		
		for(int i = 0; i < a.length; i++) {
			if(Character.toLowerCase(a[i]) != ' ') {
				remove = remove+Character.toLowerCase(a[i]);
			}
			
		}
		
		return remove;
	}

}
