public class Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(4, 7));
        System.out.println(sumTwoNumbers(12, 14));
        System.out.println(sumTwoNumbers(-10, 10));
    }

    public static int sumTwoNumbers(int firstNum, int secondNum) {
        System.out.println("First Number received: " + firstNum);
        System.out.println("Second Number received: " + secondNum);
        return firstNum + secondNum;
    }
}