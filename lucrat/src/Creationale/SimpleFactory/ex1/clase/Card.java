package Creationale.SimpleFactory.ex1.clase;

public class Card extends TitluCalatorie{
    public Card() {
        super(3.5f);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un bilet luat cu cardul.");
    }
}
