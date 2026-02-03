package Mattiazerbini.U5_W1_D2.entities;


    public class Topping extends Item{
        private String nome;

        public Topping(int calorie, double prezzo, String nome) {
            super(calorie, prezzo);
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Topping{" +
                    "nome='" + nome + '\'' +
                    ", calorie=" + calorie +
                    ", prezzo=" + prezzo +
                    '}';
        }
    }

