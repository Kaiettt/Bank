package Model;

import java.util.ArrayList;
import java.util.List;

abstract class Account {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionList;
    private Bank bank;
 

    public Account(String accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionList = new ArrayList<>();
        this.bank = bank;
    }

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    public void addTransaction(Transaction transaction) {

    }

    public double getBalance() {

    }

    public List<Transaction> getTransactions() {

    }

    public abstract String getAccountType();

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
