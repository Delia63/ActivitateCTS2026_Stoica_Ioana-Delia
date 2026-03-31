package test7.FactoryMethod.clase;

public class Camion implements MijTransport{
    private String pachet;

    public Camion(String pachet) {
        this.pachet = pachet;
    }

    @Override
    public void livreazaPachet() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camionul livreaza pachetul ").append(this.pachet);
        System.out.println(sb.toString());
    }
}
