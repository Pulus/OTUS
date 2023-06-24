package Lecture14_Homework;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryFinally {
    static void startTest() throws IOException {
        String src = "C:\\Учеба\\demo\\OTUS\\Lecture14_Homework\\file1.txt";
        FileOutputStream output3 = new FileOutputStream(src);
        try {
            output3.write(3);
        } finally {
            output3.close();
        }
    }
}
