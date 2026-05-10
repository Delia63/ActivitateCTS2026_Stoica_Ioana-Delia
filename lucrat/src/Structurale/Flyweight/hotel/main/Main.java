package Structurale.Flyweight.hotel.main;

import Structurale.Flyweight.hotel.clase.FabricaDeCamera;
import Structurale.Flyweight.hotel.clase.Rezervare;

public class Main {
    static void main(String[] args) {
        FabricaDeCamera fabricaDeCamera = new FabricaDeCamera();

        Rezervare rezervare1 = new Rezervare("Popescu",1);
        fabricaDeCamera.getCamera(1).tiparire(rezervare1);

        Rezervare rezervare2 = new Rezervare("Radu",2);
        fabricaDeCamera.getCamera(2).tiparire(rezervare2);
    }
}
