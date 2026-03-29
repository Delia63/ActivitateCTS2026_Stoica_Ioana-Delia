package test5.SimpleFactory.clase;

public class Stewardesa implements PersonalBord{
    private String nume;

    public Stewardesa(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stewardesa ").append(this.nume).append(" se afla la bord.");
        System.out.println(sb.toString());
    }
}
