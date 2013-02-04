/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gabriel Lunardi
 */
public class Conexao {
    
        public static Connection abrir(){
            Connection c = null;
            try {
                Class.forName("org.postgresql.Driver"); 
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/escola_aviadores","usersi","sistemas");
            } catch (ClassNotFoundException ecnf){
                System.out.println("erro ao carregar driver JDBC na memória!");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return c;
    }
    
}
