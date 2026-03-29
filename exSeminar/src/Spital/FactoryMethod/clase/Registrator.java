package Spital.FactoryMethod.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(int id, String nume) {
        super(id, nume);
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registrator -> ID: ").append(this.id)
                .append(" Nume: ").append(this.nume);
        System.out.println(sb.toString());
    }
}
