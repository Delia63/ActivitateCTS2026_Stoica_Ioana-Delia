package Structurale.Flyweight.hotel.clase;

public class Rezervare {
    private String numeClient;
    private int codCamera;

    public Rezervare(String numeClient, int codCamera) {
        this.numeClient = numeClient;
        this.codCamera = codCamera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", codCamera=").append(codCamera);
        sb.append('}');
        return sb.toString();
    }
}
