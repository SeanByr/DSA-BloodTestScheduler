/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

import javax.swing.JOptionPane;

/**
 *
 * @author seanb
 */
public class BloodTestGUI extends javax.swing.JFrame {

    SLLInterface<Patient> sll;
    
    
    
    public BloodTestGUI() {
        initComponents();
        
        sll = new SimpleLinkedList();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hWardBTNGroup = new javax.swing.ButtonGroup();
        menuPanel = new javax.swing.JTabbedPane();
        patientPanel = new javax.swing.JPanel();
        patientDetailsPanel = new javax.swing.JPanel();
        firstNameLBL = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        surnameLBL = new javax.swing.JLabel();
        surnameTF = new javax.swing.JTextField();
        ageLBL = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        priorityLBL = new javax.swing.JLabel();
        priorityTF = new javax.swing.JComboBox<>();
        hWardCB = new javax.swing.JCheckBox();
        titleLBL = new javax.swing.JLabel();
        gpDetailsPanel = new javax.swing.JPanel();
        gpFirstNameLBL = new javax.swing.JLabel();
        gpFirstNameTF = new javax.swing.JTextField();
        gpSurnameLBL = new javax.swing.JLabel();
        gpSurnameTF = new javax.swing.JTextField();
        gpClinicNameLBL = new javax.swing.JLabel();
        gpClinicNameTF = new javax.swing.JTextField();
        gpPhoneNumberLBL = new javax.swing.JLabel();
        gpPhoneNumberTF = new javax.swing.JTextField();
        addPatientBTN = new javax.swing.JButton();
        queuePanel = new javax.swing.JPanel();
        patientQueueTitleLBL = new javax.swing.JLabel();
        patientListPanel = new javax.swing.JPanel();
        patientListSP = new javax.swing.JScrollPane();
        patientListTA = new javax.swing.JTextArea();
        displayPatientsBTN = new javax.swing.JButton();
        nextPatientPanel = new javax.swing.JPanel();
        nextPatientTF = new javax.swing.JTextField();
        noShowBTN = new javax.swing.JButton();
        nextPatientBTN = new javax.swing.JButton();
        noShowPanel = new javax.swing.JPanel();
        noShowSP = new javax.swing.JScrollPane();
        noShowTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Test Scheduler");

        patientDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Details"));

        firstNameLBL.setText("First Name:");

        surnameLBL.setText("Surname:");

        ageLBL.setText("Age:");

        priorityLBL.setText("Priority:");

        priorityTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urgent", "Medium", "Low" }));

        hWardCB.setText("From Hospital Ward?");

        javax.swing.GroupLayout patientDetailsPanelLayout = new javax.swing.GroupLayout(patientDetailsPanel);
        patientDetailsPanel.setLayout(patientDetailsPanelLayout);
        patientDetailsPanelLayout.setHorizontalGroup(
            patientDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientDetailsPanelLayout.createSequentialGroup()
                .addGroup(patientDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(patientDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLBL)
                            .addComponent(ageLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priorityLBL))
                        .addGap(18, 18, 18)
                        .addGroup(patientDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameTF)
                            .addComponent(ageTF)
                            .addComponent(priorityTF, 0, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(surnameLBL)
                        .addGap(18, 18, 18)
                        .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(patientDetailsPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(hWardCB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        patientDetailsPanelLayout.setVerticalGroup(
            patientDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientDetailsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(patientDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLBL)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameLBL)
                    .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(patientDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLBL)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(patientDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityLBL)
                    .addComponent(priorityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hWardCB)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        titleLBL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleLBL.setText("Blood Test Form");

        gpDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("GP Details"));

        gpFirstNameLBL.setText("First Name:");

        gpSurnameLBL.setText("Surname:");

        gpClinicNameLBL.setText("Clinic Name:");

        gpPhoneNumberLBL.setText("Phone Number:");

        javax.swing.GroupLayout gpDetailsPanelLayout = new javax.swing.GroupLayout(gpDetailsPanel);
        gpDetailsPanel.setLayout(gpDetailsPanelLayout);
        gpDetailsPanelLayout.setHorizontalGroup(
            gpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(gpDetailsPanelLayout.createSequentialGroup()
                        .addComponent(gpPhoneNumberLBL)
                        .addGap(18, 18, 18)
                        .addComponent(gpPhoneNumberTF, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addGroup(gpDetailsPanelLayout.createSequentialGroup()
                        .addGroup(gpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gpFirstNameLBL)
                            .addComponent(gpClinicNameLBL))
                        .addGap(18, 18, 18)
                        .addGroup(gpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gpFirstNameTF)
                            .addComponent(gpClinicNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(gpSurnameLBL)
                .addGap(18, 18, 18)
                .addComponent(gpSurnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        gpDetailsPanelLayout.setVerticalGroup(
            gpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpDetailsPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(gpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpFirstNameLBL)
                    .addComponent(gpFirstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpSurnameLBL)
                    .addComponent(gpSurnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpClinicNameLBL)
                    .addComponent(gpClinicNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gpDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpPhoneNumberLBL)
                    .addComponent(gpPhoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addPatientBTN.setText("Add Patient");
        addPatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patientPanelLayout = new javax.swing.GroupLayout(patientPanel);
        patientPanel.setLayout(patientPanelLayout);
        patientPanelLayout.setHorizontalGroup(
            patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gpDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(patientPanelLayout.createSequentialGroup()
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientPanelLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(titleLBL))
                    .addGroup(patientPanelLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(addPatientBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        patientPanelLayout.setVerticalGroup(
            patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titleLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(patientDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gpDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addPatientBTN)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        menuPanel.addTab("Add Patient", patientPanel);

        patientQueueTitleLBL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        patientQueueTitleLBL.setText("Patient Queue Information");

        patientListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("List of All Patients"));

        patientListTA.setColumns(20);
        patientListTA.setRows(5);
        patientListSP.setViewportView(patientListTA);

        displayPatientsBTN.setText("Display All Patients");
        displayPatientsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPatientsBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patientListPanelLayout = new javax.swing.GroupLayout(patientListPanel);
        patientListPanel.setLayout(patientListPanelLayout);
        patientListPanelLayout.setHorizontalGroup(
            patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientListSP)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientListPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(displayPatientsBTN)))
                .addContainerGap())
        );
        patientListPanelLayout.setVerticalGroup(
            patientListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientListPanelLayout.createSequentialGroup()
                .addComponent(patientListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(displayPatientsBTN)
                .addContainerGap())
        );

        nextPatientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Next Patient"));

        noShowBTN.setText("No-Show");
        noShowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowBTNActionPerformed(evt);
            }
        });

        nextPatientBTN.setText("Display Next Patient");

        javax.swing.GroupLayout nextPatientPanelLayout = new javax.swing.GroupLayout(nextPatientPanel);
        nextPatientPanel.setLayout(nextPatientPanelLayout);
        nextPatientPanelLayout.setHorizontalGroup(
            nextPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextPatientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nextPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextPatientTF)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextPatientPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nextPatientBTN)
                        .addGap(18, 18, 18)
                        .addComponent(noShowBTN)))
                .addContainerGap())
        );
        nextPatientPanelLayout.setVerticalGroup(
            nextPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextPatientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nextPatientTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nextPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noShowBTN)
                    .addComponent(nextPatientBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        noShowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("List of No-Shows"));

        noShowTA.setColumns(20);
        noShowTA.setRows(5);
        noShowSP.setViewportView(noShowTA);

        javax.swing.GroupLayout noShowPanelLayout = new javax.swing.GroupLayout(noShowPanel);
        noShowPanel.setLayout(noShowPanelLayout);
        noShowPanelLayout.setHorizontalGroup(
            noShowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noShowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noShowSP)
                .addContainerGap())
        );
        noShowPanelLayout.setVerticalGroup(
            noShowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noShowPanelLayout.createSequentialGroup()
                .addComponent(noShowSP, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout queuePanelLayout = new javax.swing.GroupLayout(queuePanel);
        queuePanel.setLayout(queuePanelLayout);
        queuePanelLayout.setHorizontalGroup(
            queuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queuePanelLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(patientQueueTitleLBL)
                .addGap(135, 135, 135))
            .addComponent(patientListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nextPatientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(noShowPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        queuePanelLayout.setVerticalGroup(
            queuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queuePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(patientQueueTitleLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextPatientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(noShowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuPanel.addTab("Patient Queue", queuePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noShowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noShowBTNActionPerformed

    private void addPatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientBTNActionPerformed
        //patients details
        String fName = firstNameTF.getText();
        String surname = surnameTF.getText();
        int age = Integer.parseInt(ageTF.getText());
        String priority = (String)priorityTF.getSelectedItem();
        boolean hWard = hWardCB.isSelected();
        //gps details
        String gpFName = gpFirstNameTF.getText();
        String gpSurname = gpSurnameTF.getText();
        String gpClinic = gpClinicNameTF.getText();
        int gpPhone = Integer.parseInt(gpPhoneNumberTF.getText());
        
        Patient temp = new Patient(fName, surname, age, priority, hWard, gpFName, gpSurname, gpClinic, gpPhone);
        sll.add(temp);  //adding patient to singly linked list
        
        patientListTA.append(sll.print());
        patientListTA.setCaretPosition(0);
        
        JOptionPane.showMessageDialog(null, "Patient add to Queue");
        
    }//GEN-LAST:event_addPatientBTNActionPerformed

    private void displayPatientsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPatientsBTNActionPerformed
        patientListTA.setText("");
        patientListTA.append(sll.print());
            
        
    }//GEN-LAST:event_displayPatientsBTNActionPerformed

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
            java.util.logging.Logger.getLogger(BloodTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTestGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientBTN;
    private javax.swing.JLabel ageLBL;
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton displayPatientsBTN;
    private javax.swing.JLabel firstNameLBL;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JLabel gpClinicNameLBL;
    private javax.swing.JTextField gpClinicNameTF;
    private javax.swing.JPanel gpDetailsPanel;
    private javax.swing.JLabel gpFirstNameLBL;
    private javax.swing.JTextField gpFirstNameTF;
    private javax.swing.JLabel gpPhoneNumberLBL;
    private javax.swing.JTextField gpPhoneNumberTF;
    private javax.swing.JLabel gpSurnameLBL;
    private javax.swing.JTextField gpSurnameTF;
    private javax.swing.ButtonGroup hWardBTNGroup;
    private javax.swing.JCheckBox hWardCB;
    private javax.swing.JTabbedPane menuPanel;
    private javax.swing.JButton nextPatientBTN;
    private javax.swing.JPanel nextPatientPanel;
    private javax.swing.JTextField nextPatientTF;
    private javax.swing.JButton noShowBTN;
    private javax.swing.JPanel noShowPanel;
    private javax.swing.JScrollPane noShowSP;
    private javax.swing.JTextArea noShowTA;
    private javax.swing.JPanel patientDetailsPanel;
    private javax.swing.JPanel patientListPanel;
    private javax.swing.JScrollPane patientListSP;
    private javax.swing.JTextArea patientListTA;
    private javax.swing.JPanel patientPanel;
    private javax.swing.JLabel patientQueueTitleLBL;
    private javax.swing.JLabel priorityLBL;
    private javax.swing.JComboBox<String> priorityTF;
    private javax.swing.JPanel queuePanel;
    private javax.swing.JLabel surnameLBL;
    private javax.swing.JTextField surnameTF;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
