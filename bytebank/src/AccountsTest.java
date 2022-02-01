public class AccountsTest {
  public static void main(String[] args) {
    CurrentAccount currentAccount = new CurrentAccount(1997, 13081997);
    currentAccount.deposit(100);

    SavingsAccount savingsAccount = new SavingsAccount(0001, 01022022);
    savingsAccount.deposit(200);

    currentAccount.transfer(savingsAccount, 10);

    System.out.println("Conta Corrente: R$ " + currentAccount.getBalance());
    System.out.println("Conta Poupança: R$ " + savingsAccount.getBalance());
  }
}
