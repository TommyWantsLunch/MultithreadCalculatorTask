package View;

import java.util.Scanner;

public class View {
private static Scanner scanner = new Scanner(System.in);
    public String printCommands(){
        while(true) {
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

}
