package Lecture18_Homework.tests.unit;

import Lecture18_Homework.tests.unit.fakes.DiceSpy;
import Lecture18_Homework.tests.unit.fakes.GameWinnerConsoleSpy;
import Lecture18_Homework.app.game.*;
import org.junit.jupiter.api.Assertions;


public class GameTest {

    public static void startTest(){
        String scenario = "Тест работы приложения \n";
        try{
            Dice diceSpy = new DiceSpy();
            GameWinnerConsoleSpy gameWinnerPrinter = new GameWinnerConsoleSpy();
            Game game = new Game(diceSpy, gameWinnerPrinter);

            game.playGame(new Player("Вася"), new Player("Игорь"));
            Assertions.assertNotEquals(gameWinnerPrinter.getNameWinner(), "Игорь");

            System.out.printf("\"%S\" passed \n", scenario);
        } catch (Throwable e){
            System.err.printf("\"%S\" При равных значениях \"кубика\" приложение выбрало одного победителя: \"%S\" \n", scenario, e.getMessage());
        }
    }
}
