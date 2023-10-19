package com.xworkz.yono.sbi.savings;

import com.xworkz.yono.BankAccount;

public class SavingsAccount extends BankAccount {

    double intrestRate = 2.5;

    public SavingsAccount(){

        System.out.println("SavingAccount with Zero balance is created");
    }

    public SavingsAccount(double minBalance){
        System.out.println("SavingAccount with minimum balance is created");
        this.credit((int)minBalance);
    }

    public void calculateIntrest(){
        double intrestAmount = intrestRate * getBalance() / 100 ;
        System.out.println(intrestAmount);
    }
}
