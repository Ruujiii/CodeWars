package centuryfromYear;

public class Solution {
	
	public static void main(String args[]) { 
				
		System.out.println("How many centuries are in the input: " + century(1900));
	}
	
	public static int century(int number) {
		    
		int century = number / 100;
		int remainder = number % 100;
		
		if(remainder >= 1) {
			
			century++;
		}
		
		return century;
	}
}
