package test5.SimpleFactory.clase;

public class Pilot implements PersonalBord{
    private String nume;

    public Pilot(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pilotul ").append(this.nume).append(" se afla la bord.");
        System.out.println(sb.toString());
    }
}
