package Mattiazerbini.U5_W1_D2.entities;
import java.util.List;

public class Pizza extends Item {
    private String nome;
    private List<Topping> toppingList;

    public Pizza(String nome, List<Topping> toppingList) {
        super(1012, 4.3);
        this.nome = nome;
        this.toppingList = toppingList;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", toppingList=" + toppingList +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}

