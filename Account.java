import java.io.*;


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

    public byte withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return 0;
        }
        else {
            return 1;
        }
    }

    public byte fileWrite() {
        String fileName = "accountInfo.txt";
        String output = "Account Holder: " + owner + "\n" + "Balance: " + balance + "\n";
        try {
            FileWriter writer = new FileWriter(fileName);
            PrintWriter printer = new PrintWriter(writer);
            printer.print(output);
            printer.close();
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            return 1;
        }
    }
}
