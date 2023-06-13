package lab_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_07_01 {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new Employee();
        Employee contractEmployee = new Employee();
        SalaryController employeeController = new SalaryController();
        fullTimeEmployee.setSalary(50000);
        contractEmployee.setSalary(40000);
        List<Employee> employeeList = new ArrayList<>();
        System.out.println("Nhập số nhân viên FTE:");
        Scanner scanner = new Scanner(System.in);
        int numberFTE = scanner.nextInt();
        System.out.println("Nhập số nhân viên FTE:");
        int numberContractor = scanner.nextInt();
        for (int i = 0; i < numberFTE; i++) {
            employeeList.add(fullTimeEmployee);
        }
        for (int i = 0; i < numberContractor; i++) {
            employeeList.add(contractEmployee);
        }
        System.out.print("Tổng số lương nhân viên là: ");
        System.out.println(employeeController.getTotalSalary(employeeList));
    }
}
