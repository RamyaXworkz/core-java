package com.xworkz.accountApp.bank;

import com.xworkz.accountApp.Account;
import lombok.Setter;

import java.util.Arrays;
@Setter
public class Bank {
    Account[] account ;
    public Bank(int size){
      account = new Account[size];
    }
    int index;
    int id;
    public boolean addAccounts(Account account){
        System.out.println("invoke addOfficers");
        boolean isAdded = false;
        if(account != null){
            account.setAccId(id++);
            this.account[index++] = account;
            isAdded = true;
        }
        return isAdded ;
    }
    public void getAllAccount(){
        System.out.println("Account lists are");
        for(int index = 0; index < account.length; index++)
        {
            System.out.println(account[index].getAccId()+" "+account[index].getAccounterName()+" "+account[index].getAccNo()+" "+account[index].getAmmout());
        }
    }
    public boolean updateAccounterNameById(String updatedAccounterNo, String exisistingAccounterName){
        boolean isAccounterNoUpdated = false ;
        for (int index = 0; index < this.account.length; index++) {
            if ( account[index].getAccounterName() == exisistingAccounterName){
                account[index].setAccounterName(updatedAccounterNo);
                isAccounterNoUpdated = true;
            }
        }
        return isAccounterNoUpdated;
    }
    public void deleteAccountById(int id) {
        System.out.println("invoked deleteOfficerById ");
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.account.length; index++) {
            if (account[index].getAccId() != id) {
                account[newIndex++] = account[index];
            }
            else {
                System.out.println("Given App Name is been deleted from the SoftwareHub");
            }
        }
        account = Arrays.copyOf(account, newIndex);
        getAllNewApplication(account);
    }
    public void getAllNewApplication(Account application[]){
        System.out.println("Get all new application");
        for (int index = 0; index < application.length; index++) {
            System.out.println(account[index].getAccId()+" "+account[index].getAccounterName()+" "+account[index].getAccNo()+" "+account[index].getAmmout());
        }
    }


}
