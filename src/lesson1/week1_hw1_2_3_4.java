package lesson1;

public class week1_hw1_2 {
    public static void main(String[] args) {
        int[] newArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArr2 = {101, 12, 21, 13, 44, 53, 36, 47, 78, 49, 100};
        int arrLength = newArr.length;
        int arrLength2 = newArr2.length;
        System.out.println("Arrlength = " + arrLength);
        int arrOdd = 0, arrEven =0;
        for (int i = 0; i < arrLength ; i++) {
            if (newArr[i]%2==1)
                arrOdd++;
            else
                arrEven++;
        }
        System.out.println("There are " + arrEven + " even numbers");
        System.out.println("There are " + arrOdd + " odd numbers");

        System.out.println("Arrlength2 = " + arrLength2);
        int max = newArr2[0];
        for (int i = 1; i < arrLength2; i++) {
            if(newArr2[i]>max)
                max = newArr2[i];
        }
        System.out.println("The maximum number is " + max);

    }
}
