
package com.post;

import static com.post.dataFileEntry.dataFilePath;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class dataFileEntry {
    
    static String dataFilePath="Accounts.txt";
    
    
    public static int dataEntry(ArrayList<Account> newlist){
        File file=new File(dataFilePath);
        if(file.exists()){
            ArrayList<Account> oldList=dataFileReader.read();
            for (Account newAccount:newlist){
                boolean found=false;
                for (Account OldAccount:oldList){
                    if (newAccount.getAccountNo().equals(OldAccount.getAccountNo())){
                        System.out.println(OldAccount.toString());
                        System.out.println(newAccount.toString());
                        OldAccount.setMonthsPaid(newAccount.getMonthsPaid());
                        found=true;
                        break;
                    }
                }
                if(!found){
                    oldList.add(newAccount);
                }
            }
//            System.out.println("Writing to exixsting file ");
            write(oldList);
            return 1;    
            
        }else{
//            System.out.println("Writing to new file ");
            write(newlist);
            return 1;
        }
    }
    
    public static void saveChanges(ArrayList<Account> list){
        write(list);
    }
    
    
 
    public static void write(ArrayList<Account> list){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(dataFilePath))){
            for (Account account: list){
                bw.write(account.toString());
                bw.newLine();
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error while writing to Accounts.txt","Error",JOptionPane.ERROR_MESSAGE);      
        } 
    }





}
