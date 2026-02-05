package Mattiazerbini.U5_W1_D2.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@PropertySource("application.properties")

public class Ordine {
    private int numOrdine;
    private Tavolo tavolo;
    private List<Item> items = new ArrayList<>();
    private int coperti;
    private LocalDateTime ora;
    private boolean servito;

    @Value("${coperto.prezzo}")
    private double prezzoCoperto;

    public Ordine(int numOrdine, Tavolo tavolo,  int coperti, LocalDateTime ora, boolean servito, double prezzoCoperto) {
        this.numOrdine = numOrdine;
        this.tavolo = tavolo;
        this.coperti = coperti;
        this.ora = ora;
        this.servito = servito;
        this.prezzoCoperto = prezzoCoperto;
        tavolo.occupaTavolo();
    }

    public Ordine(int numOrdine, Tavolo tavolo, int coperti, LocalDateTime ora, boolean servito) {
        this(numOrdine, tavolo, coperti, ora, servito, 2.0);
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

    public void stampaDettagliOrdine() {
        System.out.println("  ");
        System.out.println(" ORDINE ");
        System.out.println("Numero ordine: " + numOrdine);
        System.out.println("Tavolo: " + tavolo);
        System.out.println("Coperti: " + coperti + " (" + prezzoCoperto + "€ cad.)");
        System.out.println("Servito: " + servito);
        System.out.println("Ora: " + ora);
        System.out.println("Prodotti:");
        items.forEach(item -> System.out.println("- " + item + " | prezzo: " + item.getPrezzo() + "€"));
        System.out.println("Totale ordine: " + getTotale() + "€");
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
