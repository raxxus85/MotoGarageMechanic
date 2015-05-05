/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import informationwindows.DialogType;
import objectmodels.Mechanic;
import engine.MotoGarageNotebookEngine;
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
public class MechanicWindow extends javax.swing.JFrame {
    private MotoGarageNotebookEngine motoGarageMechanicEngine;
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
    public MechanicWindow(Component parent, MotoGarageNotebookEngine incomingMotoGarageMechanicEngine) {
        this.motoGarageMechanicEngine = incomingMotoGarageMechanicEngine;
        initComponents();
        this.setIcon();
        this.createOrUpdateMechanicButton.setText("Create Mechanic");
        this.setTitle("Create Mechanic");
        this.setLocationRelativeTo(parent);
    }
    
    /**
     * Creates new form MechanicWindow for UPDATING Mechanic
     */
    public MechanicWindow(Component parent, MotoGarageNotebookEngine incomingMotoGarageMechanicEngine, Mechanic incomingMechanic) {
        this.currentMechanic = incomingMechanic;
        this.motoGarageMechanicEngine = incomingMotoGarageMechanicEngine;
        initComponents();
        this.setIcon();
        this.createOrUpdateMechanicButton.setText("Update Mechanic");
        this.setTitle("Update Mechanic");
        this.updateMechanic = true;
        this.setLocationRelativeTo(parent);
        
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
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MGFavicon.png")));
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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        mechanicPictureLabel = new javax.swing.JLabel();
        openMechanicPictureButton = new javax.swing.JButton();
        clearPictureButton = new javax.swing.JButton();
        newMechanicFirstNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mechanicLastNameLabel = new javax.swing.JLabel();
        mechanicFirstNameTextField = new javax.swing.JTextField();
        mechanicMiddleNameTextField = new javax.swing.JTextField();
        mechanicLastNameTextField = new javax.swing.JTextField();
        mechanicDescriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mechanicDescriptionTextArea = new javax.swing.JTextArea();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(openMechanicPictureButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearPictureButton))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mechanicPictureLabel))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(mechanicPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openMechanicPictureButton)
                    .addComponent(clearPictureButton))
                .addGap(0, 11, Short.MAX_VALUE))
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
        jScrollPane1.setViewportView(mechanicDescriptionTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mechanicFirstNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mechanicMiddleNameTextField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newMechanicFirstNameLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mechanicLastNameLabel)
                                .addGap(20, 20, 20)
                                .addComponent(mechanicLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mechanicDescriptionLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newMechanicFirstNameLabel)
                            .addComponent(mechanicFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(mechanicMiddleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mechanicLastNameLabel)
                            .addComponent(mechanicLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mechanicDescriptionLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(createOrUpdateMechanicButton)
                        .addGap(64, 64, 64)
                        .addComponent(cancelButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createOrUpdateMechanicButton)
                    .addComponent(cancelButton)))
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
                this.motoGarageMechanicEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "A Mechanic requires a first, middle, and last name! Please enter them and try again.");
                return;
        }
        Mechanic newMechanic = new Mechanic(incomingFirstName,incomingMiddleInitial,incomingLastName,incomingDescription);
        if(this.imageIcon!=null){
                newMechanic.setImageIcon(imageIcon);
        }
        
        // DECIDE IF CREATING OR UPDATING MECHANIC
        // CREATING MECHANIC
        if(!this.updateMechanic){            
            boolean mechanicCreated = this.motoGarageMechanicEngine.createNewMechanic(newMechanic);
            if(mechanicCreated){
                this.motoGarageMechanicEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "Mechanic, " + newMechanic.toString() + ", created successfully!");
            } else{
                this.motoGarageMechanicEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "Can not create a Mechanic with that name!");
            }
            this.dispose();
        }else if(this.updateMechanic){
            boolean mechanicUpdated = this.motoGarageMechanicEngine.updateMechanic(newMechanic);
            if(mechanicUpdated){
                this.motoGarageMechanicEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "Mechanic, " + newMechanic.toString() + ", updated successfully!");
            } else{
                this.motoGarageMechanicEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "Can not update a Mechanic with that name!");
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
