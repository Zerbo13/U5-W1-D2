package Mattiazerbini.U5_W1_D2.config;

import Mattiazerbini.U5_W1_D2.entities.Drink;
import Mattiazerbini.U5_W1_D2.entities.Menu;
import Mattiazerbini.U5_W1_D2.entities.Pizza;
import Mattiazerbini.U5_W1_D2.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {
    @Bean
            (name = "topping_pomodoro")
    public Topping toppingPomodoroBean(){
        return new Topping(0, 0, "Pomodoro");
    }

    @Bean
            (name = "mozzarella")
    public Topping toppingMozzarellaBean(){
        return new Topping(70, 0.50, "Mozzarella");
    }
    @Bean
            (name = "topping_funghi")
    public Topping toppingFunghiBean(){
        return new Topping(100, 1.2, "Funghi");
    }

    @Bean
            (name = "topping_salame")
    public Topping toppingSalameBean(){
        return new Topping(250, 2, "Salame");
    }
    @Bean
            (name = "topping_prosciutto")
    public Topping toppingProsciuttoBean(){
        return new Topping(130, 2.50, "Prosciutto");
    }

    @Bean
            (name = "pizza_marherita")
    public Pizza pizzaMargheritaBean(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingPomodoroBean());
        toppingList.addLast(toppingMozzarellaBean());
        return new Pizza("Margherita", toppingList);
    }

    @Bean
            (name = "pizza_diavola")
    public Pizza pizzaDiavolaBean(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingPomodoroBean());
        toppingList.addLast(toppingSalameBean());
        return new Pizza("Diavola", toppingList);
    }

    @Bean
            (name = "crostino")
    public Pizza pizzaCrostinoBean(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingProsciuttoBean());
        toppingList.addLast(toppingMozzarellaBean());
        return new Pizza("Crostino", toppingList);
    }

    @Bean
            (name = "acqua")
    public Drink acquaBean(){
        return new Drink(0,1,"Acqua");
    }

    @Bean
            (name = "birra")
    public Drink birraBean(){
        return new Drink(200,5,"Birra");
    }

    @Bean
            (name = "vino")
    public Drink vinoBean(){
        return new Drink(400,10,"Vino");
    }

    @Bean
            (name = "menu")
    public Menu menuBean(){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();
        List<Topping> toppingList = new ArrayList<>();


        pizzaList.add(pizzaCrostinoBean());
        pizzaList.add(pizzaDiavolaBean());
        pizzaList.add(pizzaMargheritaBean());

        drinkList.add(acquaBean());
        drinkList.add(birraBean());
        drinkList.add(vinoBean());

        toppingList.add(toppingSalameBean());
        toppingList.add(toppingFunghiBean());
        toppingList.add(toppingProsciuttoBean());
        toppingList.add(toppingMozzarellaBean());

        return new Menu(pizzaList, drinkList, toppingList);
    }
}

