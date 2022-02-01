public class Manager extends Employee implements Authenticable {
  private AuthenticationUtilities authenticationUtilities;

  public Manager() {
    this.authenticationUtilities = new AuthenticationUtilities();
  }

  // Reescrita de método
  @Override
  public double getBonus() {
    return super.getSalary();
  }

  // Implementação dos métodos da Interface
  @Override
  public void setPassword(String password) {
    this.authenticationUtilities.setPassword(password);
  }

  @Override
  public boolean authenticate(String password) {
    return this.authenticationUtilities.authenticate(password);
  }
}
