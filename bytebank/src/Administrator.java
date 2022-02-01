public class Administrator extends Employee implements Authenticable {
  private AuthenticationUtilities authenticationUtilities;

  public Administrator() {
    this.authenticationUtilities = new AuthenticationUtilities();
  }

  @Override
  public double getBonus() {
    return 50;
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
