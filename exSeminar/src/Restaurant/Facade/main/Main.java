package Restaurant.Facade.main;

import Restaurant.Facade.clase.FacadeRestaurant;

public class Main {
    static void main(String[] args) {
        FacadeRestaurant facadeRestaurant = new FacadeRestaurant();
        System.out.println(facadeRestaurant.verificaDisponibilitateMasa(1));
        System.out.println(facadeRestaurant.verificaDisponibilitateMasa(4));
        System.out.println(facadeRestaurant.verificaDisponibilitateMasa(10));
        System.out.println(facadeRestaurant.verificaDisponibilitateMasa(15));
    }
}
