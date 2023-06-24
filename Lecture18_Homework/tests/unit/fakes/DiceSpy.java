package Lecture18_Homework.tests.unit.fakes;

import Lecture18_Homework.app.game.*;

public class DiceSpy implements Dice {
    @Override
    public int roll() {
        return 1;
    }
}
