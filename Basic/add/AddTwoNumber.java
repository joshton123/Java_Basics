import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Type a number:");
        x = sc.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = sc.nextInt(); // Read user input

        sum = x + y;  
        System.out.println("Sum is: " + sum); 
    }
}
