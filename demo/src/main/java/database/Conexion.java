package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Conexion {

    private Connection conn;
    private String host;
    private String db;
    private String username;
    private String password;
    private static Conexion connect;

    public Conexion() {
            this("3.133.140.0","hotel1","hotel1","Pitusmaximus12.");
    }

    public  Conexion(String jndi) {
        try {
            InitialContext cxt = new InitialContext();
            DataSource ds = (DataSource) cxt.lookup(jndi);
            conn = ds.getConnection();
        } catch (Exception ex) {
        }
        connect = this;
    }

    public Conexion(String host, String db, String username, String password) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.host = host;
        this.db = db;
        this.username = username;
        this.password = password;
        try {
            //conn = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":1521:" + db, username, password);
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//" + host + ":1521/" + db, username, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        connect = this;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection connection() {
        try {
            return conn;
        } finally {
        }
    }

    public ResultSet query(String sQuery) {
        try {
            Statement s = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            s.executeQuery(sQuery);
            return s.getResultSet();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage() + "\n" + e.getErrorCode());
        }
        return null;
    }

    public Statement execute(String sQuery) {
        try {
            Statement s = conn.createStatement();
            s.executeUpdate(sQuery);
            return s;
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage() + "\n" + e.getErrorCode());
        }
        return null;
    }

    public void close(Statement s) {
        try {
            s.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage() + "\n" + e.getErrorCode());
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage() + "\n" + e.getErrorCode());
        }
    }

    public static Conexion getConnect() {
        return connect;
    }

    public static void setConnect(Conexion connect) {
    	Conexion.connect = connect;
    }
}