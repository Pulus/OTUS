package Lecture6_Homework;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        //Переменная для хранения количества правильных ответов
        int correctCount = 0, wrongCount = 0;

        //Массив с вопросами
        String[] questions =   {"2+2=",
                                "3+2=",
                                "2+7="};

        //Двумерный массив c вариантами ответов
        String[][] answer = {
                {"2","4"},
                {"5","4","2"},
                {"5","9"}
        };

        //Массив правильных ответов
        String[] correctAnswers = {"2","1","2"};

        //Цикл по всем вопросам
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]); //Вывод вопроса на экран

            //Вывод вариантов ответов на экран
            for (int j = 0; j < answer[i].length; j++){
                System.out.println((j+1) + ") " + answer[i][j]);
            }

            System.out.print("Выберите вариант ответа: ");
            Scanner scan = new Scanner(System.in); //Считываем с консоли ответ пользователя

            //Проверяем ответ
            String user = scan.nextLine();
            if (correctAnswers[i].equals(user)) {correctCount++;} else {wrongCount++;}

            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
