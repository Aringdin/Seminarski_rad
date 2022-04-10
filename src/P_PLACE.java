
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marko
 */
public class P_PLACE {
    
    private int id_proizvoda;
    private int Tip;
    private String Nacin_dostave; 
    private int id_klijenta; 
    private int Cena; 
    private String Adresa_dostave; 
    private int Kolicina_Proizvoda; 
    private int Broj_razlicitih_materijala; 
    private String Opis_komentar; 
    private boolean Dostupno_odmah; 
    private boolean Brza_dostava; 
    private boolean Koža; 
    private boolean Vuna;

    public int getid_proizvoda() {
        return id_proizvoda;
    }

    public void setid_proizvoda(int id_proizvoda) {
        this.id_proizvoda = id_proizvoda;
    }

    public int getTip() {
        return Tip;
    }

    public void setTip(int Tip) {
        this.Tip = Tip;
    }

    public String getNacin_dostave() {
        return Nacin_dostave;
    }

    public void setNacin_dostave(String Nacin_dostave) {
        this.Nacin_dostave = Nacin_dostave;
    }

    public int getid_klijenta() {
        return id_klijenta;
    }

    public void setid_klijenta(int id_klijenta) {
        this.id_klijenta = id_klijenta;
    }

    public int getCena() {
        return Cena;
    }

    public void setCena(int Cena) {
        this.Cena = Cena;
    }

    public String getAdresa_dostave() {
        return Adresa_dostave;
    }

    public void setAdresa_dostave(String Adresa_dostave) {
        this.Adresa_dostave = Adresa_dostave;
    }

    public int getKolicina_Proizvoda() {
        return Kolicina_Proizvoda;
    }

    public void setKolicina_Proizvoda(int Kolicina_Proizvoda) {
        this.Kolicina_Proizvoda = Kolicina_Proizvoda;
    }

    public int getBroj_razlicitih_materijala() {
        return Broj_razlicitih_materijala;
    }

    public void setBroj_razlicitih_materijala(int Broj_razlicitih_materijala) {
        this.Broj_razlicitih_materijala = Broj_razlicitih_materijala;
    }

    public String getOpis_komentar() {
        return Opis_komentar;
    }

    public void setOpis_komentar(String Opis_komentar) {
        this.Opis_komentar = Opis_komentar;
    }

    public boolean isDostupno_odmah() {
        return Dostupno_odmah;
    }

    public void setDostupno_odmah(boolean Dostupno_odmah) {
        this.Dostupno_odmah = Dostupno_odmah;
    }

    public boolean isBrza_dostava() {
        return Brza_dostava;
    }

    public void setBrza_dostava(boolean Brza_dostava) {
        this.Brza_dostava = Brza_dostava;
    }

    public boolean isKoža() {
        return Koža;
    }

    public void setKoža(boolean Koža) {
        this.Koža = Koža;
    }

    public boolean isVuna() {
        return Vuna;
    }

    public void setVuna(boolean Vuna) {
        this.Vuna = Vuna;
    }
    
    
    public P_PLACE(){}
        
        public P_PLACE(int ID, int TYPE, String NACIN, int ID_KLIJENTA, int CENA, String ADRESS, int KOLICINA, int MATERIJALI, String OPIS, 
                boolean DOSTUPNO, boolean DOSTAVA, boolean KOZA, boolean VUNA) {
        this.id_proizvoda=ID;
        this.Tip=TYPE;
        this.Nacin_dostave=NACIN; 
        this.id_klijenta=ID_KLIJENTA; 
        this.Cena=CENA; 
        this.Adresa_dostave=ADRESS; 
        this.Kolicina_Proizvoda=KOLICINA; 
        this.Broj_razlicitih_materijala=MATERIJALI; 
        this.Opis_komentar=OPIS; 
        this.Dostupno_odmah=DOSTUPNO; 
        this.Brza_dostava=DOSTAVA; 
        this.Koža=KOZA; 
        this.Vuna=VUNA;
            
        }
        
    // creating function to add new online sale
        public boolean addnewsale(P_PLACE sale){
             PreparedStatement ps;
        String addQuery = "INSERT INTO `online_sale`(`Tip`,`Nacin_dostave`, `id_klijenta`, `Cena`, `Adresa_dostave`, `Kolicina_Proizvoda`, `Broj_razlicitih_materijala`, `Opis_komentar`, `Dostupno_odmah`, `Brza_dostava`, `Koža`, `Vuna`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
         
          try {
            ps = Connect_db.getTheconnection().prepareStatement(addQuery);
            ps.setInt(1, sale.getTip());
            ps.setString(2, sale.getNacin_dostave());
            ps.setInt(3, sale.getid_klijenta());
            ps.setInt(4, sale.getCena());
            ps.setString(5, sale.getAdresa_dostave());
            ps.setInt(6, sale.getKolicina_Proizvoda());
            ps.setInt(7, sale.getBroj_razlicitih_materijala());
            ps.setString(8, sale.getOpis_komentar());
            ps.setBoolean(9, sale.isDostupno_odmah());
            ps.setBoolean(10, sale.isBrza_dostava());
            ps.setBoolean(11, sale.isKoža());
            ps.setBoolean(12, sale.isVuna());
             
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
            
        }
        
        // creating function to edit new online sale
        public boolean editnewsale(P_PLACE sale){
            
        PreparedStatement ps;
        String editQuery = "UPDATE `online_sale` SET `Tip`=?,`Nacin_dostave`=?,`id_klijenta`=?,`Cena`=?,`Adresa_dostave`=?,`Kolicina_Proizvoda`=?,`Broj_razlicitih_materijala`=?,`Opis_komentar`=?,`Dostupno_odmah`=?,`Brza_dostava`=?,`Koža`=?,`Vuna`=? WHERE `id_proizvoda`=?";
         
          try {
            ps = Connect_db.getTheconnection().prepareStatement(editQuery);
            
            ps.setInt(1, sale.getTip());
            ps.setString(2, sale.getNacin_dostave());
            ps.setInt(3, sale.getid_klijenta());
            ps.setInt(4, sale.getCena());
            ps.setString(5, sale.getAdresa_dostave());
            ps.setInt(6, sale.getKolicina_Proizvoda());
            ps.setInt(7, sale.getBroj_razlicitih_materijala());
            ps.setString(8, sale.getOpis_komentar());
            ps.setBoolean(9, sale.isDostupno_odmah());
            ps.setBoolean(10, sale.isBrza_dostava());
            ps.setBoolean(11, sale.isKoža());
            ps.setBoolean(12, sale.isVuna());
            ps.setInt(13, sale.getid_proizvoda());
             
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
            
        }
        
        // creating function to remove new online sale
        public boolean removenewsale(P_PLACE sale){
            
        
          PreparedStatement ps;
        String editQuery = "DELETE FROM `online_sale` WHERE `id_proizvoda`=?";
         
          try {
            ps = Connect_db.getTheconnection().prepareStatement(editQuery);
            ps.setInt(1, sale.getid_proizvoda());
            
             
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
            
        }
        //function to search by id
        public P_PLACE searchnewsale(int saleid){
            PreparedStatement ps;
            ResultSet rs;
            P_PLACE sale=null;
            String searchQuery = "SELECT * FROM `online_sale` WHERE `id_proizvoda`=?";
            
            try {
                
                // SELECT `id_proizvoda`, `Tip`, `Nacin_dostave`, `id_klijenta`, `Cena`, `Adresa_dostave`, `Kolicina_Proizvoda`, `Broj_razlicitih_materijala`, `Opis_komentar`, `Dostupno_odmah`, `Brza_dostava`, `Koža`, `Vuna` FROM `online_sale` WHERE 1
                 
            ps = Connect_db.getTheconnection().prepareStatement(searchQuery);
            ps.setInt(1, saleid);
            rs=ps.executeQuery();
            if (rs.next()){
                sale = new P_PLACE ( rs.getInt("id_proizvoda"), 
                        (rs.getInt("Tip")), 
                        (rs.getString("Nacin_dostave")), 
                        (rs.getInt("id_klijenta")), 
                        (rs.getInt("Cena")), 
                        (rs.getString("Adresa_dostave")), 
                        (rs.getInt("Kolicina_Proizvoda")), 
                        (rs.getInt("Broj_razlicitih_materijala")), 
                        (rs.getString("Opis_komentar")), 
                        (rs.getBoolean("Dostupno_odmah")), 
                        (rs.getBoolean("Brza_dostava")), 
                        (rs.getBoolean("Koža")), 
                        (rs.getBoolean("Vuna"))
                
                
                );
                return sale;
            }
            
            
            }catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            
            
        return sale;
            
        }
        
        //create a function to return an arrayList of sale
        
        public ArrayList<P_PLACE> saleList(){
        ArrayList<P_PLACE> list = new ArrayList<P_PLACE>();
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `online_sale` ";
        try {
        st=Connect_db.getTheconnection().createStatement();
        rs = st.executeQuery(selectQuery);
        P_PLACE sale;
        while (rs.next()){
            sale= new P_PLACE ( rs.getInt("id_proizvoda"), 
                        (rs.getInt("Tip")), 
                        (rs.getString("Nacin_dostave")), 
                        (rs.getInt("id_klijenta")), 
                        (rs.getInt("Cena")), 
                        (rs.getString("Adresa_dostave")), 
                        (rs.getInt("Kolicina_Proizvoda")), 
                        (rs.getInt("Broj_razlicitih_materijala")), 
                        (rs.getString("Opis_komentar")), 
                        (rs.getBoolean("Dostupno_odmah")), 
                        (rs.getBoolean("Brza_dostava")), 
                        (rs.getBoolean("Koža")), 
                        (rs.getBoolean("Vuna"))
                );
            list.add(sale);
        }
        }catch (SQLException ex) {
            Logger.getLogger(P_zaposleni.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
                    
                    
        }
        public HashMap<String,Integer> getTypesMap(){
            HashMap<String,Integer> map = new HashMap<>();
            
            Statement st;
            ResultSet rs;
            
            
                try {
                    st = Connect_db.getTheconnection().createStatement();
                    rs = st.executeQuery("Select * From `tehnoloski_postupak`");
                    Postupak_p type;
                    while (rs.next()){
                        type = new Postupak_p(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4));
                        map.put(type.getNaziv_operacije_rada(), type.getID_Operacije());
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Postupak_p.class.getName()).log(Level.SEVERE, null, ex);
                }
            return map;
      }
    public ArrayList<P_PLACE> saleImages(int ID_TP){
        ArrayList<P_PLACE> list = new ArrayList<P_PLACE>();
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `online_sale` WHERE `Tip`=? ";
        try {
        ps=Connect_db.getTheconnection().prepareStatement(selectQuery);
        ps.setInt(1, ID_TP);
        rs = ps.executeQuery();
        P_PLACE sale;
        while (rs.next()){
            sale= new P_PLACE ( rs.getInt("id_proizvoda"), 
                        (rs.getInt("Tip")), 
                        (rs.getString("Nacin_dostave")), 
                        (rs.getInt("id_klijenta")), 
                        (rs.getInt("Cena")), 
                        (rs.getString("Adresa_dostave")), 
                        (rs.getInt("Kolicina_Proizvoda")), 
                        (rs.getInt("Broj_razlicitih_materijala")), 
                        (rs.getString("Opis_komentar")), 
                        (rs.getBoolean("Dostupno_odmah")), 
                        (rs.getBoolean("Brza_dostava")), 
                        (rs.getBoolean("Koža")), 
                        (rs.getBoolean("Vuna"))
                );
            list.add(sale);
        }
        }catch (SQLException ex) {
            Logger.getLogger(P_PLACE.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
                    
                    
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
            Logger.getLogger(P_PLACE    .class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
            
            }
            
            //create function to get list of images
            
              public HashMap<byte[], Integer> showsaleImages(int id_proizvoda){
                  
        HashMap<byte[], Integer> list = new HashMap<>();
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `images` WHERE `id_proizvoda`=?";
        try {
        ps=Connect_db.getTheconnection().prepareStatement(selectQuery);
        ps.setInt(1, id_proizvoda);
        rs = ps.executeQuery();
      
        while (rs.next()){
            list.put(rs.getBytes("the_image"), rs.getInt("id"));
        }
        }catch (SQLException ex) {
            Logger.getLogger(P_PLACE.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
                    
                    
        }
              //create function to get list of images by id
            
              public byte[] getImagebyid(int Imageid){
                  
        
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT `the_image` FROM `images` WHERE `id`=?";
        try {
        ps=Connect_db.getTheconnection().prepareStatement(selectQuery);
        ps.setInt(1, Imageid);
        rs = ps.executeQuery();
      
        if (rs.next()){
            return rs.getBytes("the_image");
        }else {
            return null;
        }
        }catch (SQLException ex) {
            Logger.getLogger(P_PLACE.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
                    
                    
        }
              //create function to remove list of images by id
              
              public boolean Removeimage(int Imageid){
                  
        
        PreparedStatement ps;
        ResultSet rs;
        String deleteQuery = "DELETE FROM `images` WHERE `id`=?";
        try {
        ps=Connect_db.getTheconnection().prepareStatement(deleteQuery);
        ps.setInt(1, Imageid);
        
      return (ps.executeUpdate() > 0);
        
        
        }catch (SQLException ex) {
            Logger.getLogger(P_PLACE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
                    
                    
        }
    
}
