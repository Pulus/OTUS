package Lecture7_Homework;

import java.util.LinkedList;
import java.util.Scanner;

public class Question {
    public int number;
    public String text;
    public LinkedList <ResponseOptions> variants = new LinkedList<>();


    /**
     * Установка номера и текста вопроса
     */
    public void setNumber (int inNumber){
        number = inNumber;
    }
    public void setText(String inText){
        text = inText;
    }
    /**
     * Добавление варианта ответа
     */
    public void addResponse(String InText, boolean inTrueOrFalse) {
        ResponseOptions variant = new ResponseOptions();
        variant.number = this.variants.size() + 1;
        variant.text = InText;
        variant.trueOrFalse = inTrueOrFalse;
        this.variants.add(variant);
    }
    public void addResponse(String InText) {
        ResponseOptions variant = new ResponseOptions();
        variant.number = this.variants.size() + 1;
        variant.text = InText;
        this.variants.add(variant);
    }

    /**
     * Печать вопроса
     */
    public void print () {
        //Печать вопроса
        System.out.println(number + ". " + text);
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
        Scanner scan = new Scanner(System.in); //Считываем с консоли ответ пользователя
        return variants.get(scan.nextInt()-1).trueOrFalse;
    }



}
