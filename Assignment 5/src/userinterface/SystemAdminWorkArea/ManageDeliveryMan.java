/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashj
 */
public class ManageDeliveryMan extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private static EcoSystem ecosystem;
    private ArrayList<DeliveryMan> delManList = new ArrayList<DeliveryMan>();
    DefaultTableModel model;

    /**
     * Creates new form ManageDeliveryMan
     */
    public ManageDeliveryMan(JPanel userProcessContainer1, EcoSystem system) {
        initComponents();
        userProcessContainer = userProcessContainer1;
        ecosystem = system;
        for (int i = 0; i < system.getDeliveryManDirectory().getDeliverymanList().size(); i++) {
            delManList.add(system.getDeliveryManDirectory().getDeliverymanList().get(i));
        }
        model = new DefaultTableModel();
        deliveryManListTable.setModel(model);
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("Phone");
        viewDeliveryManList();
        showUpdateList();
    }

    public void viewDeliveryManList() {
        if (delManList.size() > 0) {
            for (int i = 0; i < delManList.size(); i++) {
                model.addRow(new Object[]{
                    delManList.get(i).getName(),
                    delManList.get(i).getAddress(),
                    delManList.get(i).getPhone()
                });
            }
        }
    }

    public void showUpdateList() {
        for (int i = 0; i < delManList.size(); i++) {
            delListCombo.addItem(delManList.get(i).getName());
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

        jLabel5 = new javax.swing.JLabel();
        updateRestManagerLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        usernameText = new javax.swing.JTextField();
        restPwdLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        restPwdText = new javax.swing.JPasswordField();
        phoneText = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        AddressText = new javax.swing.JTextField();
        addManagerButton = new javax.swing.JButton();
        viewLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deliveryManListTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        selectManagerLabel1 = new javax.swing.JLabel();
        delListCombo = new javax.swing.JComboBox<>();
        updateRestManagerLabel1 = new javax.swing.JLabel();
        updateNameText = new javax.swing.JTextField();
        restPwdLabel2 = new javax.swing.JLabel();
        updateUsernameText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        updatePwdText = new javax.swing.JPasswordField();
        phoneLabel1 = new javax.swing.JLabel();
        updatePhoneText = new javax.swing.JTextField();
        addressLabel1 = new javax.swing.JLabel();
        updateAddressText = new javax.swing.JTextField();
        deleteManagerButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 248, 255));
        setForeground(new java.awt.Color(72, 72, 72));

        jLabel5.setBackground(new java.awt.Color(0, 83, 170));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 83, 170));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Delivery Man");

        updateRestManagerLabel.setForeground(new java.awt.Color(72, 72, 72));
        updateRestManagerLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel.setText("Name");

        nameText.setForeground(new java.awt.Color(72, 72, 72));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        usernameText.setForeground(new java.awt.Color(72, 72, 72));

        restPwdLabel1.setForeground(new java.awt.Color(72, 72, 72));
        restPwdLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel1.setText("Username");

        jLabel6.setForeground(new java.awt.Color(72, 72, 72));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Password");

        restPwdText.setForeground(new java.awt.Color(72, 72, 72));

        phoneText.setForeground(new java.awt.Color(72, 72, 72));

        phoneLabel.setForeground(new java.awt.Color(72, 72, 72));
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone");

        addressLabel.setForeground(new java.awt.Color(72, 72, 72));
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel.setText("Address");

        AddressText.setForeground(new java.awt.Color(72, 72, 72));
        AddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTextActionPerformed(evt);
            }
        });

        addManagerButton.setBackground(new java.awt.Color(0, 83, 170));
        addManagerButton.setForeground(new java.awt.Color(255, 255, 255));
        addManagerButton.setText("Add");
        addManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addManagerButtonActionPerformed(evt);
            }
        });

        viewLabel.setBackground(new java.awt.Color(0, 83, 170));
        viewLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        viewLabel.setForeground(new java.awt.Color(0, 83, 170));
        viewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewLabel.setText("View Delivery Man");

        deliveryManListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Phone"
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
        jScrollPane1.setViewportView(deliveryManListTable);

        jLabel8.setBackground(new java.awt.Color(0, 83, 170));
        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 83, 170));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Update / Delete a Delivery Man");

        selectManagerLabel1.setForeground(new java.awt.Color(72, 72, 72));
        selectManagerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        selectManagerLabel1.setText("Select DeliveryMan");

        delListCombo.setForeground(new java.awt.Color(72, 72, 72));
        delListCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        delListCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delListComboActionPerformed(evt);
            }
        });

        updateRestManagerLabel1.setForeground(new java.awt.Color(72, 72, 72));
        updateRestManagerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel1.setText("Name");

        updateNameText.setForeground(new java.awt.Color(72, 72, 72));
        updateNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNameTextActionPerformed(evt);
            }
        });

        restPwdLabel2.setForeground(new java.awt.Color(72, 72, 72));
        restPwdLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel2.setText("Username");

        updateUsernameText.setForeground(new java.awt.Color(72, 72, 72));

        jLabel7.setForeground(new java.awt.Color(72, 72, 72));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Password");

        updatePwdText.setForeground(new java.awt.Color(72, 72, 72));
        updatePwdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePwdTextActionPerformed(evt);
            }
        });

        phoneLabel1.setForeground(new java.awt.Color(72, 72, 72));
        phoneLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel1.setText("Phone");

        updatePhoneText.setForeground(new java.awt.Color(72, 72, 72));
        updatePhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePhoneTextActionPerformed(evt);
            }
        });

        addressLabel1.setForeground(new java.awt.Color(72, 72, 72));
        addressLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel1.setText("Address");

        updateAddressText.setForeground(new java.awt.Color(72, 72, 72));

        deleteManagerButton.setBackground(new java.awt.Color(0, 83, 170));
        deleteManagerButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteManagerButton.setText("Delete");
        deleteManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteManagerButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 83, 170));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 83, 170));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        title.setBackground(new java.awt.Color(255, 51, 0));
        title.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 83, 170));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Welcome to Foodie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(updateRestManagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(restPwdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(phoneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(restPwdText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addressLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(updateAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(restPwdLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(updateUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(phoneLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(updatePhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(updateRestManagerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(selectManagerLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(updatePwdText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(updateNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(delListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addManagerButton, btnBack, deleteManagerButton, updateButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateRestManagerLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectManagerLabel1)
                    .addComponent(delListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restPwdLabel1)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateRestManagerLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(restPwdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restPwdLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel)
                    .addComponent(updatePwdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel1))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteManagerButton))
                .addGap(20, 20, 20)
                .addComponent(viewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addManagerButton, btnBack, deleteManagerButton, updateButton});

    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed
    
    public Boolean validateFields(String username, String address, String phone, String name, char[] pwd) {
        if(username.isEmpty() || phone.isEmpty() || name.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (pwd.length < 8) {
            JOptionPane.showMessageDialog(null,"Password cannot be less than 8","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if(phone.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!phone.matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void addManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addManagerButtonActionPerformed
        // TODO add your handling code here:
        Boolean isValid = validateFields(usernameText.getText(), AddressText.getText(), phoneText.getText(), nameText.getText(), restPwdText.getPassword());
        if (!isValid) {
            return;
        }
        for (int i = 0; i < ecosystem.getUserAccountDirectory().getUserAccountList().size(); i++) {
            if("deliveryManAdmin".equals(ecosystem.getUserAccountDirectory().getUserAccountList().get(i).getRoleName()) && ecosystem.getUserAccountDirectory().getUserAccountList().get(i).getUsername().equals(usernameText.getText())){
                JOptionPane.showMessageDialog(null,"Username Already Present", "Error message" ,JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        char[] ch = restPwdText.getPassword();
        String pwd = new String(ch);
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(nameText.getText());
        UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwd, employee, new DeliverManRole(), "deliveryManAdmin");
        DeliveryMan del = ecosystem.getDeliveryManDirectory().createDeliveryMan(nameText.getText(), ua, phoneText.getText(), AddressText.getText());
        delManList.add(del);
        JOptionPane.showMessageDialog(this, "Delivery man added successfully");
        delListCombo.addItem(nameText.getText());
        model.addRow(new Object[]{
            nameText.getText(),
            AddressText.getText(),
            phoneText.getText()
        });
        nameText.setText("");
        usernameText.setText("");
        restPwdText.setText("");
        phoneText.setText("");
        AddressText.setText("");
    }//GEN-LAST:event_addManagerButtonActionPerformed

    private void delListComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delListComboActionPerformed
        // TODO add your handling code here:
        if (delListCombo.getSelectedItem() != "None") {
            String selectedItem = (String) delListCombo.getSelectedItem();
            for (int i = 0; i < delManList.size(); i++) {
                char[] ch = updatePwdText.getPassword();
                String pwd = new String(ch);
                if (delManList.get(i).getName().equalsIgnoreCase(selectedItem)) {
                    updateUsernameText.setText(delManList.get(i).getAccountDetails().getUsername());
                    updatePwdText.setText(delManList.get(i).getAccountDetails().getPassword());
                    updatePhoneText.setText(delManList.get(i).getPhone());
                    updateNameText.setText(delManList.get(i).getName());
                    updateAddressText.setText(delManList.get(i).getAddress());
                }
            }
        }else{
            updateUsernameText.setText("");
            updatePwdText.setText("");
            updatePhoneText.setText("");
            updateNameText.setText("");
            updateAddressText.setText("");
        }
    }//GEN-LAST:event_delListComboActionPerformed

    private void updateNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNameTextActionPerformed

    private void updatePwdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePwdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePwdTextActionPerformed

    private void deleteManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteManagerButtonActionPerformed
        // TODO add your handling code here:
        boolean flag = false;

        String selectedItem = (String) delListCombo.getSelectedItem();
        delListCombo.getSelectedIndex();
        if(delListCombo.getSelectedItem() == null || delListCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,"Select a value from dropdown","Error message", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!validateFields(updateUsernameText.getText(), updateAddressText.getText(), updatePhoneText.getText(), updateNameText.getText(), updatePwdText.getPassword())) {
            return;
        }
        if (flag == false) {
            Boolean isDeleteUser = ecosystem.getUserAccountDirectory().deleteUser(selectedItem);
            ecosystem.getDeliveryManDirectory().deleteDeliveryMan(selectedItem);

            for (int i = 0; i < deliveryManListTable.getRowCount(); i++) {
                if (((String) deliveryManListTable.getValueAt(i, 0)).equals(selectedItem)) {
                    model.removeRow(i);
                    delListCombo.removeItemAt(i + 1);
                    updateNameText.setText("");
                    updateUsernameText.setText("");
                    updatePwdText.setText("");
                    updatePhoneText.setText("");
                    updateAddressText.setText("");
                }//end of if block
            }
            if (isDeleteUser) {
                JOptionPane.showMessageDialog(this, "Delivery Man deleted successfully");
            }
        }
        reset();
    }//GEN-LAST:event_deleteManagerButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if(delListCombo.getSelectedItem() == null || delListCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,"Select a value from dropdown","Error message", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!validateFields(updateUsernameText.getText(), updateAddressText.getText(), updatePhoneText.getText(), updateNameText.getText(), updatePwdText.getPassword())) {
            return;
        }
        if (delListCombo.getSelectedItem() != null) {
            String selectedItem = (String) delListCombo.getSelectedItem();
            for (int i = 0; i < delManList.size(); i++) {
                char[] ch = updatePwdText.getPassword();
                String pwd = new String(ch);
                if (delManList.get(i).getName().equalsIgnoreCase(selectedItem)) {
                    delManList.get(i).setAddress(updateAddressText.getText());
                    delManList.get(i).setPhone(updatePhoneText.getText());
                    delManList.get(i).getAccountDetails().setPassword(pwd);
                    delManList.get(i).setName(updateNameText.getText());
                    delManList.get(i).getAccountDetails().setUsername(updateUsernameText.getText());
                    JOptionPane.showMessageDialog(this, "Delivery Man updated successfully");
                }
            }
        }
        String selectedItem = (String) delListCombo.getSelectedItem();
        delListCombo.getSelectedIndex();
        for (int i = 0; i < deliveryManListTable.getRowCount(); i++) {
            if (((String) deliveryManListTable.getValueAt(i, 0)).equals(selectedItem)) {
                delListCombo.addItem(updateNameText.getText());
                model.addRow(new Object[]{
                    updateNameText.getText(),
                    updateAddressText.getText(),
                    updatePhoneText.getText()
                });
                model.removeRow(i);
                delListCombo.removeItemAt(i + 1);

            }//end of if block
        }
        reset();
    }//GEN-LAST:event_updateButtonActionPerformed
    
    public void reset() {
        delListCombo.setSelectedIndex(0);
        updateNameText.setText("");
        updateUsernameText.setText("");
        updatePwdText.setText("");
        updatePhoneText.setText("");
        updateAddressText.setText("");
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void updatePhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePhoneTextActionPerformed

    private void AddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressText;
    private javax.swing.JButton addManagerButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressLabel1;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> delListCombo;
    private javax.swing.JButton deleteManagerButton;
    private javax.swing.JTable deliveryManListTable;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JTextField phoneText;
    private javax.swing.JLabel restPwdLabel1;
    private javax.swing.JLabel restPwdLabel2;
    private javax.swing.JPasswordField restPwdText;
    private javax.swing.JLabel selectManagerLabel1;
    private javax.swing.JLabel title;
    private javax.swing.JTextField updateAddressText;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField updateNameText;
    private javax.swing.JTextField updatePhoneText;
    private javax.swing.JPasswordField updatePwdText;
    private javax.swing.JLabel updateRestManagerLabel;
    private javax.swing.JLabel updateRestManagerLabel1;
    private javax.swing.JTextField updateUsernameText;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel viewLabel;
    // End of variables declaration//GEN-END:variables
}