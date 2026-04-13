/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quick.chat;
import java.util.Scanner;

/**
 *
 * @author Student
 */
class Login {

    String StoreUsername;
    String StorePassword;
    String Storecellphonenumber;
    String registerUser;
    String Storefirstname;
    String Storelastname;

    boolean checkusername(String Username) {
        if (Username.contains("_") && Username.length() <= 5) {
            return true;
        } else {
            System.out.println("Username should contain an underscore and should be no more than 5 characters");
            return false;
        }

    }

    boolean checkpassword(String password) {
        if (password.length() < 8) {
            return true;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        String specialChars = "!@#$%^&*()";
        char ch;

        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialChars.indexOf(ch) >= 0);
            hasSpecialChar = true;
        }

        return hasUppercase && hasDigit && hasSpecialChar;
    }

    boolean checkcellphone(String cellphone) {
        if (Storecellphonenumber == null) {
            return false;

        }
        String pattern = "^\\+27{-}?{6|7|8}\\d{1}{-}?\\d{3][-}?\\d{4}$";
        if (Storecellphonenumber.matches(pattern)) {
            System.out.println("Cellphone number successfully added");
            return false;
        } else {
            System.out.println("cellphone number incorrectly formatted or does not contain international code");
            return false;

        }

    }

    String registerUser(String username, String password) {
        if (!checkusername(username)) {
            System.out.println("username or password incorrect,please try again");
        }//else
        if (!checkpassword(password)) {
            System.out.println("username or password incorrect,please try again");
        }
        StoreUsername = username;
        StorePassword = password;
        return "You have been registered sucessfully";
    }

    boolean LogInUser(String username, String password) {
        return username.equals(StoreUsername) && password.equals(StorePassword);
    }

    String returnLoginStatus(String username, String password, String firstname, String lastname) {

        if (username.equals(StoreUsername) && password.equals(StorePassword)) {
            return "Welcome" + firstname + "" + lastname + " its good to see you again";

        } else {
            return "User name or password incorrect ,please try again";
        }
        }
    }
public class QuickChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);

            Login login = new Login();
            System.out.println("Enter your first name");
            String firstname = scan.nextLine();
            System.out.println("Enter your Last name");
            String lastname = scan.nextLine();

            System.out.println("Enter Username");
            String username = scan.nextLine();
            login.checkusername(username);

            System.out.println("Enter your password");
            String password = scan.nextLine();
            login.checkpassword(password);
            System.out.println("Enter your cellphone number");
            String cellphone = scan.nextLine();
            login.checkcellphone(cellphone);

            System.out.println(login.registerUser(username, password));

            System.out.println("Enter your Username");
            String userName = scan.nextLine();

            System.out.println("Enter your password");
            String passwords = scan.nextLine();

            login.LogInUser(userName, password);
            // show login message
            System.out.println();
       System.out.println(login.returnLoginStatus(userName, password, firstname, lastname));
        }
    }

    
    

