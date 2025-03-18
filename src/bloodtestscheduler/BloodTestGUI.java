/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author seanb
 */
public class BloodTestGUI extends javax.swing.JFrame {

    SLLInterface<Patient> sll; //single linked list for storing all patients in the system
    
    PQInterface<Patient> pq; //priority queue for storing all patients in the system
                             //based on priority("Urgent","Medium","Low"), age and if the patient comes from a hospital ward
    
    QueueInterface<Patient> queue; //queue for storing the last 5 patients in the system that are a no-show for there appointment
    
    
    
    public BloodTestGUI() {
        initComponents();
        
        //initializing ADTs
        sll = new SimpleLinkedList();
        pq = new PriorityQueue();
        queue = new MyQueue();
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
        noShowBTN = new javax.swing.JButton();
        nextPatientBTN = new javax.swing.JButton();
        nextPatientSP = new javax.swing.JScrollPane();
        nextPatientTA = new javax.swing.JTextArea();
        noShowPanel = new javax.swing.JPanel();
        noShowSP = new javax.swing.JScrollPane();
        noShowTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Test Scheduler");

        patientDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Details"));

        firstNameLBL.setText("First Name:");

        firstNameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameTFKeyPressed(evt);
            }
        });

        surnameLBL.setText("Surname:");

        surnameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                surnameTFKeyPressed(evt);
            }
        });

        ageLBL.setText("Age:");

        ageTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTFKeyPressed(evt);
            }
        });

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

        gpFirstNameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gpFirstNameTFKeyPressed(evt);
            }
        });

        gpSurnameLBL.setText("Surname:");

        gpSurnameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gpSurnameTFKeyPressed(evt);
            }
        });

        gpClinicNameLBL.setText("Clinic Name:");

        gpClinicNameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gpClinicNameTFKeyPressed(evt);
            }
        });

        gpPhoneNumberLBL.setText("Phone Number:");

        gpPhoneNumberTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gpPhoneNumberTFKeyPressed(evt);
            }
        });

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

        patientListTA.setEditable(false);
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
                .addComponent(patientListSP, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPatientsBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nextPatientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Next Patient"));

        noShowBTN.setText("No-Show");
        noShowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowBTNActionPerformed(evt);
            }
        });

        nextPatientBTN.setText("Next Patient");
        nextPatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPatientBTNActionPerformed(evt);
            }
        });

        nextPatientTA.setEditable(false);
        nextPatientTA.setColumns(20);
        nextPatientTA.setRows(5);
        nextPatientSP.setViewportView(nextPatientTA);

        javax.swing.GroupLayout nextPatientPanelLayout = new javax.swing.GroupLayout(nextPatientPanel);
        nextPatientPanel.setLayout(nextPatientPanelLayout);
        nextPatientPanelLayout.setHorizontalGroup(
            nextPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextPatientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nextPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nextPatientSP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, nextPatientPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nextPatientBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noShowBTN)))
                .addContainerGap())
        );
        nextPatientPanelLayout.setVerticalGroup(
            nextPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextPatientPanelLayout.createSequentialGroup()
                .addComponent(nextPatientSP, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nextPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextPatientBTN)
                    .addComponent(noShowBTN))
                .addContainerGap())
        );

        noShowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("List of No-Shows"));

        noShowTA.setEditable(false);
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
            .addComponent(noShowSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout queuePanelLayout = new javax.swing.GroupLayout(queuePanel);
        queuePanel.setLayout(queuePanelLayout);
        queuePanelLayout.setHorizontalGroup(
            queuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nextPatientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(noShowPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queuePanelLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(patientQueueTitleLBL)
                .addGap(140, 140, 140))
        );
        queuePanelLayout.setVerticalGroup(
            queuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queuePanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(patientQueueTitleLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextPatientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noShowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        //if a patient is a no-show
        //this btn adds the patient to the queue(through enqueue)
        //and also removes the patient in the priority queue
        //this is possible due to this queue.enqueue(pq.dequeue());
        noShowTA.setText("");
        nextPatientTA.setText("");
        
        if(!pq.isEmpty()){
        queue.enqueue(pq.dequeue()); //adds patient to queue(no-show list) and removes patient from piority queue(next patient)
        lastFiveNoShow(); //method for dequeuing patient if queue(no-show list) exceeds 5 people
        noShowTA.append(queue.displayQueue()); //displays current patients in the queue(no-show list)
        noShowTA.setCaretPosition(0);
        
        if(!pq.isEmpty()){ //second if for displaying next patient in the priority queue(next patient)
        nextPatientTA.append(pq.peek());
        noShowTA.setCaretPosition(0);
        }
        } else { //else if the priority queue is empty, display what is currently in the queue(no-show list)
            noShowTA.append(queue.displayQueue());
            noShowTA.setCaretPosition(0);
            JOptionPane.showMessageDialog(null, "No Patients in the System");
        }
        
       
    }//GEN-LAST:event_noShowBTNActionPerformed

    public void lastFiveNoShow(){ //method for dequeuing patient if queue(no-show list) exceeds 5 people
        if(queue.size() > 5){ //dequeue if queue size is greater then 5
            queue.dequeue();
        } else {
            return;
        }
    }
    
    private void addPatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientBTNActionPerformed
        //btn for creating/adding/enqueuing patients into the blood test scheduler system

        //get patients details from fields
        String fName = firstNameTF.getText();
        String surname = surnameTF.getText();
        String ageT = ageTF.getText().trim();
        String priority = (String)priorityTF.getSelectedItem();
        boolean hWard = hWardCB.isSelected();
        //get gps details from fields
        String gpFName = gpFirstNameTF.getText();
        String gpSurname = gpSurnameTF.getText();
        String gpClinic = gpClinicNameTF.getText();
        String gpPhoneT = gpPhoneNumberTF.getText().trim();
        
        //if for checking if all fields are empty
        if(fName.trim().isEmpty() || surname.trim().isEmpty() || ageT.isEmpty()
            || gpFName.trim().isEmpty() || gpSurname.trim().isEmpty() || gpClinic.trim().isEmpty()
            || gpPhoneT.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill in all Fields to Add Patient to the Queue!"); //display msg if 1 or more fields are empty
            return;
        } else if(gpPhoneNumberTF.getText().length() != 10){
            JOptionPane.showMessageDialog(null, "GP Phone Number Must be 10 characters long!");
            return;
        } else {
        
        //int details seperated in else due to NumberFormatException error
        int age = Integer.parseInt(ageTF.getText());
        int gpPhone = Integer.parseInt(gpPhoneNumberTF.getText());
        
        //creates temp Patient obj
        Patient temp = new Patient(fName, surname, age, priority, hWard, gpFName, gpSurname, gpClinic, gpPhone);
        
        sll.add(temp);  //adding patient to singly linked list
        patientListTA.setText("");
        patientListTA.append(sll.print()); //adds patients details to the patient list
        patientListTA.setCaretPosition(0);
        
        
        pq.enqueue(priorityKey() ,temp); //adding patient to priority queue
        nextPatientTA.setText(pq.peek()); //displays patient with the highest priority in the pq
        nextPatientTA.setCaretPosition(0);
        
        emptyFields();
        JOptionPane.showMessageDialog(null, "Patient add to Queue"); //display this msg when patient is added to the queue
        }
    }//GEN-LAST:event_addPatientBTNActionPerformed

    public int priorityKey(){ //method for determining the priority of the patients to be seen to first
        
        int key = 0; //the lower the key var, the higher priority a patient has
        
        //priorty queue based upon priority selector(Urgent, Medium, Low), age and if patient is currently in a hospital ward
        String priority = (String)priorityTF.getSelectedItem();
        int age = Integer.parseInt(ageTF.getText());
        boolean hWard = hWardCB.isSelected();
        //lower ke
        if(priority.equals("Urgent")){ //if priority is "Urgent", key set to highest priority value of 0
            key += 0;
        } else if(priority.equals("Medium")){ //if priority is "Medium", key set to a medium priority value of 10
            key += 10;
        } else if(priority.equals("Low")){ //if priority is "Low", key set to lowest prority value of 20
            key += 20;
        }
        
        //if patient is a child (e.g., <=17), they are given a highest priority key of 0
        //if patient is an elderly person (e.g., >=70), they are given the next highest priority of 5
        //if paitent is between the ages of a child and elderly person (e.g., >17 && <70), they are given the lowest priority
        if(age <= 17){
            key += 0;
        } else if(age >= 70){
            key += 5;
        } else{
            key+= 10;
        }
        
        //if the patient is coming from a hospital ward they get a higher priority key of nothing
        //else if patient doesnt come from a hospital ward, they get a lower priority key of 10
        if(!hWard){
            key += 10;
        }
           
        return key; //returns the patients priority key
    }
    
    public void emptyFields(){ //method for setting all fields to be empty after patients details are submitted
        //clear patients details
        firstNameTF.setText("");
        surnameTF.setText("");
        ageTF.setText("");
        //clear patients gp details
        gpFirstNameTF.setText("");
        gpSurnameTF.setText("");
        gpClinicNameTF.setText("");
        gpPhoneNumberTF.setText("");
    }
    
    private void displayPatientsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPatientsBTNActionPerformed
       //btn for displaying all patient information
        
        if(!sll.isEmpty()){ //if the SLL is not empty, display all patients in the system
        patientListTA.setText("");
        patientListTA.append(sll.print()); //displays all patients
       } else {
           JOptionPane.showMessageDialog(null, "No Patients in the System"); //if no patients are in the system, display this msg
       }
        
    }//GEN-LAST:event_displayPatientsBTNActionPerformed

    private void nextPatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPatientBTNActionPerformed
       //btn for dequeuing patients from the priority queue as they have shown up and have been seen to
        
        nextPatientTA.setText("");
        pq.dequeue(); //dequeues(removes) patient from priority queue
        if(!pq.isEmpty()){ //if the priority queue isnt empty, display the next patient in the priority queue
        nextPatientTA.append(pq.peek()); //displays next patient
        nextPatientTA.setCaretPosition(0);
        } else {
            JOptionPane.showMessageDialog(null, "No Patients in the System"); //if no patients in the priority queue, display this msg
        }
        
    }//GEN-LAST:event_nextPatientBTNActionPerformed

    private void firstNameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTFKeyPressed
        //error handling for the firstNameTF
        
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyCode();
        
        if ((Character.isLetter(keyChar) || key == KeyEvent.VK_BACK_SPACE || evt.isShiftDown() || key == KeyEvent.VK_SPACE) 
        && firstNameTF.getText().length() < 20) {
            firstNameTF.setEditable(true);
        } else {
                firstNameTF.setEditable(false);
                JOptionPane.showMessageDialog(null, "Letters Only, 20 character limit.");
                firstNameTF.setEditable(true);
                }
    }//GEN-LAST:event_firstNameTFKeyPressed

    private void surnameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surnameTFKeyPressed
        //error handling for the surnameTF
        
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyCode();
        
        if((Character.isLetter(keyChar) || key == KeyEvent.VK_BACK_SPACE || evt.isShiftDown() || key == KeyEvent.VK_SPACE)
           && surnameTF.getText().length() < 20){
            surnameTF.setEditable(true);
        } else {
            surnameTF.setEditable(false);
            JOptionPane.showMessageDialog(null, "Letters Only, 20 character limit.");
            surnameTF.setEditable(true);
        }
    }//GEN-LAST:event_surnameTFKeyPressed

    private void ageTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTFKeyPressed
        //error handling for the ageTF
        
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyCode();
        
        if((Character.isDigit(keyChar) || key == KeyEvent.VK_BACK_SPACE) && ageTF.getText().length() < 3){
            ageTF.setEditable(true);
        } else  {
            ageTF.setEditable(false);
            JOptionPane.showMessageDialog(null, "Numbers Only, Max 3 characters long");
            ageTF.setEditable(true);
        }
    }//GEN-LAST:event_ageTFKeyPressed

    private void gpFirstNameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpFirstNameTFKeyPressed
        //error handling for the gpFirstNameTF
        
         char keyChar = evt.getKeyChar();
        int key = evt.getKeyCode();
        
        if ((Character.isLetter(keyChar) || key == KeyEvent.VK_BACK_SPACE || evt.isShiftDown() || key == KeyEvent.VK_SPACE) 
        && gpFirstNameTF.getText().length() < 20) {
            gpFirstNameTF.setEditable(true);
        } else {
                gpFirstNameTF.setEditable(false);
                JOptionPane.showMessageDialog(null, "Letters Only, 20 character limit.");
                gpFirstNameTF.setEditable(true);
                }
        
    }//GEN-LAST:event_gpFirstNameTFKeyPressed

    private void gpSurnameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpSurnameTFKeyPressed
        //error handling for the gpSurnameTF
        
         char keyChar = evt.getKeyChar();
        int key = evt.getKeyCode();
        
        if ((Character.isLetter(keyChar) || key == KeyEvent.VK_BACK_SPACE || evt.isShiftDown() || key == KeyEvent.VK_SPACE) 
        && gpSurnameTF.getText().length() < 20) {
            gpSurnameTF.setEditable(true);
        } else {
                gpSurnameTF.setEditable(false);
                JOptionPane.showMessageDialog(null, "Letters Only, 20 character limit.");
                gpSurnameTF.setEditable(true);
                }
    }//GEN-LAST:event_gpSurnameTFKeyPressed

    private void gpClinicNameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpClinicNameTFKeyPressed
        //error handling for the gpClinicNameTF
        
         char keyChar = evt.getKeyChar();
        int key = evt.getKeyCode();
        
        if ((Character.isLetter(keyChar) || key == KeyEvent.VK_BACK_SPACE || evt.isShiftDown() || key == KeyEvent.VK_SPACE) 
        && gpClinicNameTF.getText().length() < 30) {
            gpClinicNameTF.setEditable(true);
        } else {
                gpClinicNameTF.setEditable(false);
                JOptionPane.showMessageDialog(null, "Letters Only, 30 character limit.");
                gpClinicNameTF.setEditable(true);
                }
    }//GEN-LAST:event_gpClinicNameTFKeyPressed

    private void gpPhoneNumberTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpPhoneNumberTFKeyPressed
        //error handling for the gpPhoneNumberTF
        
        char keyChar = evt.getKeyChar();
        int key = evt.getKeyCode();
        
        if((Character.isDigit(keyChar) || key == KeyEvent.VK_BACK_SPACE) && gpPhoneNumberTF.getText().length() < 10){
            gpPhoneNumberTF.setEditable(true);
        } else  {
            gpPhoneNumberTF.setEditable(false);
            JOptionPane.showMessageDialog(null, "Numbers Only, Has to be 10 characters long");
            gpPhoneNumberTF.setEditable(true);
        }
    }//GEN-LAST:event_gpPhoneNumberTFKeyPressed

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
    private javax.swing.JScrollPane nextPatientSP;
    private javax.swing.JTextArea nextPatientTA;
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
