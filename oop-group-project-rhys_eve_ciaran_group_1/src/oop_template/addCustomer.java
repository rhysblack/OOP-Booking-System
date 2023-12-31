/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import javax.swing.JOptionPane;

/**
 *
 * @author R.BLack
 */
public class addCustomer extends javax.swing.JFrame {

    /**
     * Creates new form addCustomer
     */
    public addCustomer() {
        initComponents();
        //center window
        setLocationRelativeTo(null);
    }
    
    /**
     * Counts lines in the file storage\\customers.txt
     * adds one for the id number of the next line
     * @return nextID this is the id number for the next entry
     * @author R.BLack
     */
    public static String autofillID(){
        //get id number from text file
        //read lines in textfile and add 1
        int lineNum = 0;
        String nextID;
        String line = "";

        try {
            //create new reader
            FileReader fr = new FileReader("storage\\customers.txt");

            //create buffer reader to extend reader
            BufferedReader br = new BufferedReader(fr);

            //read until empty line
            while ((line = br.readLine()) != null) {
                //increment lineNum
                lineNum += 1;

            }

            //close file
            br.close();
            fr.close();
        } catch (FileNotFoundException fnfEx) {
            //show error window
            JOptionPane.showMessageDialog(null,"There was an error writing to the file.\n" + fnfEx,"Error",0);

        } catch (IOException ex) {
            //show error window
            JOptionPane.showMessageDialog(null,"There was an error writing to the file.\n" + ex,"Error",0);
        }

        //add 1 to lineNum for next id num
        lineNum += 1;
        nextID = String.valueOf(lineNum);

        return nextID;
    }
    
    /**This method returns true or false if string is numeric
     * @param str this is the string that will be checked
     * @author R.BLack
     */
    public static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
    
    /**This method returns true or false if the string is only letters
     *  @param str this is the string that will be checked
     * @author R.BLack
     */
    public boolean isAlpha(String str) {
        return str.matches("[a-zA-Z]+");
    }
    
    /**This method returns true or false if the string is a valid email
     * @param str this is the string that will be checked
     * @author R.BLack
     */
    public boolean emailValidation(String str){
        return str.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}");
    }
    
    /**
     * This method returns true or false if the phone number is in a valid format
     * @param str this is the string that will be checked
     * @author R.BLack
     */
    public boolean phoneValidation(String str){
        return str.matches("07\\d{9}|028\\d{8}");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIDNum = new javax.swing.JFormattedTextField();
        lblID = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        txtPhoneNum = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scissor Sisters");
        setBackground(new java.awt.Color(241, 240, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(241, 240, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 167, 250), 2), "Add Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(48, 41, 66))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));

        txtIDNum.setBackground(new java.awt.Color(210, 201, 240));
        txtIDNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 167, 250), 2));
        txtIDNum.setForeground(new java.awt.Color(48, 41, 66));
        txtIDNum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtIDNum.setToolTipText("");
        txtIDNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIDNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNumActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(48, 41, 66));
        lblID.setText("ID Number");

        txtFirstName.setBackground(new java.awt.Color(210, 201, 240));
        txtFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(48, 41, 66));
        txtFirstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 167, 250), 2));

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(48, 41, 66));
        lblFirstName.setText("First Name");

        txtLastName.setBackground(new java.awt.Color(210, 201, 240));
        txtLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(48, 41, 66));
        txtLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 167, 250), 2));

        lblLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(48, 41, 66));
        lblLastName.setText("Last Name");

        lblPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(48, 41, 66));
        lblPhone.setText("Phone");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(48, 41, 66));
        lblEmail.setText("Email");

        txtEmail.setBackground(new java.awt.Color(210, 201, 240));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(48, 41, 66));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 167, 250), 2));

        btnMenu.setBackground(new java.awt.Color(210, 201, 240));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(48, 41, 66));
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(210, 201, 240));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(48, 41, 66));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(210, 201, 240));
        btnEnter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(48, 41, 66));
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        txtPhoneNum.setBackground(new java.awt.Color(210, 201, 240));
        txtPhoneNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 167, 250), 2));
        txtPhoneNum.setForeground(new java.awt.Color(48, 41, 66));
        try {
            txtPhoneNum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPhoneNum.setText("");
        txtPhoneNum.setToolTipText("");
        txtPhoneNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblLastName)
                                    .addGap(323, 323, 323))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblID)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFirstName)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPhone)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtPhoneNum)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(lblID)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtIDNum)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        //create new menu
        Menu menuPage = new Menu();
        //show menu
        menuPage.show();
        //dispose current window
        dispose();
        
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // set all textboxes to ""
        txtFirstName.setText("");
        txtLastName.setText("");
        txtPhoneNum.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // get values from textbox
        String idNum = txtIDNum.getText().strip();
        String firstName = txtFirstName.getText().strip();
        String lastName = txtLastName.getText().strip();
        String phoneNum = txtPhoneNum.getText().strip();
        String email = txtEmail.getText().strip();
        
        //check if they are valid
        //create an error boolean that will be used to check if 
        //an entry should be written into the text file or not
        boolean error = false;
        
        //check if any fields are empty
        if(firstName.strip().equals("") || lastName.strip().equals("") || 
                phoneNum.strip().equals("") || email.strip().equals("") ){
            error = true;
            JOptionPane.showMessageDialog(null,"Please fill in all fields.","Error",0);
            
        //check if first and last name is only letters
        }else if(!isAlpha(firstName) || !isAlpha(lastName)){
            error = true;
            JOptionPane.showMessageDialog(null,"Invalid name.","Error",0);
            
        //test if first name is too long
        }else if(firstName.length() > 35){
            error = true;
            JOptionPane.showMessageDialog(null,"First name is too long.","Error",0);
            txtFirstName.grabFocus();
            
        //test if last name is too long
        }else if(lastName.length() > 35){
            error = true;
            JOptionPane.showMessageDialog(null,"Last name is too long.","Error",0);
            txtLastName.grabFocus();
            
        //check if email is valid
        }else if(!emailValidation(email)){
            error = true;
            JOptionPane.showMessageDialog(null,"The email adderss is invalid.","Error",0);
            txtEmail.grabFocus();
            
        //check if phone number is valid
        }else if(!phoneValidation(phoneNum)){
            error = true;
            JOptionPane.showMessageDialog(null,"The phone number is invalid.","Error",0);
            txtPhoneNum.grabFocus();
        }
        
        //only make entry if error is false
        if(!error){
            //create a string for all of the info in a line
            String newRecord = (idNum + ", " + firstName + ", " + 
                    lastName + ", " + phoneNum + ", " + email);
            
            //write it to file
            try {
                //create instance of the file writer with the chosen file path
                //set append to true so it doesnt write over curent text
                FileWriter fw = new FileWriter("storage\\customers.txt", true);

                //buffered writer for new line
                BufferedWriter bw = new BufferedWriter(fw);

                //write new record
                bw.write(newRecord);
                //take new line
                bw.newLine();

                //close file
                fw.flush();
                bw.flush();
                
            } catch (IOException ex) {
                //show error window
                JOptionPane.showMessageDialog(null,"There was an error writing to the file.\n" + ex,"Error",0);
            }
            
            //insert data into a new instance of the customer
            appData.currentCust.setIDNum(Integer.valueOf(idNum));
            appData.currentCust.setFirstName(firstName);
            appData.currentCust.setLastName(lastName);
            appData.currentCust.setPhoneNum(phoneNum);
            appData.currentCust.setEmail(email);
            
            //debug code
            System.out.println("DEBUG: " + appData.currentCust.getIDNum());
            System.out.println("DEBUG: " + appData.currentCust.getFirstName());
            System.out.println("DEBUG: " + appData.currentCust.getLastName());
            System.out.println("DEBUG: " + appData.currentCust.getPhoneNum());
            System.out.println("DEBUG: " + appData.currentCust.getEmail());
            
            //show success mesage
            JOptionPane.showMessageDialog(null,"Entry successfully made.","Success",1);
            
            //clear fields
            txtFirstName.setText("");
            txtLastName.setText("");
            txtPhoneNum.setText("");
            txtEmail.setText("");
            
            //autofill next id
            txtIDNum.setText(autofillID());
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //autofill id with new id num
        txtIDNum.setText(autofillID());
        
        //set focus to first name
        txtFirstName.grabFocus();
    }//GEN-LAST:event_formWindowOpened

    private void txtIDNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNumActionPerformed

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
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCustomer().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JFormattedTextField txtIDNum;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JFormattedTextField txtPhoneNum;
    // End of variables declaration//GEN-END:variables
}
