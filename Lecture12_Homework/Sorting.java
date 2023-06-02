package Lecture12_Homework;

import java.util.*;

public class Sorting {
    public static void setRandomInteger(List<Integer> array, int size){
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            array.add(r.nextInt(9) + 1);
        }
    }
    public static void sorting (List<Integer> array){
        //Процесс сортировки выбором
        for (int i = 0; i < array.size() - 1; i++) {
            int nMin = i;
            Integer min = array.get(i);
            for (int j = i + 1; j < array.size(); j++) {
                if (min > array.get(j)) {
                    min = array.get(j);
                    nMin = j;
                }
            }
            array.set(nMin,array.get(i));
            array.set(i,min);
        }
    }
    public static void main(String[] args) {
        int size = 100_000;
        List<Integer> array1 = new ArrayList<>();
        //Заполняем массив рандомными числами
        setRandomInteger(array1, size);

        List<Integer> array2 = new ArrayList<>(array1);
        long startTimePrimitives = System.currentTimeMillis();
        sorting(array1);
        long endTimePrimitives = System.currentTimeMillis();
        System.out.println("На сортировку выбором ушло: " + (endTimePrimitives - startTimePrimitives) + " мил.сек.");

        startTimePrimitives = System.currentTimeMillis();
        Collections.sort(array2);
        endTimePrimitives = System.currentTimeMillis();
        System.out.println("На сортировку методом sort ушло: " + (endTimePrimitives - startTimePrimitives) + " мил.сек.");
    }
}
