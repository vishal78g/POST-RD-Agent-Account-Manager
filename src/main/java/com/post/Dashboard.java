
package com.post;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;


public class Dashboard extends javax.swing.JFrame {
    
    
    ArrayList<Account> list = new ArrayList<>();
    String version="1.0.0";
    
    public Dashboard() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUi();
        setTitle("RD Account Manager");
        ImageIcon img=new ImageIcon(getClass().getResource("/Images/logo.jpg"));
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.jpg"));
        
        // Set the icon for the JFrame (affects the taskbar icon and title bar icon)
        setIconImage(icon);
        jLabel1.setIcon(img);
        getContentPane().setBackground(new java.awt.Color(249, 226, 175)); // Dark gray or any color you prefer

    }
    
    
    private void setUi(){
         //UI CUSTOMIZATION
        btnPanel.setBackground(new java.awt.Color(50, 50, 50));
        headerPanel.setBackground(new java.awt.Color(249, 226, 175));  // SteelBlue
        jTable1.setBackground(new java.awt.Color(240, 248, 255));      // AliceBlue
        jTable1.setForeground(Color.BLACK);
        jTable1.setRowHeight(25);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(new java.awt.Color(224, 224, 224));
        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (!isSelected) {
            c.setBackground(row % 2 == 0 ? Color.WHITE : new java.awt.Color(245, 245, 245));
        }
        return c;
        }});
        Font buttonFont = new Font("Segoe UI", Font.BOLD, 12);
        uploadBtn.setFont(buttonFont);
        updateBtn.setFont(buttonFont);
        searchBtn.setFont(buttonFont);
        printBtn.setFont(buttonFont);
        jButton1.setFont(buttonFont);
        uploadBtn.setToolTipText("Upload new accounts from a file");
        searchBtn.setToolTipText("Search existing accounts");
        printBtn.setToolTipText("Print account information");
        jButton1.setToolTipText("Check for application updates");


        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPanel = new javax.swing.JPanel();
        countLable = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(24, 28, 20));

        jScrollPane1.setBackground(new java.awt.Color(24, 28, 20));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No", "Account No.", "Name", "Amount", "Mobile No.", "Village"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(130);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(600);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(70);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(5).setMaxWidth(200);
        jTable1.getTableHeader().setReorderingAllowed(false);
        JTableHeader header = jTable1.getTableHeader();
        Font headerFont= new Font("Segoe UI",Font.BOLD, 14);
        header.setFont(headerFont);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RD Account Manager");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIconTextGap(20);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        countLable.setForeground(new java.awt.Color(255, 255, 255));
        countLable.setText("Count : 000");

        uploadBtn.setText("Upload");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Chcek For Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(uploadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(countLable)
                .addGap(15, 15, 15))
        );
        btnPanelLayout.setVerticalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uploadBtn)
                    .addComponent(jButton1))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.err.println("Windows Look and Feel not available on this platform.");
            e.printStackTrace();
        }   
        showPrintPreview();
}

private void showPrintPreview() {
    // Create a copy of the JTable as a JPanel
    JPanel previewPanel = new JPanel(new BorderLayout());
    JTable previewTable = new JTable(jTable1.getModel());  // Duplicate the table model to show in preview
    previewTable.getColumnModel().getColumn(0).setMaxWidth(50);
    previewTable.getColumnModel().getColumn(1).setMaxWidth(130);
    previewTable.getColumnModel().getColumn(2).setMaxWidth(600);
    previewTable.getColumnModel().getColumn(3).setMaxWidth(70);
    previewTable.getColumnModel().getColumn(4).setMaxWidth(100);
    previewTable.getColumnModel().getColumn(5).setMaxWidth(200);

    previewPanel.add(new JScrollPane(previewTable), BorderLayout.CENTER);

    // Set up preview frame
    JDialog previewDialog = new JDialog(this, "Print Preview", true);
    previewDialog.setSize(800, 600);
    previewDialog.setLayout(new BorderLayout());

    // Add table preview
    previewDialog.add(previewPanel, BorderLayout.CENTER);

    // Add print button in the preview dialog
    JButton printButton = new JButton("Print");
    printButton.addActionListener(e -> {
        previewDialog.dispose();  // Close preview dialog
        printTable();             // Print table when confirmed
    });

    // Add cancel button in the preview dialog
    JButton cancelButton = new JButton("Cancel");
    cancelButton.addActionListener(e -> previewDialog.dispose());

    // Add buttons to the dialog
    JPanel buttonPanel = new JPanel();
    buttonPanel.add(printButton);
    buttonPanel.add(cancelButton);
    previewDialog.add(buttonPanel, BorderLayout.SOUTH);

    // Display the preview dialog
    previewDialog.setLocationRelativeTo(this);
    previewDialog.setVisible(true);
}

// Method to perform the actual printing of the table
private void printTable() {
    MessageFormat header = new MessageFormat("RD Account Manager");
    try {
        jTable1.print(JTable.PrintMode.FIT_WIDTH, header, null);
    } catch (PrinterException e) {
        JOptionPane.showMessageDialog(this, "Printing error: " + e.getMessage(), "Print Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

    }//GEN-LAST:event_printBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int count = UpdateTable.updateFromAccountFile(jTable1);
        countLable.setText("Count : "+count);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        // TODO add your handling code here:
        System.out.println(" upload Button pressed");
        ArrayList newList= ExcelReader.readExcelFile(this);
        if (newList==null){
            JOptionPane.showMessageDialog(rootPane, "File Not Uploaded","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            dataFileEntry.dataEntry(newList);
            JOptionPane.showMessageDialog(rootPane, "File Uploaded","Message",JOptionPane.INFORMATION_MESSAGE);
            int count = UpdateTable.updateFromAccountFile(jTable1);
            countLable.setText("Count : "+count);
        }
    }//GEN-LAST:event_uploadBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        
        Search srch=new Search(jTable1,countLable);
        ArrayList<Account> searchList =srch.getSearchList();
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row=jTable1.rowAtPoint(evt.getPoint());
        String acc=(String)jTable1.getValueAt(row, 1);
        System.out.println(acc);
        new Profile(jTable1,acc);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CheckForUpdate.update(version);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPanel;
    private javax.swing.JLabel countLable;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton printBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables
}
