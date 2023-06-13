package lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_04 {
    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<>();
        myArr.add(1);
        myArr.add(2);
        myArr.add(3);
        myArr.add(4);
        myArr.add(5);
        myArr.add(6);
        myArr.add(7);

        for (Integer integer : myArr) {
            System.out.print(" " + integer);
        }
        System.out.println();
        System.out.println("Max Number: " + getMaxNumber(myArr));
        System.out.println("Max Number: " + getMinNumber(myArr));

        Scanner scanner = new Scanner(System.in);
        int indexNumber = scanner.nextInt();
        System.out.println(findNumber(myArr, indexNumber));
    }

    private static int findNumber(List<Integer> arr,int x) {
        return arr.get(x);
    }

    private static int getMinNumber(List<Integer> arr) {
        int minNumber = arr.get(0);
        for (Integer integer : arr) {
            if (minNumber > integer) {
                minNumber = integer;
            }
        }
        return minNumber;
    }

    private static int getMaxNumber(List<Integer> myArr) {
        int maxNumber = 0;
        for (Integer integer : myArr) {
            if (maxNumber < integer) {
                maxNumber = integer;
            }
        }
        return maxNumber;
    }
}
