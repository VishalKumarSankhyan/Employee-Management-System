import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionDB {
    private static String url = "jdbc:mysql://localhost:3306/employeedb";
    private static String userName = "root";
    private static String password = "Sunriser9994";
    public static Connection CreateConnection(){
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            return connection;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
