public class ManagerTest {
  public static void main(String[] args) {
    Manager manager = new Manager();
    manager.setName("Mateus");
    manager.setDocument("999.888.777-66");
    manager.setSalary(15500.50);
    manager.setPassword("123456");

    System.out.println(manager.getName());
    System.out.println(manager.getDocument());
    System.out.println(manager.getSalary());
    System.out.println(manager.authenticate(""));
  }
}
