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
    DOGFOOD("hundfoder"),
    CATFOOD("kattfoder"),
    SNAKEFOOD("ormpellets");

    //Konstant instansvariabel
    protected final String foodSort;

    //Konstruktor som skapar upp instanser av dem uppräkningstyperna
    PetFood(String name) {
        foodSort = name;
    }
}
