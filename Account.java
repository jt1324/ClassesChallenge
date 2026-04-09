public class Account {
    
    private int accountNumber = 1234;
    private double accountBalance = 1500.0;
    private String customerName = "Jhon";
    private String email = "jhon@email.com";
    private String phoneNumber = "1234-5678";

    //getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    //setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account Balance: £" + accountBalance);
        System.out.println("Custoner name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > accountBalance) {
            System.out.println("Not enough funds.");
            
        }
        accountBalance -= withdrawAmount;
        System.out.println("Withdrawal of £" + withdrawAmount + " successful. New balance: £" + accountBalance);
    }

    public void deposit(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of £" + depositAmount + " successful. New balance: £" + accountBalance);
    }

}
