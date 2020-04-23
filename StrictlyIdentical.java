/* OUTPUTS 
 Input5 values for array #1: 
1
2
3
4
5
Input5 values for array #2: 
1
2
3
4
5
The two arrays are equivalent
 */

import java.util.Scanner;

public class StrictlyIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing the two arrays specifying that they have 5 elements in each
		int[] list1 = new int[5];
		int[] list2 = new int[5];
		//creating the scanner to be able to read inputs for the arrays
		Scanner input = new Scanner(System.in);
		
		//prompting the user to input values for the amount needed for list 1
		System.out.println("Input" + list1.length + " values for array #1: ");
		//a loop so that the scanner can get all of 
		//the inputs for however many are needed for the array
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		//repeated above process for list2
		System.out.println("Input" + list2.length + " values for array #2: ");
		for (int i = 0; i < list1.length; i++) {
			list2[i] = input.nextInt();
		}
		
		//creating an if statement to check if the boolean method returns true or false
		if (equals(list1, list2) == true ) {
			System.out.println("The two arrays are equivalent");
		} 
		else { 
			System.out.println("The two arrays are not equivalent");
		}
	}
	//boolean method creation
public static boolean equals(int[]list1, int[]list2) {
	//for loop that runs until either the length is greater than or equal to
	//the index i, or one of the numbers from the lists are not the same
	for(int i = 0; i < list1.length; i++) {
		//checking if the integer at the index is NOT the same
		if (list1[i] != list2[i]) {
			return false;
			//adding one to the index if it does not prove to be correct
		} else { 
			i++;
		}
	}
return true;
}
}


