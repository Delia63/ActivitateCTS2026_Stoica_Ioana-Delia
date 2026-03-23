package Creationale.SimpleFactory.ex1.clase;

public class Abonament extends TitluCalatorie{

    public Abonament() {
        super(80);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un abonament lunar.");
    }
}
