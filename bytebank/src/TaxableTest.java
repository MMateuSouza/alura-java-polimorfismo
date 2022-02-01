public class TaxableTest {
  public static void main(String[] args) {
    CurrentAccount currentAccount = new CurrentAccount(1997, 13081997);
    currentAccount.deposit(100);

    LifeInsurance lifeInsurance = new LifeInsurance();

    TaxCalculator taxCalculator = new TaxCalculator();
    taxCalculator.register(currentAccount);
    taxCalculator.register(lifeInsurance);

    System.out.println(taxCalculator.getTotalTaxAmount());
  }
}
