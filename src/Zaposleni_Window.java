
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
public class Zaposleni_Window extends javax.swing.JFrame {

    /**
     * Creates new form Zaposleni_Window
     */
    public Zaposleni_Window() {
        initComponents();
        
        SimpleDateFormat dFormat= new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        jLabel14.setText(dFormat.format(date));
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jLabel15.setText(dtf.format(now));
        
         // border for title of the panel
        Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(60,70,200));
        jPanel_title.setBorder(panel_title_border);
        
        // border for jbuttons
        Border button_border = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255,255,255));
        jButton_Add_Zaposleni.setBorder(button_border);
        jButton_Edit_Zaposleni.setBorder(button_border);
        jButton_Refresh.setBorder(button_border);
        jButton_Export_all.setBorder(button_border);
        
        //populate the table
        fillJTableWithWorkersData();
    }
    

      

    //function to populate jtable with all the values in zaposleni
    public void fillJTableWithWorkersData(){
        P_zaposleni worker = new P_zaposleni();
        ArrayList<P_zaposleni> workersList= worker.workersList();
        
        // the jtable columns
        String[] colNames= {"ID_Zap","Ime","Prezime","Radna_uloga","ID_Operacije"};
        
        //the jtable row
        //workersList.size() size of arraylist
        //5 for number of colums in database
        Object[][] rows = new Object[workersList.size()][5];
        
        //add data from the list to the rows
        for(int i =0; i<workersList.size();i++){
            rows[i][0]=workersList.get(i).getID_Zap();
            rows[i][1]=workersList.get(i).getIme();
            rows[i][2]=workersList.get(i).getPrezime();
            rows[i][3]=workersList.get(i).getRadna_uloga();
            rows[i][4]=workersList.get(i).getID_Operacije();
        }
        DefaultTableModel model =new DefaultTableModel(rows, colNames);
        jTable1.setModel(model);
        //change jtable row height 
        jTable1.setRowHeight(50);
        //background color when value selected
        jTable1.setSelectionBackground(Color.red);
        //change jtable width
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(55);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(55);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(111);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(22);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Ime = new javax.swing.JTextField();
        jTextField_ID_Zap = new javax.swing.JTextField();
        jTextField_Radna_uloga = new javax.swing.JTextField();
        jTextField_Prezime = new javax.swing.JTextField();
        jButton_Edit_Zaposleni = new javax.swing.JButton();
        jButton_Refresh = new javax.swing.JButton();
        jButton_Add_Zaposleni = new javax.swing.JButton();
        jButton_Export_all = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField_ID_Operacije = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Remove_Zaposleni = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jPanel_title.setBackground(new java.awt.Color(96, 90, 223));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Zaposleni");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo3_2.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(485, 485, 485)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Prezime:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("        ID_Zap:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("ID_Operacije:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Ime:");

        jButton_Edit_Zaposleni.setBackground(new java.awt.Color(102, 0, 255));
        jButton_Edit_Zaposleni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Edit_Zaposleni.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Zaposleni.setText("edit");
        jButton_Edit_Zaposleni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Zaposleni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ZaposleniActionPerformed(evt);
            }
        });

        jButton_Refresh.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Refresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Refresh.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Refresh.setText("Refresh");
        jButton_Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshActionPerformed(evt);
            }
        });

        jButton_Add_Zaposleni.setBackground(new java.awt.Color(255, 102, 102));
        jButton_Add_Zaposleni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Add_Zaposleni.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Zaposleni.setText("add");
        jButton_Add_Zaposleni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Zaposleni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ZaposleniActionPerformed(evt);
            }
        });

        jButton_Export_all.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Export_all.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Export_all.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Export_all.setText("Export all to pdf");
        jButton_Export_all.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Export_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Export_allActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Radna_uloga:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_Remove_Zaposleni.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Remove_Zaposleni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Remove_Zaposleni.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Zaposleni.setText("remove");
        jButton_Remove_Zaposleni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Zaposleni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_ZaposleniActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("jLabel4");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("jLabel3");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Date:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Time:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton_Add_Zaposleni, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton_Edit_Zaposleni, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton_Remove_Zaposleni, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel4)))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ID_Zap, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Ime, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Prezime, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Radna_uloga, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ID_Operacije, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(166, 166, 166)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Export_all, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(414, 414, 414)))))
                .addGap(0, 88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12))
                    .addComponent(jLabel13))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField_ID_Zap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_Ime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jTextField_Prezime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_Radna_uloga, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jTextField_ID_Operacije, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Add_Zaposleni, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Edit_Zaposleni, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Remove_Zaposleni, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jButton_Export_all, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel15)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Edit_ZaposleniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ZaposleniActionPerformed
        // to edit selected values by typing the id of the value you want to edit
        
        String Ime = jTextField_Ime.getText();
        String Prezime = jTextField_Prezime.getText();
        String Radna_uloga = jTextField_Radna_uloga.getText();
        
        P_zaposleni worker = new P_zaposleni();
        int ID_Operacije = Integer.valueOf(jTextField_ID_Operacije.getText());
        try {
            int ID_Zap = Integer.valueOf(jTextField_ID_Zap.getText());
        
        if(Ime.trim().equals("") || Prezime.trim().equals("") || Radna_uloga.trim().equals("") || jTextField_ID_Operacije.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter required information--ID_Zap Ime, Prezime, Radna_uloga i ID_Operacije","to Edit Worker", 1);
        }else {
             int yes_or_no = JOptionPane.showConfirmDialog(null, "Do You want to edit this worker","Edited worker",JOptionPane.YES_NO_OPTION);
            if (yes_or_no == JOptionPane.YES_OPTION){
            if(worker.editWorkerData(new P_zaposleni(ID_Zap , Ime, Prezime, Radna_uloga, ID_Operacije))) {
            JOptionPane.showMessageDialog(null, "Worker edited in system","Edit Worker", 1);
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Worker not edited to system","Maybe id field is not empty or values incorect", 2);  
        }
        }
        }
    }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ "Enter required information--ID_Zap Ime, Prezime, Radna_uloga i ID_Operacije to edit ","Invalid", 0);
        } 
    }//GEN-LAST:event_jButton_Edit_ZaposleniActionPerformed

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
        // to remove value from picked id
        
      fillJTableWithWorkersData();
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    private void jButton_Add_ZaposleniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ZaposleniActionPerformed
        // add new values also id auto increments
        
        //get the worker data
        String Ime = jTextField_Ime.getText();
        String Prezime = jTextField_Prezime.getText();
        String Radna_uloga = jTextField_Radna_uloga.getText();
        
        
        P_zaposleni worker = new P_zaposleni();
        
        //before inserting new worker we need to check if fields are correct
        try {
            int ID_Operacije = Integer.valueOf(jTextField_ID_Operacije.getText());
        
        if(Ime.trim().equals("") || Prezime.trim().equals("") || Radna_uloga.trim().equals("") || jTextField_ID_Operacije.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter required information--Ime, Prezime, Radna_uloga","to Add Worker", 1);
        }else {
            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do You want to add this worker","Added worker",JOptionPane.YES_NO_OPTION);
            if (yes_or_no == JOptionPane.YES_OPTION){
            if(worker.addWorkerData(new P_zaposleni(0, Ime, Prezime, Radna_uloga, ID_Operacije))) {
            JOptionPane.showMessageDialog(null, "New Worker added to system","Add Worker", 1);
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Worker not added to system","Maybe id field is not empty or values incorect", 2);  
        }
        }
        }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ "Enter required information--Ime, Prezime, Radna_uloga to add worker ","Invalid", 0);
        } 
        
    }//GEN-LAST:event_jButton_Add_ZaposleniActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // when value selected in jtable to add to text fields
        int selectedRowIndex = jTable1.getSelectedRow();
        jTextField_ID_Zap.setText(jTable1.getValueAt(selectedRowIndex, 0).toString());
        jTextField_Ime.setText(jTable1.getValueAt(selectedRowIndex, 1).toString());
        jTextField_Prezime.setText(jTable1.getValueAt(selectedRowIndex, 2).toString());
        jTextField_Radna_uloga.setText(jTable1.getValueAt(selectedRowIndex, 3).toString());
        jTextField_ID_Operacije.setText(jTable1.getValueAt(selectedRowIndex, 4).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_Export_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Export_allActionPerformed
        String id=jTextField_ID_Zap.getText();
        String Ime=jTextField_Ime.getText();
        String Prezime=jTextField_Prezime.getText();
        String Radna_uloga=jTextField_Radna_uloga.getText();
        String ID_Operacije=jTextField_ID_Operacije.getText();
        
        String path="C:\\Users\\marko\\Desktop\\Zaposleni.pdf";
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path));
            doc.open();
            Paragraph paragraph1 = new Paragraph("                                Krojac(Lista Zaposlenih)\n                                 Contact Number:(+381)111111\n\n");
            doc.add(paragraph1);
            Paragraph paragraph2 = new Paragraph("Date:"+jLabel14.getText()+"\n Time: "+jLabel15.getText()+"\n\n");
            doc.add(paragraph2);
            PdfPTable tbl = new PdfPTable(5);
            tbl.addCell("Id");
            tbl.addCell("Ime");
            tbl.addCell("Prezime");
            tbl.addCell("Radna Uloga:");
            tbl.addCell("Id Operacije:");
            
            
            for (int i=0;i<jTable1.getRowCount();i++){
                String n=jTable1.getValueAt(i, 0).toString();
                String d=jTable1.getValueAt(i, 1).toString();
                String r=jTable1.getValueAt(i, 2).toString();
                String q=jTable1.getValueAt(i, 3).toString();
                String s=jTable1.getValueAt(i, 4).toString();
                
                tbl.addCell(n);
                tbl.addCell(d);
                tbl.addCell(r);
                tbl.addCell(q);
                tbl.addCell(s);
                
            }
            doc.add(tbl);
            Paragraph paragraph3= new Paragraph("\n\nThank you for Visiting !Please Come again\nKrojac");
            
            doc.add(paragraph3);
            JOptionPane.showMessageDialog(null,"Lista zaposlenih napravljena");
            setVisible(true);
            
            new Zaposleni_Window().setVisible(true);
            this.dispose();
            
        }catch (Exception e){
            
        }
        doc.close();
        
        
        
        
        
        /*
        try {
            
                        int yes_or_no = JOptionPane.showConfirmDialog(null, "Do You want export all the values","Exported",JOptionPane.YES_NO_OPTION);
            if (yes_or_no == JOptionPane.YES_OPTION){
            
            
        
    PrintWriter pw= new PrintWriter(new File("C:\\Users\\marko\\Desktop\\Zaposleni.txt"));
    StringBuilder sb=new StringBuilder();
    PreparedStatement ps;
    ResultSet rs=null;
 
    String query="select * from zaposleni";
     ps = Connect_db.getTheconnection().prepareStatement(query);
    rs=ps.executeQuery();
 
    while(rs.next()){
     sb.append("ID Zaposlenih: "); 
     sb.append(rs.getInt("ID_Zap"));
     sb.append("   "); 
     sb.append("Ime: ");
     sb.append(rs.getString("Ime"));
     sb.append("   ");
     sb.append("Prezime: ");
     sb.append(rs.getString("Prezime"));
     sb.append("   ");
     sb.append("Radna Uloga: ");
     sb.append(rs.getString("Radna_uloga"));
     sb.append("   ");
     sb.append("ID Operacije ");
     sb.append(rs.getInt("ID_Operacije"));
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
	*/
    }//GEN-LAST:event_jButton_Export_allActionPerformed

    private void jButton_Remove_ZaposleniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_ZaposleniActionPerformed
         P_zaposleni worker = new P_zaposleni();
        
        try {
            int ID_Zap = Integer.valueOf(jTextField_ID_Zap.getText());
        
        if( jTextField_ID_Zap.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter id","to Remove worker", 1);
        }else {
            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do You want to delete this worker","Deleted worker",JOptionPane.YES_NO_OPTION);
            if (yes_or_no == JOptionPane.YES_OPTION){
            
            if(worker.deleteWorkerData(new P_zaposleni(ID_Zap,"","","",1))) {
            JOptionPane.showMessageDialog(null, "Worker removed","Remove Worker", 1);
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Worker not removed from system","Maybe id field is incorect or empty", 2);  
        }
        }
        }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ "Enter required information--ID_Zap to remove worker ","Invalid", 0);
        } 
    }//GEN-LAST:event_jButton_Remove_ZaposleniActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Main_Window mainform = new Main_Window();
               mainform.setVisible(true);
               mainform.pack();
               mainform.setExtendedState(JFrame.MAXIMIZED_BOTH);  // to open in full screen
               //to close login window
               this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Zaposleni_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zaposleni_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zaposleni_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zaposleni_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zaposleni_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Zaposleni;
    private javax.swing.JButton jButton_Edit_Zaposleni;
    private javax.swing.JButton jButton_Export_all;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_Remove_Zaposleni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_ID_Operacije;
    private javax.swing.JTextField jTextField_ID_Zap;
    private javax.swing.JTextField jTextField_Ime;
    private javax.swing.JTextField jTextField_Prezime;
    private javax.swing.JTextField jTextField_Radna_uloga;
    // End of variables declaration//GEN-END:variables
}