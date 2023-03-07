package company;

import JavaAssignment.GetUserInput;

public class Company {
    public static void main(String[] args) {

 
        while (true) {
            System.out.println("\n\tChoose an Option:");
            System.out.println("1: Add Employees");
            System.out.println("2: Sort Employees by Name");
            System.out.println("3: Sort Employees by Id");
            System.out.println("4: Get List of All employee");

            System.out.println("0: Exit");

            int choice = GetUserInput.getInt("\tEnter the choice");

            if (choice == 1) {
                Employee.addEmployee(GetUserInput.getString("Enter employee name"),
                        GetUserInput.getInt("Enter employee Id"));
            } else if (choice == 2) {
                EmployeeCollection.sortByName();
            } else if (choice == 3) {
                EmployeeCollection.sortById();
            } else if (choice == 4) {
                EmployeeCollection.getAllEmployeeList();
            } else if (choice == 0) {
                System.out.println("Thank you visiting our company portal..");
                break;
            } else {
                System.out.println("Invalid Choice, Please Try Again.");
            }

        }
    }
}