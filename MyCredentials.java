import java.util.*;


public class MyCredentials{
    public static void main(String[] args){
        Credentials userpass = new Credentials();
        userpass.makeanAccount();

        class Credentials{
            //data attribute
            String username;
            String password;

        
            Credentials(){
                username = " ";
                password = " ";
            }

            public static makeanAccount(){
                System.out.println("Enter username:");
                username = keyboard.nextLine();
                System.out.println("Enter password (must be at least 8 characters, have at least one uppercase letter, must have at least 2 numbers, and at least 1 special character[eg.,?!@#])(must be at least 8 characters, have at least one uppercase letter, must have at least 2 numbers, and at least 1 special character[eg.,?!@#])\n");
                password = keyboard.nextLine();
                
                if (password.length() >= 8 &&  )



            }
        }
        
    }
}