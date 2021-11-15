 abstract interface Animal1 {
    void walk();
 }
  // in java multiple inheritance is developed by Interface
 class Horse1 implements Animal1 {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
 }
  
 class Chicken1 implements Animal1 {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
 }
  
 public class Interface{
    public static void main(String args[]) {
       Horse1 horse = new Horse1();
       horse.walk();
    }
 }
 