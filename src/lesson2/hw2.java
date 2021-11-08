package lesson2;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        int[] myIntArr = {1, 2, 2, 3, 4, 2, 5, 6, 5, 2, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int a = sc.nextInt();
        int b = myIntArr.length;
        for (int i = 0; i < b; i++) {
            for (int j = b - 1; j >= 0 && j!=i ; j--) {
                int c = myIntArr[i] + myIntArr[j];
                if (c==a){
                    System.out.println("("+i+", "+j+")");
                }
            }
        }
    }
}
