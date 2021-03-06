package Main;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Main.HomePage;
import Main.Staff;
import Main.Product;
import Main.Department;
import Main.Transaction;
import Main.Vendors;
import Main.Main;
import java.sql.*;

public class Jobs extends javax.swing.JFrame {


//Loading the UI    
    public Jobs() {
        initComponents();
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
        jobid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        departmentid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jobname = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Job Information Page");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Job Information");

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
                .addGap(48, 48, 48))
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
                .addContainerGap(25, Short.MAX_VALUE))
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
        jLabel2.setText("Job ID");

        jobid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jobid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Department ID");

        departmentid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        departmentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentidActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Name");

        jobname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jobname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68)
                        .addComponent(departmentid, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jobid, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jobname, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Name", "Department ID", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
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
        String jobID = jobid.getText();
        String name = jobname.getText();
        String dptID = departmentid.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Getting the table
        model.setRowCount(0); // Setting row count to 0
        if (jobID.equals("") || name.equals("") || dptID.equals("")){
            return;
        }
        String query = "insert into job (jobid,jobname,departmentid) values ('" + jobID + "','" + name + "','" + dptID + "')";
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","");
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.execute();
            PreparedStatement stmtSelect = con.prepareStatement("select * from job inner join department on job.departmentid = department.departmentid where jobid = '" + jobID + "'"); // To display inserted row
            ResultSet rs = stmtSelect.executeQuery(); // Selects added row to put into table
            while(rs.next()){
                Object[] row = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(5)};
                model.addRow(row);
            }   
            con.close();
            jobid.setText("");
            jobname.setText("");
            departmentid.setText("");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }   
    }//GEN-LAST:event_savebuttonActionPerformed
    
    //update feature
    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        String jobID = jobid.getText();
        String name = jobname.getText();
        String dptID = departmentid.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jobID.equals("") || name.equals("") || dptID.equals("")){
            return;
        }
        String query = "update job set jobid = '" + jobID + "', jobname = '" + name + "', departmentid = '" + dptID + "' where jobid = '" + model.getValueAt(0,0).toString() + "'";
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","");
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.execute();
            con.close();
            jobid.setText("");
            jobname.setText("");
            departmentid.setText("");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }   
    }//GEN-LAST:event_updatebuttonActionPerformed
    
    //delete feature
    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        String jobID = jobid.getText();
        String name = jobname.getText();
        String dptID = departmentid.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String query = "delete from job";
        String whereClause = " where";
        if (!jobID.equals("")){
            whereClause = whereClause + " jobid = '" + jobID + "' and"; 
        }
        if (!name.equals("")){
            whereClause = whereClause + " jobName = '" + name + "' and";
        }
        if (!dptID.equals("")){
            whereClause = whereClause + " departmentid = '" + dptID + "' and";
        }
        if (jobID.equals("") && name.equals("") && dptID.equals("")){
            return;
        } else {
            query = query + whereClause; // Text fields need to have something in order for update to work. This avoids empty string values for the table
            query = query.substring(0,query.length()-4);
        }
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","");
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.execute();
            con.close();
            jobid.setText("");
            jobname.setText("");
            departmentid.setText("");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }         
    }//GEN-LAST:event_deletebuttonActionPerformed
    
    //search feature
    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        String jobID = jobid.getText();
        String name = jobname.getText();
        String dptID = departmentid.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        String query = "select * from job inner join department on job.departmentid = department.departmentid";
        String whereClause = " where";
        if (!jobID.equals("")){
            whereClause = whereClause + " jobid = '" + jobID + "' and"; 
        }
        if (!name.equals("")){
            whereClause = whereClause + " jobName = '" + name + "' and";
        }
        if (!dptID.equals("")){
            whereClause = whereClause + " job.departmentid = '" + dptID + "' and";
        }
        if (!jobID.equals("") || !name.equals("") || !dptID.equals("")){
            query = query + whereClause; // Text fields need to have something in order for update to work. This avoids empty string values for the table
            query = query.substring(0,query.length()-4);
        }
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Object[] row = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(5)};
                model.addRow(row);
            }
            con.close();
            jobid.setText("");
            jobname.setText("");
            departmentid.setText("");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void jobidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobidActionPerformed

    private void departmentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentidActionPerformed

    private void jobnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobnameActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
    HomePage home = new HomePage();
    home.setVisible(true);
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jobs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField departmentid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField jobid;
    private javax.swing.JTextField jobname;
    private javax.swing.JButton savebutton;
    private javax.swing.JButton searchbutton;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
