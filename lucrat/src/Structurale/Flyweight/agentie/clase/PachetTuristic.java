package Structurale.Flyweight.agentie.clase;

public class PachetTuristic implements IPachetTuristic{
    private int codPachet;
    private String numeHotel;
    private String destinatie;
    private boolean micDejun;

    public PachetTuristic(int codPachet, String numeHotel, String destinatie, boolean micDejun) {
        this.codPachet = codPachet;
        this.numeHotel = numeHotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("codPachet=").append(codPachet);
        sb.append(", numeHotel='").append(numeHotel).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", micDejun=").append(micDejun);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriePachet(Optionale optionale) {
        System.out.println("Pachetul Turistic cu codul " + codPachet
                + ", are cazare la hotelul " + numeHotel
                + ", din orasul " + destinatie
                + (micDejun ? " are " : " nu are ")
                + "micDejun, " + (optionale.isCina() ? " are " : " nu are ")
                + " inclusa cina si are un numar de "
                + optionale.getNrExcursii() + " excursii optionale");
    }
}
