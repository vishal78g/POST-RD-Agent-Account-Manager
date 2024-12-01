
package com.post;


public class Account {
    
    private String accountNo;
    private String name;
    private String amount;
    private String village;
    private String mobileNo;
    private String monthsPaid;
    
    public Account(String accountNo,String name,String amount,String mobileNo, String village,  String monthsPaid){
        this.accountNo=accountNo;
        this.amount=amount;
        this.name=name;
        this.mobileNo=mobileNo;
        this.village=village;
        this.monthsPaid=monthsPaid;
    }
    
    
    
    @Override
    public String toString(){
        return accountNo+","+
                name+","+
                amount+","+
                mobileNo+","+
                village+","+
                monthsPaid;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMonthsPaid() {
        return monthsPaid;
    }

    public void setMonthsPaid(String monthsPaid) {
        this.monthsPaid = monthsPaid;
    }
    
    
    
}
