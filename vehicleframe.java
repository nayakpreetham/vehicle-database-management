/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.vehicleinfo;

import Connection.C_onnection;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Blob;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;
import vehicle.loginui.customers;
import vehicle.loginui.process;

/**
 *
 * @author user
 */
public class vehicleframe extends javax.swing.JFrame {
  public  static String  id;
     public String s;
  byte[] myimage;
         /*  byte[]b;
           Blob blob; */
    /**
     * Creates new form 
     */
    public vehicleframe() {
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
        name = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        fueltype = new javax.swing.JTextField();
        seating = new javax.swing.JTextField();
        companyid = new javax.swing.JTextField();
        dealerid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        save = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        picture = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1120, 291));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 310, 126, 28));

        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });
        jPanel1.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 385, 126, 28));

        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 349, 126, 25));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 310, 126, 30));
        jPanel1.add(fueltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 388, 126, 29));
        jPanel1.add(seating, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 347, 126, 28));

        companyid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyidActionPerformed(evt);
            }
        });
        jPanel1.add(companyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 349, 126, 28));

        dealerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealeridActionPerformed(evt);
            }
        });
        jPanel1.add(dealerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 315, 126, 28));

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 354, 26, -1));

        jLabel8.setText("PRICE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 313, -1, -1));

        jLabel3.setText("FUEL TYPE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 395, -1, -1));

        jLabel4.setText("SEATING");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 345, 58, 32));

        jLabel6.setText("COMPANY ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 356, -1, -1));

        jLabel7.setText("DEALER ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 322, -1, -1));

        jLabel1.setText("NAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 315, 37, 35));

        jlabel2.setText("COLOR");
        jPanel1.add(jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 392, -1, -1));

        browse.setText("browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jPanel1.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 426, 81, -1));

        save.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 319, 83, 30));

        update1.setBackground(new java.awt.Color(204, 204, 204));
        update1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        update1.setText("UPDATE");
        update1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel1.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, 80, 30));

        delete.setBackground(new java.awt.Color(204, 204, 204));
        delete.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 100, 30));

        jDesktopPane1.setLayer(picture, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 308, -1, -1));

        clear.setBackground(new java.awt.Color(255, 102, 51));
        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 100, 30));

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setText("SELL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 100, 30));

        back1.setBackground(new java.awt.Color(255, 102, 51));
        back1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back1.setText("<-");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        jPanel1.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 420, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1210, 470));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel5.setBackground(new java.awt.Color(255, 51, 0));
        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VEHICLE DETAILES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dealeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealeridActionPerformed

    private void companyidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyidActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        JFileChooser filechooser=new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter =new FileNameExtensionFilter("Image","jpg","gif","png","jpeg");
        filechooser.addChoosableFileFilter(filter);
        int result=filechooser.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=filechooser.getSelectedFile();

            try{
                String path=selectedFile.getAbsolutePath();
                picture.setIcon(ResizeImage(path));
                File image=new File (path);
                FileInputStream fis=new FileInputStream(image);
                ByteArrayOutputStream bos=new ByteArrayOutputStream();
                byte buf[]=new byte[024];

                for(int readnum;(readnum=fis.read(buf))!=-1;){
                    bos.write(buf,0,readnum);

                }
                s=path;
                myimage=bos.toByteArray();
            }
            catch(Exception e){
                System.out.println("error:"+e.getMessage());
            }
        }
        else if(result==JFileChooser.CANCEL_OPTION){
            System.out.println("no data");
        }
    }//GEN-LAST:event_browseActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try{
            C_onnection connect=new C_onnection();

            PreparedStatement ps;
            ps = connect.getConnection().prepareStatement("INSERT INTO vehicle VALUES(?,?,?,?,?,?,?,?,?);");

            //InputStream is=new FileInputStream(new File(s));
              ps.setString(1, number.getText());
            ps.setString(2,name.getText());
            
           
            ps.setString(3, color.getText());
             ps.setString(4, price.getText());
              ps.setString(5, seating.getText());
               ps.setString(6, fueltype.getText());
               ps.setString(7, dealerid.getText());
                                  
                 ps.setString(8, companyid.getText());

                    ps.setBytes(9,myimage);
            ps.executeUpdate();
             populateJTable();
            JOptionPane.showMessageDialog(null,"data inserted");

        }
        catch(Exception e){
            System.out.println("ERROR:   "+e.getMessage());

        }

    }//GEN-LAST:event_saveActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        C_onnection connect=new C_onnection();
        PreparedStatement ps;
        ResultSet rs;
        try{
            int i = cartable.getSelectedRow();

            TableModel model = cartable.getModel();
            String str=model.getValueAt(i,0).toString();

            //  "UPDATE users SET firstname="+signupfname.getText()+",lastname="+signuplname.getText()+",username="+signupusername.getText()+",password="+signuppassword.getText()+" WHERE id = "+searchtext.getText()+";");
        String query = "UPDATE vehicle SET name=?,color=?,price=?,seating=?,fueltype=? ,showid=?,compid=?,image=? WHERE vehid =?;";

        ps=connect.getConnection().prepareStatement(query);

       
        ps.setString(1,name.getText());

        ps.setString(2,color.getText());
        ps.setString(3,price.getText());
        ps.setString(4,seating.getText());
                ps.setString(5,fueltype.getText());

                

                        ps.setString(6,dealerid.getText());
        ps.setString(7,companyid.getText());
          ps.setBytes(8,myimage);

        ps.setString(9,model.getValueAt(i,0).toString());

        ps.executeUpdate();
       populateJTable();
        JOptionPane.showMessageDialog(null,"updated", "successfull", JOptionPane.INFORMATION_MESSAGE);

        }
        catch(Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }
    }//GEN-LAST:event_update1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
           
            
             PreparedStatement ps;
            ResultSet rs;
            int i = cartable.getSelectedRow();

            TableModel model = cartable.getModel();
            C_onnection connect=new C_onnection();
             CallableStatement cst=connect.getConnection().prepareCall("{call deletevehicle(?)}");
           
            
        
           cst.setString(1,model.getValueAt(i,0).toString());
           cst.executeUpdate();
           populateJTable();
        } catch (SQLException ex) {
          Logger.getLogger(vehicleframe.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void cartableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartableMouseClicked
        C_onnection connect=new C_onnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            
           
         int i = cartable.getSelectedRow();

            TableModel model = cartable.getModel();
          
            ps=connect.getConnection().prepareStatement("SELECT * FROM vehicle  WHERE vehid=? ;");
            
             ps.setString(1,model.getValueAt(i,0).toString());
            id= model.getValueAt(i,0).toString();
            
            rs=ps.executeQuery();
            while(rs.next()){
             name.setText(rs.getString("name"));

       number.setText(rs.getString("vehid"));
   
        color.setText(rs.getString("color"));

        price.setText(rs.getString("price"));
        seating.setText(rs.getString("seating"));
         fueltype.setText(rs.getString("fueltype"));
          companyid.setText(rs.getString("compid"));
          dealerid.setText(rs.getString("showid"));
         
            }   
            
            
        }
        catch(SQLException e){
            System.out.println("ERROR:"+e.getMessage());
        }      
    }//GEN-LAST:event_cartableMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
             name.setText(null);

       number.setText(null);
   
        color.setText(null);

        price.setText(null);
        seating.setText(null);
         fueltype.setText(null);
          companyid.setText(null);
          dealerid.setText(null);
         
    }//GEN-LAST:event_clearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new customers().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        setVisible(false);
        new process().setVisible(true);
    }//GEN-LAST:event_back1ActionPerformed

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
            java.util.logging.Logger.getLogger(vehicleframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehicleframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehicleframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehicleframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehicleframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JButton browse;
    private javax.swing.JTable cartable;
    private javax.swing.JButton clear;
    private javax.swing.JTextField color;
    private javax.swing.JTextField companyid;
    private javax.swing.JTextField dealerid;
    private javax.swing.JButton delete;
    private javax.swing.JTextField fueltype;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField price;
    private javax.swing.JButton save;
    private javax.swing.JTextField seating;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables

 private ImageIcon ResizeImage(String path) {
        ImageIcon myImage=new ImageIcon(path);
        Image img=myImage.getImage();
        Image newImage=img.getScaledInstance(picture.getWidth(),picture.getHeight(),Image.SCALE_SMOOTH);
        
        ImageIcon image=new ImageIcon(newImage);
        return image;
       
    }
 public String getVehicleId(){
     return id;
 }
 


  
  
    }
