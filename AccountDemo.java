import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Account myAccount = new Account("Joshua Saxby");
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
        System.out.println("4 - Show Account Info");
        System.out.println("5 - Print Account Info");
        System.out.println("6 - Exit this screen.");
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
                byte sucess = acc.withdraw(dd);
                if (sucess == 1) {
                    System.out.print("Sorry, you do not have enough funds to make this Withdrawal.\n");
                }
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
            case 5:
                System.out.println("Saving Bank Account details to file...");
                byte saved = acc.fileWrite();
                if (saved == 0) {
                    System.out.println("Sucess!");
                }
                else {
                    System.out.println("Failed!");
                }
                break;
            case 6:
                System.out.println("Thank you for Banking with Ultra Mega Corp Ltd");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
        return choice;
    }
}
