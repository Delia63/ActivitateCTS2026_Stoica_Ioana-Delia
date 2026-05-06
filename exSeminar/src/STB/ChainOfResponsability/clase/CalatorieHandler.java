package STB.ChainOfResponsability.clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler urmator; //succesor

    public CalatorieHandler() {
        this.urmator = null;
    }

    public void setUrmatorul(CalatorieHandler urmator) {
        this.urmator = urmator;
    }

    public abstract String recomandaCalatorie(double distanta);
}
