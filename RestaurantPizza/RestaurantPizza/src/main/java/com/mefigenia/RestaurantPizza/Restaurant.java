package com.mefigenia.RestaurantPizza;

public abstract class Restaurant {

    public Pizza orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
        return pizza;
    }

    public abstract Pizza createPizza();
}
