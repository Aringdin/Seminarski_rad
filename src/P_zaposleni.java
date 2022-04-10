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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class P_zaposleni {
    private int ID_Zap;
    private String Ime;
    private String Prezime;
    private String Radna_uloga;
    private int ID_Operacije;
    
    public int getID_Zap(){
        return this.ID_Zap;
    }
    public void setID_Zap(int ID){
        this.ID_Zap=ID;
    }
    public String getIme(){
        return this.Ime;
    }
    public void setIme(String IME){
        this.Ime = IME;
    }
      public String getPrezime(){
        return this.Prezime;
    }
    public void setPrezime(String PREZIME){
        this.Prezime = PREZIME;
    }
      public String getRadna_uloga(){
        return this.Radna_uloga;
    }
    public void setRadna_uloga(String RADNA){
        this.Radna_uloga = RADNA;
    }
      public int getID_Operacije(){
        return this.ID_Operacije;
    }
    public void setID_Operacije(int IDO){
        this.ID_Operacije = IDO;
    }
    
    public P_zaposleni(){}
        public P_zaposleni(int ID, String IME, String PREZIME, String RADNA, int IDO){
            this.ID_Zap = ID;
            this.Ime = IME;
            this.Prezime = PREZIME;
            this.Radna_uloga = RADNA;
            this.ID_Operacije = IDO;
        }
    
    
    //create a function to add a new hired person
    //create the table
    public boolean addWorkerData(P_zaposleni worker) {
        
        PreparedStatement ps;
        String addQuery = "INSERT INTO `zaposleni`(`Ime`, `Prezime`, `Radna_uloga`, `ID_Operacije`) VALUES (?,?,?,?)";
        
        try {
            ps = Connect_db.getTheconnection().prepareStatement(addQuery);
            ps.setString(1, worker.getIme());
            ps.setString(2, worker.getPrezime());
            ps.setString(3, worker.getRadna_uloga());
            ps.setInt(4, worker.getID_Operacije());
            
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_zaposleni.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    //create a function to edit the selected worker
    public boolean editWorkerData(P_zaposleni worker){
         PreparedStatement ps;
        String editQuery = "UPDATE `zaposleni` SET `Ime`=?,`Prezime`=?,`Radna_uloga`=?,`ID_Operacije`=? WHERE `ID_Zap` =?";
        
        try {
            ps = Connect_db.getTheconnection().prepareStatement(editQuery);
            ps.setString(1, worker.getIme());
            ps.setString(2, worker.getPrezime());
            ps.setString(3, worker.getRadna_uloga());
            ps.setInt(4, worker.getID_Operacije());
            ps.setInt(5, worker.getID_Zap());
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_zaposleni.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //function to delete selected value
    public boolean deleteWorkerData(P_zaposleni worker){
         PreparedStatement ps;
        String deleteQuery = "DELETE FROM `zaposleni` WHERE `ID_Zap`=?";
        
        try {
            ps = Connect_db.getTheconnection().prepareStatement(deleteQuery);
           
            ps.setInt(1, worker.getID_Zap());
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_zaposleni.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //create a unaction to return arraylist of workers
    public ArrayList<P_zaposleni> workersList()
    {
        ArrayList<P_zaposleni> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `zaposleni` ";
        try {
        st=Connect_db.getTheconnection().createStatement();
        rs = st.executeQuery(selectQuery);
        P_zaposleni worker;
        while (rs.next()){
            worker= new P_zaposleni(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getInt(5));
            list.add(worker);
        }
        }catch (SQLException ex) {
            Logger.getLogger(P_zaposleni.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
     public ArrayList<P_zaposleni> exportworkerdata()
    {
        ArrayList<P_zaposleni> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `zaposleni` ";
        try {
        st=Connect_db.getTheconnection().createStatement();
        rs = st.executeQuery(selectQuery);
        P_zaposleni worker;
        while (rs.next()){
            worker= new P_zaposleni(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getInt(5));
            list.add(worker);
        }
        }catch (SQLException ex) {
            Logger.getLogger(P_zaposleni.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public boolean ExportWorkerData(P_zaposleni worker){
         Statement st;
        ResultSet rs;
        String exportQuery = "SELECT `ID_Zap`, `Ime`, `Prezime`, `Radna_uloga`, `ID_Operacije`\n" +
"INTO OUTFILE 'C:/Users/marko/Desktop/Zaposleni.txt'" +
"FIELDS TERMINATED BY ' '" +
"FROM `zaposleni` ";
        
        try {
             st=Connect_db.getTheconnection().createStatement();
        rs = st.executeQuery(exportQuery);
        JOptionPane.showMessageDialog(null, "Done");
        } catch (SQLException ex) {
            Logger.getLogger(P_zaposleni.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return false;
    }
}

