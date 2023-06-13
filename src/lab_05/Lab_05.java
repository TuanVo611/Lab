package lab_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab_05 {
    public static void main(String[] args) {
        Map<Integer, String> studentList = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int stuId = scanner.nextInt();
        String stuName = scanner.nextLine();
        studentList.put(stuId, stuName);
        System.out.println(studentList);

        int findId = scanner.nextInt();
        System.out.println(studentList.get(findId));
    }
}
