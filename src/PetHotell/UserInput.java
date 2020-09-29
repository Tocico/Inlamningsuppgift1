package PetHotell;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-26
 * Time: 09:29
 * Project: OOP Inlämningsuppgift1
 * Copyright: MIT
 */

/**
 * Användare skall kunna mata in djuret namn
 */
public class UserInput {
    //Instansvariabel
    protected String input;

    /**
     * Konstruktor
     * Programmet fortsätter tills användare matar in rätt värdet.
     * Om man skriver felaktigt värde då visas felmeddelande.
     *
     * @param animalList List<Animal> en lista av alla djuret namn, vikt och mat sort
     */
    UserInput(List<Animal> animalList) {
        while (true) {
            System.out.println("Vilket djur ska få mat?");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if (controlUserInput(input)) {
                    if(checkIsInputValueInAnimalList(animalList)) break;
                    else System.out.println("Det finns inte " + this.input + ".");;
                }
            } else {
                System.exit(0);
            }
        }
    }

    /**
     * Kontrollera värdet som användare matar in.
     * Om användare matar ingenting då visas felmeddelande.
     * Annars sparas input värdet i instansvariabel input.
     *
     * @param input String vördet som användare matar in
     * @return bool sant eller falsk
     */
    private boolean controlUserInput(String input) {
        input = input.trim().toLowerCase();
        if (input.length() == 0 || input == " ") {
            System.out.println("Du har inte fyllt i djurets namn.");
            return false;
        }
        try {
            this.input = input;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     *  Kolla om det finns input värdet i listan
     *  genom att iterera över animal listan.
     *
     * @param animalList List<Animal> en lista av alla djuret namn, vikt och mat sort
     * @return bool sant eller falsk
     */
    private boolean checkIsInputValueInAnimalList(List<Animal> animalList) {
        boolean isThereAnimal = false;
        for (Animal animal : animalList) {
            if (animal.getName().toLowerCase().equals(this.input)) {
                isThereAnimal = true;
                break;
            }
        }
        return isThereAnimal;
    }


    public String getInput() {
        return input;
    }
}
