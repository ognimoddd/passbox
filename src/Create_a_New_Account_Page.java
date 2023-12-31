
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;


public class Create_a_New_Account_Page extends javax.swing.JFrame {
String url = "jdbc:mysql://localhost:80/";  
String database = "passbox_db";  
String driver = "com.mysql.jdbc.Driver"; 
String username = "root";  
String password = ""; 
java.sql.Connection connection = null; 
java.sql.Statement command = null; 
ResultSet incomingdata = null; 
PreparedStatement pst = null;
    /**
     * Creates new form Create_a_New_Account_Page
     */
    public Create_a_New_Account_Page() {
        initComponents();
        setIcon();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        try {
        Class.forName(driver);
        connection = DriverManager.getConnection(url + database, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error 1: DriverManager.getConnection error!" + ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password_txt = new javax.swing.JPasswordField();
        username_txt = new javax.swing.JTextField();
        email_address_txt = new javax.swing.JTextField();
        mobile_number_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton_Create_a_New_Account_Page_TurnBack_Button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fullname_txt = new javax.swing.JTextField();

        jPasswordField2.setText("jPasswordField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PassBox | Create a New Account");
        setResizable(false);

        jLabel1.setText("Username : ");

        jLabel2.setText("Password : ");

        jLabel3.setText("E-Mail Address :");

        jLabel4.setText("Mobile Number :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/register_ico.png"))); 
        jButton1.setText("Register");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/PassBox.png"))); 
        jButton2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/PassBox.png"))); 
        jButton2.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/PassBox.png"))); 
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/PassBox.png"))); 
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/PassBox.png"))); 
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/PassBox.png"))); 
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/PassBox.png"))); 

        jLabel5.setText("Confidentiality Agreement : ");

        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jLabel6.setText("Contract : ");

        jCheckBox2.setEnabled(false);
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        jButton_Create_a_New_Account_Page_TurnBack_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/turnback_ico.png"))); 
        jButton_Create_a_New_Account_Page_TurnBack_Button.setText("Turn Back");
        jButton_Create_a_New_Account_Page_TurnBack_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Create_a_New_Account_Page_TurnBack_ButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Full Name : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_address_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(username_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mobile_number_txt)
                            .addComponent(fullname_txt)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Create_a_New_Account_Page_TurnBack_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fullname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(email_address_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mobile_number_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Create_a_New_Account_Page_TurnBack_Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton_Create_a_New_Account_Page_TurnBack_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         this.setVisible(false);
         Login_Page frame = new Login_Page();
         frame.setVisible(true); 
    }

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
        // TODO add your handling code here:
        int each = evt.getStateChange(); 
        int each_not = evt.getStateChange(); 
        if(each == ItemEvent.SELECTED)
            jCheckBox2.setEnabled(true);
        else
            jCheckBox2.setEnabled(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String query = "INSERT INTO `passbox_db`.`users_tb`(`fullname`,`username`,`password`,`email_address`,`mobile_number`)VALUES(?,?,?,?,?);"; 
        try {
           pst = connection.prepareStatement(query);
           pst.setString(1, fullname_txt.getText());
           pst.setString(2, username_txt.getText());
           pst.setString(3, password_txt.getText());
           pst.setString(4, email_address_txt.getText());
           pst.setString(5, mobile_number_txt.getText());
           int x = pst.executeUpdate();
           if(x == 1)
                JOptionPane.showMessageDialog(null,"Registered Successfully");
           else
                JOptionPane.showMessageDialog(null,"Registration Failed");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "There is an error with the query!" + ex);
        }
        
    }

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {
        int each = evt.getStateChange(); 
        int each_not = evt.getStateChange(); 
        if(each == ItemEvent.SELECTED)
            jButton1.setEnabled(true);
        else
            jButton1.setEnabled(false);
                
    }

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
            java.util.logging.Logger.getLogger(Create_a_New_Account_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_a_New_Account_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_a_New_Account_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_a_New_Account_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_a_New_Account_Page().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JTextField email_address_txt;
    private javax.swing.JTextField fullname_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Create_a_New_Account_Page_TurnBack_Button;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField mobile_number_txt;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JTextField username_txt;
    

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("passbox_ico.png")));
    }
}
