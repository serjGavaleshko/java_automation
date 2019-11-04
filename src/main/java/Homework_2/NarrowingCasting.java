package Homework_2;

public class NarrowingCasting {
    int int1 = 127;
    float float1 = 3.14159f;
    double double1 = 3.14159d;

    public void narrowing(){
       double1 = float1;
        System.out.println(float1);
    }
}
