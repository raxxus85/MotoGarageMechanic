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
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import objectmodels.Customer;

/**
 *
 * @author Mark
 */
public class CustomerWindow extends JDialog {
    private MotoLogEngine motoLogEngine;
    private ImageIcon imageIcon;
    private boolean updateCustomer = false;
    /**
     * Creates new form CustomerWindow
     */
    public CustomerWindow(Component incomingParent) {
        this.setLocationRelativeTo(incomingParent);
        initComponents();
    }
    
    /**
     * Main constructor, used when creating Customer
     * @param incomingMotoGarageMechanicEngine 
     */
    public CustomerWindow(java.awt.Frame parent,boolean modal,MotoLogEngine incomingMotoGarageMechanicEngine) {
        super(parent, modal);
        this.motoLogEngine = incomingMotoGarageMechanicEngine;
        initComponents();
        this.setIcon();
        this.createOrUpdateCustomerButton.setText("Create Customer");
        this.setTitle("Create Customer");
    }
    
     /**
     * Main constructor, used when updating Customer
     * @param incomingMotoGarageMechanicEngine 
     */
    public CustomerWindow(java.awt.Frame parent,boolean modal,MotoLogEngine incomingMotoGarageMechanicEngine, Customer incomingCustomer) {
        super(parent, modal);
        this.motoLogEngine = incomingMotoGarageMechanicEngine;
        initComponents();
        //this.setLocationRelativeTo(incomingParent);
        this.setIcon();
        this.createOrUpdateCustomerButton.setText("Update Customer");
        this.setTitle("Update Customer");
        this.updateCustomer = true;
        
        this.customerFirstNameTextField.setText(incomingCustomer.getFirstName());
        this.customerMiddleNameTextField.setText(incomingCustomer.getMiddleName());
        this.customerLastNameTextField.setText(incomingCustomer.getLastName());
        this.customerDescriptionTextArea.setText(incomingCustomer.getDescription());
        if(incomingCustomer.getImageIcon()!=null){
            ImageIcon imageIcon = incomingCustomer.getImageIcon(); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg);  // transform it back
            this.imageIcon=imageIcon;
            this.customerPictureLabel.setIcon(imageIcon);       
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

        createOrUpdateCustomerButton = new javax.swing.JButton();
        newCustomerCancelButton = new javax.swing.JButton();
        ImageIcon test = new javax.swing.ImageIcon(getClass().getResource("/MGLogoTrans2.png"));
        jPanel2 = new ImagePanel(test.getImage());
        customerFirstNameTextField = new javax.swing.JTextField();
        customerMiddleNameTextField = new javax.swing.JTextField();
        customerLastNameTextField = new javax.swing.JTextField();
        customerFirstNameLabel = new javax.swing.JLabel();
        customerMiddleNameLabel = new javax.swing.JLabel();
        customerLastNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerDescriptionTextArea = new javax.swing.JTextArea();
        customerDescriptionLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        customerPictureLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        openPictureButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        createOrUpdateCustomerButton.setText("Create Customer");
        createOrUpdateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrUpdateCustomerButtonActionPerformed(evt);
            }
        });

        newCustomerCancelButton.setText("Cancel");
        newCustomerCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustomerCancelButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        customerFirstNameLabel.setText("First Name");

        customerMiddleNameLabel.setText("Middle Name");

        customerLastNameLabel.setText("Last Name");

        customerDescriptionTextArea.setColumns(20);
        customerDescriptionTextArea.setRows(5);
        customerDescriptionTextArea.setLineWrap(true);
        jScrollPane1.setViewportView(customerDescriptionTextArea);

        customerDescriptionLabel.setText("Description");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Customer Picture"));

        customerPictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noImage.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(customerPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(customerPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        openPictureButton.setText("Open");
        openPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openPictureButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clearButton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerFirstNameLabel)
                            .addComponent(customerMiddleNameLabel)
                            .addComponent(customerLastNameLabel)
                            .addComponent(customerDescriptionLabel))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(customerMiddleNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(customerFirstNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(customerLastNameTextField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(openPictureButton)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerFirstNameLabel)
                            .addComponent(customerFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerMiddleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerMiddleNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerLastNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(customerDescriptionLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearButton)
                            .addComponent(openPictureButton))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(createOrUpdateCustomerButton)
                        .addGap(91, 91, 91)
                        .addComponent(newCustomerCancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createOrUpdateCustomerButton)
                    .addComponent(newCustomerCancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newCustomerCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustomerCancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_newCustomerCancelButtonActionPerformed

    private void createOrUpdateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrUpdateCustomerButtonActionPerformed
        // Basic Checks here
        String incomingFirstName = this.customerFirstNameTextField.getText();
        String incomingMiddleInitial = this.customerMiddleNameTextField.getText();
        String incomingLastName = this.customerLastNameTextField.getText();
        String incomingDescription = this.customerDescriptionTextArea.getText();
        if(this.customerFirstNameTextField.getText().equals("") || this.customerMiddleNameTextField.getText().equals("") || this.customerLastNameTextField.getText().equals("")){
            this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "A Customer requires a first, middle, and last name! Please enter them and try again.");
            return;
        }
        Customer newCustomer = new Customer(incomingFirstName,incomingMiddleInitial,incomingLastName,incomingDescription);
        if(this.imageIcon!=null){
            newCustomer.setImageIcon(imageIcon);
        }
        // DECIDE IF CREATING OR UPDATING CUSTOMER
        // CREATING CUSTOMER
        if(!this.updateCustomer){
        boolean customerCreated = this.motoLogEngine.createNewCustomer(newCustomer);

        if(customerCreated){
            this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "Customer, " + newCustomer.toString() + ", created successfully!");
        } else{
            this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "Can not create a Customer with that name!");
        }
        this.dispose();
        } else if(this.updateCustomer){
            // UPDATING CUSTOMER HERE
            if(this.imageIcon!=null){
                newCustomer.setImageIcon(imageIcon);
            }
            System.out.println("attempting to update with " + newCustomer.toString());
            boolean customerUpdated = this.motoLogEngine.updateCustomer(newCustomer);
            if(customerUpdated){
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "Customer, " + newCustomer.toString() + ", updated successfully!");
            } else{
                this.motoLogEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "Can not updated a Customer with that name!");
            }
            this.dispose();
        }
    }//GEN-LAST:event_createOrUpdateCustomerButtonActionPerformed

    private void openPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openPictureButtonActionPerformed
        // TODO add your handling code here:
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
                this.customerPictureLabel.setIcon(imageIcon);
                
                
                
                
                //old
                //ImageIcon icon = new ImageIcon(myPicture); 
                //this.customerPictureLabel.setIcon(icon);
                // set the class imageIcon to this now for absorbtion
                //this.imageIcon = icon;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_openPictureButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        this.imageIcon=null;
        customerPictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noImage.png"))); // NOI18N
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CustomerWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton createOrUpdateCustomerButton;
    private javax.swing.JLabel customerDescriptionLabel;
    private javax.swing.JTextArea customerDescriptionTextArea;
    private javax.swing.JLabel customerFirstNameLabel;
    private javax.swing.JTextField customerFirstNameTextField;
    private javax.swing.JLabel customerLastNameLabel;
    private javax.swing.JTextField customerLastNameTextField;
    private javax.swing.JLabel customerMiddleNameLabel;
    private javax.swing.JTextField customerMiddleNameTextField;
    private javax.swing.JLabel customerPictureLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newCustomerCancelButton;
    private javax.swing.JButton openPictureButton;
    // End of variables declaration//GEN-END:variables
}
