public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.depositMoney(50, "savings");
        System.out.println(account1.getSavingsBalance());
        account1.depositMoney(300, "checking");
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getAccountTotal());
        account1.withdrawMoney(42, "checking");
        account1.withdrawMoney(200, "savings");
        System.out.println(account1.getAccountTotal());
        BankAccount account2 = new BankAccount();
        account2.depositMoney(652, "savings");
        System.out.println(BankAccount.getNumberOfAccounts());
        System.out.println(BankAccount.getTotalMoney());
    }

}