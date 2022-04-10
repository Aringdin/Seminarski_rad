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

public class P_CLIENT {
    
    private int id;
    private String Ime;
    private String Prezime;
    private String broj_telefona;
    private String mejl;
    private String adresa;
    
    public int getid(){
        return this.id;
    }
    public void setid(int ID){
        this.id=ID;
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
     public String getbroj_telefona(){
        return this.broj_telefona;
    }
    public void setbroj_telefona(String TELEFON){
        this.broj_telefona = TELEFON;
    }
      public String getmejl (){
        return this.mejl;
    }
    public void setmejl (String EMAIL){
        this.mejl = EMAIL;
    }
      public String getadresa(){
        return this.adresa;
    }
    public void setadresa(String ADRESS){
        this.adresa = ADRESS;
    }
    
    public P_CLIENT(){}
        public P_CLIENT(int ID, String IME, String PREZIME, String TELEFON, String EMAIL, String ADRESS){
            this.id = ID;
            this.Ime = IME;
            this.Prezime = PREZIME;
            this.broj_telefona = TELEFON;
            this.mejl = EMAIL;
            this.adresa = ADRESS;
            
        }
    
    
    //create a function to add a new client
    //create the table
    public boolean addClientdata(P_CLIENT client) {
        
        PreparedStatement ps;
        String addQuery = "INSERT INTO `klijenti`(`Ime`, `Prezime`, `broj_telefona`, `mejl`, `adresa`) VALUES (?,?,?,?,?)";
        
        try {
            ps = Connect_db.getTheconnection().prepareStatement(addQuery);
            ps.setString(1, client.getIme());
            ps.setString(2, client.getPrezime());
            ps.setString(3, client.getbroj_telefona());
            ps.setString(4, client.getmejl());
            ps.setString(5, client.getadresa());
            
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    //create a function to edit the selected worker
    public boolean editClientdata(P_CLIENT client){
         PreparedStatement ps;
        String editQuery = "UPDATE `zaposleni` SET `Ime`=?,`Prezime`=?,`Radna_uloga`=?,`ID_Operacije`=? WHERE `ID_Zap` =?";
        
        try {
            ps = Connect_db.getTheconnection().prepareStatement(editQuery);
            ps.setString(1, client.getIme());
            ps.setString(2, client.getPrezime());
            ps.setString(3, client.getbroj_telefona());
            ps.setString(4, client.getmejl());
            ps.setString(5, client.getadresa());
            ps.setInt(6, client.getid());
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //function to delete selected value
    public boolean deleteclientdata(P_CLIENT client){
         PreparedStatement ps;
        String deleteQuery = "DELETE FROM `klijenti` WHERE `id`=?";
        
        try {
            ps = Connect_db.getTheconnection().prepareStatement(deleteQuery);
           
            ps.setInt(1, client.getid());
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //create a unaction to return arraylist of workers
    public ArrayList<P_CLIENT> clientsList()
    {
        ArrayList<P_CLIENT> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `klijenti` ";
        try {
        st=Connect_db.getTheconnection().createStatement();
        rs = st.executeQuery(selectQuery);
        P_CLIENT client;
        while (rs.next()){
            client= new P_CLIENT(   rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getString(6));
            list.add(client);
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
