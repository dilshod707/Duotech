package Assignment28;

public abstract class BankAccount {

    Long accountNumber;
    String accountHolder;
    Double balance;

    public BankAccount(Long accountNumber, String accountHolder, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public abstract void deposit(double amount);

   // public abstract void withdraw(double amount) throws InsufficientFundsException;

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
//
//    Methods:
//
//    Constructor
//    Getter and Setter for each field
//    deposit(double amount): abstract method. Increases the balance by the amount. Should be implemented in subclasses.
//    withdraw(double amount): abstract method. Decreases the balance by the amount. Throws a custom exception InsufficientFundsException if balance is insufficient.       InsufficientFundsException class details are given below. Should be implemented in a subclasses.
//    toString(): Overridden from Object class

}
