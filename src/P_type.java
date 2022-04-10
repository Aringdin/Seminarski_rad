/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marko
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class P_type {
    
    private int id;
    private int tip;
    private String proizvod;
    

    
    
    //making getters and setters
    public Integer getid(){
        return id;
    }
    public void setid(Integer ID){
         this.id = ID;
     }
     public Integer gettip(){
        return tip;
    }
     public void settip(Integer TIP){
         this.tip = TIP;
     }
     
      public String getproizvod(){
        return proizvod;
    }
      public void setproizvod(String PROIZVOD){
          this.proizvod = PROIZVOD;
      }
      
       //create the class constructors
       public P_type(){}
      
      public P_type(Integer ID, Integer TIP, String PROIZVOD) {
          this.id= ID;
          this.tip=TIP;
          this.proizvod=PROIZVOD;
          
      }
      
      
      public HashMap<String,Integer> getTypesMap(){
            HashMap<String,Integer> map = new HashMap<>();
            
            Statement st;
            ResultSet rs;
            
            
                try {
                    st = Connect_db.getTheconnection().createStatement();
                    rs = st.executeQuery("Select * From `products`");
                    P_type type;
                    while (rs.next()){
                        
                        type = new P_type (rs.getInt(1),rs.getInt(2), rs.getString(3));
                        map.put(type.getproizvod(), type.getid());
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(P_type.class.getName()).log(Level.SEVERE, null, ex);
                }
            return map;
      }
      
                  public boolean addImage(int proizvodid, String the_image_path){
             PreparedStatement ps;
        String addQuery = "INSERT INTO `images`(`id_proizvoda`, `the_image`) VALUES (?,?)";
         
          try {
              
                 try {
                     FileInputStream productImage = new FileInputStream(new File(the_image_path));
                     
                     ps = Connect_db.getTheconnection().prepareStatement(addQuery);
                     ps.setInt(1, proizvodid);
                     ps.setBinaryStream(2, productImage);
                     return (ps.executeUpdate()>0);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(P_PLACE.class.getName()).log(Level.SEVERE, null, ex);
                     return false;
                 }
              
            
            
             
            
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
            
            }
      
      
      
      
}
