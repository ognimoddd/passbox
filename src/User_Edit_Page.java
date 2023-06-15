import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class User_Edit_Page extends javax.swing.JFrame {
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
     * Creates new form User_Edit_PAge
     */
int id=-1;
public User_Edit_Page( ) {
        initComponents();
}
    public User_Edit_Page( int gid) {
        initComponents();
        id = gid;
        jTextField2.setText(String.valueOf(gid));
        setIcon();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        try {
        Class.forName(driver);
        
        connection = DriverManager.getConnection(url + database, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: Driver and bus!" + ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jButton_TurnBack = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PassBox | User Edit");
        setResizable(false);

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

        jButton_Update.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jButton_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/database_update_ico.png")));
        jButton_Update.setText("Update");
        jButton_Update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Update.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/database_view_ico.png"))); 
        jButton1.setText("DB View");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHideActionText(true);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/PassBox.png"))); 

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel1.setText("Full Name : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel2.setText("Username : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel3.setText("Password : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel4.setText("E-Mail Address : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel5.setText("Mobile Number : ");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); 

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jTextField2.setEnabled(false);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 11)); 

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); 

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_TurnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_TurnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }

    private void jButton_TurnBackActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.setVisible(false);
    }

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try{
       String value1=jTextField1.getText();
       String value2=jTextField2.getText();
       String value3=jPasswordField1.getText();
       String value4=jTextField3.getText();
       String value5=jTextField4.getText();
       String query = "UPDATE users_tb SET fullname='"+value1+"',username='"+value2
               +"',password='"+value3+"',email_address='"+value4+"',mobile_number='"+value5+"' where fullname='"+value1+"'";
       pst = connection.prepareStatement(query);
       pst.execute();
       JOptionPane.showMessageDialog(null,"The update has taken place");
       
     } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "There is an error with the query " + ex);
        }   
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        User_Database_View_Page frame_userdatabaseview = new User_Database_View_Page();
        frame_userdatabaseview.setVisible(true);
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
            java.util.logging.Logger.getLogger(User_Edit_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Edit_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Edit_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Edit_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Edit_Page().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_TurnBack;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("passbox_ico.png")));
    }
}