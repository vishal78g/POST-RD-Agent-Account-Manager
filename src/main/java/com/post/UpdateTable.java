
package com.post;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class UpdateTable {
    
    private static String dataFilePath="Accounts.txt";
    
    public static int updateFromList(JTable table,ArrayList<Account> list){
        if(list.size()>0){
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            model.setNumRows(0);
            int counter=0;
            for (Account acc: list){
                String accountNo=acc.getAccountNo();
                String name=acc.getName();
                String amount=acc.getAmount();
                String mobileNo=acc.getMobileNo();
                String village=acc.getVillage();
                model.addRow(new Object[] {counter+1,accountNo,name,amount,mobileNo,village});
                counter++;
            }
            JOptionPane.showMessageDialog(null, "Success", "Message", JOptionPane.INFORMATION_MESSAGE);
            return counter;
        }else{
            JOptionPane.showMessageDialog(null, "No data found", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    
    public static int updateFromAccountFile(JTable table){
        try{
            ArrayList<Account> list=new ArrayList<>();
            File dataFile=  new File(dataFilePath);
            Scanner dataReader=new Scanner(dataFile);
            while(dataReader.hasNextLine()){
                String dataLine=dataReader.nextLine();
                String[] row=dataLine.split(",");
                list.add(new Account (row[0],row[1],row[2],row[3],row[4],row[5] ));   
            }
            dataReader.close();
            int count=updateFromList(table, list);
            return count;
            }
            catch(FileNotFoundException e){
                JOptionPane.showMessageDialog(null , "Data File not found","Error",JOptionPane.ERROR_MESSAGE);
                return 0;
            }
    }
    
}
