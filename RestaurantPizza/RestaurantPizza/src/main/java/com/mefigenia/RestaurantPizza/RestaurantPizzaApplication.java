package com.mefigenia.RestaurantPizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantPizzaApplication {

	public static void main(String[] args) {


		Restaurant meatLovers = new MeatLoversRestaurant();
		Pizza meatLoverspizza = meatLovers.orderPizza();

		System.out.println(meatLoverspizza);
	}

}
