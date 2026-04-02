package test9.SimpleFactory.clase;

public class Bara implements IComponenta{
    private Double dimensiune;

    public Bara(Double dimensiune) {
        this.dimensiune = dimensiune;
    }


    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bara are o dimensiune de ").append(this.dimensiune);
        System.out.println(sb.toString());
    }
}
