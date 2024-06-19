package com.mefigenia.RestaurantPizza;

public class MargheritaRestaurant extends Restaurant {
    @Override
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}
