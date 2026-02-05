package Mattiazerbini.U5_W1_D2.config;

import Mattiazerbini.U5_W1_D2.entities.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    @Value("${coperto.prezzo}")
    private double prezzoCoperto;

    @Bean(name = "topping_pomodoro")
    public Topping toppingPomodoroBean(){
        return new Topping(0, 0, "Pomodoro");
    }

    @Bean(name = "mozzarella")
    public Topping toppingMozzarellaBean(){
        return new Topping(70, 0.50, "Mozzarella");
    }
    @Bean(name = "topping_funghi")
    public Topping toppingFunghiBean(){
        return new Topping(100, 1.2, "Funghi");
    }

    @Bean(name = "topping_salame")
    public Topping toppingSalameBean(){
        return new Topping(250, 2, "Salame");
    }
    @Bean(name = "topping_prosciutto")
    public Topping toppingProsciuttoBean(){
        return new Topping(130, 2.50, "Prosciutto");
    }

    @Bean(name = "pizza_marherita")
    public Pizza pizzaMargheritaBean(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingPomodoroBean());
        toppingList.add(toppingMozzarellaBean());
        return new Pizza("Margherita", toppingList);
    }

    @Bean(name = "pizza_diavola")
    public Pizza pizzaDiavolaBean(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingPomodoroBean());
        toppingList.add(toppingSalameBean());
        return new Pizza("Diavola", toppingList);
    }

    @Bean(name = "crostino")
    public Pizza pizzaCrostinoBean(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingProsciuttoBean());
        toppingList.add(toppingMozzarellaBean());
        return new Pizza("Crostino", toppingList);
    }

    @Bean(name = "acqua")
    public Drink acquaBean(){
        return new Drink(0,1,"Acqua");
    }

    @Bean(name = "birra")
    public Drink birraBean(){
        return new Drink(200,5,"Birra");
    }

    @Bean(name = "vino")
    public Drink vinoBean(){
        return new Drink(400,10,"Vino");
    }


    @Bean(name = "Menu")
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


    @Bean(name = "ordini_demo")
    public List<Ordine> ordiniBean() {
        List<Ordine> ordini = new ArrayList<>();

        ordini.add(new Ordine(1, new Tavolo(1, 4), 2, LocalDateTime.now(), false, prezzoCoperto));
        ordini.add(new Ordine(2, new Tavolo(2, 2), 2, LocalDateTime.now(), true, prezzoCoperto));
        ordini.add(new Ordine(3, new Tavolo(3, 6), 4, LocalDateTime.now(), true, prezzoCoperto));

        return ordini;
    }
}

