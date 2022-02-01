public class TaxCalculator {
  private double totalTaxAmount;

  public void register(Taxable taxable) {
    this.totalTaxAmount += taxable.getTaxAmount();
  }

  public double getTotalTaxAmount() {
    return this.totalTaxAmount;
  }
}
