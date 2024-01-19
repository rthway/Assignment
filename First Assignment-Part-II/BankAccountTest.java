public class BankAccountTest {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount("C12345", 1000, 1.5, 500);
        SavingsAccount savings = new SavingsAccount("S67890", 2000, 2.0);

        checking.deposit(200);
        checking.withdraw(1500);

        savings.deposit(500);
        savings.withdraw(2500);
    }
}
