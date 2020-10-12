/**
 * 16. Write a Java program to remove duplicate elements from an array.
 * 
 * @author Chandni
 *
 */

import java.util.Arrays;

public class DeleteDuplicate {

	public static int removeDuplicateElements(int arr[], int arrLength){   
		
		Arrays.sort(arr);
        int[] temp = new int[arrLength];  
        int j = 0;  
        
        for (int i=0; i<arrLength-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        
        temp[j++] = arr[arrLength-1];     
        
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
    	
    	int[] arr = { 8, 7, 5, 3, 5, 1, 8, 6, 7 }; 
    	int arrlength = arr.length;
    	
    	System.out.print("Array: ");
		for (int i = 0; i < arrlength; i++) {
			System.out.print(arr[i] + " ");
		}

        arrlength = removeDuplicateElements(arr, arrlength); 
        System.out.print("\nAfter Duplicates Removal: ");
        for (int i=0; i< arrlength; i++)  
           System.out.print(arr[i]+" ");  
    } 
	
}

