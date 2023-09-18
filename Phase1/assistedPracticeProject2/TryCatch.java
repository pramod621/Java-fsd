package assistedPracticeProject2;
import java.util.*;
public class TryCatch {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int x = sc.nextInt();
    int y = sc.nextInt();
    try {
    int div = x/y;
    System.out.println("Division = " +div);
	}
    catch(Exception e) {
    	System.out.println(e);
    }sc.close();
  }
}