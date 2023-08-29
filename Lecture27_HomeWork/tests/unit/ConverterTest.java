package Lecture27_HomeWork.tests.unit;

import Lecture27_HomeWork.app.Object.Converter;
import Lecture27_HomeWork.app.Object.Currency;
import Lecture27_HomeWork.app.Object.ListCurrency;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {

    ListCurrency listCurrency = new ListCurrency(new Currency("RUR", "рубль", "рубля", "рублей"));
    Converter converter = new Converter(listCurrency);


    @Test
     void testNumTostr() {
        assertEquals("пять рублей", converter.numToStr(new BigDecimal(5)));
        assertEquals("ноль рублей", converter.numToStr(new BigDecimal(0)));
        assertEquals("сто один рубль", converter.numToStr(new BigDecimal(101)));
        assertEquals("четыреста пятьдесят рублей", converter.numToStr(new BigDecimal(450)));
        assertEquals("три рубля", converter.numToStr(new BigDecimal(3)));
        assertEquals("сорок пять рублей", converter.numToStr(new BigDecimal(45)));
        assertEquals("сто тринадцать рублей", converter.numToStr(new BigDecimal(113)));
        assertEquals("девятьсот девяносто девять рублей", converter.numToStr(new BigDecimal(999)));
        assertEquals("одна тысяча пятьсот восемьдесят четыре рубля", converter.numToStr(new BigDecimal(1584)));
        assertEquals("девятьсот девяносто девять миллиардов девятьсот девяносто девять миллионов девятьсот девяносто девять тысяч девятьсот девяносто девять рублей",
                converter.numToStr(new BigDecimal("999999999999")));

    }
    @Test
    void testNumTostrUsd (){
        listCurrency.addCurrency(new Currency("USD", "доллар", "доллара", "долларов"));
        converter.setCurrency(1);
        assertEquals("пять долларов", converter.numToStr(new BigDecimal(5)));
        assertEquals("ноль долларов", converter.numToStr(new BigDecimal(0)));
        assertEquals("сто один доллар", converter.numToStr(new BigDecimal(101)));
        assertEquals("четыреста пятьдесят долларов", converter.numToStr(new BigDecimal(450)));
        assertEquals("три доллара", converter.numToStr(new BigDecimal(3)));
        assertEquals("сорок пять долларов", converter.numToStr(new BigDecimal(45)));
        assertEquals("сто тринадцать долларов", converter.numToStr(new BigDecimal(113)));
        assertEquals("девятьсот девяносто девять долларов", converter.numToStr(new BigDecimal(999)));
        assertEquals("одна тысяча пятьсот восемьдесят четыре доллара", converter.numToStr(new BigDecimal(1584)));
        assertEquals("девятьсот девяносто девять миллиардов девятьсот девяносто девять миллионов девятьсот девяносто девять тысяч девятьсот девяносто девять долларов",
                converter.numToStr(new BigDecimal("999999999999")));
    }
}