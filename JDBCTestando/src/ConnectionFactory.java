import java.sql.*;

public class ConnectionFactory {
    private static final String url = "jdbc:postgres://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String pass = "postgres";

    public static void getConnection() {
        
       
        try {
            Connection con; // Conexão com o servidor de banco de dados
            // Conectar com o servidor de banco de dados
            System.out.println("Conectando ao banco de dados\nURL = " + url);
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}