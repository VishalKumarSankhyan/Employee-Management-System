public class Query {
    static String insert = "INSERT INTO employee (name, email, DOB, gander, Salary, department,company) VALUES (?, ?, ?, ?, ?, ?, ?)";
    static String update = "UPDATE employee SET name = ?, email = ?, DOB = ?, gander = ?, salary = ?, department = ?, company = ? WHERE id = ?";
    static String delete = "DELETE FROM employee WHERE id = ?";
    static String select = "SELECT * FROM employee";
    static String selectSpecific = "SELECT * FROM employee WHERE id = ";
}