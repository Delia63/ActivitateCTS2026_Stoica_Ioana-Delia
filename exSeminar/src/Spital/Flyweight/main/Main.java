package Spital.Flyweight.main;
import Spital.Flyweight.clase.Internare;
import Spital.Flyweight.clase.RegistruPacienti;

public class Main {
    static void main(String[] args) {
        RegistruPacienti registruPacienti = new RegistruPacienti();

        registruPacienti.getPacient("Popescu", "077234567481"
                ,"popescu@gmail.com").afisareInternarePacient(
                        new Internare(10, 5, 5));

    }
}
