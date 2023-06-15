import java.sql.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author root
 */
public class New_Password_Page extends javax.swing.JFrame {
String url = "jdbc:mysql://localhost:3306/";
String database = "passbox_db";  
String driver = "com.mysql.jdbc.Driver";
String username = "root"; 
String password = ""; 
Connection connection = null;
Statement command = null;
ResultSet incomingdata = null; 
PreparedStatement pst = null;
    /**
     * Creates new form Manage_Passwords_Page
     */
    public New_Password_Page() {
        initComponents();
        setIcon();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        try {
        Class.forName(driver);
        
        connection = DriverManager.getConnection(url + database, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error 1: Driver and connection line!" + ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel_socail_media_name = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        socail_media_name_txt = new javax.swing.JTextField();
        username_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel_email_address = new javax.swing.JLabel();
        email_address_txt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton_TurnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PassBox | New Add Password ");
        setResizable(false);

        jLabel_socail_media_name.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel_socail_media_name.setText("Social Media Name : ");

        jLabel_username.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel_username.setText("Username : ");

        jLabel_password.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel_password.setText("Password : ");

        socail_media_name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); 

        username_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); 

        password_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); 

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/add_new_password_ico.png"))); 
        jButton1.setText("New Password Add");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel_email_address.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel_email_address.setText("E-Mail Address : ");

        email_address_txt.setFont(new java.awt.Font("Tahoma", 1, 11));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/PassBox.png"))); 

        jButton_TurnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jButton_TurnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/turnback_ico.png"))); 
        jButton_TurnBack.setText("Turn Back");
        jButton_TurnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_TurnBack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_TurnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TurnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_socail_media_name)
                            .addComponent(jLabel_username)
                            .addComponent(jLabel_password)
                            .addComponent(jLabel_email_address))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(password_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(socail_media_name_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_address_txt, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton_TurnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_socail_media_name)
                            .addComponent(socail_media_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_username))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_email_address)
                            .addComponent(email_address_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_TurnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11))))
        );

        pack();
    }

    private void jButton_TurnBackActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String query = "INSERT INTO `passbox_db`.`password_database_tb`(`account_name`,`username`,`password`,`email_address`)VALUES(?,?,?,?)";
        try {
           pst = connection.prepareStatement(query);
           pst.setString(1, socail_media_name_txt.getText());
           pst.setString(2, username_txt.getText());
           pst.setString(3, password_txt.getText());
           pst.setString(4, email_address_txt.getText());
           int x = pst.executeUpdate();
           if(x == 1)
                JOptionPane.showMessageDialog(null,"Registration Succesful!");
           else
                JOptionPane.showMessageDialog(null,"Registration Failed!");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "There was an error with the query!" + ex);
        }
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
            java.util.logging.Logger.getLogger(New_Password_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Password_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Password_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Password_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Password_Page().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JTextField email_address_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_TurnBack;
    private javax.swing.JLabel jLabel_email_address;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_socail_media_name;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JTextField password_txt;
    private javax.swing.JTextField socail_media_name_txt;
    private javax.swing.JTextField username_txt;
    

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("passbox_ico.png")));
    }
}
