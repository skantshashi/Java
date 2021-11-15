class Student{
    String name;
    int age;
    public void info(String name){
        System.out.println(this.name);
    }
    public void info(int age){
        System.out.println(this.age);
    }
    public void info(String name, int age){
        System.out.println(this.name+" "+this.age);
    }
   

    Student(){//default constructor

    }
       
    Student(Student s2){//copy const.
       this.name=s2.name;
       this.age=s2.age;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
    Student s1=new Student();
     s1.name="hare krishna";
     s1.age=23;
     s1.info(s1.name);
     s1.info(s1.age);
     s1.info(s1.name, s1.age);
    }
}
