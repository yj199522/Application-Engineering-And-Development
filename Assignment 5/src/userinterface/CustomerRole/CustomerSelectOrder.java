/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Orders.Order;
import Business.Orders.OrderDirectory;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashj
 */
public class CustomerSelectOrder extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    DefaultTableModel model;
    DefaultTableModel model1;

    Restaurant restaurant;
    private String selectedItem;
    private String selectedPrice;
    private String removeItem;
    private OrderDirectory orderDirectory;

    /**
     * Creates new form CustomerSelectOrder
     */
    public CustomerSelectOrder(JPanel userProcessContainer, UserAccount account, EcoSystem system, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.restaurant = restaurant;
        ecosystem = system;
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        menuTable.setModel(model);
        cartTable.setModel(model1);
        model.addColumn("Item");
        model.addColumn("Price");
        model1.addColumn("Item");
        model1.addColumn("Price");
        model1.addColumn("Quantity");
        restNameText.setText(restaurant.getName());
        orderDirectory = new OrderDirectory();
        showMenuTable();
        showCartTable();
    }

    public void showCartTable() {
        if (orderDirectory.getOrderList().size() > 0) {
            for (int i = 0; i < orderDirectory.getOrderList().size(); i++) {
                model1.addRow(new Object[]{
                    orderDirectory.getOrderList().get(i).getItem(),
                    orderDirectory.getOrderList().get(i).getPrice(),
                    orderDirectory.getOrderList().get(i).getQuantity()
                });
            }
        }
    }

    public void showMenuTable() {
        HashMap<String, String> menu = restaurant.getMenu();
        if (menu.size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                model.addRow(new Object[]{
                    e.getKey(),
                    e.getValue()
                });
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantityText = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        placeButton = new javax.swing.JButton();
        removeFromListBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        removeItemText = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        commentText = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();
        restNameText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 248, 255));
        setForeground(new java.awt.Color(72, 72, 72));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 83, 170));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Items from Menu");

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTable);

        jLabel2.setForeground(new java.awt.Color(72, 72, 72));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Restaurant Name");
        jLabel2.setAutoscrolls(true);

        jLabel3.setForeground(new java.awt.Color(72, 72, 72));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Selected Item");
        jLabel3.setAutoscrolls(true);

        itemText.setEditable(false);
        itemText.setForeground(new java.awt.Color(72, 72, 72));

        jLabel4.setForeground(new java.awt.Color(72, 72, 72));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Quantity");
        jLabel4.setAutoscrolls(true);

        quantityText.setForeground(new java.awt.Color(72, 72, 72));

        AddButton.setBackground(new java.awt.Color(0, 83, 170));
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add Item");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 83, 170));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add to List");
        jButton2.setAutoscrolls(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 83, 170));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Your Cart");

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cartTable);

        btnBack.setBackground(new java.awt.Color(0, 83, 170));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        placeButton.setBackground(new java.awt.Color(0, 83, 170));
        placeButton.setForeground(new java.awt.Color(255, 255, 255));
        placeButton.setText("Place Order");
        placeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeButtonActionPerformed(evt);
            }
        });

        removeFromListBtn.setBackground(new java.awt.Color(0, 83, 170));
        removeFromListBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeFromListBtn.setText("Remove from cart");
        removeFromListBtn.setAutoscrolls(true);
        removeFromListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromListBtnActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(72, 72, 72));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Selected Item");
        jLabel6.setAutoscrolls(true);

        removeItemText.setEditable(false);
        removeItemText.setForeground(new java.awt.Color(72, 72, 72));

        removeButton.setBackground(new java.awt.Color(0, 83, 170));
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(0, 83, 170));
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear Cart");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 83, 170));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add Food Instruction");

        commentText.setColumns(20);
        commentText.setRows(5);
        jScrollPane3.setViewportView(commentText);

        title.setBackground(new java.awt.Color(255, 51, 0));
        title.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 83, 170));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Welcome to Foodie");

        restNameText.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        restNameText.setForeground(new java.awt.Color(72, 72, 72));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeFromListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearButton)
                                .addGap(18, 18, 18)
                                .addComponent(removeButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(removeItemText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(placeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(restNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(restNameText))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(removeFromListBtn)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeItemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeButton)
                            .addComponent(clearButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(AddButton)))
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddButton, btnBack, clearButton, jButton2, placeButton, removeButton, removeFromListBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(menuTable.getSelectedRow() >= 0){
             selectedItem = String.valueOf(model.getValueAt(menuTable.getSelectedRow(), 0));
            selectedPrice = String.valueOf(model.getValueAt(menuTable.getSelectedRow(), 1));
            itemText.setText(selectedItem);
        }else{
        JOptionPane.showMessageDialog(this, "Kindly select item from the item table","Error message", JOptionPane.ERROR_MESSAGE);
        return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        if(itemText.getText().isEmpty() ||  quantityText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kindly select item and add quantity","Error message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        orderDirectory.createOrder(selectedItem, selectedPrice, Integer.parseInt(quantityText.getText()), restaurant, userAccount);
        model1.addRow(new Object[]{
            selectedItem,
            selectedPrice,
            quantityText.getText()
        });
        itemText.setText("");        
        quantityText.setText("");
        JOptionPane.showMessageDialog(this, "Item added to cart");
    }//GEN-LAST:event_AddButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel sysAdminwjp = (CustomerAreaJPanel) component;
        sysAdminwjp.populateCustomerOrders();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void removeFromListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromListBtnActionPerformed
        // TODO add your handling code here:
        if(cartTable.getSelectedRow()>=0){
            removeItem = String.valueOf(model1.getValueAt(cartTable.getSelectedRow(), 0));
            removeItemText.setText(removeItem);
        }else{
        JOptionPane.showMessageDialog(this, "Kindly select item from the cart table","Error message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeFromListBtnActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        if(removeItemText.getText().isEmpty() || removeItem == null) {
            JOptionPane.showMessageDialog(this, "Kindly select item to remove","Error message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        orderDirectory.deleteOrder(removeItem);
        for (int i = 0; i < cartTable.getRowCount(); i++) {
            if (((String) cartTable.getValueAt(i, 0)).equals(removeItem)) {
                model1.removeRow(i);
            }
        }
        removeItemText.setText("");
        JOptionPane.showMessageDialog(this, "Item removed successfully");
    }//GEN-LAST:event_removeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        orderDirectory.deleteOrderAll();
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        JOptionPane.showMessageDialog(this, "Items removed successfully");

    }//GEN-LAST:event_clearButtonActionPerformed
    
    public Customer findCustomer() {
        for(int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i ++) {
            if(ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }
    
    public void setOrderListRestaurant(Customer cust) {
        for(int i = 0; i < orderDirectory.getOrderList().size(); i ++) {
            restaurant.getOrderList().add(orderDirectory.getOrderList().get(i));           
            cust.getOrderList().add(orderDirectory.getOrderList().get(i));

        }
        restaurant.getOrders().put(String.valueOf(restaurant.getOrders().size()), orderDirectory.getOrderList());
        cust.getOrderDirectoryList().add(orderDirectory);       
        restaurant.getOrderDirectoryList().add(orderDirectory);
    }
    
    
    private void placeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeButtonActionPerformed
        // TODO add your handling code here:
        Customer cust = findCustomer();
        if (commentText.getText() != null)
            orderDirectory.setComment(commentText.getText());
        setOrderListRestaurant(cust);
        commentText.setText("");
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        JOptionPane.showMessageDialog(this, "Placed order successfully");
    }//GEN-LAST:event_placeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextArea commentText;
    private javax.swing.JTextField itemText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton placeButton;
    private javax.swing.JTextField quantityText;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton removeFromListBtn;
    private javax.swing.JTextField removeItemText;
    private javax.swing.JLabel restNameText;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}