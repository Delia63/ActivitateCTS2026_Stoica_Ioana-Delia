package Spital.FactoryMethod.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(int id, String nume) {
        super(id, nume);
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Secretar -> ID: ").append(this.id)
                .append(" Nume: ").append(this.nume);
        System.out.println(sb.toString());
    }
}
