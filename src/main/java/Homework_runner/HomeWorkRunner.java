package Homework_runner;//Сделать HomeTaskRunner который будет вызывать меню со всеми домашними заданиями к уроку


import java.util.Scanner;

public class HomeWorkRunner {

    public void runner() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of Homework: ");
        int hwnumber = in.nextInt();

        switch (hwnumber) {
//            case 1:
//                new Homework_1.ConsoleCalc().insertion();
//                break;
            case 2:
                new Homework_2.NarrowingCasting().narrowing();
                new Homework_2.WideningCasting().widening();
                break;
            case 3:
                break;
            case 4:
                new Homework_4.RectDraw().drawing();
                new Homework_4.FrameDraw().drawing_f();
                new Homework_4.TriangleDraw().drawing_t();
                break;
            case 5:
                new Homework_5.RunTask_5().runall();
                break;
            case 6:
                new Homework_6.PalindIdent().input();
                break;
            case 7:
                new Homework_7.CoffeeMaker().drinkChoose();
                break;
            case 8:

                new Homework_8.ReadWriteToFile().writeToFile();
                break;
            default:
                System.out.println("I haven't done this Homework yet");
        }

    }

}
