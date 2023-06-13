package lab_02;

import java.util.Scanner;

public class Lab_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        int numberUserInput = scanner.nextInt();

        if (numberUserInput % 2 == 0) {
            System.out.println("Number user input is even number!");
        } else {
            System.out.println("Number user input is odd number!");
        }
    }
}
