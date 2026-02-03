package Mattiazerbini.U5_W1_D2.entities;

import lombok.Getter;
import lombok.Setter;

    @Getter
    @Setter
    public class Drink extends Item {
        private String nome;

        public Drink(int calorie, double prezzo, String nome) {
            super(calorie, prezzo);
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Drink{" +
                    "nome='" + nome + '\'' +
                    ", calorie=" + calorie +
                    ", prezzo=" + prezzo +
                    '}';
        }
    }

