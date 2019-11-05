package Homework_1;

import java.util.Scanner;

public class ConsoleCalc {
    float result = 0;
    char operation = input1();
    float number1 = input2();
    float number2 = input3();

    private static char input1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input +,-,/,*: ");
        return in.next().charAt(0);
    }

    private static float input2() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first float: ");
        float float2 = in.nextFloat();
        return float2;
    }

    private static float input3() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input second float: ");
        float float1 = in.nextFloat();
        return float1;
    }

    public static void inputRun(){

    }

    public float calculationLogic() {
//        float result = 0;
//        char operation = input1();
//        float number1 = input2();
//        float number2 = input3();

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("error");
        }
        return result;
    }

    public String resultDisplay() {

        String resultDisplay = String.valueOf(number1) + " " + String.valueOf(operation) + " " + String.valueOf(number2);
        return resultDisplay;
    }
}


