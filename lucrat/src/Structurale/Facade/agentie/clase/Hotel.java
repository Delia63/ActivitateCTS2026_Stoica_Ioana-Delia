package Structurale.Facade.agentie.clase;

public class Hotel {
    private String nume;

    public Hotel(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hotel{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void rezervaCameraHotel(String oras) {
        System.out.println("In hotelul "+this.nume+" din orasul "+oras+" se rezerva o camera.");
    }

}
