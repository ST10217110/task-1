
import java.util.Scanner;

public class Login_1{
   boolean checkUserName = true;
   boolean checkPasswordComplexity = true;
   boolean registerUser = true;
   boolean loginUser = true;
   String returnLoginStatus;

   //in the main method, we are prompting (asking) the user to enter the details required
    public static void main(String[] args) {
        Scanner details = new Scanner(System.in);
        
        
        System.out.println("Enter your first name:");
        String name = details.next();
        System.out.println("Enter yout last name:");
        String surname = details.next();
        System.out.println("Enter the username you would like use, wih a limit of 5 letters (include an underscore):");
        String username = details.next();
        System.out.println("Enter a strong password (include characters e.g @#$%*!)");
        String password = details.next();
        
        //now prompting the user to re-enter the correct required details
        System.out.println("Re-enter the username you previously entered:");
        String username_2 = details.next();
        
        System.out.println("Re-enter the password you previously entered:");
        String password_2 = details.next();
        
        //pasword and username validation using decisions
        if (username.equals(username_2) && password.equals(password_2)){
            System.out.println("Welcome" +" "+ name + " "+ surname + " " + "it is great to see you again");
        }
        else{
            System.out.println("Username or password incorrect, please try again");
        }
    }
    
    public static boolean checkUserName(String username){
        //in this method, we are checking if the user entered a username of the required length with an underscore included
        int length = username.length();
        boolean requiredLength = false;
        //checking using decisions
        for (int x = 0; x < length; x++){
            if (username.charAt(x) ==95){
                return true;
            }
            else {
                return false;
            }
        }
            if (length <= 5){
                requiredLength = true;
            }
            else{
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            }
            return false;
    }
    //checking if user entered a strong password which meets the requirements    
    public static boolean checkPasswordComplexity(String password){
        int length_2 = password.length();
        boolean hasLength = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;
        
        for (int y = 0; y < length_2; y++){
            if (password.charAt(y) >=65 && password.charAt(y) <=90){
                hasUpper = true;
            }
            else if (password.length()>=8){
                hasLength = true;
            
            }
            else if (password.charAt(y) >= 48 && password.charAt(y) <=57){
                hasDigit = true;
            }
            else if ( password.charAt(y) >= 33 && password.charAt(y) <=47 && password.charAt(y) >= 58 && password.charAt(y) <= 64 && password.charAt(y) >= 91 && password.charAt(y) <= 96 && password.charAt(y) >= 123 && password.charAt(y) <= 126){
                hasSpecialCharacter = true;            
            }           
        }
        
           if (hasLength   && hasUpper && hasDigit && hasSpecialCharacter ){
               return true;
               
           }
           
           else {
               return false;
           }
                       
           
    
    
}
}
