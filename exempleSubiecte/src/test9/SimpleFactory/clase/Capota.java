package test9.SimpleFactory.clase;

public class Capota implements IComponenta{
    private Double dimensiune;

    public Capota(Double dimensiune) {
        this.dimensiune = dimensiune;
    }


    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Capota are o dimensiune de ").append(this.dimensiune);
        System.out.println(sb.toString());
    }
}
