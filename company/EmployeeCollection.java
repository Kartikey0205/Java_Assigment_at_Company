package company;

import java.util.ArrayList;

public class EmployeeCollection {
    public static ArrayList<Employee> Employees = new ArrayList<>();

    public static void getAllEmployeeList() {
        System.out.println("Employee ID \t\t\tEmployee Name");
        for (Employee employee : Employees) {
            System.out.println("\t"+employee.id + "\t\t\t " + employee.name);
        }
    }

    public static void sortByName() {
        for (int i = 0; i < Employees.size() - 1; i++) {
            for (int j = i + 1; j < Employees.size(); j++) {
                Employee emp1 = Employees.get(i);
                Employee emp2 = Employees.get(j);

                if (emp1.name.compareTo(emp2.name) > 0) {
                    Employees.set(i, emp2);
                    Employees.set(j, emp1);
                }
            }
        }

        getAllEmployeeList();
    }

    public static void sortById() {
        for (int i = 0; i < Employees.size() - 1; i++) {
            for (int j = i + 1; j < Employees.size(); j++) {
                Employee emp1 = Employees.get(i);
                Employee emp2 = Employees.get(j);

                if (emp1.id > emp2.id) {
                    Employees.set(i, emp2);
                    Employees.set(j, emp1);
                }
            }
        }

        getAllEmployeeList();
    }
}
