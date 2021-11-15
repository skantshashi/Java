class Student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name+" "+this.age);
    }
    Student(){
        System.out.println("constructor is called when object is instantiated ");
    }// does not called when object is initiated with the values 
    Student(String name, int age){
       this.name=name;// this says that this.name assign the values of attributes of class
       this.age=age;
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Student s1=new Student();// object is created in heap memory
        s1.name="shashi";
        s1.age=23;
        s1.info();
        Student s2=new Student("hare Krishna",34);
        s2.info();
    }
}
