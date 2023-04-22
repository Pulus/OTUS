package Lecture6_Homework;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        //Переменная для хранения количества правильных ответов
        int correctCount = 0, wrongCount = 0;
        //Конфигурационные переменные
        int cfgCollQuestions = 3;   // Колличество вопросов
        int cfgCollAnswer = 2;      // Количество вариантов ответа

        //Массив с вопросами
        String[] questions = new String[cfgCollQuestions];
        questions[0] = "2+2=";
        questions[1] = "3+2=";
        questions[2] = "2+7=";

        //Двумерный массив c вариантами ответов
        String[][] answer = new String[cfgCollQuestions][cfgCollAnswer];
        answer[0][0] = "1) 2";
        answer[0][1] = "2) 4";
        answer[1][0] = "1) 5";
        answer[1][1] = "2) 4";
        answer[2][0] = "1) 5";
        answer[2][1] = "2) 9";

        //Массив правильных ответов
        int[] correctAnswers = new int[cfgCollQuestions];
        correctAnswers[0] = 1;
        correctAnswers[1] = 0;
        correctAnswers[2] = 1;
        //Цикл по всем вопросам
        for(int i = 0; i < cfgCollQuestions; i++){
            System.out.println(questions[i]); //Вывод вопроса на экран

            //Вывод вариантов ответов на экран
            for (int j = 0; j < cfgCollAnswer; j++){System.out.println(answer[i][j]);}

            System.out.print("Выберите вариант ответа: ");
            Scanner scan = new Scanner(System.in); //Считываем с консоли ответ пользователя

            //Проверяем ответ
            if ((scan.nextInt() - 1) == correctAnswers[i]) {correctCount++;} else {wrongCount++;}

            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
