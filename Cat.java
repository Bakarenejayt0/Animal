public class Cat extends Animal {
 
  @Override
  public void eat() {
    System.out.print("Cats love to eat fish ");
  }

  @Override
  public void sleep() {
    System.out.println("and sleep for 8-10 hours a day");
  }

  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}