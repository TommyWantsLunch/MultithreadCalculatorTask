package View;

import Model.Division;
import Model.Minus;
import Model.Multiply;
import Model.Plus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);

    public String printCommands() {
        while (true) {
            System.out.println("\nКакую операцию вы хотите совершить?" +
                    "\nВведите \"1\" для сложения;" +
                    "\nВведите \"2\" для вычитания;" +
                    "\nВведите \"3\" для умножения;" +
                    "\nВведите \"4\" для деления;" +
                    "\nВведите \"5\" для факториала." +
                    "\nВведите \"6\" для получения результата.");
            String operationNumber = scanner.nextLine();
            if (operationNumber.equals("1") || operationNumber.equals("2") || operationNumber.equals("3") ||
                    operationNumber.equals("4") || operationNumber.equals("5") || operationNumber.equals("6")) {
                return operationNumber;
            }
        }
    }

    public static ArrayList<String> listOfUserNumbers() {
        System.out.println("Введите числа через пробел для проведения вычислений.");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputNumbers = new ArrayList<>(List.of(scanner.nextLine().split(" ")));
        return inputNumbers;
    }
    public static final String plusResult = "Результат сложения чисел ";
    public static final String minusResult = "Результат вычитания чисел ";
    public static final String multiplyResult = "Результат умножения чисел ";
    public static final String divisionResult = "Результат деления чисел ";
    public static final String factorialResult = "Факториал числа ";
    public static final String amountTo = "равен ";
    public static final String amountToWithSpacebar = " равен ";

}
