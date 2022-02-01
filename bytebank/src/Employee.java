// Não se pode instanciar objetos a partir dessa classe, visto que ela é abstrata
public abstract class Employee {
  private String name;
  private String document;
  private double salary;

  // Métodos Construtores
  // Opcional, será aplicado construtor padrão se não definido
  public Employee() {}

  // Métodos Getters/Setters

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

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  // Métodos abstratos
  // Desprovido de implementações, os herdeiros deverão implementá-lo

  public abstract double getBonus();
}