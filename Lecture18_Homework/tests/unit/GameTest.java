package Lecture18_Homework.tests.unit;

import Lecture18_Homework.tests.unit.fakes.DiceSpy;
import Lecture18_Homework.tests.unit.fakes.GameWinnerConsoleSpy;
import Lecture18_Homework.app.game.*;
import org.junit.jupiter.api.Assertions;


public class GameTest {

    public static void startTestEqualValues(){
        String scenario = "Тест работы приложения. Одинаковые значения кубиков.\"\n";
        try{
            Dice diceSpy = new DiceSpy(1,1);
            GameWinnerConsoleSpy gameWinnerPrinter = new GameWinnerConsoleSpy();
            Game game = new Game(diceSpy, gameWinnerPrinter);

            game.playGame(new Player("Вася"), new Player("Игорь"));
            Assertions.assertNotEquals(gameWinnerPrinter.getNameWinner(), "Игорь");

            System.out.printf("\"%S\"Тест пройден!\n", scenario);
        } catch (Throwable e){
            System.err.printf("\"%S\"При одинаковых значениях \"кубика\" приложение выбрало одного победителя!\"\n", scenario);
        }
    }
    public static void startTestFirstValueGreater(){
        String scenario = "Тест работы приложения. Первое значение больше.\n";
        try{
            Dice diceSpy = new DiceSpy(6,1);
            GameWinnerConsoleSpy gameWinnerPrinter = new GameWinnerConsoleSpy();
            Game game = new Game(diceSpy, gameWinnerPrinter);

            game.playGame(new Player("Вася"), new Player("Игорь"));
            Assertions.assertEquals(gameWinnerPrinter.getNameWinner(), "Вася");

            System.out.printf("\"%S\"Тест пройден!\n", scenario);
        } catch (Throwable e){
            System.err.printf("\"%S\"Выбран неправильный победитель!\"\n", scenario);
        }
    }
    public static void startTestSecondValueGreater(){
        String scenario = "Тест работы приложения. Второе значение больше. \n";
        try{
            Dice diceSpy = new DiceSpy(1,6);
            GameWinnerConsoleSpy gameWinnerPrinter = new GameWinnerConsoleSpy();
            Game game = new Game(diceSpy, gameWinnerPrinter);

            game.playGame(new Player("Вася"), new Player("Игорь"));
            Assertions.assertEquals(gameWinnerPrinter.getNameWinner(), "Игорь");

            System.out.printf("\"%S\"Тест пройден!\n", scenario);
        } catch (Throwable e){
            System.err.printf("\"%S\"Выбран неправильный победитель!\"\n", scenario);
        }
    }
}
