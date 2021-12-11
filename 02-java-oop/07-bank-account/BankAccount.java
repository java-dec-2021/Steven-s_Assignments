import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalMoney;

    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }

    public void depositMoney(double amount, String account) {
        if (account.equals("checking")) {
            this.setCheckingBalance(this.getCheckingBalance() + amount);
        } else if (account.equals("savings")) {
            this.setSavingsBalance(this.getSavingsBalance() + amount);
        }
        totalMoney = totalMoney + amount;
    }

    public void withdrawMoney(double amount, String account) {
        if (account.equals("checking")) {
            if (this.getCheckingBalance() - amount < 0) {
                System.out.println("Insufficient Funds in Checking Account");
            } else {
                this.setCheckingBalance(this.getCheckingBalance() - amount);
                totalMoney = totalMoney - amount;
            }
        } else if (account.equals("savings")) {
            if (this.getSavingsBalance() - amount < 0) {
                System.out.println("Insufficient Funds in Savings Account");
            } else {
                this.setSavingsBalance(this.getSavingsBalance() - amount);
                totalMoney = totalMoney - amount;
            }
        }
    }

    public double getAccountTotal() {
        return (this.getCheckingBalance() + this.getSavingsBalance());
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    private void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    private void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void setNumberOfAccounts(int numberOfAccounts) {
        BankAccount.numberOfAccounts = numberOfAccounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }
}