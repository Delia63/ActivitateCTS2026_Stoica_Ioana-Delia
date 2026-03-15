package Spital.SimpleFactory.clase;

public class Asistent implements PersonalSpital{
    private int id;
    private String nume;

    public Asistent(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public void afisarePersonal() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asistent: ID - ").append(this.id).append(" Nume - ").append(this.nume);
        System.out.println(sb.toString());
    }
}
