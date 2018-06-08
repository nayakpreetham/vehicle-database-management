/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.vehicleinfo;
import Connection.C_onnection;
//import java.sql.Blob;
import java.sql.PreparedStatement;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class vehiclecarquery {
  
     
       
    // TO OBTAIN THE DATA FROM VEHICLE CAR AND TO RETURN AFTER BINDING IT TO THE ARRAYLIST
    public ArrayList<vehiclecar> bindTable()
    {
        
             ArrayList<vehiclecar> carlist = new ArrayList<>();
            C_onnection connect=new C_onnection();
            PreparedStatement st;
            ResultSet rs;
             vehiclecar vehicle;
   try {
       
      
            st = connect.getConnection().prepareStatement("SELECT vehid,name,color,price,fueltype,seating,showid,compid,image FROM vehicle");
            rs = st.executeQuery();
             // Blob blob;

            while(rs.next())
            {
                vehicle = new vehiclecar(
                 rs.getString("vehid"),
                 rs.getString("name"),
                 rs.getString("color"),
                          rs.getString("price"),
                          rs.getString("fueltype"),
                          rs.getString("seating"),
                          rs.getString("showid"),
                          rs.getString("compid"),
                 rs.getBytes("image")
                
            
               );
                
                 carlist.add(vehicle);
                 
            }

        } 
        catch (SQLException ex) 
        {
       
            Logger.getLogger(vehiclecarquery.class.getName()).log(Level.SEVERE, null, ex);
        }
            return carlist;
    }
}