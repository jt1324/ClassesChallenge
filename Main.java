public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.printAccountDetails();
        account.with(500.0);
        account.deposit(1000.5);
    }
}
