package Lecture6_OtherTask;

public class Task1 {
    public static String reverseWords(String inputText) {
        // TODO
        int index = inputText.indexOf(" ");
        if (index != (-1)) {
            String[] words = inputText.split(" ");
            inputText = (words[1] + " " + words[0]);
        }
        return inputText;
    }

    private Task1() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + Task1.reverseWords(""));
        System.out.println("Ввод одного слова - " + Task1.reverseWords("word"));
        System.out.println("Ввод двух слов - " + Task1.reverseWords("два слова"));
    }
}

