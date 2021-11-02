package lesson1;

public class week1_hw1_2_3_4 {
    public static void main(String[] args) {
        int[] newArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArr2 = {101, 12, 21, 13, 44, 53, 36, 47, 78, 49, 100};
        int arrLength = newArr.length;
        int arrLength2 = newArr2.length;
        int arrOdd = 0, arrEven = 0;
        int sum = 0;
        //Task 01 count odd/even numbers
        for (int i = 0; i < arrLength; i++) {
            sum = sum + newArr[i];
            if (newArr[i] % 2 == 1)
                arrOdd++;
            else
                arrEven++;
        }
        //Task 03 calculate the average.
        int avg = sum / arrLength;
        System.out.println("=====Task01=====");
        System.out.println("Even numbers: " + arrEven);
        System.out.println("Odd numbers: " + arrOdd);
        System.out.println("=====Task03=====");
        System.out.println("AVG = " + avg);
        //Task 02 compare the numbers
        System.out.println("=====Task02=====");
        int max = newArr2[0];
        for (int i = 0; i < arrLength2; i++) {
            if (newArr2[i] > max)
                max = newArr2[i];
        }
        System.out.println("MAX = " + max);

        // Task 04
        System.out.println("=====Task04=====");
        System.out.println("Original Array: ");
        for (int i = 0; i < arrLength2; i++) {
            System.out.print(newArr2[i] + " ");
        }
        System.out.println();
            int min;
            for (int i = 0; i < arrLength2; i++) {
                for (int j = 0; j < arrLength2; j++) {
                    if (newArr2[i] < newArr2[j]) {
                        min = newArr2[i];
                        newArr2[i] = newArr2[j];
                        newArr2[j] = min;
                    }
                }

            }
            System.out.println("Here's the Array after sorting: ");
            for (int i = 0; i < arrLength2; i++) {
                System.out.print(newArr2[i] + " ");
            }
        }
    }