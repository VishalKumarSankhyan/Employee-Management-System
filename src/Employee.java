public class Employee {
    private int employeeID;
    private String employeeName;
    private String employeeEmail;
    private String employeeDOB;
    private String employeeGander;
    private int employeeSalary;
    private String employeeDepartment;
    private String employeeCompany;

    public Employee() {
    }

    public Employee(int employeeID, String employeeName, String employeeEmail, String employeeDOB, String employeeGander,
            int employeeSalary,
            String employeeDepartment, String employeeCompany) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeDOB = employeeDOB;
        this.employeeGander = employeeGander;
        this.employeeSalary = employeeSalary;
        this.employeeDepartment = employeeDepartment;
        this.employeeCompany = employeeCompany;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public void setEmployeeDOB(String employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

    public void setEmployeeGander(String employeeGander) {
        this.employeeGander = employeeGander;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeCompany(String employeeCompany) {
        this.employeeCompany = employeeCompany;
    }

    // get

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeeDOB() {
        return employeeDOB;
    }

    public String getEmployeeGander() {
        return employeeGander;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public String getEmployeeCompany() {
        return employeeCompany;
    }


    public String toString(){
        return ("\nid - "+this.employeeID + "\nName - " + this.employeeName + "\nEmail - " + this.employeeEmail + "\nDOB - " + this.employeeDOB +"\nGander - " + this.employeeGander + "\nSalary - " + this.employeeSalary + "\nDepartment - " + this.employeeDepartment + "\nCompany - " + this.employeeCompany);
    }

    public String StringFy(){
        return (this.employeeID + " [" + this.employeeName + ", " + this.employeeEmail + ", " + this.employeeDOB +", " + this.employeeGander + ", " + this.employeeSalary + ", " + this.employeeDepartment + ", " + this.employeeCompany + "]");
    }
}
