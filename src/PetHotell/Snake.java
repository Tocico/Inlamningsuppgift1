package PetHotell;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 17:39
 * Project: OOP Inlämningsuppgift1
 * Copyright: MIT
 */

/**
 * Klassen Snake är en subklass till Klassem Animal
 * Den klassen implementerar interface IFood.
 */
public class Snake extends Animal implements IFood {

    //Konstruktor
    //super() anropar den superklass Animal
    public Snake(String name, double weight, PetFood foodSort) {
        super(name, weight, foodSort);
    }

    /**
     * Polymorfism genom interface
     * En portion utgörs av 20 gram ormpellets, oberoende av vikt
     * @return double 20.0
     */
    @Override
    public double calculateFood() {
        return 20;
    }

}
