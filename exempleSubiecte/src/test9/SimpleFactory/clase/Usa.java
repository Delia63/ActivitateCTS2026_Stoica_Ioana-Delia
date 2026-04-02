package test9.SimpleFactory.clase;

public class Usa implements IComponenta{
    private Double dimensiune;

    public Usa(Double dimensiune) {
        this.dimensiune = dimensiune;
    }


    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usa are o dimensiune de ").append(this.dimensiune);
        System.out.println(sb.toString());
    }
}
