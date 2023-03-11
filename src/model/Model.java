package model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
        for (Integer i : listForFactorial) {
            tasks.add(new Factorial(i));
        }
    }

    public void getResults() throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> futureList = new ArrayList<>();

        for (Callable c : tasks) {
            Future<String> future = executorService.submit(c);
            futureList.add(future);
        }
        for (Future<String> future : futureList) {
            results.add(future.get());
        }
        executorService.shutdown();

        for (String s : results) {
            System.out.println(s);
        }
    }


}
