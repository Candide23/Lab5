import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your letters");
		
		String word = input.nextLine();
		
	char[]value = word.toCharArray();
		
		for(int i = 0; i < value.length; i++) {
		int	count =0;
			
		for(int j = i+1; j < value.length; j++) {
			if( Character.toLowerCase(value[i])==Character.toLowerCase(value[j]) ) {
				System.out.println("Your duplicate characters is : " + value[j]);
				count++;
				
				
			}			
			
				
		}
		
			
		}
			
	}
	
	

}
