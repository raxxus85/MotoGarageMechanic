/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import engine.MotoGarageMechanicEngine;
import informationwindows.DialogType;

/**
 *
 * @author Mark
 */
public class DeleteMechanicWindow extends javax.swing.JFrame {
    private MotoGarageMechanicEngine motoGarageMechanicEngine;

    /**
     * Creates new form DeleteMechanicWindow
     */
    public DeleteMechanicWindow() {
        initComponents();
    }
    
    /**
     * Creates new form DeleteMechanicWindow
     */
    public DeleteMechanicWindow(MotoGarageMechanicEngine incomingMotoGarageMechanicEngine) {
        this.motoGarageMechanicEngine = incomingMotoGarageMechanicEngine;
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

        cancelButton = new javax.swing.JButton();
        deleteMechanicButton = new javax.swing.JButton();
        deleteMechanicLabel = new javax.swing.JLabel();
        mechanicToDeleteTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        deleteMechanicButton.setText("Delete Mechanic");
        deleteMechanicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMechanicButtonActionPerformed(evt);
            }
        });

        deleteMechanicLabel.setText("Delete Mechanic");

        this.mechanicToDeleteTextField.setText(this.motoGarageMechanicEngine.getCurrentMechanic().toString());
        mechanicToDeleteTextField.setEditable(false);
        mechanicToDeleteTextField.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(mechanicToDeleteTextField)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteMechanicLabel)
                .addGap(124, 124, 124))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addComponent(deleteMechanicButton)
                .addGap(42, 42, 42)
                .addComponent(cancelButton)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteMechanicLabel)
                .addGap(21, 21, 21)
                .addComponent(mechanicToDeleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteMechanicButton)
                    .addComponent(cancelButton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * User hit the cancel button, kill the window
     * @param evt 
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * User hit the Delete Mechanic Button
     * <li> Pop up Confirm Dialog to ENSURE they really want to delete mechainc
     * <li> Delete the Mechanic
     * @param evt 
     */
    private void deleteMechanicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMechanicButtonActionPerformed
        // TODO add your handling code here:
        //boolean sureToDelete = false;
        boolean sureToDelete = this.motoGarageMechanicEngine.getDialogFactory().createConfirmMessage("Are you sure you wish to delete the Mechanic? This is permanent!");
        if(sureToDelete){
            this.motoGarageMechanicEngine.deleteCurrentMechanic();
            this.dispose();
        }
    }//GEN-LAST:event_deleteMechanicButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteMechanicWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteMechanicWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteMechanicWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteMechanicWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteMechanicWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteMechanicButton;
    private javax.swing.JLabel deleteMechanicLabel;
    private javax.swing.JTextField mechanicToDeleteTextField;
    // End of variables declaration//GEN-END:variables
}
