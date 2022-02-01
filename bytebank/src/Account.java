public abstract  class Account {
  // Atributos de Instância
  private double balance;
  private int bankBranch;
  private int number;
  private Customer holder;

  // Atributos Estáticos
  private static int accountsQuantity;

  // Método Construtor

  public Account() {}

  public Account(int bankBranch, int number) {
    this.bankBranch = bankBranch;
    this.number = number;
    Account.accountsQuantity++;
  }

  // Métodos Estáticos

  public static int getAccountsQuantity() {
    return accountsQuantity;
  }

  // Métodos Getters e/ou Setters

  public double getBalance() {
    return this.balance;
  }

  public int getBankBranch() {
    return this.bankBranch;
  }

  public void setBankBranch(int bankBranch) {
    if (bankBranch <= 0) {
      System.out.println("Agência não pode ser valor negativo ou zero.");
      return;
    }
    this.bankBranch = bankBranch;
  }

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    if (number <= 0) {
      System.out.println("Número da conta não pode ser negativo ou zero.");
      return;
    }
    this.number = number;
  }

  public Customer getHolder() {
    return this.holder;
  }

  public void setHolder(Customer holder) {
    this.holder = holder;
  }

  // Métodos

  public void deposit(double value) {
    if (value > 0) {
      this.balance += value;
    }
  }

  public boolean withdraw(double value) {
    if (this.balance >= value) {
      this.balance -= value;
      return true;
    }
    return false;
  }

  public boolean transfer(Account destination, double value) {
    if (this.withdraw(value)) {
      destination.deposit(value);
      return true;
    }
    return false;
  }
}