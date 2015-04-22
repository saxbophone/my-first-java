public class Account {
    int accountNo;
    double balance;
    String owner;
    static int accountCounter = 0;

    public Account() {
        accountNo = ++accountCounter;
        owner = "Account #" + accountNo;
        balance = 0.0;
    }

    public Account(String own) {
        accountNo = ++accountCounter;
        owner = own;
        balance = 0.0;
    }

    public Account(String own, double bal) {
        accountNo = ++accountCounter;
        owner = own;
        balance = bal;
    }

    public void setAccountNo(int accNo) {
        accountNo = accNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String own) {
        owner = own;
    }

    public String getOwner() {
        return owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
