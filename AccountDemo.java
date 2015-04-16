public class AccountDemo {
    public static void main(String[] args) {
        Account myAccount = new Account("Joshua Saxby", 100);
        Account myOtherAccount = new Account("Saxbophone", 2000);
        myAccount.getBalance();
        myOtherAccount.getBalance();
        transfer(myAccount, myOtherAccount, 80.0);
        myAccount.getBalance();
        myOtherAccount.getBalance();
    }

    public static void transfer(Account accountFrom, Account accountTo, double amount) {
        accountFrom.withdraw(amount);
        accountTo.deposit(amount);
    }
}
