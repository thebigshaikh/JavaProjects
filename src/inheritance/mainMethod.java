package inheritance;

public class mainMethod {
    public static void main(String[] args) {
        savingAccount account = new savingAccount(123, "basil","04-20-1995", 123 ,456);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getSavingAccountNumber());
        System.out.println(account.getBalance());
        account.deposit(100);
        System.out.println(account.getBalance());

    }
}
