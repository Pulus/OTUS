package Lecture6_OtherTask;

public class Task2 {
    public static boolean isCorrectBrackets(String input,
                                            char bracketOpenSymbol,
                                            char bracketCloseSymbol) {
        //TODO
        int countOpenS=0, countCloseS=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)== bracketOpenSymbol){
                countOpenS++;
            } else if (input.charAt(i)== bracketCloseSymbol) {
                countCloseS++;
            }
        }
        return countOpenS == countCloseS;
    }

    private Task2() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного поличества открывающих и закрывающих скобок - "
                + Task2.isCorrectBrackets("{{}}", '{', '}'));
        System.out.println("Ввод неравного поличества открывающих и закрывающих скобок - "
                + Task2.isCorrectBrackets("{{}}}", '{', '}'));
    }
}