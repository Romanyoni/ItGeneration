import java.util.Scanner;

//1. Написати програму, яка розраховує суму двох дійсних чисел введених у
//        консоль. Результат вивести у консоль у форматованому вигляді з одним
//        знаком після коми.

public class SubTask1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Integer.parseInt(args[0]);
        double secondNumber = Integer.parseInt(args[1]);

        double res = firstNumber + secondNumber;
        System.out.printf("SubTask1. Sum of this two numbers is %.1f. \n", res);
    }
}
