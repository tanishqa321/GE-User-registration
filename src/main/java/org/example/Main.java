package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String emailPattern = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        // Regex pattern for First Name validation (Starts with Capital and at least 3 characters)
        String namePattern = "^[A-Z][a-zA-Z]{2,}$";

        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();
        if (Pattern.matches(namePattern, firstName)) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Invalid first name. Please ensure it starts with a capital letter and has at least 3 characters.");
        }
        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine();

        //UC2:  Validate last name
        if (Pattern.matches(namePattern, lastName)) {
            System.out.println("Valid last name: " + lastName);
        } else {
            System.out.println("Invalid last name. Please ensure it starts with a capital letter and has at least 3 characters.");
        }
        System.out.println("Please enter your email address:");


        String email = scanner.nextLine();

        // Validate email using regex pattern
        if (Pattern.matches(emailPattern, email)) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Invalid email. Please enter a valid email in the format abc.xyz@bl.co.in.");

            String mobilePattern = "^\\d{2} \\d{10}$"; // Country code followed by space and 10 digits


            System.out.println("Please enter your mobile number ");

            //UC4
            String mobileNumber = scanner.nextLine();

            // Validate mobile number using regex pattern
            if (Pattern.matches(mobilePattern, mobileNumber)) {
                System.out.println("Valid mobile number: " + mobileNumber);
            } else {
                System.out.println("Invalid mobile number. Please enter a valid mobile number in the format 91 9919819801.");
            }

        }
        //UC5
        String r1 = ".{8,}"; // Minimum 8 characters
        String r2 = "(?=.*[A-Z]).*"; // At least one uppercase letter
        String r3 = "(?=.*[0-9]).*"; // At least one numeric number
        String r4 = "(?=.*[@#$%^&+=!]).*"; // At least one special character
        System.out.println("Please enter your password (Minimum 8 characters, at least 1 uppercase letter , at least one numeric number ):");

        String password = scanner.nextLine();
        if(Pattern.matches(r1,password) && Pattern.matches(r2, password) && Pattern.matches(r3, password)&& Pattern.matches(r2, password)){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid password. Please follow these rules:");
            System.out.println("2. Minimum 8 characters.");
            System.out.println("2. At least 1 uppercase letter.");
            System.out.println("3. At least 1 numeric digit.");
            System.out.println("4. Exactly 1 special character.");
        }

        //UC9
        List<String> emailSamples = List.of(
                // Valid Emails
                "abc@yahoo.com",         // Valid
                "abc-100@yahoo.com",     // Valid
                "abc.100@yahoo.com",     // Valid
                "abc111@abc.com",        // Valid
                "abc-100@abc.net",       // Valid
                "abc.100@abc.com.au",    // Valid
                "abc@1.com",             // Valid
                "abc@gmail.com.com",     // Valid
                "abc+100@gmail.com",     // Valid

                // Invalid Emails
                "abc",                   // Invalid - Missing "@" symbol
                "abc@.com.my",           // Invalid - TLD starts with a dot
                "abc123@gmail.a",        // Invalid - TLD must have at least two characters
                "abc123@.com",           // Invalid - TLD starts with a dot
                "abc123@.com.com",       // Invalid - TLD starts with a dot
                ".abc@abc.com",          // Invalid - First character is a dot
                "abc()*@gmail.com",      // Invalid - Contains invalid characters
                "abc@%*.com",            // Invalid - TLD contains invalid characters
                "abc..2002@gmail.com",   // Invalid - Contains double dots
                "abc.@gmail.com",        // Invalid - Ends with a dot
                "abc@abc@gmail.com",     // Invalid - Contains multiple "@" symbols
                "abc@gmail.com.1a",      // Invalid - TLD with two characters contains a digit
                "abc@gmail.com.aa.au"    // Invalid - Multiple TLDs are not allowed
        );
        // Check each email sample
        for (String emails : emailSamples) {
            if (Pattern.matches(emailPattern, emails)) {
                System.out.println("Valid email: " + emails);
            } else {
                System.out.println("Invalid email: " + emails);
            }
        }
        scanner.close();
    }
}