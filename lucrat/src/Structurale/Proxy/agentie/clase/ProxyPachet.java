package Structurale.Proxy.agentie.clase;

public class ProxyPachet implements PachetTuristic{
    private PachetTransport pachetTransport;

    public ProxyPachet(PachetTransport pachetTransport) {
        this.pachetTransport = pachetTransport;
    }

    public ProxyPachet(Persoana persoana) {
        this.pachetTransport = new PachetTransport(persoana);
    }

    @Override
    public void descrierePachet() {
        this.pachetTransport.descrierePachet();
    }

    @Override
    public void rezervaPachet() {
        if(this.pachetTransport.getPersoana().getVarsta() >= 65) {
            pachetTransport.rezervaPachet();
        }
        else {
            System.out.println("Rezervarea nu este permisa, deoarece " + pachetTransport.getPersoana().getNume() + " are doar "
                    + pachetTransport.getPersoana().getVarsta() + " ani.");
        }
    }
}
