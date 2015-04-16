public class Account {
    int accountNo = 0;
    double balance = 0.0;
    String owner = " ";

    public void Account() {
        accountNo = 0;
        balance = 0.0;
        owner = " ";
    }

    public void setAccountNo(int accNo) {
        accountNo = accNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setBalance(double bal) {
        System.out.println("Set balance of account " + accountNo + " to " + bal);
        balance = bal;
    }

    public double getBalance() {
        System.out.println("Balance of account " + accountNo + " is " + balance);
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
