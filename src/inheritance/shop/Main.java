package inheritance.shop;

public class Main {
	public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(1, "iPhone", "Apple", 800.99, 22, "490154203237518", 124);
        Televisore televisore = new Televisore(2, "Smart TV", "Samsung", 700.99, 22, 55, true);
        Cuffie cuffie = new Cuffie(3, "AirPods", "Apple", 200.99, 22, "Nero", true);
        
        System.out.println(smartphone.dettagliProdotto());
        System.out.println(televisore.dettagliProdotto());
        System.out.println(cuffie.dettagliProdotto());
    }
}