package Lecture7_Homework;

public class Testing {

    public static void main(String[] args) {
        int correctCount = 0;
        int wrongCount = 0;

        Question[] questions = new Question[3];
        for (int i=0; i<3; i++) {
            questions[i] = new Question();
        }

        questions[0].setText("2+2=");
        questions[0].addResponse("1");
        questions[0].addResponse("2");
        questions[0].addResponse("3");
        questions[0].addResponse("4", true);

        questions[1].setText("2+4=");
        questions[1].addResponse("1");
        questions[1].addResponse("2");
        questions[1].addResponse("3");
        questions[1].addResponse("4");
        questions[1].addResponse("6", true);

        questions[2].setText("2+9=");
        questions[2].addResponse("11", true);
        questions[2].addResponse("12");
        questions[2].addResponse("13");

        for (Question question : questions){
            question.printTerminal();
            //Проверяем ответ
            if (question.checkResponse()) {correctCount++;} else {wrongCount++;}
            System.out.println();
        }
        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
