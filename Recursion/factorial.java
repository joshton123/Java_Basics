import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Welcome to factorial \n");
        System.out.println("Enter ur number: ");
        int num = i.nextInt();
        long fact = factorialIteractive(num);
        System.out.println("Ans: "+fact);
    }    

    public static long factorialIteractive(int num){
        if(num==1) return 1;

        return num * factorialIteractive(num-1);
    }
}
