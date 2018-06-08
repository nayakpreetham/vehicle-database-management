/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.vehicleinfo;

import Connection.C_onnection;
import java.awt.Image;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Blob;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import javax.swing.ImageIcon;
import javax.swing.table.TableModel;

import vehicle.loginui.process;

/**
 *
 * @author user
 */
public class existingvehicles extends javax.swing.JFrame {
    String id;
     public String s;
  byte[] myimage;
         /*  byte[]b;
           Blob blob; */
    /**
     * Creates new form 
     */
    public existingvehicles() {
        initComponents();
        populateJTable();
    }
     // create a methode to populate data Into JTable from Mysql  database And Displaying Picture
    
    public void populateJTable(){
        vehiclecarquery mq = new vehiclecarquery();
        ArrayList<vehiclecar> list = mq.bindTable();
        String[] columnName = {"ID","NAME","COLOR","PRICE","SEATING","FUELTYPE","SHOWID","COMPID","IMAGE"};
        Object[][] rows = new Object[list.size()][9];
        for(int i = 0; i < list.size(); i++){
            rows[i][0] = list.get(i).getId();
            rows[i][1] = list.get(i).getName();
            rows[i][2] = list.get(i).getColor();
             rows[i][3] = list.get(i).getPrice();
              rows[i][4] = list.get(i).getFueltype();
               rows[i][5] = list.get(i).getSeating();
                rows[i][6] = list.get(i).getShowid();
                 rows[i][7] = list.get(i).getCompid();
          
            
            if(list.get(i).getMyImage() != null){
                
             ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage()
             .getScaledInstance(200,120, Image.SCALE_SMOOTH) );   
                
            rows[i][8] = image;
            }
            else{
                rows[i][8] = null;
            }
          
        }
        
       
        
        Model model = new Model(rows, columnName);
        cartable.setModel(model);
        cartable.setRowHeight(75);
        cartable.getColumnModel().getColumn(8).setPreferredWidth(150);
    }
    
    
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartable = new javax.swing.JTable();
        SELL = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 800));

        cartable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "COLOR", "PRICE", "SEATING", "FUELTYPE", "SHOWID", "COMPID", "IMAGE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cartable.setGridColor(new java.awt.Color(0, 0, 0));
        cartable.setRowHeight(75);
        cartable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cartable);
        if (cartable.getColumnModel().getColumnCount() > 0) {
            cartable.getColumnModel().getColumn(8).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1180, 410));

        SELL.setBackground(new java.awt.Color(255, 51, 0));
        SELL.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        SELL.setText("SELL");
        SELL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELLActionPerformed(evt);
            }
        });
        jPanel1.add(SELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 100, 30));

        back.setBackground(new java.awt.Color(255, 102, 51));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("<-");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1230, 510));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AVIALABLE VEICLES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SELLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELLActionPerformed
  C_onnection connect=new C_onnection();
            PreparedStatement ps;
            ResultSet rs;
            int i = cartable.getSelectedRow();

            TableModel model = cartable.getModel();
            
           

            
         id=  model.getValueAt(i,0).toString();
    
    }//GEN-LAST:event_SELLActionPerformed

    private void cartableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartableMouseClicked
       
    }//GEN-LAST:event_cartableMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       setVisible(false);
       new process().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(existingvehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(existingvehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(existingvehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(existingvehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new existingvehicles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SELL;
    private javax.swing.JButton back;
    private javax.swing.JTable cartable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

 
    
 public String geVehicleId(){
     return id;
 }
 


  
  
    }
