public class SuperMan implements CanFly, CanRun, CanSwim {


  @Override
  public void fly() {
    System.out.println("Superman can fly");
  }

  @Override
  public void run() {
    System.out.println("Superman can run");

  }

  @Override
  public void swim() {
    System.out.println("Superman can swim" + "\n");

  }
}
