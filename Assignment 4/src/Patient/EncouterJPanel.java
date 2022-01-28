/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patient;

import Model.Encounter;
import Model.EncounterHistory;
import Model.Patient;
import Model.PatientDirectory;
import Model.VitalSigns;
import Person.*;
import UI.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author yashjain
 */
public class EncouterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    PatientDirectory patientHistory;
    public EncouterJPanel(PatientDirectory patientHistory) {
        initComponents();  
        this.patientHistory = patientHistory;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        FName = new javax.swing.JLabel();
        DNTxt = new javax.swing.JTextField();
        LName = new javax.swing.JLabel();
        CNTxt = new javax.swing.JTextField();
        PersonId = new javax.swing.JLabel();
        WNTxt = new javax.swing.JTextField();
        Age = new javax.swing.JLabel();
        RPTxt = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        HPTxt = new javax.swing.JTextField();
        City = new javax.swing.JLabel();
        BPTxt = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        DNErr = new javax.swing.JLabel();
        CNErr = new javax.swing.JLabel();
        WNErr = new javax.swing.JLabel();
        RPErr = new javax.swing.JLabel();
        HRErr = new javax.swing.JLabel();
        BPErr = new javax.swing.JLabel();
        City1 = new javax.swing.JLabel();
        WeightTxt = new javax.swing.JTextField();
        WeightErr = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 248, 255));

        Title.setBackground(java.awt.Color.white);
        Title.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 83, 170));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Create Appointment");

        FName.setForeground(new java.awt.Color(72, 72, 72));
        FName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FName.setText("Doctor Name");

        LName.setForeground(new java.awt.Color(72, 72, 72));
        LName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LName.setText("Clinic Name");

        PersonId.setForeground(new java.awt.Color(72, 72, 72));
        PersonId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PersonId.setText("Ward Name");

        Age.setForeground(new java.awt.Color(72, 72, 72));
        Age.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Age.setText("Respiratory Rate");

        Address.setForeground(new java.awt.Color(72, 72, 72));
        Address.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Address.setText("Heart Rate");

        City.setForeground(new java.awt.Color(72, 72, 72));
        City.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        City.setText("Blood Pressure");

        Submit.setBackground(new java.awt.Color(0, 83, 170));
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("SAVE");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        DNErr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        DNErr.setForeground(java.awt.Color.red);

        CNErr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        CNErr.setForeground(java.awt.Color.red);

        WNErr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        WNErr.setForeground(java.awt.Color.red);

        RPErr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        RPErr.setForeground(java.awt.Color.red);

        HRErr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        HRErr.setForeground(java.awt.Color.red);

        BPErr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        BPErr.setForeground(java.awt.Color.red);

        City1.setForeground(new java.awt.Color(72, 72, 72));
        City1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        City1.setText("Weight (in Pounds)");

        WeightErr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        WeightErr.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PersonId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(City, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(City1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(WNTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(CNTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DNTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RPTxt)
                            .addComponent(BPTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WeightTxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DNErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CNErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(WNErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RPErr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BPErr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WeightErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(HRErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FName)
                    .addComponent(DNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNErr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LName)
                    .addComponent(CNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNErr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonId)
                    .addComponent(WNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WNErr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age)
                    .addComponent(RPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RPErr))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address)
                    .addComponent(HRErr))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(City)
                    .addComponent(BPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(BPErr)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WeightErr)
                    .addComponent(City1))
                .addGap(12, 12, 12)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String DName = DNTxt.getText();
        String CName = CNTxt.getText();
        String WName = WNTxt.getText();
        Double RP = 0d;
        Double BP = 0d;
        Double HR = 0d;
        Double weight = 0d;
        Boolean isVaild = true;
        
         if(DName.trim().isEmpty()) {
            DNErr.setText("Last Name is required");
            isVaild = false;
        }
        else DNErr.setText("");
        
         if(CName.trim().isEmpty()) {
            CNErr.setText("Last Name is required");
            isVaild = false;
        }
        else CNErr.setText("");
         
        if(WName.trim().isEmpty()) {
            WNErr.setText("Last Name is required");
            isVaild = false;
        }
        else WNErr.setText("");
        
         if(!BPTxt.getText().trim().isEmpty()){
        try {
            BP = Double.parseDouble(BPTxt.getText());
            BPErr.setText("");
            } catch (NumberFormatException nfe) {
                BPErr.setText("Blood Pressure must be number");
                isVaild = false;
            }
         }else{
            BPErr.setText("Blood Pressure is required");
            isVaild = false;
        }
        if(!HPTxt.getText().trim().isEmpty()){
        try {
            HR = Double.parseDouble(HPTxt.getText());
            HRErr.setText("");
            } catch (NumberFormatException nfe) {
                HRErr.setText("Heart Rate must be number");
                isVaild = false;
            }
         }else{
            HRErr.setText("Heart Rate is required");
            isVaild = false;
        }
        if(!RPTxt.getText().trim().isEmpty()){
        try {
            RP = Double.parseDouble(RPTxt.getText());
            RPErr.setText("");
            } catch (NumberFormatException nfe) {
                RPErr.setText("Respiratory Rate must be number");
                isVaild = false;
            }
         }else{
            RPErr.setText("Respiratory Rate is required");
            isVaild = false;
        }
        if(!WeightTxt.getText().trim().isEmpty()){
        try {
            weight = Double.parseDouble(WeightTxt.getText());
            WeightErr.setText("");
            } catch (NumberFormatException nfe) {
                WeightErr.setText("Weight must be number");
                isVaild = false;
            }
         }else{
            WeightErr.setText("Weight is required");
            isVaild = false;
        }
        
        if(isVaild){
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");  
            Date today = Calendar.getInstance().getTime();  
            Patient patient = patientHistory.getSelectedView();
            Encounter encouterData = patient.getEncounterHistory().addEncountersInHistory();
            encouterData.setDoctorName(DName);
            encouterData.setClinicName(CName);
            encouterData.setWardCategory(WName);
            encouterData.getVital().setBloodPressure(BP);
            encouterData.getVital().setHeartRate(HR);
            encouterData.getVital().setRespiratoryRate(RP);
            encouterData.getVital().setWeight(weight);
            
            encouterData.getVital().setTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            patient.setEncounter(encouterData);
            JOptionPane.showMessageDialog(this, "Data Added Successfully");
            DNTxt.setText("");
            CNTxt.setText("");
            WNTxt.setText("");
            BPTxt.setText("");
            HPTxt.setText("");
            RPTxt.setText("");
            WeightTxt.setText("");
        }
    }//GEN-LAST:event_SubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel BPErr;
    private javax.swing.JTextField BPTxt;
    private javax.swing.JLabel CNErr;
    private javax.swing.JTextField CNTxt;
    private javax.swing.JLabel City;
    private javax.swing.JLabel City1;
    private javax.swing.JLabel DNErr;
    private javax.swing.JTextField DNTxt;
    private javax.swing.JLabel FName;
    private javax.swing.JTextField HPTxt;
    private javax.swing.JLabel HRErr;
    private javax.swing.JLabel LName;
    private javax.swing.JLabel PersonId;
    private javax.swing.JLabel RPErr;
    private javax.swing.JTextField RPTxt;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel WNErr;
    private javax.swing.JTextField WNTxt;
    private javax.swing.JLabel WeightErr;
    private javax.swing.JTextField WeightTxt;
    // End of variables declaration//GEN-END:variables
}
