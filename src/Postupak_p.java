/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marko
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Postupak_p {
    
    private int ID_Operacije;
    private String Naziv_operacije_rada;
    private double Vreme_trajanja_operacije_rada_min;
    private double Pripremno_zavrsno_vreme_tpz_min;

    
    
    //making getters and setters
    public Integer getID_Operacije(){
        return ID_Operacije;
    }
    public void setID_Operacije(Integer ID){
         this.ID_Operacije = ID;
     }
     public String getNaziv_operacije_rada(){
        return Naziv_operacije_rada;
    }
     public void setNaziv_operacije_rada(String NAZIV){
         this.Naziv_operacije_rada = NAZIV;
     }
     
      public Double getVreme_trajanja_operacije_rada_min(){
        return Vreme_trajanja_operacije_rada_min;
    }
      public void setVreme_trajanja_operacije_rada_min(Double TRAJANJE_OPERACIJE_RADA){
          this.Vreme_trajanja_operacije_rada_min = TRAJANJE_OPERACIJE_RADA;
      }
       public Double getPripremno_zavrsno_vreme_tpz_min(){
        return Pripremno_zavrsno_vreme_tpz_min;
    }
       public void setPripremno_zavrsno_vreme_tpz_min(Double PRIPREMNO_ZAVRSNO_VREME){
       this.Pripremno_zavrsno_vreme_tpz_min=PRIPREMNO_ZAVRSNO_VREME;
    }
       //create the class constructors
       public Postupak_p(){}
      
      public Postupak_p(Integer ID, String NAZIV, Double TRAJANJE_OPERACIJE_RADA, Double PRIPREMNO_ZAVRSNO_VREME) {
          this.ID_Operacije= ID;
          this.Naziv_operacije_rada=NAZIV;
          this.Vreme_trajanja_operacije_rada_min=TRAJANJE_OPERACIJE_RADA;
          this.Pripremno_zavrsno_vreme_tpz_min=PRIPREMNO_ZAVRSNO_VREME;
      }
      
      //create a function to insert- edit - remove valies
      public boolean execTypeQuery(String queryType, Postupak_p type){
          PreparedStatement ps;
          
          // add a new value
          if (queryType.equals("Add")){
              try {
                  //query INSERT INTO `operacija_rada`(`Naziv_operacije_rada`, `Vreme_trajanja_operacije_rada_min`, `Pripremno_zavrsno_vreme_tpz_min`) VALUES (?,?,?)
                  ps = Connect_db.getTheconnection().prepareStatement("INSERT INTO `operacija_rada`(`Naziv_operacije_rada`, `Vreme_trajanja_operacije_rada_min`, `Pripremno_zavrsno_vreme_tpz_min`) VALUES (?,?,?)");
                  ps.setString(1, type.getNaziv_operacije_rada());
                  ps.setDouble(2, type.getVreme_trajanja_operacije_rada_min());
                  ps.setDouble(3, type.getPripremno_zavrsno_vreme_tpz_min());
                  
                  return (ps.executeUpdate() > 0);
              } catch (SQLException ex) {
                  Logger.getLogger(Postupak_p.class.getName()).log(Level.SEVERE, null, ex);
                  return false;
              }
          }
          //to update values.... UPDATE `operacija_rada` SET `Naziv_operacije_rada`=?,`Vreme_trajanja_operacije_rada_min`=?,`Pripremno_zavrsno_vreme_tpz_min`=? WHERE `ID_Operacije`=?
          else if (queryType.equals("Edit")){
              try {
                  //query INSERT INTO `operacija_rada`(`Naziv_operacije_rada`, `Vreme_trajanja_operacije_rada_min`, `Pripremno_zavrsno_vreme_tpz_min`) VALUES (?,?,?)
                  ps = Connect_db.getTheconnection().prepareStatement("UPDATE `operacija_rada` SET `Naziv_operacije_rada`=?,`Vreme_trajanja_operacije_rada_min`=?,`Pripremno_zavrsno_vreme_tpz_min`=? WHERE `ID_Operacije`=?");
                  ps.setString(1, type.getNaziv_operacije_rada());
                  ps.setDouble(2, type.getVreme_trajanja_operacije_rada_min());
                  ps.setDouble(3, type.getPripremno_zavrsno_vreme_tpz_min());
                  ps.setInt(4, type.getID_Operacije());
                  return (ps.executeUpdate() > 0);
              } catch (SQLException ex) {
                  Logger.getLogger(Postupak_p.class.getName()).log(Level.SEVERE, null, ex);
                  return false;
              }
          }
          // to remove values..... 
          else if (queryType.equals("Remove")){
              try {
                  //query DELETE FROM `operacija_rada` WHERE `ID_Operacije`=?
                  ps = Connect_db.getTheconnection().prepareStatement("DELETE FROM `operacija_rada` WHERE `ID_Operacije`=?");
                  ps.setInt(1, type.getID_Operacije());
                  return (ps.executeUpdate() > 0);
              } catch (SQLException ex) {
                  Logger.getLogger(Postupak_p.class.getName()).log(Level.SEVERE, null, ex);
                  return false;
              }
          }
          else {
              JOptionPane.showMessageDialog(null,"Enter the correct Query(add,edit,remove)","Invalid Operation",2);
              return false;
          }
          //creating a function to return all the values in the Hashmap
          

      }
        public ArrayList<Postupak_p> workersList()
    {
        ArrayList<Postupak_p> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `operacija_rada` ";
        try {
        st=Connect_db.getTheconnection().createStatement();
        rs = st.executeQuery(selectQuery);
        Postupak_p worker;
        while (rs.next()){
            worker= new Postupak_p(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getDouble(3),
                                    rs.getDouble(4)
                                    );
            list.add(worker);
        }
        }catch (SQLException ex) {
            Logger.getLogger(P_zaposleni.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
        //Function to get values by id
        public Postupak_p getTypeByUd(Integer ID_Operacije ){
             PreparedStatement ps;
            ResultSet rs;
            Postupak_p type;
            type = new Postupak_p();
                try {
                    ps = Connect_db.getTheconnection().prepareStatement("SELECT * FROM `operacija_rada` WHERE `ID_Operacije`=?");
                    ps.setInt(1, ID_Operacije);
                    rs = ps.executeQuery();
                    
                    if (rs.next()){
                        type.setID_Operacije(ID_Operacije);
                        type.setNaziv_operacije_rada(rs.getString(2));
                        type.setVreme_trajanja_operacije_rada_min(rs.getDouble(3));
                        type.setPripremno_zavrsno_vreme_tpz_min(rs.getDouble(4));
                    }
                    
                     } catch (SQLException ex) {
                    Logger.getLogger(Postupak_p.class.getName()).log(Level.SEVERE, null, ex);
                }
                return type;
        }
        public boolean ExportWorkerData(Postupak_p worker){
         Statement st;
        ResultSet rs;
        String selectQuery = "SELECT ID_Operacije,Naziv_operacije_rada,Vreme_trajanja_operacije_rada_min, Pripremno_zavrsno_vreme_tpz_min\n" +
"INTO OUTFILE 'C:/Users/marko/Desktop/Operacije.txt'" +
"FIELDS TERMINATED BY ' '" +
"FROM `operacija_rada`; ";
        
        try {
             st=Connect_db.getTheconnection().createStatement();
        rs = st.executeQuery(selectQuery);
        JOptionPane.showMessageDialog(null, "Done");
        } catch (SQLException ex) {
            Logger.getLogger(Postupak_p.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return false;
    }
        
}
