/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.reservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nachi
 */
public class BookTicketFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomerFrame
     */
    public BookTicketFrame() {
        initComponents();
        try{
            createID();
        }
        catch(ClassNotFoundException e){
            JOptionPane.showInternalMessageDialog(null, "class");
        }
        catch(SQLException e){
            JOptionPane.showInternalMessageDialog(null, "sql");
        }
    }
    public final void createID() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservationsystem","root1","root1");
        PreparedStatement statement = conn.prepareStatement("SELECT MAX(bookingID) as id FROM booking");
        ResultSet result = statement.executeQuery();
        result.next();
        if(result.getString("id")==null){
            ticketID.setText("TK001");
        }
        else{
            String maxString = result.getString("id");
            int num = Integer.parseInt(maxString.substring(2,maxString.length()));
            num++;
            ticketID.setText(String.valueOf("TK"+String.format("%03d",num)));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify
     * this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        source = new javax.swing.JComboBox<>();
        destination = new javax.swing.JComboBox<>();
        searchFlights = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        book = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        ticketID = new javax.swing.JTextField();
        customerID = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        fare = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        flightName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        seatNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Book Ticket");

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Search Flight");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("From ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("To");

        source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Mumbai", "Chennai", "Banglore" }));
        source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceActionPerformed(evt);
            }
        });

        destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Chennai", "Delhi", "Banglore" }));
        destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationActionPerformed(evt);
            }
        });

        searchFlights.setBackground(new java.awt.Color(102, 255, 102));
        searchFlights.setText("Search");
        searchFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFlightsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(searchFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(source, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(destination))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(searchFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel2.setEnabled(false);
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel4.setText("Customer ID");

        jLabel6.setText("Last Name");

        jLabel7.setText("First Name");

        jLabel8.setText("Contact");

        jLabel9.setText("Gender");

        jLabel10.setText("Fare");

        book.setBackground(new java.awt.Color(102, 255, 102));
        book.setText("Book");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        jLabel16.setText("Ticket ID");

        firstName.setBackground(new java.awt.Color(242, 242, 242));
        firstName.setEnabled(false);

        lastName.setBackground(new java.awt.Color(242, 242, 242));
        lastName.setEnabled(false);

        contact.setBackground(new java.awt.Color(242, 242, 242));
        contact.setEnabled(false);

        gender.setBackground(new java.awt.Color(242, 242, 242));
        gender.setEnabled(false);
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        fare.setBackground(new java.awt.Color(242, 242, 242));
        fare.setEnabled(false);

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        flightName.setBackground(new java.awt.Color(242, 242, 242));
        flightName.setEnabled(false);

        jLabel19.setText("Flight");

        jLabel20.setText("Seats Number");

        seatNumber.setBackground(new java.awt.Color(242, 242, 242));
        seatNumber.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(flightName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ticketID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fare, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4))
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ticketID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fare, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Flight Name", "Date", "Time", "Fare"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(387, 387, 387))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
        String bookingIDString = ticketID.getText();
        String flightIDString = flightName.getText();
        String customerIDString = customerID.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservationsystem","root1","root1");
                PreparedStatement statement = conn.prepareStatement("INSERT INTO booking(bookingID,customerID,flightID) VALUES (?,?,?)");

                statement.setString(1, bookingIDString);
                statement.setString(2,customerIDString);
                statement.setString(3, flightIDString);

                PreparedStatement statementForTotalSeats = conn.prepareStatement("SELECT seats FROM flight where flightId = ?");
                statementForTotalSeats.setString(1,flightIDString);

                PreparedStatement statementForBookedSeats = conn.prepareStatement("SELECT COUNT(flightId) FROM booking where flightId = ?");
                statementForBookedSeats.setString(1,flightIDString);

                ResultSet totalResult = statementForTotalSeats.executeQuery();
                ResultSet bookedResult = statementForBookedSeats.executeQuery();

                int total = 0;
                int booked = 0;
                if(totalResult.next()){
                    total = Integer.parseInt(totalResult.getString(1));
                }
                if(bookedResult.next()){
                    booked = Integer.parseInt(bookedResult.getString(1));
                }

                if(total<=booked){
                    JOptionPane.showMessageDialog(this, "Flight is booked completely try another flight");
                    return;
                }
                int rows = statement.executeUpdate();
                if(rows>0){
                    JOptionPane.showMessageDialog(this, "Booking Successful");
                    try{
                    createID();
                    }
                    catch(ClassNotFoundException e){
                        JOptionPane.showInternalMessageDialog(null, "class");
                    }
                    catch(SQLException e){
                        JOptionPane.showInternalMessageDialog(null, "sql");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error! Check your Details or try again later");
                }
            }catch (SQLException ex) {
                Logger.getLogger(BookTicketFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookTicketFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void searchFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFlightsActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String sourceString = source.getSelectedItem().toString();
            String destinationString = destination.getSelectedItem().toString();
            if(sourceString==null || destinationString==null){
                JOptionPane.showConfirmDialog(this, "Invalid Selection");
                return;
            }
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservationsystem","root1","root1");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM flight WHERE departure = ? AND arrival =?");
            
            statement.setString(1, sourceString);
            statement.setString(2, destinationString);
            ResultSet rs=statement.executeQuery();
            ResultSetMetaData RSMD=rs.getMetaData();
            int cc=RSMD.getColumnCount();
            DefaultTableModel DFT=(DefaultTableModel)jTable1.getModel();
            while(rs.next()) {
                Vector v=new Vector();
                for(int i=1;i<=cc;i++) { 
                    v.add(rs.getString("flightID"));
                    v.add(rs.getString("flight_name"));
                    v.add(rs.getString("date"));
                    v.add(rs.getString("departure_time"));
                    v.add(rs.getString("fare"));
                }
                DFT.addRow(v);
            }
            
             //v[0] = result.getString("flightID");
//                v[1] = result.getString("flight_name");
//                v[2] = result.getString("date");
//                v[3] = result.getString("departure_time");
//                v[4] = result.getString("fare");
            
//            statement.setString(1, sourceString);
//            statement.setString(2, destinationString);
//            ResultSet result = statement.executeQuery();
//            ResultSetMetaData data = result.getMetaData();
//            int coulumnCount = data.getColumnCount();
//            DefaultTableModel defaultTableModel = (DefaultTableModel)jTable1.getModel();
//            if(result.next()==false){
//                JOptionPane.showMessageDialog(this, "Flights not availbale for current date");
//            }
            //defaultTableModel.setNumRows(0);
            

//            while(result.next()){
//                String[] v = new String[5];
//                v[0] = result.getString("flightID");
//                v[1] = result.getString("flight_name");
//                v[2] = result.getString("date");
//                v[3] = result.getString("departure_time");
//                v[4] = result.getString("fare");
//                defaultTableModel.addRow(v);
//                
//            }
            
            
        }
        catch(ClassNotFoundException e){
            //for testing
            JOptionPane.showMessageDialog(this, "missing mysql connector");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "sql");
            Logger.getLogger(BookTicketFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchFlightsActionPerformed

    private void sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceActionPerformed

    private void destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            String customerIDString = customerID.getText();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservationsystem","root1","root1");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM customer WHERE customer_id = ?");
            
            
            
            statement.setString(1,customerIDString);
            ResultSet result = statement.executeQuery();
            if(result.next()==false){
                 JOptionPane.showMessageDialog(this, "not found");
            }
            else{
                firstName.setText(result.getString("first_name"));
                lastName.setText(result.getString("last_name"));
                contact.setText(result.getString("contact"));
                gender.setText(result.getString("gender"));
            }
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error !");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            // TODO add your handling code here:
            int row = jTable1.getSelectedRow();
            DefaultTableModel dtf = (DefaultTableModel)jTable1.getModel();
            String flightIDString = jTable1.getValueAt(row,0).toString();
            //before setting text get the max seat number from booking table for choosen flight
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservationsystem","root1","root1");
            PreparedStatement currCountStatement = conn.prepareStatement("SELECT Count(bookingID) as count FROM booking WHERE flightID = ?");
            currCountStatement.setString(1, flightIDString);
            ResultSet result = currCountStatement.executeQuery();
            int seatNumberValue;
            if(result.next()){
                String currSeatNumber = result.getString("count");
                seatNumberValue = Integer.parseInt(currSeatNumber) +1;
            }
            else{
                seatNumberValue = 1;
            }
            PreparedStatement maxCountStatement = conn.prepareStatement("SELECT seats FROM flight WHERE flightID=?");
            maxCountStatement.setString(1, flightIDString);
            result = maxCountStatement.executeQuery();
            int max = 0;
            if(result.next()){
                String maxCountNumber = result.getString("seats");
                max = Integer.parseInt(maxCountNumber);
            }
            else{
                JOptionPane.showMessageDialog(this,"flight not found");
            }
            
            if(seatNumberValue <= max){
                flightName.setText(jTable1.getValueAt(row, 0).toString());
                fare.setText(jTable1.getValueAt(row, 4).toString());
                seatNumber.setText(String.valueOf(seatNumberValue));
            }
            
            else{
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookTicketFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookTicketFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField customerID;
    private javax.swing.JComboBox<String> destination;
    private javax.swing.JTextField fare;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField flightName;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastName;
    private javax.swing.JButton searchFlights;
    private javax.swing.JTextField seatNumber;
    private javax.swing.JComboBox<String> source;
    private javax.swing.JTextField ticketID;
    // End of variables declaration//GEN-END:variables
}
