public class Man implements CanRun, CanSwim {


  @Override
  public void run() {
    System.out.println("Man can run");

  }

  @Override
  public void swim() {
    System.out.println("Man can swim" + "\n");
  }
}
