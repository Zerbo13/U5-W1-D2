package Mattiazerbini.U5_W1_D2;

import Mattiazerbini.U5_W1_D2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class U5W1D2Application {

	public static void main(String[] args) {

		var ctx = SpringApplication.run(U5W1D2Application.class, args);

		Menu menu = (Menu) ctx.getBean("menu");

		menu.printMenu();

	}

}
