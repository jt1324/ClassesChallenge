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

    public void setAccountNumber(double accountBalance) {
        if (accountBalance < 0) {
            System.out.println("Not enough founds.");
        } else {
            this.accountBalance = accountBalance;
        }
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

}
