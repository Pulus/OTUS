package Lecture18_Homework.tests.unit;

import Lecture18_Homework.app.game.*;
import org.junit.jupiter.api.Assertions;

public class DiceTest {

    public static void startTest(){
        String scenario = "Тест генератора чисел\" \n" ;
        int actual = 0;
        try{
            Dice dice = new DiceImpl();
            for (int i = 0; i < 100; i++){
                actual = dice.roll();
                Assertions.assertTrue(actual <= 6);
                Assertions.assertTrue(actual >= 1);
            }
            System.out.printf("\"%S\"Тест пройден!\n", scenario);
        } catch (Throwable e){
            System.err.printf("\"%S\"Класс вернул значение вне диапазона 1-6. А именно: \"" + actual + "\"\n",
                                scenario);
        }
    }
}
