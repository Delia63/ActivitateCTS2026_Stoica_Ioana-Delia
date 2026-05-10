package Comportamentale.Observer.clase.observer;

public class Client implements IClient{
    private String numeClient;

    public Client(String nume) {
        this.numeClient=nume;
    }
    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println(numeClient + " ai primit mesajul: " + mesaj);
    }
}
