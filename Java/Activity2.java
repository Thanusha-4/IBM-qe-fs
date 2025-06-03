/*package Activities;

public class Activity2 {
    public static void main(String[] args) {
        // Step 1: Initialize the array
        int[] numbers = {10, 77, 10, 54, -11, 10};

        // Step 2: Variable to store the sum of all 10's
        int sum = 0;

        // Step 3: Loop through the array
        for (int number : numbers) {
            // If number is 10, add to sum
            if (number == 10) {
                sum += 10;
            }
        }
        if (sum==30) {
        	System.out.println("True");
        }
        else {
        	System.out.println("False");
        }	
        // Step 4: Check if the sum is exactly 30
       // boolean result = (sum == 30);

        // Step 5: Print the result
        //System.out.println("Result: " + result);
    }
}
*/
package Activities;

public class Activity2 {
    public static void main(String[] args) {
    	int[] numbers= {10,20,10,10,50};
    	int sum=0;
    	for (int number:numbers) {
    		if (number == 10){
    			sum+=10;
    			
    		}
    }
    	boolean Result=(sum==30);
    		System.out.println("Result:" + Result);
    
}

    }

/*import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        //Initialize the array
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
        
        //Set constants
        int searchNum = 10;
        int fixedSum = 30;

        //Print result
        System.out.println("Result: " + result(numArr, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == searchNum) {
                //Add them
                temp_sum += searchNum;
            }

            //Sum should not be more than 30
            if (temp_sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == fixedSum;
    }
}*/
