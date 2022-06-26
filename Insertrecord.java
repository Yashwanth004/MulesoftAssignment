import java.sql.*;

public class Insertrecord{
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:C:\\sqlite\\sqlite-tools-win32-x86-3390000\\yashwanth.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement

            String query0 = "INSERT INTO FavMovies values ('Bahubali','Prabhas','Anushka', 2018,'s.s Rajamouli');";
            stmt.executeUpdate(query0); // Create Query-1

            String query1 = "INSERT INTO FavMovies values ('Bahubali 2','Prabhas','Anushka', 2021,'S.S Rajamouli');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO FavMovies values ('F3','Venkatesh','Thamanna',2022,'Anil Ravipudi');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO FavMovies values ('shyam singha roy','nani','Sai pallavi',2021,'rahul sankrithyan');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO FavMovies values ('RRR','NTR','Olivia Morris',2022,'S.S Rajamouli');";
            stmt.executeUpdate(query4); // Create Query-4

            String query5 = "INSERT INTO FavMovies values ('KGF2','Yash','Srinidhi',2022,'Prashanth');";
            stmt.executeUpdate(query5);
            stmt.close();

            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}