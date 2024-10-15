package Model;

import java.util.ArrayList;
import java.util.List;

class User {

    private String userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String password;
    private List<Account> accountList;
    private String role;

    public User(String userId, String name, String email, String phoneNumber, String address, String password, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        this.accountList = new ArrayList<>();
        this.role = role;
    }

    public void updateDetails(String name, String email, String phoneNumber, String address) {

    }

    public Account getAccount(String accountNumber) {

    }

    public void changePassword(String newPassword) {

    }

    public void addAccount(Account account) {

    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
                + ", address=" + address + ", role=" + role + "]";
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

