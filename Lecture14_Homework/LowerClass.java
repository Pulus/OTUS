package Lecture14_Homework;

public class LowerClass {
    public static void addException() {
        try{
            throw new IllegalArgumentException();
        } catch (Exception e){
            throw e;
        }
    }
}
