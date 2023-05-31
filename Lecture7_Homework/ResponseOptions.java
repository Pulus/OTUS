package Lecture7_Homework;

public class ResponseOptions {
    final int number;
    final String text;
    private boolean trueOrFalse = false;
    public void print() {
        System.out.println(number + ") " + text);
    }
    public ResponseOptions (int inNumber, String inText, Boolean inTrueOrFalse){
        this.number = inNumber;
        this.text = inText;
        this.trueOrFalse = inTrueOrFalse;
    }
    public ResponseOptions (int inNumber, String inText){
        this.number = inNumber;
        this.text = inText;
    }
    public boolean getTrueOrFalse (){
        return trueOrFalse;
    }
}
