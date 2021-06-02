
package proyectofinalpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ProyectoFinalPro {
    
    Connection enlazar = null;

public Connection conectar(){
        System.out.println("Bienvenido!!!!");
        try {
            
            enlazar =  DriverManager.getConnection("jdbc:mysql://localhost/basefinalpro","root","");
            System.out.println("Conectado");
            
        } catch (Exception e) {
            System.out.println("No amigo");
        }
    return enlazar;
    }

}
