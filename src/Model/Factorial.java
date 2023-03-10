package Model;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Factorial implements Callable {
    private List<Integer> forNumbers = new ArrayList<>();
    public Factorial(List<Integer> forNumbers) {
        this.forNumbers = forNumbers;
    }
    public static ArrayList<Integer> factorialMain() {
        ArrayList<Integer> inputBigDecimalNumbers = new ArrayList<>();
        while(true) {
            try {
                System.out.println("Введите числа через пробел для проведения вычислений.");
                Scanner scanner = new Scanner(System.in);
                ArrayList<String> inputNumbers = new ArrayList<>(List.of(scanner.nextLine().split(" ")));
                for (String s : inputNumbers) {
                    inputBigDecimalNumbers.add((int) Double.parseDouble(s));
                }
                break;
            } catch (NumberFormatException e) {
            }
        }
        return inputBigDecimalNumbers;
    }

    @Override
    public ArrayList<String> call() {
        ArrayList<String> factorialResultsList = new ArrayList<>();
        BigInteger result = BigInteger.valueOf(1);

        for(int i = 0; i < forNumbers.size(); i++) {
            for (int j = forNumbers.get(i); j > 0 ; j--) {
                result = result.multiply(BigInteger.valueOf(j));
            }
            String s = "Факториал числа " + forNumbers.get(i) + " равен " + result;
            factorialResultsList.add(s);
            result = BigInteger.valueOf(1);
        }
        return factorialResultsList;
    }
}
