
package com.post;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;


public class Profile extends javax.swing.JFrame {
    
    JTable table;
    String accNo;
    ArrayList<Account> list=dataFileReader.read();


    public Profile() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public Profile(JTable table ,String acc) {
        initComponents();
        this.table=table;
        this.accNo=acc;
        populateProfile(accNo);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Profile");
        setUi();
        
    }
    
    private void setUi(){
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.jpg"));
        
        // Set the icon for the JFrame (affects the taskbar icon and title bar icon)
        setIconImage(icon);
//        jLabel6 = new javax.swing.JLabel("Account Profile", javax.swing.SwingConstants.CENTER);
    jLabel6.setFont(new Font("Arial", Font.BOLD, 26));
    jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    editBtn.setBackground(new Color(102, 205, 170));
    cancelBtn.setBackground(new Color(255, 69, 0));
    JPanel formPanel = new JPanel(new GridBagLayout());
    formPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
    formPanel.setBackground(new Color(245, 245, 245));
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(8, 8, 8, 8);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridwidth = 2;
    gbc.gridx = 0;
    gbc.gridy = 0;
    formPanel.add(jLabel6, gbc);

    // Account No
    gbc.gridwidth = 1;
    gbc.gridy++;
    gbc.gridx = 0;
    formPanel.add(jLabel1, gbc);
    gbc.gridx = 1;
    formPanel.add(accountNo, gbc);

    // Name
    gbc.gridy++;
    gbc.gridx = 0;
    formPanel.add(jLabel5, gbc);
    gbc.gridx = 1;
    formPanel.add(name, gbc);

    // Mobile No
    gbc.gridy++;
    gbc.gridx = 0;
    formPanel.add(jLabel2, gbc);
    gbc.gridx = 1;
    formPanel.add(mobileNo, gbc);

    // Village
    gbc.gridy++;
    gbc.gridx = 0;
    formPanel.add(jLabel3, gbc);
    gbc.gridx = 1;
    formPanel.add(village, gbc);

    // Amount
    gbc.gridy++;
    gbc.gridx = 0;
    formPanel.add(jLabel4, gbc);
    gbc.gridx = 1;
    formPanel.add(amount, gbc);

    // Months Paid
    gbc.gridy++;
    gbc.gridx = 0;
    formPanel.add(jLabel7, gbc);
    gbc.gridx = 1;
    formPanel.add(monthsPaid, gbc);

    // Total
    gbc.gridy++;
    gbc.gridx = 0;
    formPanel.add(jLabel8, gbc);
    gbc.gridx = 1;
    formPanel.add(total, gbc);

    // Buttons
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
    buttonPanel.add(editBtn);
    buttonPanel.add(cancelBtn);

    // Main layout
    setLayout(new BorderLayout());
    add(formPanel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);

    pack();
    setResizable(false);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        accountNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mobileNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        village = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        monthsPaid = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Account Profile");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Account No.");

        jLabel2.setText("Mobile No.");

        jLabel3.setText("Village");

        jLabel4.setText("Amount");

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Name");

        jLabel7.setText("Months Paid");

        jLabel8.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(village, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthsPaid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(editBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBtn)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(village, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthsPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        if(editBtn.getText().equals("Edit")){
            name.setEditable(true);
            mobileNo.setEditable(true);
            village.setEditable(true);
            editBtn.setText("Save");
        }else if(editBtn.getText().equals("Save")){
            int inp=JOptionPane.showConfirmDialog(this, "Do you want to save changes");
            if(inp==0){
                for (Account acc: list){
                    if(acc.getAccountNo().equals(accountNo.getText())){
                        acc.setName(name.getText());
                        acc.setMobileNo(mobileNo.getText());
                        acc.setVillage(village.getText());
                    }
                }
                dataFileEntry.saveChanges(list);
                dispose();
                UpdateTable.updateFromAccountFile(table);
            }else if(inp==1){
                dispose();
            }
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void populateProfile(String accNo){
        for(Account acc:list){
            if(acc.getAccountNo().equals(accNo)){
                accountNo.setText(acc.getAccountNo());
                accountNo.setEditable(false);
                name.setText(acc.getName());
                name.setEditable(false);
                village.setText(acc.getVillage());
                village.setEditable(false);
                mobileNo.setText(acc.getMobileNo());
                mobileNo.setEditable(false);
                accountNo.setText(acc.getAccountNo());
                accountNo.setEditable(false);
                amount.setText(acc.getAmount());
                amount.setEditable(false);
                monthsPaid.setText(acc.getMonthsPaid());
                monthsPaid.setEditable(false);
                double month=Double.parseDouble(acc.getMonthsPaid());
                double amt = Double.parseDouble(acc.getAmount());
                total.setText(Double.toString(amt*month));
                total.setEditable(false);
            }
        }
    }
    
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNo;
    private javax.swing.JTextField amount;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mobileNo;
    private javax.swing.JTextField monthsPaid;
    private javax.swing.JTextField name;
    private javax.swing.JTextField total;
    private javax.swing.JTextField village;
    // End of variables declaration//GEN-END:variables
}
