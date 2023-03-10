package Model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Multiply implements Callable {
    private List<BigDecimal> forNumbers = new ArrayList<>();
    public Multiply(List<BigDecimal> forNumbers) {
        this.forNumbers = forNumbers;
    }
    public static ArrayList<BigDecimal> multiplyMain() {
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
    public String call() {
        BigDecimal result = BigDecimal.valueOf(1);
        for(BigDecimal d: forNumbers) {
            result = result.multiply(d);
        }
        String s = "Результат умножения чисел ";
        for(BigDecimal d: forNumbers) {
            s = s + d + " ";
        }
        s = s + "равен " + result;
        return s;
    }
}
