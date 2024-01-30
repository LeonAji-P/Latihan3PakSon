package Main;

public class Main {
   public static void main (String[]args){
            
       
             User leon = new User();

      // menggunakan method setter
      leon.setUsername("lotnok");
      leon.setPassword("kontol123");

      // menggunakan method getter
      System.out.println("Username: " + leon.getUsername());
      System.out.println("Password: " + leon.getPassword());  
        }
           
     }     