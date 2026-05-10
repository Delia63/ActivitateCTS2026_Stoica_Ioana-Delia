package Structurale.Facade.hotel.main;

import Structurale.Facade.hotel.clase.Facade;

public class Main {
    static void main(String[] args) {
        Facade facade = new Facade();
        System.out.println(facade.verificaDisponibilitateCamera(6));
        System.out.println();
        System.out.println(facade.verificaDisponibilitateCamera(1));
        System.out.println();
        System.out.println(facade.verificaDisponibilitateCamera(12));
    }
}
