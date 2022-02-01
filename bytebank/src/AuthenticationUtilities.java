public class AuthenticationUtilities {
  private String password;

  public boolean authenticate(String password) {
    if (this.password.equals(password)) {
      return true;
    }
    return false;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
