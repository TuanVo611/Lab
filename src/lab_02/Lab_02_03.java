package lab_02;

import java.util.Scanner;

public class Lab_02_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your height: ");
        float height = scanner.nextFloat();
        System.out.print("Input your weight: ");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * 2);
        System.out.println(BMI);

        if (BMI < 18.5) {
            System.out.println("Underweight");
            double weightIncrease = (18.5 - BMI) * height * 2;
            System.out.println("You should increase " + weightIncrease + " kg");
        } else if (BMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (BMI > 25 && BMI < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}
