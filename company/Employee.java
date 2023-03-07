package company;

public class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public static void addEmployee(String name , int id){
        EmployeeCollection.Employees.add(new Employee(name,id));
        System.out.println("Employee with id "+ id + " joined the company....");
    }



}
