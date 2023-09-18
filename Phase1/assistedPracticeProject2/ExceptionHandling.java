package assistedPracticeProject2;

import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter two numbers");
    	int x = sc.nextInt();
    	int y = sc.nextInt();
        try {
            int result = x/y;
            System.out.println("Result: " + result); 
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed.");
        }
        sc.close();
    }
}