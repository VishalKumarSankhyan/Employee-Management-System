import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeBE {
    public static void createEmployee(Employee employee) throws SQLException{
        Connection connection = ConnectionDB.CreateConnection();
        String query = Query.insert;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, employee.getEmployeeName());
        preparedStatement.setString(2, employee.getEmployeeEmail());
        preparedStatement.setString(3, employee.getEmployeeDOB());
        preparedStatement.setString(4, employee.getEmployeeGander());
        preparedStatement.setInt(5, employee.getEmployeeSalary());
        preparedStatement.setString(6, employee.getEmployeeDepartment());
        preparedStatement.setString(7, employee.getEmployeeCompany());
        // System.out.println("n ps = "+preparedStatement + "\n" + employee);
        preparedStatement.executeUpdate();
        System.out.println("\nInserted Successfully");
        preparedStatement.close();

    }

    public static void updateEmployee(Employee employee, Employee upEmployee) throws SQLException{
        Connection connection = ConnectionDB.CreateConnection();
        String query = Query.update;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, (upEmployee.getEmployeeName() != "" ? upEmployee.getEmployeeName() : employee.getEmployeeName()));
        preparedStatement.setString(2, (upEmployee.getEmployeeEmail() != "" ? upEmployee.getEmployeeEmail() : employee.getEmployeeEmail()));
        preparedStatement.setString(3, (upEmployee.getEmployeeDOB() != "" ? upEmployee.getEmployeeDOB() : employee.getEmployeeDOB()));
        preparedStatement.setString(4, (upEmployee.getEmployeeGander() != "" ? upEmployee.getEmployeeGander() : employee.getEmployeeGander()));
        preparedStatement.setInt(5, (upEmployee.getEmployeeSalary() != -1 ? upEmployee.getEmployeeSalary() : employee.getEmployeeSalary()));
        preparedStatement.setString(6, (upEmployee.getEmployeeDepartment() != "" ? upEmployee.getEmployeeDepartment() : employee.getEmployeeDepartment()));
        preparedStatement.setString(7, (upEmployee.getEmployeeCompany() != "" ? upEmployee.getEmployeeCompany() : employee.getEmployeeCompany()));
        preparedStatement.setInt(8, employee.getEmployeeID());
        // System.out.println("n ps = "+preparedStatement);
        preparedStatement.executeUpdate();
        System.out.println("\nUpdated Successfully");
        preparedStatement.close();
    }

    public static ArrayList<Employee> readAllEmployee() throws SQLException{
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Connection connection = ConnectionDB.CreateConnection();
        String query = Query.select;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        // System.out.println("\n st = " + preparedStatement);
        ResultSet rs = preparedStatement.executeQuery(query);
        while(rs.next()){
            Employee employee = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8));
            employeeList.add(employee);
        }
        preparedStatement.close();
        return employeeList;
    }

    public static Employee getEmployee(int id) throws SQLException{
        Connection connection = ConnectionDB.CreateConnection();
        String query = Query.selectSpecific;
        query = query + id;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        // System.out.println("n ps = "+preparedStatement);
        ResultSet rs = preparedStatement.executeQuery(query);
        Employee employee = new Employee();
        while(rs.next()){
            if(rs.getInt(1) == id){
                employee = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8));
            }
        }
        preparedStatement.close();
        return employee;
    }

    public static void deleteEmployee(int id) throws SQLException{
        Connection connection = ConnectionDB.CreateConnection();
        String query = Query.delete;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        // System.out.println("n ps = "+preparedStatement);
        preparedStatement.executeUpdate();
        System.out.println("\nDeleted Successfully");
        preparedStatement.close();
    }
}