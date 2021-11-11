package lesson3;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int maxInput = 2;
        int count = 0;
        String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter passwords: ");
        userInput = sc.nextLine();
        if (userInput.equals(myPassword))
            System.out.println("Password correct!");
        while (userInput.equals(myPassword) == false && count < maxInput) {
            System.out.println("Password incorrect, try again!");
            System.out.println("Please enter passwords: ");
            userInput = sc.nextLine();
            if (userInput.equals(myPassword))
                System.out.println("Password correct!");
            count++;
            if (count == maxInput && userInput.equals(myPassword) == false) {
                System.out.println("Please try again later!");
            }
        }

    }
}