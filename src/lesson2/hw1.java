package lesson2;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int a = scanner.nextInt();

        for (int i = 0; i < a; ++i) {
            for (int j = a; j > i; --j) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
