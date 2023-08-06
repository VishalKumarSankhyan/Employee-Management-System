import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isActive = true;
        Scanner input = new Scanner(System.in);
        int choice;
        while (isActive) {
            System.out.println("\n----- Employee Management System -----");
            System.out.println("--- Menu ---");
            System.out.println("1. Create ");
            System.out.println("2. Update ");
            System.out.println("3. Read ALL");
            System.out.println("4. Search ");
            System.out.println("5. Delete ");
            System.out.println("6. Exit ");
            System.out.print("Choice -> ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    Employee employee = new Employee();
                    input.nextLine();
                    System.out.print("\nName -> ");
                    employee.setEmployeeName(input.nextLine());
                    System.out.print("Email -> ");
                    employee.setEmployeeEmail(input.nextLine());
                    System.out.print("DOB (YYYY/MM/DD) -> ");
                    employee.setEmployeeDOB(input.nextLine());
                    System.out.print("gander -> ");
                    employee.setEmployeeGander(input.nextLine());
                    System.out.print("Salary -> ");
                    employee.setEmployeeSalary(input.nextInt());
                    input.nextLine();
                    System.out.print("Department -> ");
                    employee.setEmployeeDepartment(input.nextLine());
                    System.out.print("Company -> ");
                    employee.setEmployeeCompany(input.nextLine());

                    EmployeeBE.createEmployee(employee);
                    break;

                case 2:
                    System.out.print("Enter id of employee to Update -> ");
                    int upId = input.nextInt();
                    Employee getEmployee = EmployeeBE.getEmployee(upId);
                    if (getEmployee.getEmployeeID() == 0) {
                        System.out.println("Not Found");
                    } else {
                        System.out.println(getEmployee);
                        Employee upEmployee = new Employee();
                        input.nextLine();
                        System.out.print("\nName -> ");
                        upEmployee.setEmployeeName(input.nextLine());
                        System.out.print("Email -> ");
                        upEmployee.setEmployeeEmail(input.nextLine());
                        System.out.print("DOB (YYYY/MM/DD) -> ");
                        upEmployee.setEmployeeDOB(input.nextLine());
                        System.out.print("gander -> ");
                        upEmployee.setEmployeeGander(input.nextLine());
                        System.out.print("Salary -> ");
                        upEmployee.setEmployeeSalary(input.nextInt());
                        input.nextLine();
                        System.out.print("Department -> ");
                        upEmployee.setEmployeeDepartment(input.nextLine());
                        System.out.print("Company -> ");
                        upEmployee.setEmployeeCompany(input.nextLine());

                        EmployeeBE.updateEmployee(getEmployee, upEmployee);
                    }
                    break;

                case 3:
                    ArrayList<Employee> employeeList = EmployeeBE.readAllEmployee();
                    System.out.println(
                            "\nid  [  Name  ,  Email  ,  DOB  ,  Gander  ,  Salary  ,  Department  ,  Company  ]");
                    for (Employee emp : employeeList) {
                        System.out.println(emp.StringFy());
                    }
                    break;

                case 4:
                    System.out.print("Enter id of employee to search -> ");
                    int id = input.nextInt();
                    Employee speEmployee = EmployeeBE.getEmployee(id);
                    System.out.println(speEmployee.getEmployeeID() == 0 ? "Not Found" : speEmployee);
                    break;

                case 5:
                    System.out.print("Enter id of employee to delete -> ");
                    int deleteId = input.nextInt();
                    EmployeeBE.deleteEmployee(deleteId);
                    break;

                case 6:
                    isActive = false;
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        }
        input.close();
    }
}
