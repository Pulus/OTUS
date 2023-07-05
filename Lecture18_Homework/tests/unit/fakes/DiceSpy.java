package Lecture18_Homework.tests.unit.fakes;

import Lecture18_Homework.app.game.*;

public class DiceSpy implements Dice {
    private boolean callbackFlag;
    private final int valueCube1;
    private final int valueCube2;
    public DiceSpy (int valueCube1, int valueCube2){
        this.valueCube1 = valueCube1;
        this.valueCube2 = valueCube2;
    }
    @Override
    public int roll() {
        if (!callbackFlag) {
            callbackFlag = true;
            return valueCube1;
        }else{
            callbackFlag = false;
            return valueCube2;
        }
    }
}
