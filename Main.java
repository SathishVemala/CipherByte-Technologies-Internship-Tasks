import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.next();
                    bank.createAccount(accountNumber, accountHolderName);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    Account depositAccount = bank.getAccount(accountNumber);
                    if (depositAccount != null) {
                        depositAccount.deposit(depositAmount);
                        bank.saveAccounts();
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    Account withdrawAccount = bank.getAccount(accountNumber);
                    if (withdrawAccount != null) {
                        withdrawAccount.withdraw(withdrawAmount);
                        bank.saveAccounts();
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter your account number: ");
                    String fromAccountNumber = scanner.next();
                    System.out.print("Enter target account number: ");
                    String toAccountNumber = scanner.next();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    Account fromAccount = bank.getAccount(fromAccountNumber);
                    Account toAccount = bank.getAccount(toAccountNumber);
                    if (fromAccount != null && toAccount != null) {
                        fromAccount.transfer(toAccount, transferAmount);
                        bank.saveAccounts();
                        System.out.println("Transfer successful.");
                    } else {
                        System.out.println("One or both accounts not found.");
                    }
                    break;
                case 5:
                    bank.showAllAccounts();
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
