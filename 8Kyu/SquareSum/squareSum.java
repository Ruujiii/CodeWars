package SquareSum;
import java.util.*;

public class squareSum {
	 
	public static void main(String args[]) { 
		
		int Arr[] = {2, 3, 4};
		System.out.println("Sum: " + squareSum(Arr));
	}
	
    public static int squareSum(int[] n) { 
		int square = 0;
		int sum = 0;

		for (int i = 0; i < n.length; i++) {
			square = n[i] * n[i];
			sum = sum + square;
		}
        return sum;
    }
}
