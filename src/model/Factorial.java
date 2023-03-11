package model;
import view.View;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Factorial implements Callable {
    private Integer number;
    public Factorial(Integer number) {
        this.number = number;
    }
    public static ArrayList<Integer> factorialMain() {
        ArrayList<Integer> inputBigDecimalNumbers = new ArrayList<>();
        while(true) {
            try {
                ArrayList<String> inputNumbers = View.listOfUserNumbers();
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
    public String call() {
        BigInteger result = BigInteger.valueOf(1);
            for (int j = number; j > 0 ; j--) {
                result = result.multiply(BigInteger.valueOf(j));
            }
            String s = View.factorialResult + number + View.amountToWithSpacebar + result;
        return s;
    }
}
