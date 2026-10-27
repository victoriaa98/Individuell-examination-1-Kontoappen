import java.util.ArrayList;

public class AccountRegister {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(String owner, double startingBalance) {
        Account account = new Account(owner, startingBalance);
        accounts.add(account);
        System.out.println("Kontot har skapats.");
    }

    public void listAccounts() {
        if (accounts.size() == 0) {
            System.out.println("Det finns inga konton.");
        } else {
            for (int i = 0; i < accounts.size(); i++) {
                Account account = accounts.get(i);

                System.out.println(
                        "Ägare: " + account.getOwner()
                                + ", saldo: " + String.format("%.2f", account.getBalance())
                                + " kr"
                );
            }
        }
    }

    public Account findAccount(String owner) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);

            if (account.getOwner().equalsIgnoreCase(owner)) {
                return account;
            }
        }
        return null;
    }
}
