package Modelos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
Connection conexion;
    public Connection Conectar()
    {
        try
        {
            //JOptionPane.showMessageDialog(null, "Entrando a la conexion");
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            
            //NOMBRE DEL SERVIDOR
            String nombre_servidor = "localhost";
            //String nombre_servidor = "localhost";
            String numero_puerto = "1521";
            String sid = "xe";
            String url = "jdbc:oracle:thin:@"+ nombre_servidor + ":" + numero_puerto + ":" + sid; 
            
            //NOMBRE DEL USUARIO Y CONTRASEÑA
            String usuario="SYSTEM";
            String password="9820";
            this.conexion = DriverManager.getConnection(url,usuario,password);
            //JOptionPane.showMessageDialog(null,"Conectado");
            return this.conexion;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Problema al conectar...."+e.getMessage());
            return this.conexion;
        }
    }
}
