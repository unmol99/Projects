/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.majorproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anmol
 */
public class BookFlight extends javax.swing.JInternalFrame {

    /**
     * Creates new form BookFlight
     */
    public BookFlight() {
        initComponents();
        AutoId();
    }
    
    Connection con; // to store path of communication between DataBase and Java Program
    PreparedStatement pre; // Variable which will be having actions to perform on database or orders to give
    
    
public void AutoId()
{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // defining jdbc driver to cmmunicate with database
            con= DriverManager.getConnection("jdbc:mysql://localhost/major_project", "root", "1245");// establishing path to DB
            pre = con.prepareStatement("Select Max(TicketID) from ticket");//prepares sql QUery to be sent to database
            ResultSet rs = pre.executeQuery();
            rs.next();// moves cursor to result of SQL query
            
            // check if Customer table is empty and add first customer ID 
            if(rs.getString("MAX(TicketID)")== null)// if resultant string is empty
            {
                ticketId.setText("TK001");
            }
            else
            {
                // get the substring and convert into integer(parseint); substring starts from 2nd index"001"
                int id = Integer.parseInt(rs.getString("MAX(TicketID)").substring(2, rs.getString("MAX(TicketID)").length()));//001
                id++;
                ticketId.setText("TK" + String.format("%03d", id));// converts id to 3 decimal paces digit
                
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel1 = new javax.swing.JLabel();
        fromCity = new javax.swing.JComboBox<>();
        toCity = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        fnamel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        fare = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        totalSeats = new javax.swing.JTextField();
        totalFare = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ticketId = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Search Your Flight");

        fromCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Goa", "Kolkata", "Chennai","Mumbai" }));
        fromCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromCityActionPerformed(evt);
            }
        });

        toCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Goa", "Kolkata", "Chennai", "Mumbai" }));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(fromCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(toCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jButton1)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Flight ID", "Flight Name", "Arrival", "Departure", "Date", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Ticket ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Customer ID");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        fnamel.setText("First Name");

        jLabel5.setText("Last Name");

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        jLabel6.setText("Contact");

        jLabel7.setText("Date of Birth");

        jLabel8.setText("Fare");

        jLabel9.setText("No. of Tickets");

        jLabel10.setText("Total Fare");

        totalSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSeatsActionPerformed(evt);
            }
        });

        totalFare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFareActionPerformed(evt);
            }
        });

        jButton3.setText("Calculate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Book");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        ticketId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ticketId.setText("T-id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(ticketId))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(fnamel)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(lname, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cid, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(totalFare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(totalSeats, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fare, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton3)))))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(52, 52, 52)
                        .addComponent(jButton5)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ticketId))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnamel)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(fare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(totalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(totalFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5))))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String departure = fromCity.getSelectedItem().toString();
            String arrival = toCity.getSelectedItem().toString();
            
            Connection con; // to store path of communication between DataBase and Java Program
            PreparedStatement pre; // Variable which will be having actions to perform on database or orders to give
            
            Class.forName("com.mysql.jdbc.Driver"); // defining jdbc driver to cmmunicate with database
            con= DriverManager.getConnection("jdbc:mysql://localhost/major_project", "root", "1245");// establishing path to DB
            
            pre = con.prepareStatement("Select * from flight where Arrival=? and Departure =?");//prepares sql QUery to be sent to database
            pre.setString(1, arrival);
            pre.setString(2, departure);
            
            ResultSet rs = pre.executeQuery();
            ResultSetMetaData RSDM = rs.getMetaData(); // get Metadata of the Result obtained from SQL Query
            int cc = RSDM.getColumnCount();// counts number of columns in result of query
            DefaultTableModel DFT = (DefaultTableModel)table.getModel(); // gets model of resultant table
            DFT.setRowCount(0); // clear all table data so that we can display new searched data
            
            while(rs.next()) // LL jab tak SQL ki Query ka result pointer null pe point nai karta
            {
                Vector v2 = new Vector(); // type of arraylist can add any data type
                for(int i = 0; i<cc; i++)// to add new row till count of column
                {
                    v2.add(rs.getString("FlightID"));
                    v2.add(rs.getString("FlightName"));
                    v2.add(rs.getString("Arrival"));
                    v2.add(rs.getString("Departure"));
                    v2.add(rs.getString("Date"));
                    v2.add(rs.getString("Duration"));
                    
                }
                DFT.addRow(v2);// Adding entire row data in vector to table
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            String customerid = cid.getText();
            
            Connection con; // to store path of communication between DataBase and Java Program
            PreparedStatement pre; // Variable which will be having actions to perform on database or orders to give
            
            con= DriverManager.getConnection("jdbc:mysql://localhost/major_project", "root", "1245");// establishing path to DB
            
            pre = con.prepareStatement("Select * from customer where CustID=? ");//prepares sql QUery to be sent to database
            pre.setString(1, customerid);
            
            ResultSet rs = pre.executeQuery();// store result
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(null, "Customer does not exist");
            }
            else
            {
               fname.setText(rs.getString("FirstName"));
               lname.setText(rs.getString("LastName"));
               contact.setText(rs.getString("Contact"));
               String sDate1=rs.getString("DOB");  
               Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1); 
               dob.setDate(date1);
               JOptionPane.showMessageDialog(null, "Customer added successfully");
               
            }
            
             
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void totalSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSeatsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int TotalSeats = Integer.parseInt(totalSeats.getText());// getting total seats in Integer form
        int fare = Integer.parseInt(Fare); // getting total fair earlier displayed in Integer form
        int totalfare = TotalSeats*fare; // calculating total
        
        totalFare.setText(Integer.toString(totalfare));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    
    private void fromCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromCityActionPerformed
        
        
        
    }//GEN-LAST:event_fromCityActionPerformed

    String Fare ="";
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try {
            // TODO add your handling code here:
            int row = table.getSelectedRow();
            String flightId = table.getModel().getValueAt(row,0).toString();
            Class.forName("com.mysql.jdbc.Driver"); // defining jdbc driver to cmmunicate with database
            
            Connection con; // to store path of communication between DataBase and Java Program
            PreparedStatement pre; // Variable which will be having actions to perform on database or orders to give
            
            con= DriverManager.getConnection("jdbc:mysql://localhost/major_project", "root", "1245");// establishing path to DB
            
            pre = con.prepareStatement("Select fare from flight where FlightID=? ");//prepares sql QUery to be sent to database
            pre.setString(1, flightId);
            
            ResultSet rs = pre.executeQuery();
            rs.next();
            
            fare.setText(rs.getString("Fare"));
            Fare =rs.getString("Fare");// store fare in var to calculate total fare
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            String ticketID = ticketId.getText();
            int row = table.getSelectedRow();
            String flightId = table.getModel().getValueAt(row,0).toString();
            String Arrival = toCity.getSelectedItem().toString();
            String Departure = fromCity.getSelectedItem().toString();
            
            String fName = fname.getText();
            String lName = lname.getText();
            String Contact = contact.getText();
            String date2 = table.getModel().getValueAt(row, 4).toString();
            String Total = totalFare.getText();
            
            Connection con; // to store path of communication between DataBase and Java Program
            PreparedStatement pre; // Variable which will be having actions to perform on database or orders to give
            
            con= DriverManager.getConnection("jdbc:mysql://localhost/major_project", "root", "1245");// establishing path to DB
            
            pre = con.prepareStatement("insert into ticket(TicketID, FlightID, Arrival, Departure, FirstName, LastName, TotalFare, date, Contact) values(?,?,?,?,?,?,?,?,?)");//prepares sql QUery to be sent to database
            pre.setString(1, ticketID);
            pre.setString(2, flightId);
            pre.setString(3, Arrival);
            pre.setString(4, Departure);
            pre.setString(5, fName);
            pre.setString(6, lName);
            pre.setString(7, Total);
            pre.setString(8, date2);
            pre.setString(9, Contact);
            
            pre.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Booked Ticket Successfully");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void totalFareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFareActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cid;
    private javax.swing.JTextField contact;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField fare;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel fnamel;
    private javax.swing.JComboBox<String> fromCity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTable table;
    private javax.swing.JLabel ticketId;
    private javax.swing.JComboBox<String> toCity;
    private javax.swing.JTextField totalFare;
    private javax.swing.JTextField totalSeats;
    // End of variables declaration//GEN-END:variables
}
