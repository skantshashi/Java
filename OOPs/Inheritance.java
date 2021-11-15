class Shape{
    String color;

}
class Triangle extends Shape{
  void show(){
      System.out.println(color);
  }
}
public class Inheritance {
   public static void main(String[] args) {
       Triangle t1=new Triangle();
       t1.color="red";//shows the traigle class inherit the properties of base class(shape)
       t1.show();
   }

}
