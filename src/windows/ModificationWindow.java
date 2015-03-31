/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import engine.MotoGarageNotebookEngine;
import java.awt.Toolkit;
import java.util.Date;
import objectmodels.Modification;

/**
 *
 * @author Mark
 */
public class ModificationWindow extends javax.swing.JFrame {
    private MotoGarageNotebookEngine mechanicsNotebookEngine;
    private Boolean addModification;
    private Modification originalModification;
    
    
    /**
     * Creates new form ModificationWindow, for ADDING
     */
    public ModificationWindow(MotoGarageNotebookEngine incomingMechanicsNotebookEngine) {
        this.mechanicsNotebookEngine = incomingMechanicsNotebookEngine;
        initComponents();
        this.setIcon();
        addModification=true;
        this.addOrUpdateButton.setText("Create Modification");
        this.setTitle("Create Modification");
        Date currentDate = new Date();
        this.datePicker.setDate(currentDate);
        this.warrantyDurationTextField.setText(Integer.toString(this.durationSlider.getValue())+ " Days");
    }
    
    /**
     * Creates new form ModificationWindow, for UPDATING
     */
    public ModificationWindow(MotoGarageNotebookEngine incomingMechanicsNotebookEngine, Modification incomingModification) {
        this.mechanicsNotebookEngine = incomingMechanicsNotebookEngine;
        initComponents();
        this.setIcon();
        addModification = false;
        this.addOrUpdateButton.setText("Edit Modification");
        this.setTitle("View / Edit Modification");
        originalModification=incomingModification;
        
        this.partTextField.setText(incomingModification.getPartName());
        this.datePicker.setDate(incomingModification.getDate());
        this.warrantyDurationTextField.setText(incomingModification.getWarrantyDuration());
        this.descriptionTextField.setText(incomingModification.getDescription());
        this.costTextField.setText(incomingModification.getCost().toString());
        
        if(incomingModification.getWarrantyDuration().equals("Lifetime")){
            this.warrantyDurationTextField.setText(incomingModification.getWarrantyDuration());
            this.lifetimeCheckBox.setSelected(true);
            this.noWarrantyCheckBox.setSelected(false);
            this.noWarrantyCheckBox.setEnabled(false);
            this.durationSlider.setEnabled(false);
        }else if(incomingModification.getWarrantyDuration().equals("No Warranty")){
            this.warrantyDurationTextField.setText(incomingModification.getWarrantyDuration());
            this.lifetimeCheckBox.setSelected(false);
            this.lifetimeCheckBox.setEnabled(false);
            this.noWarrantyCheckBox.setSelected(true);
            this.durationSlider.setEnabled(false);
        }else{        
            String originalString = incomingModification.getWarrantyDuration();
            String reducedString = originalString.substring(0, originalString.length() - 5);
            this.durationSlider.setValue(Integer.parseInt(reducedString));
            this.warrantyDurationTextField.setText(incomingModification.getWarrantyDuration());
            this.lifetimeCheckBox.setSelected(false);
            this.noWarrantyCheckBox.setSelected(false);
            this.durationSlider.setEnabled(true);
            
        }
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MGFavicon.png")));
    }
    /**
     * Creates new form ModificationWindow
     */
    public ModificationWindow() {
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

        partLabel = new javax.swing.JLabel();
        datePurchasedLabel = new javax.swing.JLabel();
        warrantyDurationLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();
        partTextField = new javax.swing.JTextField();
        warrantyDurationTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        costTextField = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();
        addOrUpdateButton = new javax.swing.JButton();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        durationSlider = new javax.swing.JSlider();
        lifetimeCheckBox = new javax.swing.JCheckBox();
        noWarrantyCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        partLabel.setText("Part");

        datePurchasedLabel.setText("Date Purchased");

        warrantyDurationLabel.setText("Warranty Duration");

        descriptionLabel.setText("Description");

        costLabel.setText("Cost");

        warrantyDurationTextField.setFocusable(false);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        addOrUpdateButton.setText("Add or Update");
        addOrUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrUpdateButtonActionPerformed(evt);
            }
        });

        durationSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                durationSliderStateChanged(evt);
            }
        });

        lifetimeCheckBox.setText("Lifetime");
        lifetimeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lifetimeCheckBoxActionPerformed(evt);
            }
        });

        noWarrantyCheckBox.setText("No Warranty");
        noWarrantyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noWarrantyCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(addOrUpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(closeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(partLabel)
                            .addComponent(datePurchasedLabel)
                            .addComponent(warrantyDurationLabel)
                            .addComponent(descriptionLabel)
                            .addComponent(costLabel)
                            .addComponent(lifetimeCheckBox)
                            .addComponent(noWarrantyCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(durationSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(costTextField)
                            .addComponent(descriptionTextField)
                            .addComponent(datePicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(partTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(warrantyDurationTextField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partLabel)
                    .addComponent(partTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePurchasedLabel)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(warrantyDurationLabel)
                    .addComponent(warrantyDurationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(durationSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lifetimeCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noWarrantyCheckBox)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(costTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(addOrUpdateButton))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void addOrUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrUpdateButtonActionPerformed
        // TODO add your handling code here:
        
        if(this.addModification){
            
            Modification newModification = new Modification(this.partTextField.getText(), this.datePicker.getDate(), 
            this.warrantyDurationTextField.getText(),this.descriptionTextField.getText(), Float.parseFloat(this.costTextField.getText()));
            this.mechanicsNotebookEngine.addModification(newModification);
        }else{
            Modification newModification = new Modification(this.partTextField.getText(), this.datePicker.getDate(), 
            this.warrantyDurationTextField.getText(),this.descriptionTextField.getText(), Float.parseFloat(this.costTextField.getText()));
            this.mechanicsNotebookEngine.editModification(this.originalModification, newModification);
        }
        this.dispose();
    }//GEN-LAST:event_addOrUpdateButtonActionPerformed

    private void lifetimeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lifetimeCheckBoxActionPerformed
        // TODO add your handling code here:
        if(this.lifetimeCheckBox.isSelected()){
            this.warrantyDurationTextField.setText("Lifetime");
            this.durationSlider.setEnabled(false);
            this.noWarrantyCheckBox.setEnabled(false);
        }else{
            this.durationSlider.setEnabled(true);
            this.noWarrantyCheckBox.setEnabled(true);
            this.warrantyDurationTextField.setText(Integer.toString(this.durationSlider.getValue())+ " Days");
            
        }
    }//GEN-LAST:event_lifetimeCheckBoxActionPerformed

    private void noWarrantyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noWarrantyCheckBoxActionPerformed
        // TODO add your handling code here:
        if(this.noWarrantyCheckBox.isSelected()){
            this.warrantyDurationTextField.setText("No Warranty");
            this.durationSlider.setEnabled(false);
            this.lifetimeCheckBox.setEnabled(false);
        }else{
            this.durationSlider.setEnabled(true);
            this.noWarrantyCheckBox.setEnabled(true);
            this.lifetimeCheckBox.setEnabled(true);
            this.warrantyDurationTextField.setText(Integer.toString(this.durationSlider.getValue())+ " Days");
        }
    }//GEN-LAST:event_noWarrantyCheckBoxActionPerformed

    private void durationSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_durationSliderStateChanged
        // TODO add your handling code here:
        this.warrantyDurationTextField.setText(Integer.toString(this.durationSlider.getValue()) + " Days");
    }//GEN-LAST:event_durationSliderStateChanged

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
            java.util.logging.Logger.getLogger(ModificationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificationWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrUpdateButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel costLabel;
    private javax.swing.JTextField costTextField;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JLabel datePurchasedLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JSlider durationSlider;
    private javax.swing.JCheckBox lifetimeCheckBox;
    private javax.swing.JCheckBox noWarrantyCheckBox;
    private javax.swing.JLabel partLabel;
    private javax.swing.JTextField partTextField;
    private javax.swing.JLabel warrantyDurationLabel;
    private javax.swing.JTextField warrantyDurationTextField;
    // End of variables declaration//GEN-END:variables
}