import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountRegister register = new AccountRegister();

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("Bankkonto:");
            System.out.println("1. Skapa ett konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");
            System.out.print("Välj ett alternativen: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Ange användarens namn: ");
                String owner = scanner.nextLine();

                if (owner.trim().isEmpty()) {
                    System.out.println("Användarens namn får inte vara tomt.");
                } else {
                    System.out.print("Ange ett startbelopp för kontot: ");
                    double startingBalance = readAmount(scanner);

                    if (startingBalance < 0) {
                        System.out.println("Startbeloppet får inte vara mindre än 0.");
                    } else {
                        register.createAccount(owner, startingBalance);
                    }
                }

            } else if (choice.equals("2")) {
                register.listAccounts();

            } else if (choice.equals("3")) {
                System.out.print("Ange användarens namn: ");
                String owner = scanner.nextLine();

                Account account = register.findAccount(owner);

                if (account == null) {
                    System.out.println("Kontot hittades inte.");
                } else {
                    System.out.print("Ange ett belopp att sätta in: ");
                    double amount = readAmount(scanner);
                    account.deposit(amount);
                }

            } else if (choice.equals("4")) {
                System.out.print("Ange användarens namn: ");
                String owner = scanner.nextLine();

                Account account = register.findAccount(owner);

                if (account == null) {
                    System.out.println("Kontot hittades inte.");
                } else {
                    System.out.print("Ange ett belopp att ta ut: ");
                    double amount = readAmount(scanner);
                    account.withdraw(amount);
                }

            } else if (choice.equals("5")) {
                running = false;
                System.out.println("Programmet avslutas.");

            } else {
                System.out.println("Valet finns inte på menyn. Välj ett nummer mellan 1 och 4 för att gå vidare, eller 5 för att avsluta.");
            }
        }

        scanner.close();
    }

    public static double readAmount(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            input = input.replace(',', '.');

            boolean valid = true;
            int decimalPoints = 0;
            int digits = 0;

            for (int i = 0; i < input.length(); i++) {
                char character = input.charAt(i);

                if (character >= '0' && character <= '9') {
                    digits++;
                } else if (character == '.' && decimalPoints == 0) {
                    decimalPoints++;
                } else {
                    valid = false;
                }
            }

            if (digits == 0) {
                valid = false;
            }

            if (valid) {
                double amount = Double.parseDouble(input);

                if (!Double.isInfinite(amount)) {
                    return amount;
                }
            }
            System.out.print(
                    "Skriv ett giltigt belopp, till exempel 500 eller 1000: "
            );
        }
    }
}
