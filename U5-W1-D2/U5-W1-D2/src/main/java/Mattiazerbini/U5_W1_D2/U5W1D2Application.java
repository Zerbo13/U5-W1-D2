package Mattiazerbini.U5_W1_D2;

import Mattiazerbini.U5_W1_D2.entities.Menu;
import Mattiazerbini.U5_W1_D2.entities.Ordine;
import Mattiazerbini.U5_W1_D2.entities.Tavolo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

import static java.awt.SystemColor.menu;

@SpringBootApplication
public class U5W1D2Application {

	public static void main(String[] args) {

		var ctx = SpringApplication.run(U5W1D2Application.class, args);

		Menu menu = (Menu) ctx.getBean("Menu");

		menu.printMenu();

		List<Ordine> ordini = (List<Ordine>) ctx.getBean("ordini_demo");

		for (int i = 0; i < ordini.size(); i++) {
			Ordine ordine = ordini.get(i);
			ordine.aggiungiItem(menu.getPizzaList().get(i % menu.getPizzaList().size()));
			ordine.aggiungiItem(menu.getDrinkList().get(i % menu.getDrinkList().size()));
			ordine.stampaDettagliOrdine();
		}
	}
}


