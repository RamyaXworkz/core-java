package com.xworkz.yono;

public class BankAccount {

    private double balance;


    public void debit(int amount) {
        System.out.println("debiting the amount "+amount+" from My account");
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Remaning balance on my Account is " + balance);
        }
    }
    public void credit(int amount){

        this.balance = balance + amount ;
    }

    public void transfer(int amount , BankAccount benificiaryAccount ){
        this.debit(amount);
        benificiaryAccount.credit(amount);
    }
    public double getBalance() {
        return balance;

    }
}
