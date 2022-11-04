import java.util.Scanner;

public class BinaryDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the your number: ");
          int yourNumber = scanner.nextInt();
        degreeOfTwo(yourNumber);
    }

    private static void degreeOfTwo(int yourNumber){

        int thisNumberInBinaryCode = Integer.parseInt(Integer.toBinaryString(yourNumber));

        boolean IsDegreeOfTwo = 1 == thisNumberInBinaryCode
                / Math.pow(10,Integer.toBinaryString(yourNumber).length()-1);

        if(IsDegreeOfTwo) {
            System.out.printf("Number " + yourNumber + " is a degree of 2. \n");
        } else {
            System.out.printf("Number " + yourNumber + " is NOT a degree of 2. \n");
        }
    }
}