/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell Latitude E7270
 */
public class Gui extends javax.swing.JFrame {
  StringEncoder objStringEn = new StringEncoder();
  
    /**
     * Creates new form Gui
     */
    public Gui() {
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

        jLabel1 = new javax.swing.JLabel();
        cm_Encoder = new javax.swing.JComboBox<>();
        btn_Decoder = new javax.swing.JButton();
        txtEncoder = new javax.swing.JTextField();
        txtString = new javax.swing.JPasswordField();
        btn_Encoder1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Value?");

        cm_Encoder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Encoder:", "Base64Encoder", "URLEncoder", "MIMEEncoder" }));
        cm_Encoder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm_EncoderActionPerformed(evt);
            }
        });

        btn_Decoder.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_Decoder.setForeground(new java.awt.Color(255, 51, 51));
        btn_Decoder.setText("Decoder");
        btn_Decoder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DecoderActionPerformed(evt);
            }
        });

        btn_Encoder1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_Encoder1.setForeground(new java.awt.Color(255, 51, 51));
        btn_Encoder1.setText("Generate Encoder");
        btn_Encoder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Encoder1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Decoder)
                    .addComponent(txtEncoder, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtString, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cm_Encoder, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE))
                    .addComponent(btn_Encoder1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtString, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cm_Encoder, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(btn_Encoder1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEncoder, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Decoder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cm_EncoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm_EncoderActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cm_EncoderActionPerformed

    private void btn_DecoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DecoderActionPerformed
        // TODO add your handling code here:
        
        if(txtString.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Field cannot be empty!!");
        }else if (cm_Encoder.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "Select a valid Encoder!");
        }
        if(cm_Encoder.getSelectedIndex()==1)
        {
            try {
                String userDecoder = objStringEn.basicDecoder(txtEncoder.getText());
                JOptionPane.showMessageDialog(null, userDecoder);
                //txtEncoder.setText(userDecoder);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (cm_Encoder.getSelectedIndex()==2)
        {
            
        }else if(cm_Encoder.getSelectedIndex()==3)
        {
            
        }
        

    }//GEN-LAST:event_btn_DecoderActionPerformed

    private void btn_Encoder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Encoder1ActionPerformed
       
        if(txtString.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Field cannot be empty!!");
        }else if (cm_Encoder.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "Select a valid Encoder!");
        }
        if(cm_Encoder.getSelectedIndex()==1)
        {  
           String encodedUserValue = objStringEn.basicEncoder(txtString.getText());
           txtEncoder.setText(encodedUserValue);
        }else if (cm_Encoder.getSelectedIndex()==2)
        {
            String urlEncoder = objStringEn.urlEncoder(txtString.getText());
            txtEncoder.setText(urlEncoder);
        }else if(cm_Encoder.getSelectedIndex()==3)
        {
            
        }
    }//GEN-LAST:event_btn_Encoder1ActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Decoder;
    private javax.swing.JButton btn_Encoder1;
    private javax.swing.JComboBox<String> cm_Encoder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtEncoder;
    private javax.swing.JPasswordField txtString;
    // End of variables declaration//GEN-END:variables
}
