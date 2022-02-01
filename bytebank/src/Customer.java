public class Customer implements Authenticable {
  private String name;
  private String document;
  private String profession;
  private AuthenticationUtilities authenticationUtilities;


  public Customer() {
    this.authenticationUtilities = new AuthenticationUtilities();
  }

  // Métodos Getters e/ou Setters

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDocument() {
    return this.document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public String getProfession() {
    return this.profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
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