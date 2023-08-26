package Lecture27_HomeWork.app.Object;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

/**<br/> * Класс для работы с деньгами<br/> * @author runcore<br/> */
public class Converter {

    /**<br/>     * Сумма денег<br/>     */
    private final ListCurrency listCurrency;
    private static Currency currentCurr;
    private static final BigDecimal MIN = new BigDecimal("0");
    private static final BigDecimal MAX = new BigDecimal("999999999999");

    /**<br/>     * Конструктор из BigDecimal<br/>     */
    public Converter(ListCurrency listCurrency) {
        this.listCurrency = listCurrency;
        currentCurr = listCurrency.getCurrency(0);
    }

    public void printAllCurrency (){
        listCurrency.printAll();
    }

    public void setCurrency (int i){
        currentCurr = listCurrency.getCurrency(i);
    }

    /**<br/>     * Выводим сумму прописью<br/>  * @return String Сумма прописью<br/>     */
    public String numToStr(BigDecimal amount) {
        try {
            String[][] sex = {
                    {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
                    {"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            };
            String[] str100 = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
            String[] str11 = {"", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};
            String[] str10 = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
            String[][] forms = {
                    {"копейка", "копейки", "копеек", "1"},
                    {currentCurr.f1(), currentCurr.f2(), currentCurr.f5(), "0"},//сюда передаём валюту
                    {"тысяча", "тысячи", "тысяч", "1"},
                    {"миллион", "миллиона", "миллионов", "0"},
                    {"миллиард", "миллиарда", "миллиардов", "0"},
                    {"триллион", "триллиона", "триллионов", "0"},
                    // можно добавлять дальше секстиллионы и т.д.
            };
            // получаем отдельно рубли и копейки
            long rub = amount.longValue();
            long rub_tmp = rub;

            // Разбиватель суммы на сегменты по 3 цифры с конца
            ArrayList<Long> segments = new ArrayList<>();
            while (rub_tmp > 999) {
                long seg = rub_tmp / 1000;
                segments.add(rub_tmp - (seg * 1000));
                rub_tmp = seg;
            }
            segments.add(rub_tmp);
            Collections.reverse(segments);

            // Анализируем сегменты
            StringBuilder o = new StringBuilder();
            if (rub == 0) {// если Ноль
                o = new StringBuilder("ноль " + morph(0, forms[1][0], forms[1][1], forms[1][2]));
                return o.toString();
            }
            // Больше нуля
            int lev = segments.size();
            for (Long segment : segments) {// перебираем сегменты
                int sexi = Integer.parseInt(forms[lev][3]);// определяем род
                int ri = Integer.parseInt(String.valueOf(segment));// текущий сегмент
                if (ri == 0 && lev > 1) {// если сегмент ==0 И не последний уровень(там Units)
                    lev--;
                    continue;
                }
                String rs = String.valueOf(ri); // число в строку
                // нормализация
                if (rs.length() == 1) rs = "00" + rs;// два нулика в префикс?
                if (rs.length() == 2) rs = "0" + rs; // или лучше один?
                // получаем циферки для анализа
                int r1 = Integer.parseInt(rs.substring(0, 1)); //первая цифра
                int r2 = Integer.parseInt(rs.substring(1, 2)); //вторая
                int r3 = Integer.parseInt(rs.substring(2, 3)); //третья
                int r22 = Integer.parseInt(rs.substring(1, 3)); //вторая и третья
                // Супер-нано-анализатор циферок
                if (ri > 99) o.append(str100[r1]).append(" "); // Сотни
                if (r22 > 20) {// >20
                    o.append(str10[r2]).append(" ");
                    o.append(sex[sexi][r3]).append(" ");
                } else { // <=20
                    if (r22 > 9) o.append(str11[r22 - 9]).append(" "); // 10-20
                    else o.append(sex[sexi][r3]).append(" "); // 0-9
                }
                // Единицы измерения (рубли...)
                o.append(morph(ri, forms[lev][0], forms[lev][1], forms[lev][2])).append(" ");
                lev--;
            }
            String oStr = o.toString();
            oStr = oStr.substring(0, oStr.length() - 1);
            return oStr.replace("  "," ");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Введенное значение выходит за рамки допустимого диапазона (от "+MIN+" до "+MAX+")!");
            return "";
        }catch (Exception e){
            System.out.println("Упс! Произошла не предвиденная ошибка! "+e);
            return "";
        }
    }

    /**<br/>     * Склоняем словоформу<br/>     * @param n Long количество объектов<br/>     * @param f1 String вариант словоформы для одного объекта<br/>     * @param f2 String вариант словоформы для двух объектов<br/>     * @param f5 String вариант словоформы для пяти объектов<br/>     * @return String правильный вариант словоформы для указанного количества объектов<br/>     */
    public static String morph(long n, String f1, String f2, String f5) {
        n = Math.abs(n) % 100;
        long n1 = n % 10;
        if (n > 10 && n < 20) return f5;
        if (n1 > 1 && n1 < 5) return f2;
        if (n1 == 1) return f1;
        return f5;
    }
}