/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import engine.MotoGarageNotebookEngine;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import objectmodels.DragStripSlip;

/**
 *
 * @author Mark
 */
public class DragStripSlipWindow extends javax.swing.JFrame {
    MotoGarageNotebookEngine motoGarageNotebookEngine;
    private Boolean addDragStripSlip;
    private DragStripSlip originalDragStripSlip;
    
    /**
     * Creates new form DragStripSlipWindow, for ADDING
     */
    public DragStripSlipWindow(MotoGarageNotebookEngine incomingMotoGarageNotebookEngine) {
        initComponents();
        this.setIcon();
        this.motoGarageNotebookEngine = incomingMotoGarageNotebookEngine;
        addDragStripSlip = true;
        this.addOrUpdateButton.setText("Add");
        this.setTitle("Add Drag Strip Slip");
        Date currentDate = new Date();
        this.datePicker.setDate(currentDate);
    }
    
    /**
     * Creates new form DragStripSlipWindow, for Updating
     * @param incomingMotoGarageNotebookEngine
     * @param incomingDragStripSlip
     */
    public DragStripSlipWindow(MotoGarageNotebookEngine incomingMotoGarageNotebookEngine, DragStripSlip incomingDragStripSlip) {
        initComponents();
        this.setIcon();
        this.motoGarageNotebookEngine = incomingMotoGarageNotebookEngine;
        addDragStripSlip = false;
        this.originalDragStripSlip = incomingDragStripSlip;
        this.addOrUpdateButton.setText("Edit");
        this.setTitle("View / Edit Drag Strip Slip");
               
        this.datePicker.setDate(this.originalDragStripSlip.getDate());
        
        this.reactionTimeTextField.setText(this.originalDragStripSlip.getReactionTime().toString());
        this.sixtyFeetTextField.setText(this.originalDragStripSlip.getSixtyFeetTime().toString());
        this.threeHundredThirtyFeetTextField.setText(this.originalDragStripSlip.getThreeHundredThirtyFeetTime().toString());
        this.eighthMileTextField.setText(this.originalDragStripSlip.getEighthMileTime().toString());
        this.eighthMileSpeedTextField.setText(this.originalDragStripSlip.getEighthSpeed().toString());
        this.oneThousandFeetTextField.setText(this.originalDragStripSlip.getOneThousandFeetTime().toString());
        this.quarterMileTextField.setText(this.originalDragStripSlip.getQuarterMileSpeed().toString());
        this.quarterMileSpeedTextField.setText(this.originalDragStripSlip.getQuarterMileSpeed().toString());

        
    }
    
    /**
     * Creates new form DragStripSlipWindow
     */
    public DragStripSlipWindow() {
        initComponents();
    }

    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MGFavicon.png")));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        reactionTimeTextField = new javax.swing.JTextField();
        sixtyFeetTextField = new javax.swing.JTextField();
        threeHundredThirtyFeetTextField = new javax.swing.JTextField();
        eighthMileTextField = new javax.swing.JTextField();
        eighthMileSpeedTextField = new javax.swing.JTextField();
        oneThousandFeetTextField = new javax.swing.JTextField();
        quarterMileTextField = new javax.swing.JTextField();
        quarterMileSpeedTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        addOrUpdateButton = new javax.swing.JButton();
        datePicker = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("Date");

        jLabel3.setText("R/T");

        jLabel4.setText("60'");

        jLabel5.setText("330'");

        jLabel6.setText("1/8");

        jLabel7.setText("1/8 MPH");

        jLabel8.setText("1000'");

        jLabel9.setText("1/4");

        jLabel10.setText("1/4 MPH");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addOrUpdateButton.setText("Add or Update");
        addOrUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(threeHundredThirtyFeetTextField)
                    .addComponent(eighthMileTextField)
                    .addComponent(eighthMileSpeedTextField)
                    .addComponent(oneThousandFeetTextField)
                    .addComponent(quarterMileTextField)
                    .addComponent(quarterMileSpeedTextField)
                    .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reactionTimeTextField)
                    .addComponent(sixtyFeetTextField))
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(addOrUpdateButton)
                .addGap(90, 90, 90)
                .addComponent(cancelButton)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reactionTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sixtyFeetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(threeHundredThirtyFeetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(eighthMileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(eighthMileSpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(oneThousandFeetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(quarterMileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(quarterMileSpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(addOrUpdateButton))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addOrUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrUpdateButtonActionPerformed
        // TODO add your handling code here:
        DragStripSlip newDragStripSlip = new DragStripSlip(this.datePicker.getDate(),Float.parseFloat(this.reactionTimeTextField.getText()),
                    Float.parseFloat(this.sixtyFeetTextField.getText()),
                    Float.parseFloat(this.threeHundredThirtyFeetTextField.getText()),
                    Float.parseFloat(this.eighthMileTextField.getText()),
                    Float.parseFloat(this.eighthMileSpeedTextField.getText()),
                    Float.parseFloat(this.oneThousandFeetTextField.getText()),
                    Float.parseFloat(this.quarterMileTextField.getText()),
                    Float.parseFloat(this.quarterMileSpeedTextField.getText()));
        if(this.addDragStripSlip){
            // STILL NOT DOING DATE PROPERLY!!!           
            this.motoGarageNotebookEngine.addDragStripSlip(newDragStripSlip);
        }else{
            this.motoGarageNotebookEngine.editDragStripSlip(originalDragStripSlip, newDragStripSlip);
        }
        this.dispose();
    }//GEN-LAST:event_addOrUpdateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DragStripSlipWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DragStripSlipWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DragStripSlipWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DragStripSlipWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DragStripSlipWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrUpdateButton;
    private javax.swing.JButton cancelButton;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JTextField eighthMileSpeedTextField;
    private javax.swing.JTextField eighthMileTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField oneThousandFeetTextField;
    private javax.swing.JTextField quarterMileSpeedTextField;
    private javax.swing.JTextField quarterMileTextField;
    private javax.swing.JTextField reactionTimeTextField;
    private javax.swing.JTextField sixtyFeetTextField;
    private javax.swing.JTextField threeHundredThirtyFeetTextField;
    // End of variables declaration//GEN-END:variables
}
