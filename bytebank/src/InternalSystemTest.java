public class InternalSystemTest {
  public static void main(String[] args) {
    Authenticable manager = new Manager();
    manager.setPassword("password");

    Authenticable administrator = new Administrator();
    administrator.setPassword("drowssap");

    Authenticable customer = new Customer();
    customer.setPassword("password");

    InternalSystem internalSystem = new InternalSystem();
    internalSystem.authenticate(manager);
    internalSystem.authenticate(administrator);
    internalSystem.authenticate(customer);
  }
}
