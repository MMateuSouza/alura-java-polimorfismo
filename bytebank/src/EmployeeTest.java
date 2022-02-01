public class EmployeeTest {
  public static void main(String[] args) {
    Employee employee = new Manager();

    employee.setName("Mateus");
    employee.setDocument("000.111.222-33");
    employee.setSalary(1250.99);

    System.out.println(employee.getName());
    System.out.println(employee.getBonus());
    System.out.println(employee.getDocument());
  }
}