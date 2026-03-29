package Restaurant.Prototype.main;

import Restaurant.Prototype.clase.IRezervare;
import Restaurant.Prototype.clase.Rezervare;

public class Main {
    static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Ion", 12, 3, "1234567891234567");
        Rezervare rezervare1 = (Rezervare) rezervare.copiaza();

        System.out.println(rezervare);
        System.out.println(rezervare1);
    }
}
