package Homework_1;

public class ConsoleCalcRun extends Homework_1.ConsoleCalc {

    public String runner() {

        String printer = getResultDisplay() + " = " + getResult();
        System.out.println(printer);
        return printer;

    }


}
