public class Salary {

    static class Employee {
        String name;
        double salary;

        void setDetails(String empName, double empSalary)
        {name=empName;
         salary =empSalary;
        }

        void displayDetails() {
            System.out.println("Name of employee is:" + name);
            System.out.printf(" Salary of the employee is:%.0f\n", salary);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setDetails("Bibhuti", 500000.0);
        emp.displayDetails();
        
    }
    
        
    }

