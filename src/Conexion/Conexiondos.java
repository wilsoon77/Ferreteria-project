package Conexion;
//Importamos el paquete 
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexiondos 
{
    static String bd = "dbferreteria";
    //El método getConnection de la clase DriverManager
    //necesita 3 argumentos:
    //url, user y password
    static String url = "jdbc:mysql://localhost/"+bd;
    static String user = "root";
    static String password = "";
    
    static public Connection cnx = null;
    
    //Para hacer las consultas
    static public Statement st = null;
    //Para recibir las consultas
    static public ResultSet rs = null;

    //Para realizar consultas preparadas
    static public PreparedStatement pst = null;
    
    public Conexiondos()
    {
        try 
        {
            //En JDBC4 la siguiente línea no es necesaria
            //No es necesaria, se pone por compatibilidad
            Class.forName("com.mysql.jdbc.Driver");
            
            cnx = DriverManager.getConnection(url,user,password);
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        /*finally
        {
            if(cnx != null)
            {
                try {
                    cnx.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }*/
    }   
}
