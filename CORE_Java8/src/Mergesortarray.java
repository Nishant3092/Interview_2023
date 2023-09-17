import java.util.Arrays;

public class Mergesortarray {

	private static String[] mergeArray(String[] arrayA, String[] arrayB)
    {
		String[] mergedArray = new String[arrayA.length + arrayB.length];
         
        int i=0, j=0, k=0; 
                 
        while (i < arrayA.length) 
        {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        } 
                 
        while (j < arrayB.length) 
        {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        } 
             
        Arrays.sort(mergedArray);
         
        return mergedArray;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] arrayA = new String[] {"a","c","d","f","g"};
        
		String[] arrayB = new String[] {"e","b","h"};
         
		String[] mergedArray = mergeArray(arrayA, arrayB);
         
        System.out.println("Array A : "+Arrays.toString(arrayA));
         
        System.out.println("Array B : "+Arrays.toString(arrayB));
         
        System.out.println("Merged Array : "+Arrays.toString(mergedArray));
		
		
		
	}

}
