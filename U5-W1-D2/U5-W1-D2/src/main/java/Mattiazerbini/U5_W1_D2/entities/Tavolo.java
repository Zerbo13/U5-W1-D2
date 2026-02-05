package Mattiazerbini.U5_W1_D2.entities;

public class Tavolo {
    private int numero;
    private int copertiMassimo;
    private boolean occupato;

    public Tavolo(int numero, int copertiMassimo) {
        this.numero = numero;
        this.copertiMassimo = copertiMassimo;
        this.occupato = false;
    }

    public void occupaTavolo(){
        this.occupato = true;
    }


    public void liberaTavolo(){
        this.occupato = false;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", copertiMassimo=" + copertiMassimo +
                ", occupato=" + occupato +
                '}';
    }
}
