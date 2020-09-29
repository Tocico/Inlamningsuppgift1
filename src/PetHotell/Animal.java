package PetHotell;
/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 17:04
 * Project: OOP Inlämningsuppgift1
 * Copyright: MIT
 */

/**
 * Klassen Animal är superklass
 */
public class Animal {

    //De instansvariabler är tillgänglig inne i Animal klassen med hjälp av ordet "private" (Inkapsling)
    private String name;
    private double weight;
    private PetFood foodSort;

    //Konstruktor
    Animal(String name, double weight, PetFood foodSort) {
        this.name = name;
        this.weight = weight * 1000; //Konvertera kg till gram
        this.foodSort = foodSort;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public PetFood getFoodSort() {
        return foodSort;
    }
}
