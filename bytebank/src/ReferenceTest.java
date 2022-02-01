public class ReferenceTest {
  public static void main(String[] args) {
    Manager manager = new Manager();
    manager.setName("Gerente Anônimo");
    manager.setSalary(10000);

    VideoEditor videoEditor = new VideoEditor();
    videoEditor.setName("Editor de Vídeo Anônimo");
    videoEditor.setSalary(4000);

    Designer designer = new Designer();
    designer.setName("Designer Anônimo");
    designer.setSalary(4500);

    BonusControl control = new BonusControl();
    control.register(manager);
    control.register(videoEditor);
    control.register(designer);

    System.out.println(control.getBonusSum());
  }
}
