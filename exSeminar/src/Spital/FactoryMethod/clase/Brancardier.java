package Spital.FactoryMethod.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(int id, String nume, String tura) {
        super(id, nume, tura);
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brancardier -> ID: ").append(this.id)
                .append(" Nume: ").append(this.nume)
                .append(" Tura: ").append(this.tura);
        System.out.println(sb.toString());
    }
}
