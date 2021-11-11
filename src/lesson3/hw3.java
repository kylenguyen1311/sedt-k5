package lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your string: ");
        String myStr = sc.nextLine();
        char[] myChar = myStr.toCharArray();
        ArrayList<String> myDigits = new ArrayList<>();
        String lastStr = "";
        for (char c : myChar) {
            if (Character.isDigit(c)) {
                myDigits.add(String.valueOf(c));
            }
        }
        if (!myDigits.isEmpty()) {
            for (String myDigit : myDigits) lastStr += myDigit;
            System.out.println(lastStr);
        } else System.out.println("There's no digits in your string");
    }
}
