package Lecture6_OtherTask;
import java.math.BigInteger;
public class Task3 {
    public static String getFibonacciSum(byte limit) {
        BigInteger result = new BigInteger ("0");

        if (limit > 1) {
            BigInteger[] fn = new BigInteger[limit]; //Инициирую массив заявленной длины для хранения чисел Фибоначчи
            fn[0] = BigInteger.ZERO; //Записываю первые два числа, что бы остальные прогнать через цикл
            fn[1] = BigInteger.ONE;
            //Заполняем массив Фибоничи
            for (int i = 2; i < limit; i++){
                fn[i] = fn[i-1].add(fn[i-2]);
            }
            //Скаладываем числа
            for (int i = 0; i < limit; i++){
                result = result.add(fn[i]);
            }
        }
        return String.valueOf(result);
    }

    private Task3(){

    }

    public static void main(String[] args) {
        System.out.println("Сумма чисел фибоначчи до 5 должна равняться 7 - " + Task3.getFibonacciSum((byte) 100));
    }

}