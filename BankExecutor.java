package com.xworkz.yono; //standard package


import com.xworkz.yono.sbi.savings.SavingsAccount;

import java.util.Date;

public class BankExecutor {
    public static void main(String[] args) {

        BankAccount myAccount = new SavingsAccount(500);

        System.out.println("Crediting the amount 5000 to My Account ");
        myAccount.credit(5000);
        System.out.println("Crediting the amount 500 to My Account");
        myAccount.credit(500);
        System.out.println("Available Balance on my Account is "+myAccount.getBalance());
        myAccount.debit(300);

        SavingsAccount mySavingsAccount = (SavingsAccount) myAccount;
        mySavingsAccount.calculateIntrest();
        System.out.println("Balance after intrest rate "+ mySavingsAccount);

        //type casting - up / polymorphism
        System.out.println("---------First Transaction--------");
        SavingsAccount friendsAccount = new SavingsAccount();
        System.out.println("Transferring 500 to my frineds account");
        myAccount.transfer(500,friendsAccount);
        System.out.println("Available balance on Friends Account "+friendsAccount.getBalance());

        System.out.println("--------Second Transaction--------");
        SavingsAccount pappaAccount = new SavingsAccount();
        System.out.println("Transferring 400 to my pappa account");
        myAccount.transfer(400,pappaAccount);
        System.out.println("Available balance on Pappa Account "+pappaAccount.getBalance());

        System.out.println("--------Third Transaction---------");
        SavingsAccount ammaAccount = new SavingsAccount();
        System.out.println("Transferring 300 to my amma account");
        myAccount.transfer(300,ammaAccount);
        System.out.println("Available balance on Amma Account "+ammaAccount.getBalance());

        System.out.println("--------Fourth Transaction--------");
        SavingsAccount brotherAccount = new SavingsAccount();
        System.out.println("Transferring 200 to my brother account");
        myAccount.transfer(200,brotherAccount);
        System.out.println("Available balance on brother Account "+brotherAccount.getBalance());

        System.out.println("---------Fifth Transaction---------");
        SavingsAccount sisterAccount = new SavingsAccount();
        System.out.println("Transferring 100 to  sister account");
        myAccount.transfer(100,sisterAccount);
        System.out.println("Available balance on sister Account "+sisterAccount.getBalance());

        System.out.println("--------Sixth Transaction---------");
        SavingsAccount naniAccount = new SavingsAccount();
        System.out.println("Transferring 100 to  nani account");
        myAccount.transfer(100,naniAccount);
        System.out.println("Available balance on nani Account "+naniAccount.getBalance());

        System.out.println("-------Seventh Transaction--------");
        SavingsAccount tataAccount = new SavingsAccount();
        tataAccount.credit(10000);
        System.out.println("Transferring 4000 to my account from tata account");
        tataAccount.transfer(4000 , myAccount);
        System.out.println("Available balance on tata Account "+tataAccount.getBalance());

        System.out.println("---------Eighth Transaction---------");
        pappaAccount.credit(50000);
        System.out.println("Transferring 24000 to my account from pappa account");
        pappaAccount.transfer(24000 , myAccount);
        System.out.println("Available balance on Pappa Account "+pappaAccount.getBalance());

        System.out.println("-------Nineth Transaction--------");
        SavingsAccount xworkzAccount = new SavingsAccount();
        System.out.println("Transferring 24000 to  xworkz account");
        myAccount.transfer(24000,xworkzAccount);
        System.out.println("Available balance on xworkz Account "+xworkzAccount.getBalance());

        System.out.println("------Tenth Transaction-------");
        SavingsAccount hospitalAccount = new SavingsAccount();
        System.out.println("Transferring 2000 to hospital account");
        myAccount.transfer(2000,hospitalAccount);
        System.out.println("Available balance on hospital Account "+hospitalAccount.getBalance());


        Date accountcreation = new Date();
        System.out.println(accountcreation);


    }
}
