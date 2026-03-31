package test7.FactoryMethod.clase;

public class Motocicleta implements MijTransport{
    private String pachet;

    public Motocicleta(String pachet) {
        this.pachet = pachet;
    }

    @Override
    public void livreazaPachet() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motocicleta livreaza pachetul ").append(this.pachet);
        System.out.println(sb.toString());
    }
}
