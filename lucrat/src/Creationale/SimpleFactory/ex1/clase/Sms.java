package Creationale.SimpleFactory.ex1.clase;

public class Sms extends TitluCalatorie{
    public Sms() {
        super(4);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un bilet luat prin SMS.");
    }
}
