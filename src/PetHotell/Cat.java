package PetHotell;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 17:38
 * Project: OOP Inlämningsuppgift1
 * Copyright: MIT
 */

/**
 * Klassen Cat är en subklass till Klassem Animal.
 * Den klassen implementerar interface IFood.
 */
public class Cat extends Animal implements IFood{

    //Konstruktor
    //super() anropar den superklass Animal
    public Cat(String name, double weight, PetFood foodSort) {
        super(name, weight, foodSort);
    }

    /**
     * Polymorfism genom interface
     * Räkna ut hur många gram mat djuret ska få
     * @return double  vikten på en portion kattfoder
     */
    @Override
    public double calculateFood() {
        return getWeight() / PetFood.CATFOOD.foodQuantity;
    }


}
