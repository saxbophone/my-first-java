public class AccountDemo {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account myOtherAccount = new Account();
        myAccount.setBalance(100);
        myOtherAccount.setBalance(2000);
        transfer(myAccount, myOtherAccount, 80.0);
        myAccount.getBalance();
        myOtherAccount.getBalance();
    }

    public static void transfer(Account accountFrom, Account accountTo, double amount) {
        accountFrom.withdraw(amount);
        accountTo.deposit(amount);
    }
}
