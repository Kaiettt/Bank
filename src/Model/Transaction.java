package Model;

import java.time.LocalDateTime;

class Transaction {

    private String transactionId;
    private double amount;
    private String transactionType;
    private LocalDateTime timestamp;
    private Account fromAccount;
    private Account toAccount;

    public Transaction(String transactionId, double amount, String transactionType, LocalDateTime timestamp,
            Account fromAccount, Account toAccount) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.timestamp = timestamp;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public String getDetails() {
        return "Transaction ID: " + transactionId + ", Amount: " + amount + ", Type: " + transactionType
                + ", Timestamp: " + timestamp + ", From: " + (fromAccount != null ? fromAccount.getAccountType() + " (" + fromAccount.getBalance() + ")" : "N/A")
                + ", To: " + (toAccount != null ? toAccount.getAccountType() + " (" + toAccount.getBalance() + ")" : "N/A");
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }
}

