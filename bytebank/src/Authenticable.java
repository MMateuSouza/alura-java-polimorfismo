public abstract interface Authenticable {

  public abstract boolean authenticate(String password);

  public abstract void setPassword(String password);

}
