import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class EmployeeManagement {
    private Map<Integer, Employee> employees;
    
    public EmployeeManagement() {
        employees = new HashMap<>();
    }
    
    public void addEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
        System.out.println("Employee added successfully.");
    }
    
    public Employee getEmployee(int id) {
        return employees.get(id);
    }
    
    public void updateEmployeeSalary(int id, double newSalary) {
        Employee emp = employees.get(id);
        if (emp != null) {
            emp.setSalary(newSalary);
            System.out.println("Employee salary updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
    
    public void removeEmployee(int id) {
        Employee emp = employees.remove(id);
        if (emp != null) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeManagement empManagement = new EmployeeManagement();
        
        // Add some employees
        empManagement.addEmployee(new Employee(1, "John Doe", 50000));
        empManagement.addEmployee(new Employee(2, "Jane Smith", 60000));
        
        // Retrieve and display an employee
        Employee emp = empManagement.getEmployee(1);
        if (emp != null) {
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee Salary: " + emp.getSalary());
        } else {
            System.out.println("Employee not found.");
        }
        
        // Update an employee's salary
        empManagement.updateEmployeeSalary(2, 65000);
        
        // Remove an employee
        empManagement.removeEmployee(1);
    }
}
