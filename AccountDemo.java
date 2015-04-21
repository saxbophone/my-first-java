import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Account myAccount = new Account("Joshua Saxby", 0.0);
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            runInterface(keyboard, myAccount);
        }
    }

    public static void transfer(Account accountFrom, Account accountTo, double amount) {
        accountFrom.withdraw(amount);
        accountTo.deposit(amount);
    }

    public static int runInterface(Scanner input, Account acc) {
        System.out.println("===============================");
        System.out.println("Ultra Mega Corp Ltd ATM Machine");
        System.out.println("===============================");
        System.out.println("Choose an Option:");
        System.out.println("1 - Show Account Balance");
        System.out.println("2 - Make a Withdrawal");
        System.out.println("3 - Make a Deposit");
        System.out.println("4 - Show account Info");
        System.out.println("===============================");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        double dd;
        System.out.println("===============================");
        switch (choice) {
            case 1:
                System.out.println("Account Balance: " + acc.getBalance());
                break;
            case 2:
                System.out.print("Enter Amount to Withdraw: ");
                dd = input.nextDouble();
                acc.withdraw(dd);
                break;
            case 3:
                System.out.print("Enter Amount to Deposit: ");
                dd = input.nextDouble();
                acc.deposit(dd);
                break;
            case 4:
                System.out.println("Showing information for account number " + acc.accountNo + ":");
                System.out.println("Name of account Holder: " + acc.owner);
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
        return choice;
    }
}
