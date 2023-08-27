import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "root";

        try{
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select name, age from employee");
            while(rs.next()){
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("Name: " + name + ", Age: " + age);
            }
            con.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}