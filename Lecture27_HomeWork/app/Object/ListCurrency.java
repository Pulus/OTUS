package Lecture27_HomeWork.app.Object;

import java.util.ArrayList;

public class ListCurrency {
    private final ArrayList <Currency> listCurrency = new ArrayList<>();
    public ListCurrency (Currency currency){
        this.listCurrency.add(currency);
    }
    public void addCurrency (Currency currency){
        this.listCurrency.add(currency);
    }
    public Currency getCurrency (int index){
        return this.listCurrency.get(index);
    }
    public void printAll(){
        System.out.println("Введите номер валюты из списка:");
        for (Currency curr : listCurrency){
            System.out.println(listCurrency.indexOf(curr)+" "+curr.curr()+" "+ curr.f1()+";");
        }
    }
}
