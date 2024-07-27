import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long sum = SumOfDigits(num);
        System.out.println("Sum is: " + sum);
    }    

    public static int SumOfDigits(int num){
        int sum=0;
        while (num>0) {
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
}
