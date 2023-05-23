package Lecture7_Homework;

public class ResponseOptions {
    public int number;
    public String text;
    public boolean trueOrFalse;
    public void print() {
        System.out.println(number + ") " + text);
    }
    public void set (int inNumber, String inText, Boolean inTrueOrFalse){
        number = inNumber;
        text = inText;
        trueOrFalse = inTrueOrFalse;
    }
}
