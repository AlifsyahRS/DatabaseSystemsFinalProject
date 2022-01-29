package Main;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Main.Jobs;
import Main.Staff;
import Main.HomePage;
import Main.Department;
import Main.Transaction;
import Main.Vendors;
import Main.Main;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.sql.*;


public class Product extends javax.swing.JFrame {


//Loading the UI and table with existing database entries    
    public Product() {
        initComponents();
    }
    public void close(){
        WindowEvent closeWindow  = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    //Swing generated code
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        savebutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        searchbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        productid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productstock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        producttype = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        productprice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        vendorid = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Information Page");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product Information");

        backbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbutton.setText("Back");
        backbutton.setFocusable(false);
        backbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbutton)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backbutton)
                        .addGap(10, 10, 10)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);

        savebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        savebutton.setText("Save");
        savebutton.setFocusable(false);
        savebutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        savebutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        jToolBar1.add(savebutton);

        updatebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatebutton.setText("Update");
        updatebutton.setFocusable(false);
        updatebutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updatebutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        jToolBar1.add(updatebutton);

        deletebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.setFocusable(false);
        deletebutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deletebutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        jToolBar1.add(deletebutton);

        searchbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchbutton.setText("Search/Select");
        searchbutton.setFocusable(false);
        searchbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        jToolBar1.add(searchbutton);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Product ID");

        productid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Stock");

        productstock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productstockActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Type");

        producttype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        producttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producttypeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Product Name");

        productname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Price");

        productprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productpriceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Vendor ID");

        vendorid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vendorid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendoridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productprice, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vendorid, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(producttype, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(84, 84, 84)
                        .addComponent(productstock, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(producttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Type", "Price", "Stock", "Vendor ID", "Vendor Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //save feature
    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        String id = productid.getText();
        String name = productname.getText();
        String type = producttype.getText();
        String price = productprice.getText();
        String stock = productstock.getText();
        String idVendor = vendorid.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        if (id.equals("") || name.equals("") || type.equals("") || price.equals("") || stock.equals("") || idVendor.equals("")){
            return; // Text fields need to have something in order for update to work. This avoids empty string values for the table
        }        
        String query = "insert into product(productid,productname,type,price,stock,vendorid) values ('" + id + "', '" + name + "','" + type + "', '" + price + "', '" + stock + "','" + idVendor + "')";
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","");
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.execute();
            PreparedStatement selectStmt = con.prepareStatement("select * from product inner join vendor on product.vendorid = vendor.vendorid where productid = '" + id + "'"); // To display inserted row
            ResultSet rs = selectStmt.executeQuery();
            while(rs.next()){
                Object[] row = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),rs.getString(6),rs.getString(8)};
                model.addRow(row);
            }
            con.close();
            productid.setText("");
            productname.setText("");
            producttype.setText("");
            productprice.setText("");
            productstock.setText("");
            vendorid.setText("");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }   
    }//GEN-LAST:event_savebuttonActionPerformed
    
    //update feature
    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        String id = productid.getText();
        String name = productname.getText();
        String type = producttype.getText();
        String price = productprice.getText();
        String stock = productstock.getText();
        String idVendor = vendorid.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (id.equals("") || name.equals("") || type.equals("") || price.equals("") || stock.equals("") || idVendor.equals("")){
            return; // Text fields need to have something in order for update to work. This avoids empty string values for the table
        }
        String query;
        for (int i = 0; i < model.getRowCount(); i++){
            query = "update product set productid = '" + id + "', productname = '" + name + "', type = '" + type + "', price = " + price + ", stock = " + stock + ", vendorid = '" + idVendor + 
                    "' where productid = '" + model.getValueAt(i,0).toString() + "'";
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","");
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.execute();
                con.close();
                productid.setText("");
                productname.setText("");
                producttype.setText("");
                productprice.setText("");
                productstock.setText("");
                vendorid.setText("");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_updatebuttonActionPerformed
    
    //delete feature
    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        String id = productid.getText();
        String name = productname.getText();
        String type = producttype.getText();
        String price = productprice.getText();
        String stock = productstock.getText();
        String idVendor = vendorid.getText();
        String query = "delete from product";
        String whereClause = " where";
        if (!id.equals("")){
            whereClause = whereClause + " productid = '" + id + "' and"; 
        }
        if(!name.equals("")){
            whereClause = whereClause + " productname = '" + name + "' and";
        }
        if(!type.equals("")){
            whereClause = whereClause + " type = '" + type + "' and";
        }
        if(!price.equals("")){
            whereClause = whereClause + " price = " + price + " and";
        }
        if(!stock.equals("")){
            whereClause = whereClause + " stock = " + stock + " and";
        }

        if(!idVendor.equals("")){
            whereClause = whereClause + " vendorid = '" + idVendor + "' and";
        }
        if (id.equals("") && name.equals("") && type.equals("") && price.equals("") && stock.equals("") && idVendor.equals("")){// If all the textFields are empty, abort
            return;
        } else {
            query = query + whereClause; 
            query = query.substring(0,query.length()-4);         
        }
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","");
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.execute();
            con.close();
            productid.setText("");
            productname.setText("");
            producttype.setText("");
            productprice.setText("");
            productstock.setText("");
            vendorid.setText("");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_deletebuttonActionPerformed
    
    //search feature
    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        
        String id = productid.getText();
        String name = productname.getText();
        String type = producttype.getText();
        String price = productprice.getText();
        String stock = productstock.getText();
        String idVendor = vendorid.getText();
        String query = "select * from product "
                + "inner join vendor on product.vendorid = vendor.vendorid";
        String whereClause = " where";
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        if (!id.equals("")){
            whereClause = whereClause + " productid = '" + id + "' and"; 
        }
        if(!name.equals("")){
            whereClause = whereClause + " productname = '" + name + "' and";
        }
        if(!type.equals("")){
            whereClause = whereClause + " type = '" + type + "' and";
        }
        if(!price.equals("")){
            whereClause = whereClause + " price = " + price + " and";
        }
        if(!stock.equals("")){
            whereClause = whereClause + " stock = " + stock + " and";
        }

        if(!idVendor.equals("")){
            whereClause = whereClause + " product.vendorid = '" + idVendor + "' and";
        }
        
        if (!id.equals("") || !name.equals("") || !type.equals("") || !price.equals("") || !stock.equals("") || !idVendor.equals("")){
            query = query + whereClause; // Text fields need to have something in order for update to work. This avoids empty string values for the table
            query = query.substring(0,query.length()-4);
        }
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Object[] row = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getInt(5),rs.getString(6),rs.getString(8)};
                model.addRow(row);
            }
            con.close();
            productid.setText("");
            productname.setText("");
            producttype.setText("");
            productprice.setText("");
            productstock.setText("");
            vendorid.setText("");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }   
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void productidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productidActionPerformed

    private void productstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productstockActionPerformed

    private void producttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producttypeActionPerformed

    private void productnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productnameActionPerformed

    private void productpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productpriceActionPerformed

    private void vendoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendoridActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
    HomePage home = new HomePage();
    home.setVisible(true);
    dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField productid;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField productprice;
    private javax.swing.JTextField productstock;
    private javax.swing.JTextField producttype;
    private javax.swing.JButton savebutton;
    private javax.swing.JButton searchbutton;
    private javax.swing.JButton updatebutton;
    private javax.swing.JTextField vendorid;
    // End of variables declaration//GEN-END:variables
}
