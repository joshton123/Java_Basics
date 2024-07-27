import java.util.Scanner;

class NumberOfOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOCCarence(numArr, num);
        System.out.println("Your element was found " + occurrences + " times in the array");
    }    
    public static int noOfOCCarence(int[] numArr , int num ){
        int count=0;
        int i=0;
        while (i<numArr.length) {
            if(numArr[i] == num){
                count++;
            }
            i++;
        }
        return count;
    }
}
