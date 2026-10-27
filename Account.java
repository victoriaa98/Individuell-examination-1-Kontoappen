public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double startingBalance) {
        this.owner = owner;
        this.balance = startingBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Beloppet ska vara mer/större än 0.");
        } else {
            balance = balance + amount;
            System.out.println("Pengarna är nu insatta på ditt konto.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Önskat belopp måste vara mer än 0.");
        } else if (amount > balance) {
            System.out.println("Det finns inte tillräckligt med pengar på kontot.");
        } else {
            balance = balance - amount;
            System.out.println("Pengarna har tagits ut.");
        }
    }
}
