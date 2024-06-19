package com.mefigenia.RestaurantPizza;

public class MeatLoversPizza implements Pizza {
    @Override
    public void prepare() {
        Boolean pepperoni = true;
        Boolean sopressata = true;
        Boolean capiccola = true;
        Boolean sausage = true;

    }

    @Override
    public double price() {
        return 8.5;
    }
}
