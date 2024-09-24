public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(2024, "Jasmina Kiyalbek kyzy");

        account.deposit(2000.00);
        account.deposit(39000.00);
        account.withdraw(15000.00);
        account.withdraw(650.00);

        System.out.println("Current Balance: " + account.getBalance());
        account.printTransactionHistory();
    }
}
