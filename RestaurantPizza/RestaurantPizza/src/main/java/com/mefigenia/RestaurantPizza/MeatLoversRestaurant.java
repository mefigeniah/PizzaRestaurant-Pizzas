package com.mefigenia.RestaurantPizza;

public class MeatLoversRestaurant extends Restaurant{
    @Override
    public Pizza createPizza() {
        return new MeatLoversPizza();
    }
}
