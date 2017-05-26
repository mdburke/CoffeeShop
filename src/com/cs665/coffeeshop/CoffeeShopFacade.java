package com.cs665.coffeeshop;

/**
 * Created by mburke on 5/23/17.
 */
public class CoffeeShopFacade {
    private static CoffeeShopFacade coffeeShopFacadeSingleton = new CoffeeShopFacade();

    private CoffeeShopFacade() {}

    public static CoffeeShopFacade getCoffeeShopFacadeSingleton() {
        return coffeeShopFacadeSingleton;
    }

    public void printDrinkMenu() {
        Menu.printDrinkMenu();
    }

    public void printExtrasMenu() {
        Menu.printExtrasMenu();
    }

    public Drink createLargeCoffee() {
        return new LargeCoffee();
    }

    public Drink createSmallCoffee() {
        return new SmallCoffee();
    }

    public DrinkDecorator addExtraShot(DrinkComponent drink) {
        return new EspressoShot(drink);
    }

    public DrinkDecorator addSkimMilk(DrinkComponent drink) {
        return new SkimMilk(drink);
    }

    public DrinkDecorator addSoyMilk(DrinkComponent drink) {
        return new SoyMilk(drink);
    }
}
