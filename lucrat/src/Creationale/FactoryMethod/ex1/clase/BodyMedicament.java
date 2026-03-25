package Creationale.FactoryMethod.ex1.clase;

public class BodyMedicament extends Medicament{
    public BodyMedicament(String denumire, float pret) {
        super(denumire, pret);
    }

    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Body -> Medicamentul ").append(this.denumire)
                .append(" costa ").append(this.pret).append(" lei.");
        System.out.println(sb.toString());
    }
}
