public class InternalSystem {
  private String password = "password";

  public void authenticate(Authenticable authenticable) {
    boolean success = authenticable.authenticate(password);
    if (success) {
      System.out.println("Usuário autenticado!");
      return;
    }
    System.out.println("Credenciais inválidas");
    return;
  }
}
