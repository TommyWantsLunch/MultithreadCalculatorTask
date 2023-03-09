package Controller;
import Model.Model;
import View.View;

public class Controller {
    private final Model model = new Model();
    private final View view = new View();
    public void start() {
        while (true) {
            String operationNumber = view.printCommands();
            if(operationNumber.equals("6")){
                model.getResults();
                break;
            }
            switch (operationNumber) {
                case "1":
                    model.addPlusTask();
                    break;
                case "2":
                    model.addMinusTask();
                    break;
                case "3":
                    model.addMultiplyTask();
                    break;
                case "4":
                    model.addDivisionTask();
                    break;
                case "5":
                    model.addFactorialTask();
                    break;
            }

        }
    }
}
