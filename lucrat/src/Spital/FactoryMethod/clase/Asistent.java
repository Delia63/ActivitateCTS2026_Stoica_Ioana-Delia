package Spital.FactoryMethod.clase;

public class Asistent extends PersonalMedical{
    public Asistent(int id, String nume, String tura) {
        super(id, nume, tura);
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asistent -> ID: ").append(this.id)
                .append(" Nume: ").append(this.nume)
                .append(" Tura: ").append(this.tura);
        System.out.println(sb.toString());
    }
}
