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

public class Proizvodi_p {
    
    private double id;
    private double min;
    private double Krojaci;
    private double Magacioneri;
    private double kWh;
    private double Konac;
    private double Keper;
    private double Strec;
    private double Guma;
    private double Celicni_kalup;
    private double Makaze;
    private double Stoni_metar;
    private double Pribor_za_pisanje;
    private double Stancer;
    private double Masina_za_sivenje;
    private double Masina_za_endlanje;
    private double Masina_za_tabanicenje;
    private String proizvod;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getKrojaci() {
        return Krojaci;
    }

    public void setKrojaci(double Krojaci) {
        this.Krojaci = Krojaci;
    }

    public double getMagacioneri() {
        return Magacioneri;
    }

    public void setMagacioneri(double Magacioneri) {
        this.Magacioneri = Magacioneri;
    }

    public double getkWh() {
        return kWh;
    }

    public void setkWh(double kWh) {
        this.kWh = kWh;
    }

    public double getKonac() {
        return Konac;
    }

    public void setKonac(double Konac) {
        this.Konac = Konac;
    }

    public double getKeper() {
        return Keper;
    }

    public void setKeper(double Keper) {
        this.Keper = Keper;
    }

    public double getStrec() {
        return Strec;
    }

    public void setStrec(double Strec) {
        this.Strec = Strec;
    }

    public double getGuma() {
        return Guma;
    }

    public void setGuma(double Guma) {
        this.Guma = Guma;
    }

    public double getCelicni_kalup() {
        return Celicni_kalup;
    }

    public void setCelicni_kalup(double Celicni_kalup) {
        this.Celicni_kalup = Celicni_kalup;
    }

    public double getMakaze() {
        return Makaze;
    }

    public void setMakaze(double Makaze) {
        this.Makaze = Makaze;
    }

    public double getStoni_metar() {
        return Stoni_metar;
    }

    public void setStoni_metar(double Stoni_metar) {
        this.Stoni_metar = Stoni_metar;
    }

    public double getPribor_za_pisanje() {
        return Pribor_za_pisanje;
    }

    public void setPribor_za_pisanje(double Pribor_za_pisanje) {
        this.Pribor_za_pisanje = Pribor_za_pisanje;
    }

    public double getStancer() {
        return Stancer;
    }

    public void setStancer(double Stancer) {
        this.Stancer = Stancer;
    }

    public double getMasina_za_sivenje() {
        return Masina_za_sivenje;
    }

    public void setMasina_za_sivenje(double Masina_za_sivenje) {
        this.Masina_za_sivenje = Masina_za_sivenje;
    }

    public double getMasina_za_endlanje() {
        return Masina_za_endlanje;
    }

    public void setMasina_za_endlanje(double Masina_za_endlanje) {
        this.Masina_za_endlanje = Masina_za_endlanje;
    }

    public double getMasina_za_tabanicenje() {
        return Masina_za_tabanicenje;
    }

    public void setMasina_za_tabanicenje(double Masina_za_tabanicenje) {
        this.Masina_za_tabanicenje = Masina_za_tabanicenje;
    }

    public String getProizvod() {
        return proizvod;
    }

    public void setProizvod(String proizvod) {
        this.proizvod = proizvod;
    }

  

    
    
   
       //create the class constructors
       public Proizvodi_p(){}
      
      public Proizvodi_p(Double ID, Double MIN, Double KROJACI, Double MAGACIONERI, Double KWH, Double KONAC, Double KEPER, Double STREC, Double GUMA, Double CELINI_KALUP, Double MAKAZE, Double STONI_METAR, Double PRIBOR_ZA_PISANJE, Double STANCER, Double MASINA_ZA_SIVANJE, Double MASINA_ZA_ENDLANJE, Double MASINA_ZA_TABACINJE, String PROIZVOD ) {
          this.id= ID;
          this.min=MIN;
          this.Krojaci=KROJACI;
          this.Magacioneri=MAGACIONERI;
          this.kWh=KWH;
          this.Konac=KONAC;
          this.Keper=KEPER;
          this.Strec=STREC;
          this.Guma=GUMA;
          this.Celicni_kalup=CELINI_KALUP;
          this.Makaze=MAKAZE;
          this.Stoni_metar=STONI_METAR;
          this.Pribor_za_pisanje=PRIBOR_ZA_PISANJE;
          this.Stancer=STANCER;
          this.Masina_za_sivenje=MASINA_ZA_SIVANJE;
          this.Masina_za_endlanje=MASINA_ZA_ENDLANJE;
          this.Masina_za_tabanicenje=MASINA_ZA_TABACINJE;
          this.proizvod=PROIZVOD;
          
      }
      
      //create a display all values
       public ArrayList<Proizvodi_p> productsList(){
        ArrayList<Proizvodi_p> list = new ArrayList<Proizvodi_p>();
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `proizvodi`";
        try {
        st=Connect_db.getTheconnection().createStatement();
        rs = st.executeQuery(selectQuery);
        Proizvodi_p products;
        while (rs.next()){
            products= new Proizvodi_p ( rs.getDouble("id"), 
                        (rs.getDouble("min")), 
                        (rs.getDouble("Krojaci")), 
                        (rs.getDouble("Magacioneri")), 
                        (rs.getDouble("kWh")), 
                        (rs.getDouble("Konac")), 
                        (rs.getDouble("Keper")), 
                        (rs.getDouble("Strec")), 
                        (rs.getDouble("Guma")), 
                        (rs.getDouble("Celicni_kalup")), 
                        (rs.getDouble("Makaze")), 
                        (rs.getDouble("Stoni_metar")), 
                        (rs.getDouble("Pribor_za_pisanje")),
                        (rs.getDouble("Stancer")),
                        (rs.getDouble("Masina_za_sivenje")),
                        (rs.getDouble("Masina_za_endlanje")),
                        (rs.getDouble("Masina_za_tabanicenje")),
                        (rs.getString("Proizvod"))
                );
            list.add(products);
        }
        }catch (SQLException ex) {
            Logger.getLogger(Proizvodi_p.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
                    
                    
        }
}
