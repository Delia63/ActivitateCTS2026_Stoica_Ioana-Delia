package Restaurant.Builder.main;

import Restaurant.Builder.clase.Rezervare;
import Restaurant.Builder.clase.RezervareBuilder;

public class Main {
    static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare1 = builder.setAsezareLaGeam(true).setDecorareMasa(true)
                .setMuzicaAmbientala(true).build("Delia");
        Rezervare rezervare2 = builder.setAsezareLaGeam(false).setDecorareMasa(false)
                .setMuzicaAmbientala(false).build("Luca");

        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
