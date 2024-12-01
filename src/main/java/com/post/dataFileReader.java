
package com.post;

import static com.post.UpdateTable.updateFromList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class dataFileReader {
    
    private static String dataFilePath="Accounts.txt";
    
    public static ArrayList<Account> read(){
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
            return list;
            }
            catch(FileNotFoundException e){
                JOptionPane.showMessageDialog(null , "Data File not found","Error",JOptionPane.ERROR_MESSAGE);
                return null;
            }
    }
    
}
