package Model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Model {
    public List<Callable> tasks = new ArrayList<>();
    public List<String> results = new ArrayList<>();

    public void addPlusTask() {
        ArrayList<BigDecimal> listForPlus = new ArrayList<>(Plus.plusMain());
        tasks.add(new Plus(listForPlus));
    }
    public void addMinusTask() {
        ArrayList<BigDecimal> listForMinus = new ArrayList<>(Minus.minusMain());
        tasks.add(new Minus(listForMinus));
    }
    public void addMultiplyTask() {
        ArrayList<BigDecimal> listForMultiply = new ArrayList<>(Multiply.multiplyMain());
        tasks.add(new Multiply(listForMultiply));
    }
    public void addDivisionTask() {
        ArrayList<BigDecimal> listForDivision = new ArrayList<>(Division.divisionMain());
        tasks.add(new Division(listForDivision));
    }
    public void addFactorialTask() {
        ArrayList<Integer> listForFactorial = new ArrayList<>(Factorial.factorialMain());
        tasks.add(new Factorial(listForFactorial));
    }
    public void getResults() throws Exception {
        for(Callable c: tasks) {
            if(c.getClass() == Factorial.class) {
                ArrayList<String> factorialResults = ((Factorial) c).call();
                for (String ss: factorialResults) {
                    results.add(ss);
                }
            } else {
                results.add((String) c.call());
            }
        }
        for (String s: results) {
            System.out.println(s);
        }
    }



}
