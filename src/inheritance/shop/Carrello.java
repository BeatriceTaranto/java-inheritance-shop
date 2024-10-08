package inheritance.shop;
import java.util.Scanner;

public class Carrello {
	private Prodotto prodotto;

	public Carrello() {
        prodotto = null;
    }
	
	public void aggiungiProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	
	public String stampaCarrello() {
        if (prodotto != null) {
            return "Prodotto aggiunto " + prodotto.dettagliProdotto(); 
        } else {
            return "Il carrello è vuoto. Nessun prodotto aggiunto!"; 
        }
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrello carrello = new Carrello();
        String scelta;
        
        System.out.println("Inserisci il prodotto (1 - smartphone, 2 - televisore, 3 - cuffie)");
        scelta = scanner.nextLine();
	
        switch (scelta) {
        case "1": 
            System.out.println("Hai scelto lo smartphone");
            Smartphone smartphone = new Smartphone(1, "iPhone", "Apple", 800.99, 22, "490154203237518", 124);
            carrello.aggiungiProdotto(smartphone);
            break;

        case "2": 
            System.out.println("Hai scelto il televisore");
            Televisore televisore = new Televisore(2, "Smart TV", "Samsung", 700.99, 22, 55, true);
            carrello.aggiungiProdotto(televisore);
            break;

        case "3": 
            System.out.println("Hai scelto le cuffie");
            Cuffie cuffie = new Cuffie(3, "AirPods", "Apple", 200.99, 22, "Nero", true);
            carrello.aggiungiProdotto(cuffie);
            break;

        default: 
            System.out.println("Prodotto non valido");
            break;
    }

    System.out.println(carrello.stampaCarrello());

    scanner.close();
    }
}
        
