public class BonusControl {
  private double bonusSum;

  // #01 - Implementação sem utilizar polimorfismo

  // public void register(Manager manager) {
  //   this.bonusSum += manager.getBonus();;
  // }

  // public void register(Employee employee) {
  //   this.bonusSum += employee.getBonus();;
  // }

  // public void register(VideoEditor videoEditor) {
  //   this.bonusSum += videoEditor.getBonus();;
  // }

  // #02 - Implementação utilizando polimorfismo (Duck-Typing)

  public void register(Employee employee) {
    this.bonusSum += employee.getBonus();
  }

  public double getBonusSum() {
    return this.bonusSum;
  }
}
