package application;


import java.sql.Connection;
import java.sql.DriverManager;

public class database {

    public static Connection connectDb() {

        try {


            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/gym", "root", "");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
