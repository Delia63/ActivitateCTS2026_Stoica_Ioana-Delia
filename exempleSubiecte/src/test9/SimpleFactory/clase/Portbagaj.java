package test9.SimpleFactory.clase;

public class Portbagaj implements IComponenta{
    private Double dimensiune;

    public Portbagaj(Double dimensiune) {
        this.dimensiune = dimensiune;
    }


    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Porbagajul are o dimensiune de ").append(this.dimensiune);
        System.out.println(sb.toString());
    }
}
