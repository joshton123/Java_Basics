import java.util.Scanner;;

public class PasswordChecker  {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Welecome to Set Password");
        String password;
        do{
            System.out.println("Enter your password: ");
            password = i.next();
        }while(!isValidPassword(password));

        System.out.println("Done");
    }

    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
