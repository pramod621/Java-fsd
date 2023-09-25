package assistedPracticeProject4;

public class LinearSearchAlgo {
	public static void main(String[] args) {
		int arr[] = {25,45,12,14,75,84,90};
		int key=65;
		int indexOfKey = linearSearch(arr, key);
		
		if(indexOfKey != -1)
		System.out.println(key + " was found in index position "+ indexOfKey);
		else
			System.out.println(key + " was not found");
	}

	private static int linearSearch(int[] arr, int key) {		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] == key) 
				return i;
		}		
		return -1;
	}
}