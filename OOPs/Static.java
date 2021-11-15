class Student2 {
    static String school;
    String name;   
 }
  
 public class Static {
    public static void main(String args[]) {
        Student2.school = "JMV";
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
  
        s1.name = "Meena";
        s2.name = "Beena";
  
        System.out.println(s1.school);
        System.out.println(s2.school);
    }
 }
 