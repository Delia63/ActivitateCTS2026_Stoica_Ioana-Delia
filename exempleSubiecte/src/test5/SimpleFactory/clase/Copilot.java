package test5.SimpleFactory.clase;

public class Copilot implements PersonalBord{
    private String nume;

    public Copilot(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Copilotul ").append(this.nume).append(" se afla la bord.");
        System.out.println(sb.toString());
    }
}
