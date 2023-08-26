package Lecture27_HomeWork.app;

import Lecture27_HomeWork.app.Object.Converter;
import Lecture27_HomeWork.app.Object.Currency;
import Lecture27_HomeWork.app.Object.ListCurrency;

import java.util.Scanner;

public class Mast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListCurrency listCurrency = new ListCurrency(new Currency("RUR", "рубль", "рубля", "рублей"));
        listCurrency.addCurrency(new Currency("USD", "доллар", "доллара", "долларов"));
        Converter conv = new Converter(listCurrency);
        String exit = "";
        while (!exit.equals("exit")) {
            conv.printAllCurrency();
            try {
                conv.setCurrency(scan.nextInt());
                try {
                    System.out.println("Введите число:");
                    System.out.println(conv.numToStr(scan.nextBigDecimal()));
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не корректное значение!"+e);
                }
            }catch (NumberFormatException e){
                System.out.println("Вы ввели не корректное значение!"+e);
            }catch (IndexOutOfBoundsException e) {
                System.out.println("В списке нет значения с таким номером!");
            }catch (Exception e){
                System.out.println("Упс! Произошла не предвиденная ошибка! "+e);
            }

            System.out.println();
            System.out.println("Если хотите выйти введите 'exit'. Если нет, то введите любое значение:");
            exit=scan.next();
        }
    }
}
