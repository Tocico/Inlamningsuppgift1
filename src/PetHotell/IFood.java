package PetHotell; /**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 17:30
 * Project: OOP Inlämningsuppgift1
 * Copyright: MIT
 */

/**
 * Interface
 */
public interface IFood {
    //Abstrakta metoder
    String getName();
    PetFood getFoodSort();
    double calculateFood();
}
