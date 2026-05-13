package Comportamentale.Command.ex1.clase;

public class ContBancar {
    private String titular;
    private double sold;

    public ContBancar(String titular, double sold) {
        this.titular = titular;
        this.sold = sold;
    }

    public void constituire(double sumaInitiala) {
        this.sold = sumaInitiala;
        System.out.println("Contul titularului " + this.titular
                + " a fost constituit cu suma de " + sumaInitiala
                + " lei.");
    }

    public void retragere(double suma) {
        if(suma <= this.sold) {
            this.sold -= suma;
            System.out.println("Sold dupa retragere: " + this.sold);
        }
        else {
            System.out.println("Fonduri insuficiente pentru retragere!");
        }
    }

    public void depundere(double suma) {
        this.sold += suma;
        System.out.println("Sold dupa depunere: " + this.sold);
    }
}
