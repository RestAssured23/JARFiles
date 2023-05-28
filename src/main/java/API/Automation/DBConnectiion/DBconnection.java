package API.Automation.DBConnectiion;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Test
public class DBconnection {
        private static String userName="Sathish";
        private static String password="Sathish&damodhar$%123";
        private static String url="jdbc:sqlserver://mumbai-test-priv.cpdliqr4wev2.ap-south-1.rds.amazonaws.com:1433" + ";databaseName=WIFS_TEST" + ";encrypt=true;trustServerCertificate=true";

    private static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        private static Connection con;

    private static String live_userName="Sathish";
    private static String live_password="Sathish&damodhar$%123";
    private static String live_url="jdbc:sqlserver://mumbai-test-priv.cpdliqr4wev2.ap-south-1.rds.amazonaws.com:1433" + ";databaseName=WIFS_TEST" + ";encrypt=true;trustServerCertificate=true";

    private static String live_driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";


    public  Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, userName, password);
                System.out.println("Connection Created ");
                Connection con = DriverManager.getConnection(url, userName, password);

            } catch (SQLException ex) {
                // log an exception.
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            // log an exception.
            System.out.println("Driver not found.");
        }
        return con;
    }

    public  Connection Live_Connection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(live_url,live_userName, live_password);
                System.out.println("Connection Created ");
                Connection con = DriverManager.getConnection(live_url,live_userName, live_password);

            } catch (SQLException ex) {
                // log an exception.
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            // log an exception.
            System.out.println("Driver not found.");
        }
        return con;
    }

}










