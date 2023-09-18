package javaPrograms;

import java.util.Scanner;
import java.util.ArrayList;

public class EmailValidation {
    public static void main(String[] args) {
       
        ArrayList<String> personEmails = new ArrayList<>();
        personEmails.add("prakashns200@example.com");
        personEmails.add("apache123@example.com");
        personEmails.add("viratkholi@example.com");

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email ID to search: ");
        String searchEmail = scanner.nextLine();

        boolean found = searchEmailID(personEmails, searchEmail);

        if (found) {
            System.out.println(searchEmail + "is in the list");
        } else {
            System.out.println(searchEmail + "is not in the list");
        }
        
        scanner.close();
    }

    public static boolean searchEmailID(ArrayList<String> emailList, String searchEmail) {
        for (String email : emailList) {
            if (email.equalsIgnoreCase(searchEmail)) {
                return true;
            }
        }
        return false; 
    }
}
