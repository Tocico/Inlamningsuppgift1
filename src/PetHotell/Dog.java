package PetHotell;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 17:07
 * Project: OOP Inlämningsuppgift1
 * Copyright: MIT
 */

/**
 * Klassen Dog är en subklass till Klassem Animal
 * Den klassen implementerar interface IFood.
 */
public class Dog extends Animal implements IFood {

    //Konstruktor
    //super() anropar den superklass Animal
    public Dog(String name, double weight, PetFood foodSort) {
        super(name, weight, foodSort);
    }

    /**
     * Polymorfism genom interface
     * Räkna ut hur många gram mat djuret ska få
     * @return double  vikten på en portion hundfoder
     */
    @Override
    public double calculateFood() {
        return getWeight() / 100;
    }

}
