package Restaurant.Flyweight.main;

import Restaurant.Flyweight.clase.Client;
import Restaurant.Flyweight.clase.IClient;
import Restaurant.Flyweight.clase.RegistruClienti;
import Restaurant.Flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        RegistruClienti registruClienti = new RegistruClienti();

        IClient client1 = registruClienti.getClient("Popescu", "0725364758", "popescu@gmail.com");

        Rezervare rezervare1 = new Rezervare(1,3,"12:50");
        Rezervare rezervare2 = new Rezervare(2,2,"14:30");
        Rezervare rezervare3 = new Rezervare(3,4,"20:00");

        client1.printeazaRezervare(rezervare1);
        client1.plateste(rezervare1, 20.0);

        registruClienti.getClient("Ioan", "0725364709", "ionescu@gmail.com").printeazaRezervare(rezervare2);
        registruClienti.getClient("Ioan", "0725364709", "ionescu@gmail.com").plateste(rezervare2, 10.0);

        registruClienti.getClient("Radu", "0725365758", "radu@gmail.com").printeazaRezervare(rezervare3);
        registruClienti.getClient("Radu", "0725365758", "radu@gmail.com").plateste(rezervare3,20.0);
    }
}
