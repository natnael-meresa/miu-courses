package fpp.lesson5hw.prob3;

import java.util.Arrays;

public class TestEmployee {

    void main() {
        Employee[] employees = {
                new BasePlusCommissionEmployee("John", "Doe", "12345", 120, 10, 100),
                new CommissionEmployee("Tesfay", "Aynalm", "12234", 10, 100),
                new HourlyEmployee("Natnael", "Meresa", "8908", 910, 30),
                new SalariedEmployee("Hadush", "Alem", "89033", 9000),
                new SalariedEmployee("Dawit", "Hagos", "89033", 500),
                null
        };

        for (Employee employee: employees) {
            System.out.println(employee);
            System.out.println();
        }

        Employee[] employees1 = findSalaryList(employees, 2000);
        System.out.println("Employee with salary less then: " + 2000);
        for (Employee employee: employees1) {
            System.out.println(employee.firstName + " " + employee.lastName + ":  " + employee.getPayment());
        }
    }

    public static Employee[] findSalaryList (Employee[] col, double salary) {
        Employee[] employees = new Employee[col.length];
        int cnt = 0;
        for (Employee employee: col) {
            if (employee != null && employee.getPayment() < salary) {
                employees[cnt] = employee;
                cnt += 1;
            }
        }

        return Arrays.copyOf(employees, cnt);
    }
}
