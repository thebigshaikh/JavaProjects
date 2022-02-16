package inheritance;

public class savingAccount extends account {

    private int savingNumber;

    private String savingAccountNumber;

    public savingAccount(int accountNumber, String accountName, String dob, int cellNumber, int savingNumber) {
        super(accountNumber, accountName, dob, cellNumber);
        this.savingNumber = savingNumber;
        setSavingAccountNumber(this.savingNumber);
    }

    public void setSavingAccountNumber(int savingAccountNumber) {
        int num1 = getAccountNumber();
        this.savingAccountNumber = Integer.toString(num1)+Integer.toString(this.savingNumber);
    }

    public String getSavingAccountNumber() {
        return savingAccountNumber;
    }

    public void deposit(int amount){
        if(amount > 0){
            double currentBalance = getBalance();
            setBalance(amount);
        }
    }
}
