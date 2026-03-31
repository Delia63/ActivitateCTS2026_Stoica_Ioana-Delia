package test7.FactoryMethod.clase;

public class Autoutilitara implements MijTransport{
    private String pachet;

    public Autoutilitara(String pachet) {
        this.pachet = pachet;
    }

    @Override
    public void livreazaPachet() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autoutilitara livreaza pachetul ").append(this.pachet);
        System.out.println(sb.toString());
    }
}
