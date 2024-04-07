package BankApplication.account;

/**
 * Account
 */
public class Account {
    private String name;
    private double balance;
    private String accountNumber;
    private String accountType;
    private String accountStatus;
    private String address;
    private String email;
    private int pincode;
    private long contactNumber; 
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAccountStatus() {
        return accountStatus;
    }
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }  
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public long getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
    public Account(String name, double balance, String accountNumber, String accountType, String accountStatus, String address, String email, int pincode, long contactNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
        this.address = address;
        this.email = email;
        this.pincode = pincode;
        this.contactNumber = contactNumber;
    }
    public Account(){}
}