/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import engine.MotoLogEngine;
import informationwindows.DialogType;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import objectmodels.Vehicle;
import objectmodels.VehicleModel;
import objectmodels.VehicleType;

/**
 *
 * @author Mark
 */
public class VehicleWindow extends javax.swing.JDialog {
    private MotoLogEngine motoLogEngine;
    private ImageIcon imageIcon;
    boolean updateVehicle = false;
    
    /**
     * Creates new form VehicleWindow
     * NOT USED
     */
    public VehicleWindow() {
        initComponents();
    }
    
    /**
     * Creates new form VehicleWindow, used for creating a Vehicle
     */
    public VehicleWindow(java.awt.Frame parent,boolean modal,MotoLogEngine incomingMotoLogEngine) {
        super(parent, modal);
        this.motoLogEngine = incomingMotoLogEngine;
        initComponents();
        //.this.setLocationRelativeTo(incomingParent);
        this.setIcon();
        this.createOrUpdateVehicleButton.setText("Create Vehicle");
        this.setTitle("Create Vehicle");
    }
    
    /**
     * Creates new form VehicleWindow, used for updating a Vehicle
     */
    public VehicleWindow(java.awt.Frame parent,boolean modal,MotoLogEngine incomingMotoGarageMechanicEngine,Vehicle incomingVehicle) {
        super(parent, modal);
        this.motoLogEngine = incomingMotoGarageMechanicEngine;
        initComponents();
        //this.setLocationRelativeTo(incomingParent);
        this.setIcon();
        this.createOrUpdateVehicleButton.setText("Update Vehicle");
        this.setTitle("View / Update Vehicle");
        this.updateVehicle = true;
        
        // Vehicle Type
        VehicleModel currentVehicleModel = incomingVehicle.getVehicleModel();
        Object[] testArray = motoLogEngine.getVehicleModelArray();
        DefaultComboBoxModel test1 = new javax.swing.DefaultComboBoxModel<>(testArray);
        this.vehicleModelComboBox.setModel(test1);
        this.vehicleModelComboBox.setSelectedItem(currentVehicleModel);
        
        this.vehicleYearTextField.setText(incomingVehicle.getYear().toString());
        this.vehicleColorTextField.setText(incomingVehicle.getColor());
        this.vehicleVINTextField.setText(incomingVehicle.getVIN());
        this.vehicleOdometerTextField.setText(incomingVehicle.getOdometer().toString());
        this.vehicleDescriptionTextArea.setText(incomingVehicle.getDescription());
        if(incomingVehicle.getImageIcon()!=null){
            ImageIcon imageIcon = incomingVehicle.getImageIcon(); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg);  // transform it back
            this.imageIcon=imageIcon;
            this.vehiclePictureLabel.setIcon(imageIcon);
        }else{
            if(incomingVehicle.getVehicleModel().getVehicleType().equals(VehicleType.CARORTRUCK)){
                vehiclePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noCar100x100.png"))); // NOI18N
            }else{
                vehiclePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noMotorcycle100x100.png"))); // NOI18N
            }
        }
        
    }
    
    private void setIcon(){
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/mechanicIcon.png")));
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MGFavicon.png")));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(this.motoLogEngine.getMotoLogIcon())));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createOrUpdateVehicleButton = new javax.swing.JButton();
        newVehicleCancelButton = new javax.swing.JButton();
        ImageIcon test = new javax.swing.ImageIcon(getClass().getResource("/MGLogoTrans2.png"));
        jPanel2 = new ImagePanel(test.getImage());
        vehicleYearTextField = new javax.swing.JTextField();
        vehicleColorTextField = new javax.swing.JTextField();
        vehicleVINTextField = new javax.swing.JTextField();
        vehicleOdometerTextField = new javax.swing.JTextField();
        vehicleYearLabel = new javax.swing.JLabel();
        vehicleColorLabel = new javax.swing.JLabel();
        vehicleVinLabel = new javax.swing.JLabel();
        vehicleOdometerLabel = new javax.swing.JLabel();
        vehicleDescriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleDescriptionTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        vehiclePictureLabel = new javax.swing.JLabel();
        openPictureButton = new javax.swing.JButton();
        clearPictureButton = new javax.swing.JButton();
        vehicleModelComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        createOrUpdateVehicleButton.setText("Create Vehicle");
        createOrUpdateVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrUpdateVehicleButtonActionPerformed(evt);
            }
        });

        newVehicleCancelButton.setText("Cancel");
        newVehicleCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newVehicleCancelButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        vehicleYearLabel.setText("Year");

        vehicleColorLabel.setText("Color");

        vehicleVinLabel.setText("VIN");

        vehicleOdometerLabel.setText("Odometer");

        vehicleDescriptionLabel.setText("Description");

        vehicleDescriptionTextArea.setColumns(20);
        vehicleDescriptionTextArea.setRows(5);
        vehicleDescriptionTextArea.setWrapStyleWord(true);
        vehicleDescriptionTextArea.setLineWrap(true);
        jScrollPane1.setViewportView(vehicleDescriptionTextArea);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Vehicle Picture"));

        vehiclePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noMotorcycle100x100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vehiclePictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vehiclePictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        openPictureButton.setText("Open");
        openPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openPictureButtonActionPerformed(evt);
            }
        });

        clearPictureButton.setText("Clear");
        clearPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPictureButtonActionPerformed(evt);
            }
        });

        vehicleModelComboBox.setModel(new javax.swing.DefaultComboBoxModel(this.motoLogEngine.getVehicleModelArray()));
        vehicleModelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleModelComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Make and Model");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehicleYearLabel)
                    .addComponent(vehicleColorLabel)
                    .addComponent(vehicleVinLabel)
                    .addComponent(vehicleOdometerLabel)
                    .addComponent(vehicleDescriptionLabel)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(vehicleOdometerTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehicleVINTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehicleColorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehicleYearTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(vehicleModelComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(openPictureButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearPictureButton)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleModelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehicleYearLabel)
                            .addComponent(vehicleYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehicleColorLabel))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleVINTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehicleVinLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleOdometerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehicleOdometerLabel)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clearPictureButton)
                        .addComponent(openPictureButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleDescriptionLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(createOrUpdateVehicleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newVehicleCancelButton)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newVehicleCancelButton)
                    .addComponent(createOrUpdateVehicleButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newVehicleCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newVehicleCancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_newVehicleCancelButtonActionPerformed

    private void createOrUpdateVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrUpdateVehicleButtonActionPerformed
        // TODO add your handling code here:
        Integer newVehicleYear;
        Integer newVehicleOdometer;
        // check to ensure at least the make, model, and year are ENTERED and accurate
        //String newVehicleMake = this.vehicleMakeTextField.getText();
        //String newVehicleModel = this.vehicleModelTextField.getText();
        String newVehicleColor = this.vehicleColorTextField.getText();
        String newVehicleVIN = this.vehicleVINTextField.getText();
        
        String newVehicleDescription = this.vehicleDescriptionTextArea.getText();
        // MUST HAVE AT LEAST A MAKE AND MODEL

//        if(newVehicleMake.equals("")||newVehicleModel.equals("")){
//            this.motoGarageNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.WARNING_MESSAGE, "You must specify a Make, Model and Year before creating a Vehicle!");
//            //if(newVehicleYear
//            return;
//        }
        
        // now try the year
        try{
            newVehicleYear = Integer.parseInt(this.vehicleYearTextField.getText());
            newVehicleOdometer = Integer.parseInt(this.vehicleOdometerTextField.getText());
        }catch(NumberFormatException ex){
            this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.WARNING_MESSAGE, "The Vehicle Year must be an Integer(ie 1997)!");
            return;
        }
        VehicleModel selectedVehicleModel = (VehicleModel)this.vehicleModelComboBox.getSelectedItem();
        Vehicle newVehicle = new Vehicle(selectedVehicleModel,newVehicleYear,newVehicleColor, newVehicleVIN,newVehicleOdometer,newVehicleDescription);
        if(this.imageIcon!=null){
            newVehicle.setImageIcon(imageIcon);
        }
        // if updating...
        if(this.updateVehicle){
            boolean vehicleUpdated = this.motoLogEngine.updateVehicle(newVehicle);
            if(vehicleUpdated){
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "The Vehicle, " + newVehicle.toString() +", has been updated!");
            }else{
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.WARNING_MESSAGE, "The Vehicle was not updated!");
            }
            this.dispose();
        }else{ // creating...
            boolean vehicleCreated = this.motoLogEngine.createNewVehicle(newVehicle);
            if(vehicleCreated){
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "The Vehicle, " + newVehicle.toString() +", has been created!");
            }else{
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.WARNING_MESSAGE, "The Vehicle was not created!");
            }
            this.dispose();  
        }
          

    }//GEN-LAST:event_createOrUpdateVehicleButtonActionPerformed

    private void openPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openPictureButtonActionPerformed
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
                this.vehiclePictureLabel.setIcon(imageIcon);
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_openPictureButtonActionPerformed

    private void clearPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPictureButtonActionPerformed
        // TODO add your handling code here:
        this.imageIcon=null;
        //vehiclePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noMotorcycle100x100.png"))); // NOI18N
        VehicleModel vehicleModel = null;
        vehicleModel = (VehicleModel)this.vehicleModelComboBox.getSelectedItem();
        if(vehicleModel.getVehicleType().equals(VehicleType.CARORTRUCK)){
            this.vehiclePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noCar100x100.png")));
        }else{
            this.vehiclePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noMotorcycle100x100.png")));
        }
    }//GEN-LAST:event_clearPictureButtonActionPerformed

    private void vehicleModelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleModelComboBoxActionPerformed
        // TODO add your handling code here:
        VehicleModel vehicleModel = null;
        vehicleModel = (VehicleModel)this.vehicleModelComboBox.getSelectedItem();
        if(vehicleModel.getVehicleType().equals(VehicleType.CARORTRUCK)){
            this.vehiclePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noCar100x100.png")));
        }else{
            this.vehiclePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noMotorcycle100x100.png")));
        }
    }//GEN-LAST:event_vehicleModelComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(VehicleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearPictureButton;
    private javax.swing.JButton createOrUpdateVehicleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newVehicleCancelButton;
    private javax.swing.JButton openPictureButton;
    private javax.swing.JLabel vehicleColorLabel;
    private javax.swing.JTextField vehicleColorTextField;
    private javax.swing.JLabel vehicleDescriptionLabel;
    private javax.swing.JTextArea vehicleDescriptionTextArea;
    private javax.swing.JComboBox vehicleModelComboBox;
    private javax.swing.JLabel vehicleOdometerLabel;
    private javax.swing.JTextField vehicleOdometerTextField;
    private javax.swing.JLabel vehiclePictureLabel;
    private javax.swing.JTextField vehicleVINTextField;
    private javax.swing.JLabel vehicleVinLabel;
    private javax.swing.JLabel vehicleYearLabel;
    private javax.swing.JTextField vehicleYearTextField;
    // End of variables declaration//GEN-END:variables
}
