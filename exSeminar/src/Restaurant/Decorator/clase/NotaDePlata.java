package Restaurant.Decorator.clase;

public class NotaDePlata implements INotaDePlata{
    private Float sumaDePlatit;
    private String dataNotaDePlata;

    public NotaDePlata(Float sumaDePlatit, String dataNotaDePlata) {
        this.sumaDePlatit = sumaDePlatit;
        this.dataNotaDePlata = dataNotaDePlata;
    }

    @Override
    public void printeaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nota de plata de la data ").append(this.dataNotaDePlata)
                .append(" cu suma de ").append(this.sumaDePlatit).append(" lei.");
        System.out.println(sb.toString());
    }
}
