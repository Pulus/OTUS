package Lecture14_Homework;

import java.io.FileOutputStream;
import java.io.IOException;

public class LowerClass {
    static String src = "C:\\Учеба\\demo\\OTUS\\Lecture14_Homework\\file1.txt";
    public static void addException() throws IOException {
        try(FileOutputStream output1 = new FileOutputStream(src);
            FileOutputStream output2 = new FileOutputStream(src)){
            output1.write(1);
            output2.write(2);
            throw new IllegalArgumentException();
        } catch (Exception e){
            throw e;
        }
    }
}
