/*
 *
 *  * Copyright (c) 2022.
 *  * Vahid Alizadeh
 *  * Object-oriented Software Development
 *  * DePaul University
 *
 */

package DesignPatterns.Singleton.BankAccountUsecase;

public class CreateBankAccount {
    private static CreateBankAccount newAccount;
    // constructor
    private CreateBankAccount() {
    }
    public static CreateBankAccount getNewAccount() {
        if (newAccount == null) {
            newAccount = new CreateBankAccount();
            System.out.println("New Account created.");
        } else {
            System.out.println("Account already opened.");
        }
        return newAccount;
    }
}