public class CurrentAccount extends Account implements Taxable {
  public CurrentAccount(int bankBranch, int number) {
    super(bankBranch, number);
  }

  @Override
  public boolean withdraw(double value) {
    double amountToBeWithdraw = value + 0.2;
    return super.withdraw(amountToBeWithdraw);
  }

  @Override
  public double getTaxAmount() {
    return super.getBalance() * 0.01;
  }
}
