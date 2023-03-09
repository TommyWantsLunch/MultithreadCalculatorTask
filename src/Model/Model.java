package Model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Model {
    public List<Runnable> tasks = new ArrayList<>();

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
    public void getResults() {
        for(Runnable r: tasks) {
            r.run();
        }
    }



}
