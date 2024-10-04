package inheritance.shop;

public class Televisore extends Prodotto {
    private int dimensioni;
    private boolean smart;
    
    public Televisore(int codice, String nome, String marca, double prezzo, double iva, int dimensioni, boolean smart) {
    	super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }
    
    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
