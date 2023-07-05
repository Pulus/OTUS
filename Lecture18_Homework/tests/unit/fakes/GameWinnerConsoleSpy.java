package Lecture18_Homework.tests.unit.fakes;

import Lecture18_Homework.app.game.GameWinnerPrinter;
import Lecture18_Homework.app.game.Player;

public class GameWinnerConsoleSpy implements GameWinnerPrinter {
    private String nameWinner;
    @Override
    public void printWinner(Player winner) {
        this.nameWinner = winner.getName();
    }
    public String getNameWinner (){
        return nameWinner;
    }
}
