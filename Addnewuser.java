/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.vehicleinfo;


import Connection.C_onnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vehicle.loginui.Login;
import vehicle.loginui.process;


/**
 *
 * @author user
 */
public class Addnewuser extends javax.swing.JFrame {
    
   
   
       
       
    /**
     * 
     * Creates new form Signup
     */
    public Addnewuser() {
        
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        signupfname = new javax.swing.JTextField();
        signuplname = new javax.swing.JTextField();
        signupusername = new javax.swing.JTextField();
        signuppassword = new javax.swing.JTextField();
        signupid = new javax.swing.JTextField();
        signupclear = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        searchtext = new javax.swing.JTextField();
        searchbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jback = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setFocusable(false);
        jPanel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 24);

        signupfname.setBackground(new java.awt.Color(51, 51, 51));
        signupfname.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        signupfname.setForeground(new java.awt.Color(255, 255, 255));
        signupfname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(signupfname);
        signupfname.setBounds(30, 120, 210, 30);

        signuplname.setBackground(new java.awt.Color(51, 51, 51));
        signuplname.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        signuplname.setForeground(new java.awt.Color(255, 255, 255));
        signuplname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(signuplname);
        signuplname.setBounds(30, 190, 210, 30);

        signupusername.setBackground(new java.awt.Color(51, 51, 51));
        signupusername.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        signupusername.setForeground(new java.awt.Color(255, 255, 255));
        signupusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(signupusername);
        signupusername.setBounds(30, 250, 210, 30);

        signuppassword.setBackground(new java.awt.Color(51, 51, 51));
        signuppassword.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        signuppassword.setForeground(new java.awt.Color(255, 255, 255));
        signuppassword.setBorder(null);
        jPanel1.add(signuppassword);
        signuppassword.setBounds(30, 320, 210, 30);

        signupid.setBackground(new java.awt.Color(51, 51, 51));
        signupid.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        signupid.setForeground(new java.awt.Color(255, 255, 255));
        signupid.setBorder(null);
        jPanel1.add(signupid);
        signupid.setBounds(30, 390, 210, 30);

        signupclear.setBackground(new java.awt.Color(255, 51, 0));
        signupclear.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        signupclear.setForeground(new java.awt.Color(255, 255, 255));
        signupclear.setText("CLEAR");
        signupclear.setBorder(null);
        signupclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupclearActionPerformed(evt);
            }
        });
        jPanel1.add(signupclear);
        signupclear.setBounds(30, 470, 80, 30);

        add.setBackground(new java.awt.Color(255, 51, 0));
        add.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.setBorder(null);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(280, 470, 80, 30);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(51, 51, 51));
        jTextField6.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("FIRST NAME :");
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(30, 99, 80, 10);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(51, 51, 51));
        jTextField7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("LAST NAME :");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(30, 170, 73, 17);

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(51, 51, 51));
        jTextField8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setText("USER NAME :");
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(30, 230, 80, 17);

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(51, 51, 51));
        jTextField9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setText("PASSWORD :");
        jTextField9.setBorder(null);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(30, 300, 80, 17);

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(51, 51, 51));
        jTextField10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText("ID :");
        jTextField10.setBorder(null);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(30, 370, 140, 17);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 150, 210, 10);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(30, 220, 210, 10);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(30, 280, 210, 30);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(30, 350, 210, 20);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(30, 420, 210, 20);

        searchtext.setBackground(new java.awt.Color(255, 255, 255));
        searchtext.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        searchtext.setForeground(new java.awt.Color(0, 0, 0));
        searchtext.setText("Search");
        searchtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextActionPerformed(evt);
            }
        });
        jPanel1.add(searchtext);
        searchtext.setBounds(240, 70, 110, 19);

        searchbutton.setText("...");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(searchbutton);
        searchbutton.setBounds(350, 70, 30, 20);

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setText("CLEAR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 110, 70, 30);

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CLEAR");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(250, 175, 70, 30);

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setText("CLEAR");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(250, 250, 70, 30);

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("CLEAR");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(250, 315, 70, 30);

        jButton6.setBackground(new java.awt.Color(255, 51, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CLEAR");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(250, 380, 73, 30);

        update.setBackground(new java.awt.Color(255, 51, 0));
        update.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.setBorder(null);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(160, 470, 80, 30);

        jback.setBackground(new java.awt.Color(255, 51, 0));
        jback.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jback.setForeground(new java.awt.Color(255, 255, 255));
        jback.setText("<-");
        jback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbackActionPerformed(evt);
            }
        });
        jPanel1.add(jback);
        jback.setBounds(0, 40, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(398, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        C_onnection connect=new C_onnection();
        PreparedStatement ps;
        ResultSet rs;
        try{
         
            
            
        String query2="INSERT INTO users VALUES(?,?,?,?,?);";
        ps=connect.getConnection().prepareStatement(query2);
        ps.setString(1,signupfname.getText());
                 ps.setString(2,signuplname.getText());
                 
                 
                          ps.setString(3,signupusername.getText());
                                   ps.setString(4,signuppassword.getText());
                                   ps.setString(5,signupid.getText());
                                   
                                           
                                            
          ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"inserted", "successfull", JOptionPane.INFORMATION_MESSAGE);
              
            
            
        }
                
        catch(Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }
    }//GEN-LAST:event_addActionPerformed

    private void signupclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupclearActionPerformed
        signupfname.setText(null);
         signuplname.setText(null);
         signupusername.setText(null);
         signuppassword.setText(null);
         signupid.setText(null);
        
        
        
    }//GEN-LAST:event_signupclearActionPerformed

    private void searchtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextActionPerformed
      
       
    }
     
     
     
     
  /*public void executeSQlQuery(String query, String message)
   {
       C_onnection connect1=new C_onnection();
       Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTable_Display_Users.getModel();
               model.setRowCount(0);
               Show_Users_In_JTable();
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception ex){
           ex.printStackTrace();
       } 
    }//GEN-LAST:event_searchtextActionPerformed
 */
    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        C_onnection connect=new C_onnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            
            String i="SELECT * FROM users  WHERE id='?' ;";
        
            ps=connect.getConnection().prepareStatement("SELECT * FROM users  WHERE username=? ;");
             ps.setString(1,searchtext.getText());
             
            rs=ps.executeQuery();
            while(rs.next()){
             signupfname.setText(rs.getString("firstname"));

       signuplname.setText(rs.getString("lastname"));

        signupusername.setText(rs.getString("username"));

        signuppassword.setText(rs.getString("password"));
        signupid.setText(rs.getString("logid"));
            }   
            
            
        }
        catch(SQLException e){
            System.out.println("ERROR:"+e.getMessage());
        }
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        signupfname.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              signuplname.setText(null);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
               signupusername.setText(null);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
signuppassword.setText(null);    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         signupid.setText(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
           C_onnection connect=new C_onnection();
        PreparedStatement ps;
        ResultSet rs;
        try{
            
          //  "UPDATE users SET firstname="+signupfname.getText()+",lastname="+signuplname.getText()+",username="+signupusername.getText()+",password="+signuppassword.getText()+" WHERE id = "+searchtext.getText()+";");
            String query = "UPDATE users SET firstname=?,lastname=?,username=?,password=?,logid=? WHERE username =?;";
          
          ps=connect.getConnection().prepareStatement(query);
            
        ps.setString(1,signupfname.getText());
                 ps.setString(2,signuplname.getText());
                 
                 
                          ps.setString(3,signupusername.getText());
                                   ps.setString(4,signuppassword.getText());
                                           ps.setString(5,signupid.getText());
                                        ps.setString(6,searchtext.getText());
                 
             
              ps.executeUpdate();
             
             
           JOptionPane.showMessageDialog(null,"updated", "successfull", JOptionPane.INFORMATION_MESSAGE);
              setVisible(false);
              new process().setVisible(true);          
                }
        catch(Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }
                                          
    }//GEN-LAST:event_updateActionPerformed

    private void jbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbackActionPerformed
        setVisible(false);
        new  process().setVisible(true);
    }//GEN-LAST:event_jbackActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jback;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField searchtext;
    private javax.swing.JButton signupclear;
    private javax.swing.JTextField signupfname;
    private javax.swing.JTextField signupid;
    private javax.swing.JTextField signuplname;
    private javax.swing.JTextField signuppassword;
    private javax.swing.JTextField signupusername;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

     
       
  
        
}
