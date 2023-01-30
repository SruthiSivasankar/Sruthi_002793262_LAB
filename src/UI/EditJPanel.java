/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Customer;
import Model.DeliveryPackage;
import Model.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sruthisivasankar
 */
public class EditJPanel extends javax.swing.JPanel {
    
    private DeliveryPackage delPackage;
    private Product productViewed;

    /**
     * Creates new form EditJPanel
     */
    public EditJPanel() {
        initComponents();
    }
    
    EditJPanel(DeliveryPackage deliveryPackage) {
        initComponents();

        this.delPackage = deliveryPackage;

        displayProductList();
        
        displayPackageDetails();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        packageId = new javax.swing.JTextField();
        packageWt = new javax.swing.JTextField();
        custName1 = new javax.swing.JTextField();
        custId = new javax.swing.JTextField();
        productId1 = new javax.swing.JTextField();
        productName1 = new javax.swing.JTextField();
        productPrice1 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        productComboBox = new javax.swing.JComboBox();

        packageId.setText("jTextField1");

        packageWt.setText("jTextField1");

        custName1.setText("jTextField1");

        custId.setText("jTextField1");

        productId1.setText("jTextField1");

        productName1.setText("jTextField1");

        productPrice1.setText("jTextField1");

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnUpdateProduct.setText("UPDATE PRODUCT");
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });

        btnShow.setText("SHOW");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        jLabel1.setText("Package Id");

        jLabel2.setText("Package Weight");

        jLabel3.setText("Customer Name");

        jLabel4.setText("ID");

        jLabel5.setText("Product Id");

        jLabel6.setText("Product Name");

        jLabel7.setText("Product Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(96, 96, 96)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productPrice1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(productName1)
                            .addComponent(productId1)
                            .addComponent(packageId)
                            .addComponent(packageWt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custName1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(custId))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnShow)
                            .addComponent(btnUpdateProduct))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageWt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShow)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateProduct)
                    .addComponent(jLabel7))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String id = packageId.getText();
        String weight = packageWt.getText();
//        String productId = productId1.getText();
//        String productName = productName1.getText();
//        String productPrice = productPrice1.getText();
        String customerId = custId.getText();
        String customername = custName1.getText();

        // store the data
        this.delPackage.setPackageId(Integer.valueOf(id));
        this.delPackage.setPackageWeight(Double.valueOf(weight));

        Customer customer = this.delPackage.getCustomer();
        customer.setCustomerId(Integer.valueOf(customerId));
        customer.setFullName(customername);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        // to disable the field
        productId1.setEnabled(false);
        
        int pid = (int) productComboBox.getSelectedItem();

        // find the product in the arraylsit
        Product prod = this.delPackage.findProduct(pid);
         this.productViewed = prod;
        // display the product content

        if (!prod.equals(null)) {
            productId1.setText(String.valueOf(pid));
            productName1.setText(prod.getProductName());
            productPrice1.setText(String.valueOf(prod.getPrice()));
        } else {
            JOptionPane.showMessageDialog(null, "Product not found");
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        // TODO add your handling code here:
        this.productViewed.setProductName(productName1.getText());
        this.productViewed.setPrice(Double.valueOf(productPrice1.getText()));
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    public void displayProductList() {

      for(Product p : this.delPackage.getProductList()){
          productComboBox.addItem(p.getProductId());
      }

    }

    public void displayPackageDetails() {
        packageId.setText(String.valueOf(this.delPackage.getPackageId()));
        packageWt.setText(String.valueOf(this.delPackage.getPackageWeight()));

        Customer customer = this.delPackage.getCustomer();
        custId.setText(String.valueOf(customer.getCustomerId()));
        custName1.setText(customer.getFullName());

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JTextField custId;
    private javax.swing.JTextField custName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField packageId;
    private javax.swing.JTextField packageWt;
    private javax.swing.JComboBox productComboBox;
    private javax.swing.JTextField productId1;
    private javax.swing.JTextField productName1;
    private javax.swing.JTextField productPrice1;
    // End of variables declaration//GEN-END:variables
}