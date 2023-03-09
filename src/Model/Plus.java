package Model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plus implements Runnable {
    private List<BigDecimal> forNumbers = new ArrayList<>();
    public Plus(List<BigDecimal> forNumbers) {
        this.forNumbers = forNumbers;
    }
    public static ArrayList<BigDecimal> plusMain() {
        ArrayList<BigDecimal> inputBigDecimalNumbers = new ArrayList<>();
        while(true) {
            try {
                System.out.println("Введите числа через пробел для проведения вычислений.");
                Scanner scanner = new Scanner(System.in);
                ArrayList<String> inputNumbers = new ArrayList<>(List.of(scanner.nextLine().split(" ")));
                for (String s : inputNumbers) {
                    inputBigDecimalNumbers.add(BigDecimal.valueOf(Double.parseDouble(s)));
                }
                break;
            } catch (NumberFormatException e) {
            }
        }
        return inputBigDecimalNumbers;
    }

    @Override
    public void run() {
        BigDecimal result = BigDecimal.valueOf(0);
        for(BigDecimal d: forNumbers) {
            result = result.add(d);
        }
        String s = "Результат суммы чисел ";
        for(BigDecimal d: forNumbers) {
            s = s + d + " ";
        }
        s = s + "равен " + result;
        System.out.println(s);
    }
}
