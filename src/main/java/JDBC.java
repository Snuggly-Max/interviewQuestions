
import java.sql.*;
public class JDBC {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/aliens";
        String username = "root";
        String password = "13636411656a";
        String query = "select username from user where email = \"wenhong1@qq.com\"";
        Class.forName("com.mysql.jdbc.Driver"); //method helping me to load class
        Connection con = DriverManager.getConnection(url,username,password);// from java.sql.*
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString("username");
        System.out.println(name);
        st.close();
        con.close();
    }
}
