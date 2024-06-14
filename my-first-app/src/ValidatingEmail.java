
    // import java.util.Scanner;
public class ValidatingEmail {
   public static void main(String[] args) {

    String email = "testgmail";
      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
      //Matching the given phone number with regular expression
      boolean result = email.matches(regex);
      if(result) {
         System.out.println("Given email-id is valid");
      } else {
         System.out.println("Given email-id is not valid");
      }
   }
}


