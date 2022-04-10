
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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
public class P_SALE {
    
    
    private int id;
    private int product_id;
    private int client_id;
    private String final_price;
    private String sale_date;
    
    public P_SALE(){}
    
    public P_SALE(int ID, int PRODUCT_ID, int CLIENT_ID, String FINAL_PRICE, String SALE_DATE){
        
        this.id= ID;
        this.product_id = PRODUCT_ID;
        this.client_id = CLIENT_ID;
        this.final_price = FINAL_PRICE;
        this.sale_date = SALE_DATE;
        
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getFinal_price() {
        return final_price;
    }

    public void setFinal_price(String final_price) {
        this.final_price = final_price;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }
    
    // to add the sale in the system
      public boolean addnewsale(P_SALE sale) {
        
        PreparedStatement ps;
        String addQuery = "INSERT INTO `sale`( `product_id`, `client_id`, `final_price`, `sale_date`) VALUES (?,?,?,?)";
        
        try {
            ps = Connect_db.getTheconnection().prepareStatement(addQuery);
            ps.setInt(1, sale.getProduct_id());
            ps.setInt(2, sale.getClient_id());
            ps.setString(3, sale.getFinal_price());
            ps.setString(4, sale.getSale_date());
            
            
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    //create a function to edit the selected sale
    public boolean editSale(P_SALE sale){
         PreparedStatement ps;
        String editQuery = "UPDATE `sale` SET `product_id`=?,`client_id`=?,`final_price`=?,`sale_date`=? WHERE `id`=?";
        
        try {
            ps = Connect_db.getTheconnection().prepareStatement(editQuery);
            ps.setInt(1, sale.getId());
            ps.setInt(2, sale.getProduct_id());
            ps.setInt(3, sale.getClient_id());
            ps.setString(4, sale.getFinal_price());
            ps.setString(5, sale.getSale_date());
         
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //function to delete selected sale
    public boolean deletesaledata(int saleId){
         PreparedStatement ps;
        String deleteQuery = "DELETE FROM `sale` WHERE `id`=?";
        
        try {
            ps = Connect_db.getTheconnection().prepareStatement(deleteQuery);
           
            ps.setInt(1, saleId);
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //function to return values of sale list
    public ArrayList<P_SALE> salesList()
    {
        ArrayList<P_SALE> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `sale` ";
        try {
        st=Connect_db.getTheconnection().createStatement();
        rs = st.executeQuery(selectQuery);
        P_SALE sale;
        while (rs.next()){
            sale= new P_SALE(   rs.getInt(1),
                                    rs.getInt(2),
                                    rs.getInt(3),
                                    rs.getString(4),
                                    rs.getString(5));
            list.add(sale);
        }
        }catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
