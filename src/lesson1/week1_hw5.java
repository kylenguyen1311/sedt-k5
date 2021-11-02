package lesson1;

import java.util.Scanner;

public class week1_hw5 {
    public static void main(String[] args) {
        int a, b = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Please input: ");
        a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            b = b*i;
        }
        System.out.println(a + "! = " + b);
    }
}
