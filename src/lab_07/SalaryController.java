package lab_07;

import java.util.List;

public class SalaryController {

    public int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            totalSalary += employeeList.get(i).getSalary();
        }
        return totalSalary;
    }
}
