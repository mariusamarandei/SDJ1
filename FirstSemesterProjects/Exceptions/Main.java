package Exceptions;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        int counter = 0;

        while (counter < 5) {
            System.out.print("Type an integer in the range 10-99: ");
            try {
                int number = scanner.nextInt();
                if (number >= 10 && number <= 99) {
                    numbers[counter] = number;
                    counter++;
                } else {
                    throw new InputMismatchException("Input is an integer, but not in range");
                }
            } catch (InputMismatchException e) {
                System.out.println("The input is not an integer in the range 10-99, try again");
                scanner.nextLine();
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
