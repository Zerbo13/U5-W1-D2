package Mattiazerbini.U5_W1_D2.entities;

import lombok.Getter;

@Getter
public abstract class Item {
    protected int calorie;
    protected double prezzo;

    public Item(int calorie, double prezzo) {
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
}

