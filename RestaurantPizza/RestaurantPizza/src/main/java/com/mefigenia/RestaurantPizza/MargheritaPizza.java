package com.mefigenia.RestaurantPizza;

public class MargheritaPizza implements Pizza{
    @Override
    public void prepare() {
        Boolean tomatoes = true;
        Boolean basil = true;
        Boolean ricotta = true;
        Boolean sauces = false;
    }

    @Override
    public double price() {
        return 7.5;
    }
}
