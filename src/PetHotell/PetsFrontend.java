package PetHotell;

import java.util.List;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 16:51
 * Project: OOP Inlämningsuppgift1
 * Copyright: MIT
 */

 /**
  * Husdjurshotellet HealtyPets nischar sig genom att alla djur blir matade med hotellets eget
 * hemlagade djurfoder, i portioner där portionsstorlekarna är noga uträknade för att passa djurens
 * behov.
 * HealthyPets dietcoach väger upp varje portion foder enligt nedanstående formler:
  *
 * • Hundar: Hundens vikt (i gram) / 100 = vikten på en portion hundfoder (i gram)
 * • Katter: Kattens vikt (i gram) / 150 = vikten på en portion kattfoder (i gram)
 * • Ormar: En portion utgörs av 20 gram ormpellets, oberoende av vikt
  *
 * Tyvärr har dietcoachen svårt att komma ihåg hur mycket mat varje djur ska få och vilken sort, vilket
 * har blivit ett problem för hotellets trovärdighet. HealthyPets ägare ber därför dig att hjälpa till och
 * skriva ett system som kan hjälpa dietcoachen med sitt jobb.
  *
 * Systemet ska, ut ett användarperspektiv, fungera enligt följande:
 * En meddelande-ruta dyker upp på skärmen med texten ”Vilket djur ska få mat?” och en tom rad
 * under. Dietcoachen fyller i djurets namn på tomma raden och programmet visar en ny ruta där det
 * står hur många gram mat djuret ska få samt vilken sorts mat (kattfoder, hundfoder eller ormpellets)
 * som ska serveras.
  *
 * -----------Dessa djur bor på hotellet-------------------------
 * • Hunden Sixten, väger 5 kg.
 * • Hunden Dogge, väger 10 kg.
 * • Katten Venus, väger 5 kg.
 * • Katten Ove, väger 3 kg.
 * • Ormen Hypno, väger 1 kg.
 */


/**
 * Frontend
 */
public class PetsFrontend {

     /**
      * Konstruktor
      *
      * Skapa ett objekt av Kalssen PetsBackend
      * för att kunna använda metoderna getAllAnimalFoodList() och
      * getAllAnimalList() som skapades i Klassen PetsBackend.
      *
      * Skapa ett objekt av Klassen UserInput för att användare skall
      * kunna fylla i djurets namn.
      *
      * Medan itererar över foodList anropa metoden printFood() för att kunna skriva ut ett resultat
      */
    PetsFrontend() {
        PetsBackend petsBackend = new PetsBackend();
        List<IFood> foodList = petsBackend.getAllAnimalFoodList();
        List<Animal> animalList = petsBackend.getAllAnimalList();
        UserInput userInput = new UserInput(animalList);

        for (IFood f : foodList)
            if (f.getName().toLowerCase().equals(userInput.getInput()))
            printFood(f);
    }

    /**
     * Skriva ut hur många gram mat djuret ska få samt vilken sorts mat (kattfoder, hundfoder eller ormpellets)
     * som ska serveras.
     * @param f IFood djuret namn, mat sort och mängden mat
     */
    private void printFood(IFood f) {
            System.out.println("Du ska servera " + Math.round(f.calculateFood()) + "g " + f.getFoodSort().foodSort + " till " + f.getName());
    }

     /**
      * Huvud program
      * @param args
      */
    public static void main(String[] args) {
        PetsFrontend petHotel = new PetsFrontend();
    }
}
