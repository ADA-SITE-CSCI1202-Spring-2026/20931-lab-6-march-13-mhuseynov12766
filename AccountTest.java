public class AccountTest {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Bob", 1000000);

        acc.deposit(500);
        System.out.println("Balance after deposit: " + acc.getBalance());

        try {
            acc.withdraw(1000);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final balance: " + acc.getBalance());
    }
}
