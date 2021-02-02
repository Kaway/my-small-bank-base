package fr.paris8.iutmontreuil.mysmallbank.account.domain.model;

public enum AccountType {

    TRANSACTION(-1000, 0), // Compte courrant
    SAVINGS(0, 1), // Un Livret A, on peut verser et retirer à tout moment, un minimum à avoir, ainsi que des intérêts
    PEL(300, 1.50); // On peut verser à tout moment, un minimum à l'ouverture, on ne peut pas retirer avant 4 ans, et le retrait cloture

    private final int minimumBalance;
    private final double interestRate;

    AccountType(int minimumBalance, double interestRate) {
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
