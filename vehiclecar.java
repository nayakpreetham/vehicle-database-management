/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.vehicleinfo;

import java.sql.Blob;

/**
 *
 * @author user
 */
public class vehiclecar {
    
     private String name;
    private String color;
    private String id;
    private String price;
    private String fueltype;
    private String showid;
   private String compid;
   private String seating;

    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getShowid() {
        return showid;
    }

    public void setShowid(String showid) {
        this.showid = showid;
    }

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid;
    }
  
   
    private byte[] image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
     public byte[] getMyImage() {
        return image;
    }


   

    public void setImage(byte[] image) {
        this.image = image;
    }
    
    public vehiclecar(){}
    
    public vehiclecar(String id,String name, String color, String price,String fueltype,String seating,String showid,String compid,byte[]image){
     this.id = id;
        this.name = name;
      
        this.color = color;
         this.price = price;
         this.fueltype = fueltype;
         this.seating = seating;
          this.showid = showid;
           this.compid = compid;
       
        this.image = image;
        
       
    }
    
    
    
}
