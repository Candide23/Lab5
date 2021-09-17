import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your letters");
		
		String word = input.nextLine();
		
		System.out.println(reverseOrder(word));

	}
	
	public static String reverseOrder(String word) {
		
		
		String reverse = " ";
		String []value = word.split("\\s");
		
		for(int i = value.length -1; i>=0; i--) {
			reverse = reverse +value[i]+" ";
		}
		
		return reverse;
		
		
	}

}
