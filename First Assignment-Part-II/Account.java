class Account {
    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    public Account(String accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
        displayBalance();
    }

    public void applyInterest() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        balance += balance * monthlyInterestRate;
        System.out.println("Interest applied. New balance: $" + balance);
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Protected getter for balance
    protected double getBalance() {
        return balance;
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double annualInterestRate, double overdraftLimit) {
        super(accountNumber, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Exceeded overdraft limit. Withdrawal failed.");
        }
        displayBalance();
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot go overdrawn. Withdrawal failed.");
        }
        displayBalance();
    }
}


