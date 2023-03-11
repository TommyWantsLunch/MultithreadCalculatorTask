package model;
import view.View;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Division implements Callable {
    private List<BigDecimal> forNumbers = new ArrayList<>();
    public Division(List<BigDecimal> forNumbers) {
        this.forNumbers = forNumbers;
    }
    public static ArrayList<BigDecimal> divisionMain() {
        ArrayList<BigDecimal> inputBigDecimalNumbers = new ArrayList<>();
        while(true) {
            try {
                ArrayList<String> inputNumbers = View.listOfUserNumbers();
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
        BigDecimal result = forNumbers.get(0);
        for(int i = 1; i < forNumbers.size(); i++) {
            result = result.divide(forNumbers.get(i), 10, RoundingMode.HALF_EVEN);
        }
        String s = View.divisionResult;
        for (BigDecimal d : forNumbers) {
            s = s + d + " ";
        }
        s = s + View.amountTo + result;
        return s;
    }
}
