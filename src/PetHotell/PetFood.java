package PetHotell;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-28
 * Time: 09:30
 * Project: OOP Inlämningsuppgift1
 * Copyright: MIT
 */

/**
 * Enum(uppräkningstyper)
 * Klassen PetFood som beskriver olika djurets mat
 */
public enum PetFood {
    // Associera värden till uppräkningskonstanterna
    DOGFOOD("hundfoder", 100),
    CATFOOD("kattfoder", 150),
    SNAKEFOOD("ormpellets", 20);

    //Konstant instansvariabler
    protected final String foodSort;
    protected final Integer foodQuantity;

    //Konstruktor som skapar upp instanser av dem uppräkningstyperna
    PetFood(String foodSort, Integer foodQuantity) {
        this.foodSort = foodSort;
        this.foodQuantity = foodQuantity;
    }
}
