import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;
    private static final String DATA_FILE = "accounts.dat";

    public Bank() {
        accounts = new HashMap<>();
        loadAccounts();
    }

    public void createAccount(String accountNumber, String accountHolderName) {
        if (!accounts.containsKey(accountNumber)) {
            Account account = new Account(accountNumber, accountHolderName);
            accounts.put(accountNumber, account);
            saveAccounts();
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account with this number already exists.");
        }
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    private void saveAccounts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(accounts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadAccounts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            accounts = (Map<String, Account>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Ignore, as the file will be created when we save the accounts.
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void showAllAccounts() {
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }
}
