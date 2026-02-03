package Mattiazerbini.U5_W1_D2.entities;

import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private int numOrdine;
    private Tavolo tavolo;
    private List<Item> items = new ArrayList<>();
    private int coperti;
    private LocalDateTime ora;
    private boolean servito;

    @Value("${coperto.prezzo}")
    private double prezzoCoperto;

    public Ordine(int numOrdine, Tavolo tavolo,  int coperti, LocalDateTime ora, boolean servito) {
        this.numOrdine = numOrdine;
        this.tavolo = tavolo;
        this.coperti = coperti;
        this.ora = LocalDateTime.now();
        this.servito = false;
        tavolo.occpuaTavolo();
    }

    public void aggiungiItem(Item item){
        items.add(item);
    }

    public double getTotale(){
        double totale = 0;
        for(Item item : items){
            totale += item.getPrezzo();
        }
        totale += coperti * prezzoCoperto;
        return totale;
    }


    @Override
    public String toString() {
        return "Ordine{" +
                "numOrdine=" + numOrdine +
                ", tavolo=" + tavolo +
                ", items=" + items +
                ", coperti=" + coperti +
                ", ora=" + ora +
                ", servito=" + servito +
                ", prezzoCoperto=" + prezzoCoperto +
                '}';
    }
}
