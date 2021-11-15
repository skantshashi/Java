import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
class Account {
   public String name;
   protected String email;
   private String password;
   String address;
 
   public void setPassword(String password, String address) {
       this.password = password;
       this.address=address;
   }
   public void getPass(){
       System.out.println(password);
       System.out.println(address);
   }
}
class derived extends Account{
  derived(){
      name="skant";
      email="skantshashi";
      //password="abcd";
      address="pqrs";
  }
}

public class AccessModifiers {
    public static void main(String args[]) {
        Account a1 = new Account();
        a1.name = "Apna College";
        a1.setPassword("abcd","bncd");
        a1.email = "hello@apnacollege.com";
        a1.getPass();
        //a1.password(); private 
        //a1.email(); protected
       // a1.address();
    }
 
}
