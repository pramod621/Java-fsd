package assistedPracticeProject1;

import java.util.*;
public class ArraysImpts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the size for an Array");
		   int a = sc.nextInt();
		   System.out.println("Enter the elements for an Array");
		   int arr[] = new int[a];
		   for(int i=0; i<a ;i++) 
		   {
			   arr[i] = sc.nextInt();
		   }
		   System.out.println("Array elements are:");
		   for(int i=0;i<a;i++)
		   {
			   System.out.print(arr[i]+" ");
		   }

    }
}