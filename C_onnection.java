 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class C_onnection 
        
        
 
{
    public Connection connection;
    
    public  Connection getConnection(){
        
        try{
           
       
                Class.forName("com.mysql.jdbc.Driver");
                connection=DriverManager.getConnection("jdbc:mysql://localhost/vehicledatabase","root","");
       
       
         }
    
    catch(Exception e)
        {
        
            System.out.println("ERROR:"+e.getMessage());
        }

          return connection;

    }
}