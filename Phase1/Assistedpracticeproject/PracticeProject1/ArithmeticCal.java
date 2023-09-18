package javaPrograms;
import java.util.Scanner;
public class ArithmeticCal {
    public static void main(String[] args) {
       
    	Scanner num = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = num.nextDouble();
         
        System.out.print("Enter the second number: ");
        double num2 = num.nextDouble();
         
        System.out.println("Choose the operation below:");
        System.out.println("1. Addition(+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Multiplication(*)");
        System.out.println("4. Division(/)");
       
        int operator = num.nextInt();
        double result = 0;
        
        switch (operator) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
            	result = num1 / num2;
                break;
            default :
                System.out.println("Invalid operator....");
                
        }
        
        System.out.println("Result: " + result);
    }
}