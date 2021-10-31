public class Charactarofarray {
   public static void main(String[] args) {
    String firstName = "Tony";
    String secondName = "Stark";

    String fullName = firstName + " " + secondName;

    for(int i=0; i<fullName.length(); i++) {
        System.out.print(fullName.charAt(i));// every charcter of string
        System.out.print(" ");
    }
}
}
