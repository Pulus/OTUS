package Lecture13_Homework.Object;


import java.util.Objects;

public class Account {
    final int number;
    private String currency = "RUB";
    private float coins = 0.0F;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
    public Account(int number){
        this.number = number;
    }
    public Account(int number, String currency){
        this.number = number;
        this.currency = currency;
    }
    public Account(int number, String currency, float coins){
        this.number = number;
        this.currency = currency;
        this.coins = coins;
    }
    public String getDataStr() {
        return "№ " + number + " " + currency + " " + coins;
    }
}
