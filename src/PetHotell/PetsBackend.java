package PetHotell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-26
 * Time: 08:12
 * Project: OOP Inlämningsuppgift1
 * Copyright: MIT
 */


/**
 * Backend
 * Registrera alla djur
 */
public class PetsBackend {
    //Skapa objekt av respektive klasser
    //Sätta nyckelordet "private" för att skydda personliga uppgifter (Inkapsling)
    private Dog sixten = new Dog("Sixten", 5, PetFood.DOGFOOD);
    private Dog dogge = new Dog("Dogge", 10, PetFood.DOGFOOD);
    private Cat venus = new Cat("Venus", 5, PetFood.CATFOOD);
    private Cat ove = new Cat("Ove", 3, PetFood.CATFOOD);
    private Snake hypno = new Snake("Hypno", 1, PetFood.SNAKEFOOD);


    /**
     * Skapa en lista med element av typen Interface IFood.
     * Lägga till alla de djurens objekten
     *
     * @return ArrayList Lista av alla djuret namn, mat sort och mängden mat
     */
    public List<IFood> getAllAnimalFoodList() {

        List<IFood> allAnimalFoodList = new ArrayList<>();
        allAnimalFoodList.add(sixten);
        allAnimalFoodList.add(dogge);
        allAnimalFoodList.add(venus);
        allAnimalFoodList.add(ove);
        allAnimalFoodList.add(hypno);

        return allAnimalFoodList;
    }

    /**
     * Skapa en lista med element av typen Klass Animal.
     * Lägga till alla de djurens objekten
     *
     * @return ArrayList Lista av alla djuret namn, vikt och mat sort
     */
    public List<Animal> getAllAnimalList() {

        List<Animal> allAnimalList = new ArrayList<>();
        allAnimalList.add(sixten);
        allAnimalList.add(dogge);
        allAnimalList.add(venus);
        allAnimalList.add(ove);
        allAnimalList.add(hypno);

        return allAnimalList;
    }
}
