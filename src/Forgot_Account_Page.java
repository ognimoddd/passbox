
import java.awt.Toolkit;

public class Forgot_Account_Page extends javax.swing.JFrame {

    /**
     * Creates new form Forgot_Account_Page
     */
    public Forgot_Account_Page() {
        initComponents();
        setIcon();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jButton_Forgot_Account_PassBox_Logo = new javax.swing.JButton();
        jButton_Forgot_Account_ForgotUsername_Button = new javax.swing.JButton();
        jButton_Forgot_Account_ForgotPassword_Button = new javax.swing.JButton();
        jButton_Forgot_Account_TurnBack_Button = new javax.swing.JButton();
        jButton_Forgot_Account_Exit_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PassBox | Forgot Account?");
        setAutoRequestFocus(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setFocusableWindowState(false);
        setResizable(false);

        jButton_Forgot_Account_PassBox_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/PassBox.png")));

        jButton_Forgot_Account_ForgotUsername_Button.setText("Forgot Username?");
        jButton_Forgot_Account_ForgotUsername_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Forgot_Account_ForgotUsername_ButtonActionPerformed(evt);
            }
        });

        jButton_Forgot_Account_ForgotPassword_Button.setText("Forgot Password?");

        jButton_Forgot_Account_TurnBack_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/turnback_ico.png"))); 
        jButton_Forgot_Account_TurnBack_Button.setText("Turn Back");
        jButton_Forgot_Account_TurnBack_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Forgot_Account_TurnBack_ButtonActionPerformed(evt);
            }
        });

        jButton_Forgot_Account_Exit_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/exit_ico.png"))); 
        jButton_Forgot_Account_Exit_Button.setText("Exit");
        jButton_Forgot_Account_Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Forgot_Account_Exit_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jButton_Forgot_Account_PassBox_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Forgot_Account_TurnBack_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Forgot_Account_Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton_Forgot_Account_ForgotPassword_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Forgot_Account_ForgotUsername_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Forgot_Account_ForgotUsername_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton_Forgot_Account_ForgotPassword_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Forgot_Account_TurnBack_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Forgot_Account_Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton_Forgot_Account_PassBox_Logo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton_Forgot_Account_Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
    }

    private void jButton_Forgot_Account_TurnBack_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         this.setVisible(false);
         Login_Page frame = new Login_Page();
         frame.setVisible(true);  
    }

    private void jButton_Forgot_Account_ForgotUsername_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
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
            java.util.logging.Logger.getLogger(Forgot_Account_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot_Account_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot_Account_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot_Account_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot_Account_Page().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton jButton_Forgot_Account_Exit_Button;
    private javax.swing.JButton jButton_Forgot_Account_ForgotPassword_Button;
    private javax.swing.JButton jButton_Forgot_Account_ForgotUsername_Button;
    private javax.swing.JButton jButton_Forgot_Account_PassBox_Logo;
    private javax.swing.JButton jButton_Forgot_Account_TurnBack_Button;

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("passbox_ico.png")));
    }
}