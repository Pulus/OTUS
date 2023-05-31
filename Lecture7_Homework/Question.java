package Lecture7_Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    private String text = "";
    final ArrayList<ResponseOptions> variants = new ArrayList<>();

    /**
     * Установка номера и текста вопроса
     */
    public void setText(String inText){
        text = inText;
    }
    /**
     * Добавление варианта ответа
     */
    public void addResponse(String InText, boolean inTrueOrFalse) {
        int size = this.variants.size() + 1;
        ResponseOptions variant = new ResponseOptions(size,InText,inTrueOrFalse);
        this.variants.add(variant);
    }
    public void addResponse(String InText) {
        int size = this.variants.size() + 1;
        ResponseOptions variant = new ResponseOptions(size,InText);
        this.variants.add(variant);
    }

    /**
     * Печать вопроса
     */
    public void printTerminal () {
        //Печать вопроса
        System.out.println(text);
        //Печать вариантов ответа
        for (ResponseOptions variant : variants) {
            variant.print();
        }
    }

    /**
     * Проверка ответа
     */
    public boolean checkResponse (){
        System.out.print("Выберите вариант ответа: ");
        Scanner scan = new Scanner(System.in); //Считываем с консоли ответ пользовател
        return variants.get(scan.nextInt()-1).getTrueOrFalse();
    }
}
