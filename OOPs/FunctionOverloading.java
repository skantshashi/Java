class Student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name+" "+this.age);
    }
    Student(){//default constructor

    }
       
    Student(Student s2){//copy const.
       this.name=s2.name;
       this.age=s2.age;
    }
}
public class FunctionOverloading {
    
}
