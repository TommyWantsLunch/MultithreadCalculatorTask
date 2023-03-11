package model;
import view.View;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Minus implements Callable {
    private List<BigDecimal> forNumbers = new ArrayList<>();
    public Minus(List<BigDecimal> forNumbers) {
        this.forNumbers = forNumbers;
    }
    public static ArrayList<BigDecimal> minusMain() {
        ArrayList<BigDecimal> inputBigDecimalNumbers = new ArrayList<>();
        while(true) {
            try {
                ArrayList<String> inputStringNumbers = View.listOfUserNumbers();
                for (String s : inputStringNumbers) {
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
        BigDecimal result = forNumbers.get(0);
        for(int i = 1; i < forNumbers.size(); i++) {
            result = result.subtract(forNumbers.get(i));
        }
        String s = View.minusResult;
        for (BigDecimal d : forNumbers) {
            s = s + d + " ";
        }
        s = s + View.amountTo + result;
        return s;
    }
}
