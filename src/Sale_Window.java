
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.spire.data.table.DataTable;
import com.spire.data.table.common.JdbcAdapter;
import com.spire.pdf.PdfDocument;
import com.spire.pdf.PdfPageBase;
import com.spire.pdf.graphics.PdfBrush;
import com.spire.pdf.graphics.PdfBrushes;
import com.spire.pdf.graphics.PdfLayoutResult;
import com.spire.pdf.graphics.PdfLayoutType;
import com.spire.pdf.graphics.PdfStringFormat;
import com.spire.pdf.graphics.PdfTextAlignment;
import com.spire.pdf.graphics.PdfTrueTypeFont;
import com.spire.pdf.tables.PdfTable;
import com.spire.pdf.tables.PdfTableDataSourceType;
import com.spire.pdf.tables.PdfTableLayoutFormat;
import java.awt.Color;
import java.io.*;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.geom.*;
import java.awt.*;
import java.sql.*;
import javax.swing.JFrame;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author marko
 */
public class Sale_Window extends javax.swing.JFrame {

    /**
     * Creates new form Sale_Window
     */
    public Sale_Window() {
        initComponents();
        
         SimpleDateFormat dFormat= new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        jLabel14.setText(dFormat.format(date));
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jLabel15.setText(dtf.format(now));
        
        
         // border for title of the panel
        Border panel_title_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(26,138,32));
        jLabel_title.setBorder(panel_title_border);
        
        // border for jbuttons
        Border button_border = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255,255,255));
        jButton_Add_Sale.setBorder(button_border);
        jButton_edit.setBorder(button_border);
        jButton_Remove_Sale.setBorder(button_border);
        
        //populate the jtable properties with product values you want to fill it with
        fillJTableWithSalesData();
        //populate the jtable with client values you want to fill it with
        fillJTableWithClientsData();
        //populate the jtable with sale values you want to fill it with
        fillJTableWithSales();
        
        jTable_properties.setRowHeight(50);
        jTable_Clients.setRowHeight(50);
        jTable_Sale.setRowHeight(50);
        jTable_properties.setSelectionBackground(Color.red);
        jTable_Clients.setSelectionBackground(Color.red);
        jTable_Sale.setSelectionBackground(Color.red);
        
    }
    //populate the jtable properties with values you want to fill it with
     public void fillJTableWithSalesData(){
        P_PLACE sale = new P_PLACE();
        ArrayList<P_PLACE> saleList= sale.saleList();
        
        // the jtable columns
        String[] colNames= {"ID Proizvoda","Cena"};
        
        //the jtable row
        //workersList.size() size of arraylist
        //5 for number of colums in database
        Object[][] rows = new Object[saleList.size()][2];
        
        //add data from the list to the rows
        for(int i =0; i<saleList.size();i++){
            rows[i][0]=saleList.get(i).getTip();
            rows[i][1]=saleList.get(i).getCena();
            
            
        }
        DefaultTableModel model =new DefaultTableModel(rows, colNames);
        jTable_properties.setModel(model);
       
        
    }
     public void fillJTableWithClientsData(){
        P_CLIENT client = new P_CLIENT();
        ArrayList<P_CLIENT> clientsList= client.clientsList();
        
        // the jtable columns
        String[] colNames= {"id","Ime","Prezime"};
        
        //the jtable row
        //workersList.size() size of arraylist
        //5 for number of colums in database
        Object[][] rows = new Object[clientsList.size()][3];
        
        //add data from the list to the rows
        for(int i =0; i<clientsList.size();i++){
            rows[i][0]=clientsList.get(i).getid();
            rows[i][1]=clientsList.get(i).getIme();
            rows[i][2]=clientsList.get(i).getPrezime();
            
            
        }
        DefaultTableModel model =new DefaultTableModel(rows, colNames);
        jTable_Clients.setModel(model);
    
     }
     
      public void fillJTableWithSales(){
        P_SALE sale = new P_SALE();
        ArrayList<P_SALE> salesList= sale.salesList();
        
        // the jtable columns
        String[] colNames= {"id","Proizvod","Klijent","Cena","datum prodaje"};
        
        //the jtable row
        //workersList.size() size of arraylist
        //5 for number of colums in database
        Object[][] rows = new Object[salesList.size()][5];
        
        //add data from the list to the rows
        for(int i =0; i<salesList.size();i++){
            rows[i][0]=salesList.get(i).getId();
            rows[i][1]=salesList.get(i).getProduct_id();
            rows[i][2]=salesList.get(i).getClient_id();
            rows[i][3]=salesList.get(i).getFinal_price();
            rows[i][4]=salesList.get(i).getSale_date();
            
            
        }
        DefaultTableModel model =new DefaultTableModel(rows, colNames);
        jTable_Sale.setModel(model);
    
     }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_properties = new javax.swing.JTable();
        jTextField_id_proizvoda = new javax.swing.JTextField();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_cena = new javax.swing.JTextField();
        jTextField_id_klijenta = new javax.swing.JTextField();
        jPanel_title3 = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Remove_Sale = new javax.swing.JButton();
        jButton_Add_Sale = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Clients = new javax.swing.JTable();
        jDateChooser_sale_date = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Sale = new javax.swing.JTable();
        jButton_Refresh_sales_table = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_Export_all = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("ID Klijenta:");

        jTable_properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_propertiesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_properties);

        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jPanel_title3.setBackground(new java.awt.Color(102, 102, 0));

        jLabel_title.setBackground(new java.awt.Color(246, 145, 16));
        jLabel_title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title.setText("Prodaja");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo3_2.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_title3Layout = new javax.swing.GroupLayout(jPanel_title3);
        jPanel_title3.setLayout(jPanel_title3Layout);
        jPanel_title3Layout.setHorizontalGroup(
            jPanel_title3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_title3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel_title3Layout.setVerticalGroup(
            jPanel_title3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_title3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel_title3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton_Remove_Sale.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Remove_Sale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Remove_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Sale.setText("remove");
        jButton_Remove_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_SaleActionPerformed(evt);
            }
        });

        jButton_Add_Sale.setBackground(new java.awt.Color(255, 102, 102));
        jButton_Add_Sale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Add_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Sale.setText("add");
        jButton_Add_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_SaleActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("ID proizvoda:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Lista Proizvoda:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Cena:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Datum:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("ID:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Lista Klijenta:");

        jTable_Clients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ClientsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Clients);

        jDateChooser_sale_date.setDateFormatString("dd/MM/yyyy");
        jDateChooser_sale_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Lista Prodaje:");

        jTable_Sale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SaleMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_Sale);

        jButton_Refresh_sales_table.setBackground(new java.awt.Color(255, 102, 102));
        jButton_Refresh_sales_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Refresh_sales_table.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Refresh_sales_table.setText("Refresh");
        jButton_Refresh_sales_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_sales_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Refresh_sales_tableMouseClicked(evt);
            }
        });
        jButton_Refresh_sales_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_sales_tableActionPerformed(evt);
            }
        });

        jButton_edit.setBackground(new java.awt.Color(255, 102, 102));
        jButton_edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_edit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_edit.setText("edit");
        jButton_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        jButton_Export_all.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Export_all.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Export_all.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Export_all.setText("Export all to text file");
        jButton_Export_all.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Export_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Export_allActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Time:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Date:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("jLabel3");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_id_proizvoda, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_cena, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_id_klijenta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jButton_Add_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jButton_Remove_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser_sale_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Export_all, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Refresh_sales_table, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(38, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addGap(442, 442, 442))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel_title3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_id_proizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_id_klijenta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_cena, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_sale_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Remove_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jButton_Export_all, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Refresh_sales_table))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_propertiesMouseClicked
        // when value selected in jtable to add to text fields
        int selectedRowIndex = jTable_properties.getSelectedRow();
        jTextField_id_proizvoda.setText(jTable_properties.getValueAt(selectedRowIndex, 0).toString());
      
        jTextField_cena.setText(jTable_properties.getValueAt(selectedRowIndex, 1).toString());
        
    }//GEN-LAST:event_jTable_propertiesMouseClicked

    private void jButton_Remove_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_SaleActionPerformed
     
        //remove sale
        
        try{
        int id = Integer.valueOf(jTextField_ID.getText());
       
        int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to add this sale","Added Sale",JOptionPane.YES_NO_OPTION);
        
  
      if (yes_or_no == JOptionPane.YES_OPTION){
        if(new P_SALE().deletesaledata(id)){
            JOptionPane.showMessageDialog(null, "Sale deleted"," Deleted ", 1);
        } else {
                        JOptionPane.showMessageDialog(null, "Sale not deleted in the system","check the fields, maybe id field not empty or some values are missing", 2);
                    }
      }else {
               JOptionPane.showMessageDialog(null, "OK","", 3);
           }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ "Error, can't remove. Select value from sale list or enter id manually ","Invalid", 0);
        }
      
      
    }//GEN-LAST:event_jButton_Remove_SaleActionPerformed

    private void jButton_Add_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_SaleActionPerformed
        // add new sale 
        
        try {
        //int id = Integer.valueOf(jTextField_ID.getText());
        int id_proizvoda = Integer.valueOf(jTextField_id_proizvoda.getText());
        int id_klijenta = Integer.valueOf(jTextField_id_klijenta.getText());
        String cena = jTextField_cena.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String sale_date = dateFormat.format(jDateChooser_sale_date.getDate());
        P_SALE sale = new P_SALE(0 , id_proizvoda, id_klijenta, cena, sale_date);
        
        
         int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to add this sale","Added Sale",JOptionPane.YES_NO_OPTION);
        
  
           if (yes_or_no == JOptionPane.YES_OPTION){
            if(new P_SALE().addnewsale(sale)){
            JOptionPane.showMessageDialog(null, "Sale added to system"," Added Sale ", 1);
            } else {
                        JOptionPane.showMessageDialog(null, "Sale not added in the system","check the fields, maybe id field not empty or some values are missing", 2);
                    }
        
        
           }
        
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ "Error, can't add. Select value from sale list or enter values manually ","Invalid", 0);
        }
          
        
      
    }//GEN-LAST:event_jButton_Add_SaleActionPerformed

    private void jTable_ClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClientsMouseClicked
        
        
        int selectedRowIndex = jTable_Clients.getSelectedRow();
        
        jTextField_id_klijenta.setText(jTable_Clients.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_jTable_ClientsMouseClicked

    private void jTable_SaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SaleMouseClicked
        
         int selectedRowIndex = jTable_Sale.getSelectedRow();
         
          jTextField_ID.setText(jTable_Sale.getValueAt(selectedRowIndex, 0).toString());
          jTextField_id_proizvoda.setText(jTable_Sale.getValueAt(selectedRowIndex, 1).toString());
          jTextField_id_klijenta.setText(jTable_Sale.getValueAt(selectedRowIndex, 2).toString());
          jTextField_cena.setText(jTable_Sale.getValueAt(selectedRowIndex, 3).toString());
          
          
          //display the date in jdatechooser
          
          Date saledate;
        try {
            saledate = new SimpleDateFormat("yyyy-MM-dd").parse(jTable_Sale.getValueAt(selectedRowIndex,4).toString());
            jDateChooser_sale_date.setDate(saledate);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ "Error, can't add. Select value from sale list or enter values manually ","Invalid", 0);
        }
          
          
        
        
        
    }//GEN-LAST:event_jTable_SaleMouseClicked

    private void jButton_Refresh_sales_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_sales_tableActionPerformed
       fillJTableWithSales();
    }//GEN-LAST:event_jButton_Refresh_sales_tableActionPerformed

    private void jButton_Refresh_sales_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Refresh_sales_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Refresh_sales_tableMouseClicked

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        // to edit selected values by typing the id of the value you want to edit
        int id = Integer.valueOf(jTextField_ID.getText());
        int id_proizvoda = Integer.valueOf(jTextField_id_proizvoda.getText());
        int id_klijenta = Integer.valueOf(jTextField_id_klijenta.getText());
        String cena = jTextField_cena.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String sale_date = dateFormat.format(jDateChooser_sale_date.getDate());
        P_SALE sale = new P_SALE(0 , id_proizvoda, id_klijenta, cena, sale_date);
        
        int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to add this sale","Added Sale",JOptionPane.YES_NO_OPTION);
        
  try{
           if (yes_or_no == JOptionPane.YES_OPTION){
            if(new P_SALE().editSale(sale)){
            JOptionPane.showMessageDialog(null, "Sale added to system"," Added Sale ", 1);
            } else {
                        JOptionPane.showMessageDialog(null, "Sale not added in the system","check the fields, maybe id field not empty or some values are missing", 2);
                    }
        
        
           }
        
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ "Error, can't add. Select value from sale list or enter values manually ","Invalid", 0);
        }
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_Export_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Export_allActionPerformed

        
         try {
            
                        int yes_or_no = JOptionPane.showConfirmDialog(null, "Do You want export all the values","Exported",JOptionPane.YES_NO_OPTION);
            if (yes_or_no == JOptionPane.YES_OPTION){
            
            
        
    PrintWriter pw= new PrintWriter(new File("C:\\Users\\marko\\Desktop\\Prodaja.txt"));
    StringBuilder sb=new StringBuilder();
    PreparedStatement ps;
    ResultSet rs=null;
 
    String query="select * from sale";
     ps = Connect_db.getTheconnection().prepareStatement(query);
    rs=ps.executeQuery();
 
    while(rs.next()){
     sb.append("ID: "); 
     sb.append(rs.getInt("id"));
     sb.append("   "); 
     sb.append("Id proizvoda: ");
     sb.append(rs.getInt("product_id"));
     sb.append("   ");
     sb.append("ID klijenta: ");
     sb.append(rs.getInt("client_id"));
     sb.append("   ");
     sb.append("Cena: ");
     sb.append(rs.getString("final_price"));
     sb.append("   ");
     sb.append("Datum prodaje: ");
     sb.append(rs.getDate("sale_date"));
     sb.append("\r\n");
    }
 
    pw.write(sb.toString());
    pw.close();
    System.out.println("finished");
    JOptionPane.showMessageDialog(null,"Exported all values to file ","Done", 0);
            }else {
            JOptionPane.showMessageDialog(null, "Ok","Next time maybe", 2);  
        }
            
   } catch (Exception e) {
    // TODO: handle exception
   }
        

    }//GEN-LAST:event_jButton_Export_allActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Main_Window mainform = new Main_Window();
               mainform.setVisible(true);
               mainform.pack();
               mainform.setExtendedState(JFrame.MAXIMIZED_BOTH);  // to open in full screen
               //to close login window
               this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Sale;
    private javax.swing.JButton jButton_Export_all;
    private javax.swing.JButton jButton_Refresh_sales_table;
    private javax.swing.JButton jButton_Remove_Sale;
    private javax.swing.JButton jButton_edit;
    private com.toedter.calendar.JDateChooser jDateChooser_sale_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_title3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_Clients;
    private javax.swing.JTable jTable_Sale;
    private javax.swing.JTable jTable_properties;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_cena;
    private javax.swing.JTextField jTextField_id_klijenta;
    private javax.swing.JTextField jTextField_id_proizvoda;
    // End of variables declaration//GEN-END:variables
}
