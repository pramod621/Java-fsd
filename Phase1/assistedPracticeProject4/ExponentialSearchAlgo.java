package assistedPracticeProject4;

import java.util.Arrays;

public class ExponentialSearchAlgo {
	public static void main(String[] args) {
		int arr[] = {50,40,20,30,10,90};

		int key = 40;
		
		int indexOfKey = expSearch(arr, arr.length-1, key);
		
		if (indexOfKey != -1)
			System.out.println(key + " was found in index position " + indexOfKey);
		else
			System.out.println(key + " was not found");

	}

	private static int expSearch(int[] arr, int end, int key) {
		// Is the key found in the first index (0)
		if (arr[0] == key) {
			return 0;
		}
		
		int i=1;
		while( i< end && arr[i] <= key)
			i = i * 2;
		
		// we are here means we have found the range for the key
		// to be in.
		// Apply binarySearch now
		return Arrays.binarySearch(arr, i/2, Math.min(i,end), key);		
	}

}