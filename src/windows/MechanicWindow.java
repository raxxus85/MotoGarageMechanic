/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import informationwindows.DialogType;
import objectmodels.Mechanic;
import engine.MotoLogEngine;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import objectmodels.Attachment;

/**
 *
 * @author Mark
 */
public class MechanicWindow extends javax.swing.JDialog {
    private MotoLogEngine motoLogEngine;
    private ImageIcon imageIcon;
    private boolean updateMechanic = false;
    private Mechanic currentMechanic;
    
    /**
     * Creates new form MechanicWindow
     */
    public MechanicWindow() {
        initComponents();
    }
    
    /**
     * Creates new form MechanicWindow for CREATING Mechanic
     * @param parent
     * @param incomingMotoGarageMechanicEngine
     */
    public MechanicWindow(java.awt.Frame parent,boolean modal, MotoLogEngine incomingMotoLogEngine) {
        super(parent, modal);
        this.motoLogEngine = incomingMotoLogEngine;
        initComponents();
        this.setIcon();
        this.createOrUpdateMechanicButton.setText("Create Mechanic");
        this.setTitle("Create Mechanic");
        //this.setLocationRelativeTo(parent);
    }
    
    /**
     * Creates new form MechanicWindow for UPDATING Mechanic
     */
    public MechanicWindow(java.awt.Frame parent,boolean modal, MotoLogEngine incomingMotoGarageMechanicEngine, Mechanic incomingMechanic) {
        super(parent, modal);
        this.currentMechanic = incomingMechanic;
        this.motoLogEngine = incomingMotoGarageMechanicEngine;
        initComponents();
        this.setIcon();
        this.createOrUpdateMechanicButton.setText("Update Mechanic");
        this.setTitle("Update Mechanic");
        this.updateMechanic = true;
        //this.setLocationRelativeTo(parent);
        
        this.mechanicFirstNameTextField.setText(incomingMechanic.getFirstName());
        this.mechanicMiddleNameTextField.setText(incomingMechanic.getMiddleName());
        this.mechanicLastNameTextField.setText(incomingMechanic.getLastName());
        this.mechanicDescriptionTextArea.setText(incomingMechanic.getDescription());
        if(incomingMechanic.getImageIcon()!=null){
            
            ImageIcon imageIcon = incomingMechanic.getImageIcon(); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg);  // transform it back
                //this.customerPictureLabel.setIcon(imageIcon);
            this.imageIcon=imageIcon;
            this.mechanicPictureLabel.setIcon(imageIcon);
            
            // OLD OLD 
            //this.mechanicPictureLabel.setIcon(incomingMechanic.getImageIcon());
            //this.imageIcon=incomingMechanic.getImageIcon();
        } 
        
    }
    
    private void setIcon(){
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MGFavicon.png")));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(this.motoLogEngine.getMotoLogIcon())));
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/mechanicIcon.png")));
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createOrUpdateMechanicButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        ImageIcon test = new javax.swing.ImageIcon(getClass().getResource("/MGLogoTrans2.png"));
        jPanel2 = new ImagePanel(test.getImage());
        jPanel1 = new javax.swing.JPanel();
        mechanicPictureLabel = new javax.swing.JLabel();
        newMechanicFirstNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mechanicLastNameLabel = new javax.swing.JLabel();
        mechanicFirstNameTextField = new javax.swing.JTextField();
        mechanicMiddleNameTextField = new javax.swing.JTextField();
        mechanicLastNameTextField = new javax.swing.JTextField();
        mechanicDescriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mechanicDescriptionTextArea = new javax.swing.JTextArea();
        openMechanicPictureButton = new javax.swing.JButton();
        clearPictureButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Mechanic");
        setResizable(false);

        createOrUpdateMechanicButton.setText("Create or Update Mechanic");
        createOrUpdateMechanicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrUpdateMechanicButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Mechanic Picture"));

        mechanicPictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noImage.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mechanicPictureLabel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(mechanicPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        newMechanicFirstNameLabel.setText("First Name");

        jLabel2.setText("Middle Name");

        mechanicLastNameLabel.setText("Last Name");

        mechanicLastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mechanicLastNameTextFieldActionPerformed(evt);
            }
        });

        mechanicDescriptionLabel.setText("Description");

        mechanicDescriptionTextArea.setColumns(20);
        mechanicDescriptionTextArea.setRows(5);
        mechanicDescriptionTextArea.setLineWrap(true);
        jScrollPane1.setViewportView(mechanicDescriptionTextArea);

        openMechanicPictureButton.setText("Open");
        openMechanicPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMechanicPictureButtonActionPerformed(evt);
            }
        });

        clearPictureButton.setText("Clear");
        clearPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPictureButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(openMechanicPictureButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearPictureButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newMechanicFirstNameLabel)
                            .addComponent(jLabel2)
                            .addComponent(mechanicLastNameLabel)
                            .addComponent(mechanicDescriptionLabel))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mechanicFirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addComponent(mechanicMiddleNameTextField)
                                .addComponent(mechanicLastNameTextField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newMechanicFirstNameLabel)
                            .addComponent(mechanicFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(mechanicMiddleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mechanicLastNameLabel)
                            .addComponent(mechanicLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mechanicDescriptionLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearPictureButton)
                            .addComponent(openMechanicPictureButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createOrUpdateMechanicButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createOrUpdateMechanicButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method used when a user presses the Cancel button
     * @param evt 
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // Dispose of the Window, as the user has pressed cancel
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Method used when user hits "Create Mechanic" button
     * <li> Checks to ensure user actually entered text for FName,MName,LName
     * 
     * @param evt 
     */
    private void createOrUpdateMechanicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrUpdateMechanicButtonActionPerformed
        // General Checks Here
        // Must have First Name, Middle Name, Last Name
        String incomingFirstName = this.mechanicFirstNameTextField.getText();
        String incomingMiddleInitial = this.mechanicMiddleNameTextField.getText();
        String incomingLastName = this.mechanicLastNameTextField.getText();
        String incomingDescription = this.mechanicDescriptionTextArea.getText();
        
        if(this.mechanicFirstNameTextField.getText().equals("") || this.mechanicMiddleNameTextField.getText().equals("") || this.mechanicLastNameTextField.getText().equals("")){
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "A Mechanic requires a first, middle, and last name! Please enter them and try again.");
                return;
        }
        Mechanic newMechanic = new Mechanic(incomingFirstName,incomingMiddleInitial,incomingLastName,incomingDescription);
        if(this.imageIcon!=null){
                newMechanic.setImageIcon(imageIcon);
        }
        
        // DECIDE IF CREATING OR UPDATING MECHANIC
        // CREATING MECHANIC
        if(!this.updateMechanic){            
            boolean mechanicCreated = this.motoLogEngine.createNewMechanic(newMechanic);
            if(mechanicCreated){
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "Mechanic, " + newMechanic.toString() + ", created successfully!");
            } else{
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "Can not create a Mechanic with that name!");
            }
            this.dispose();
        }else if(this.updateMechanic){
            boolean mechanicUpdated = this.motoLogEngine.updateMechanic(newMechanic);
            if(mechanicUpdated){
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "Mechanic, " + newMechanic.toString() + ", updated successfully!");
            } else{
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "Can not update a Mechanic with that name!");
            }
            this.dispose();
        }
    }//GEN-LAST:event_createOrUpdateMechanicButtonActionPerformed

    private void mechanicLastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mechanicLastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mechanicLastNameTextFieldActionPerformed

    private void openMechanicPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMechanicPictureButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
       
        
        
        File testFile = chooser.getSelectedFile();
        String filePath="";
        if(testFile != null){
            filePath = testFile.getAbsolutePath();
            try {
                BufferedImage myPicture=null;
                try {
                    myPicture = ImageIO.read(new File(filePath));
                } catch (IOException ex) {
                Logger.getLogger(MechanicWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Time to transform!
                ImageIcon icon = new ImageIcon(myPicture);                 
                Image image = icon.getImage(); // transform it 
                Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                this.imageIcon = new ImageIcon(newimg);  // transform it back
                this.mechanicPictureLabel.setIcon(imageIcon);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_openMechanicPictureButtonActionPerformed

    private void clearPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPictureButtonActionPerformed
        // TODO add your handling code here:
        this.imageIcon=null;
        mechanicPictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noImage.png"))); // NOI18N

    }//GEN-LAST:event_clearPictureButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MechanicWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MechanicWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MechanicWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MechanicWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MechanicWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearPictureButton;
    private javax.swing.JButton createOrUpdateMechanicButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mechanicDescriptionLabel;
    private javax.swing.JTextArea mechanicDescriptionTextArea;
    private javax.swing.JTextField mechanicFirstNameTextField;
    private javax.swing.JLabel mechanicLastNameLabel;
    private javax.swing.JTextField mechanicLastNameTextField;
    private javax.swing.JTextField mechanicMiddleNameTextField;
    private javax.swing.JLabel mechanicPictureLabel;
    private javax.swing.JLabel newMechanicFirstNameLabel;
    private javax.swing.JButton openMechanicPictureButton;
    // End of variables declaration//GEN-END:variables
}
