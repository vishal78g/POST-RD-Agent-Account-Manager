
package com.post;

import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
    

    public static ArrayList<Account> readExcelFile( JFrame frame){
         try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.err.println("Windows Look and Feel not available on this platform.");
            e.printStackTrace();
        }
        ArrayList<Account> newList= new ArrayList<>(); // for newList 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select an Excel file");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xls", "xlsx");
        fileChooser.setFileFilter(filter);
        int res= fileChooser.showOpenDialog(frame); // 
        if (res==JFileChooser.APPROVE_OPTION){ 
            try(FileInputStream fis=new FileInputStream(fileChooser.getSelectedFile().getAbsolutePath())){       
                Workbook workbook = new XSSFWorkbook(fis);
                Sheet sheet =workbook.getSheetAt(0);
                for (Row row:sheet){
                    long accountNo= (long) row.getCell(1).getNumericCellValue();
                    String accNo=Long.toString(accountNo);
                    String name = row.getCell(2).getStringCellValue();
                    String amt = row.getCell(3).getStringCellValue();
                    String amount=amountVerify(amt);
                    double monthsPaid=row.getCell(4).getNumericCellValue();
                    String months=Double.toString(monthsPaid);
                    System.out.println(accNo+","+ name+","+ amount+","+" "+","+" "+","+ months);
                    newList.add(new Account(accNo, name, amount,"","", months));
                }
                fis.close();
                
                System.out.println("Data from excel file ");
                for (Account acc: newList){
                    
                    System.out.println(acc.toString());
                }
                
                System.out.println("\n\n");
                
                return newList;
            }
            // Catch block to handle exceptions
            catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
                JOptionPane.showMessageDialog(frame,"Invalid Format Plaese Provide in the below format \n | Sr.No.| Account No. | Name | Amount | MonthsPaidUpto |", "Error", res);

            }
        }
        return null;
    }
    
    
    private static String amountVerify(String amt){
        String amount;
        if (amt.contains(",")){
            amount=amt.replace(",", "");
            amount=amount.replace(".00 Cr.", "");
            return amount;
        }else{
            amount=amt;
            amount=amount.replace(".00 Cr.", "");
            return amount;
        }
    }
    
    
}
