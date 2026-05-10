package STB.Observer.clase.observer;

public class Calator implements ICalator{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Calator "+this.nume+" ati primit mesajul: "+mesaj);
    }
}
