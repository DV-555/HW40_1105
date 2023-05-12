public class Main {

  public static void main(String[] args) {

    SuperMan superMan1 = new SuperMan();
    superMan1.fly();
    superMan1.run();
    superMan1.swim();

    Penguin penguin1 = new Penguin();
    penguin1.swim();

    Duck duck1 = new Duck();
    duck1.fly();
    duck1.swim();

    Man man1 = new Man();
    man1.run();
    man1.swim();

    Airplane airplaneG450 = new Airplane();
    airplaneG450.fly();
  }
}