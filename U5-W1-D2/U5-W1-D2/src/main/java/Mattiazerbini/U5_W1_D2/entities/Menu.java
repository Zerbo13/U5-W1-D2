package Mattiazerbini.U5_W1_D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private  List<Topping> toppingList ;

    public void printMenu() {
        System.out.println("Menu");
        System.out.println("Le Pizze");
        this.pizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("I Topping");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("I Drink");
        this.drinkList.forEach(System.out::println);
        System.out.println();

    }
}