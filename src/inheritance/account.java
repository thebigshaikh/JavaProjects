package inheritance;

import java.util.Date;

public class account {
    private int accountNumber;
    private String accountName;
    private String dob;
    private int cellNumber;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getDob() {
        return dob;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    protected void setBalance(int balance) {
        this.balance += balance;
    }

    public account(int accountNumber, String accountName, String dob, int cellNumber) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.dob = dob;
        this.cellNumber = cellNumber;
    }
}
