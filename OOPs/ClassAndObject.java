class Student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name+" "+this.age);
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="shashi";
        s1.age=23;
        s1.info();
    }
}
