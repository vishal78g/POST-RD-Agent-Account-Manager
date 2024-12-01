
package com.post;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Search extends javax.swing.JFrame {
    
    ArrayList<Account> list=dataFileReader.read();
    ArrayList<Account> searchList=new ArrayList<>();
    JTable table;
    JLabel countLable;
        
    public Search() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public Search(JTable table,JLabel countLable) {
        initComponents();
        this.countLable=countLable;
        this.table=table;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setUI();
        
        setTitle("Search");
    }
    
    
    private void setUI() {
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.jpg"));
        
        // Set the icon for the JFrame (affects the taskbar icon and title bar icon)
        setIconImage(icon);
        // Set frame title and dimensions
        setTitle("Account Search");

        // Create main panel with GridBagLayout


        // Title label
        JLabel titleLabel = new JLabel("Search Account");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setForeground(new Color(34, 40, 49)); // A subtle dark color for the title
        searchBtn.setBackground(new Color(102, 205, 170)); // Light teal color for primary button
        searchBtn.setFont(new Font("Arial", Font.BOLD, 12));


        resetBtn.setBackground(new Color(211, 211, 211)); // Light gray for secondary buttons
        resetBtn.setFont(new Font("Arial", Font.BOLD, 12));

        cancelBtn.setBackground(new Color(255, 69, 0));
        cancelBtn.setFont(new Font("Arial", Font.BOLD, 12));

    
}

    
 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        accountNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mobileNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        village = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Account No.");

        jLabel2.setText("Mobile No.");

        jLabel3.setText("Village");

        jLabel4.setText("Amount");

        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Search Account");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(village, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(accountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancelBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resetBtn))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(village, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelBtn)
                        .addComponent(resetBtn)))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        name.setText(null);
        amount.setText(null);
        village.setText(null);
        mobileNo.setText(null);
        accountNo.setText(null);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) table.getModel();
        model.setNumRows(0);
        
        if (name.getText().length()>0 && village.getText().length()>0){
            findByNameAndVillage(name.getText(),village.getText());
        }else if (amount.getText().length()>0 && village.getText().length()>0){
            findByAmountAndVillage(amount.getText(),village.getText());
        }else if (accountNo.getText().length()>0){
            if(accountNo.getText().startsWith("0")){
                String accountNo=this.accountNo.getText().substring(1);
                findByAccountNo(accountNo);
            }else{
                findByAccountNo(accountNo.getText());
            }
        }else if (name.getText().length()>0){
            findByName(name.getText());
        }else if (mobileNo.getText().length()>0){
            if(isMobileNoValid()==true){
                findByMobileNo(mobileNo.getText());
            }
        }else if (amount.getText().length()>0){
            findByAmount(amount.getText());
        }else if (village.getText().length()>0){
            findByVillage(village.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    
    private boolean isMobileNoValid(){
        if (mobileNo.getText().length()!=10){
            JOptionPane.showMessageDialog(this, "Invalid Mobile Number","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
    
    public void findByNameAndVillage(String name,String village){
        ArrayList<Account> newList= new ArrayList<>();
        for(Account acc :list){
                if (acc.getName().toLowerCase().equals(name.toLowerCase())
                        && acc.getVillage().toLowerCase().contains(village.toLowerCase())){
                    newList.add(acc);
                }
        }
        if(newList.size()>0){
            dispose();
            searchList=newList;
            int count = UpdateTable.updateFromList(table, newList);
            countLable.setText("Count : "+count);
            
        }else{
            JOptionPane.showMessageDialog(this, "No Account found..!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void findByAmountAndVillage(String amount,String village){
        ArrayList<Account> newList= new ArrayList<>();
        for(Account acc :list){
                if (acc.getAmount().equals(amount)
                        && acc.getVillage().toLowerCase().contains(village.toLowerCase())){
                    newList.add(acc);
                }
        }
        if(newList.size()>0){
            dispose();
            searchList=newList;
            int count = UpdateTable.updateFromList(table, newList);
            countLable.setText("Count : "+count);
            
        }else{
            JOptionPane.showMessageDialog(this, "No Account found..!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void findByAccountNo(String accountNo){
        ArrayList<Account> newList= new ArrayList<>();
        for(Account acc :list){
                if (acc.getAccountNo().equals(accountNo)){
                    newList.add(acc);
                }
        }
        if(newList.size()>0){
            dispose();
            searchList=newList;
            int count = UpdateTable.updateFromList(table, newList);
            countLable.setText("Count : "+count);
            
        }else{
            JOptionPane.showMessageDialog(this, "No Account found..!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void findByName(String name){
        ArrayList<Account> newList= new ArrayList<>();
        for(Account acc :list){
                if (acc.getName().toLowerCase().contains(name.toLowerCase())){
                    newList.add(acc);
                }
        }
        if(newList.size()>0){
            dispose();
            searchList=newList;
            int count = UpdateTable.updateFromList(table, newList);
            countLable.setText("Count : "+count);
        }else{
            JOptionPane.showMessageDialog(this, "No Account found..!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void findByMobileNo(String mobileNo){
        ArrayList<Account> newList= new ArrayList<>();
        for(Account acc :list){
                if (acc.getMobileNo().equals(mobileNo)){
                    newList.add(acc);
                }
        }
        if(newList.size()>0){
            dispose();
            searchList=newList;
            int count = UpdateTable.updateFromList(table, newList);
            countLable.setText("Count : "+count);
            
        }else{
            JOptionPane.showMessageDialog(this, "No Account found..!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void findByVillage(String village){
        ArrayList<Account> newList= new ArrayList<>();
        for(Account acc :list){
                if (acc.getVillage().toLowerCase().contains(village.toLowerCase())){
                    newList.add(acc);
                }
        }
        if(newList.size()>0){
            dispose();
            searchList=newList;
            int count = UpdateTable.updateFromList(table, newList);
            countLable.setText("Count : "+count);
        }else{
            JOptionPane.showMessageDialog(this, "No Account found..!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void findByAmount(String amount){
        ArrayList<Account> newList= new ArrayList<>();
        for(Account acc :list){
                if (acc.getAmount().equals(amount)){
                    newList.add(acc);
                }
        }
        if(newList.size()>0){
            dispose();
            searchList=newList;
            int count = UpdateTable.updateFromList(table, newList);
            countLable.setText("Count : "+count);
        }else{
            JOptionPane.showMessageDialog(this, "No Account found..!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public ArrayList<Account> getSearchList(){
        return searchList;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNo;
    private javax.swing.JTextField amount;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mobileNo;
    private javax.swing.JTextField name;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField village;
    // End of variables declaration//GEN-END:variables
}
