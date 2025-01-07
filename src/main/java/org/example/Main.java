package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regex pattern for First Name validation (Starts with Capital and at least 3 characters)
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";

        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();
        if (Pattern.matches(firstNamePattern, firstName)) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Invalid first name. Please ensure it starts with a capital letter and has at least 3 characters.");
        }
        scanner.close();
    }
}