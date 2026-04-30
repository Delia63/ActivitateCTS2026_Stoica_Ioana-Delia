package Restaurant.Flyweight.clase;

public interface IClient {
    public void printeazaRezervare(Rezervare rezervare);

    public void plateste(Rezervare rezervare, Double taxaPerPersoana);
}
