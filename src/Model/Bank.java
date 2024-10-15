package Model;

import java.util.ArrayList;
import java.util.List;

class Bank {

    private String bankName;
    private List<String> branches;
    private List<Account> accounts;
    private List<String> users;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public Account createAccount(String user, String accountType) {

    }

    public Account getAccount(String accountNumber) {

    }

    public List<Account> listAllAccounts() {
        return accounts;
    }

    public void performTransaction(Account fromAccount, Account toAccount, double amount) {

    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
