package com.xworkz.accountApp;

import com.xworkz.accountApp.bank.Bank;

import java.util.Scanner;

public class AccountExecutor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of Accounts to be created");
        int size = scanner.nextInt();
        Bank bank = new Bank(size);
        for (int index = 0; index < size; index++) {
            Account account = new Account();

            System.out.println("enter the Accounter name");
            account.setAccounterName(scanner.next());
            System.out.println("enter the account number");
            account.setAccNo(scanner.nextLong());
            System.out.println("enter the ammount");
            account.setAmmout(scanner.nextInt());
            bank.addAccounts(account);
        }
         bank.getAllAccount();

    }
}
