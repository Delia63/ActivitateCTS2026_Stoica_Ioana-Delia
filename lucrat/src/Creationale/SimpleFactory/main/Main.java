package Creationale.SimpleFactory.main;

import Creationale.SimpleFactory.clase.PachetTuristic;
import Creationale.SimpleFactory.factory.AgentieFactory;
import Creationale.SimpleFactory.factory.TipPachet;

public class Main {
    public static void main(String[] args) throws Exception {
        AgentieFactory agentieFactory = new AgentieFactory();

        PachetTuristic pachetTuristic = agentieFactory.createPachet(TipPachet.pachetCazare);
        pachetTuristic.descriere();

        PachetTuristic pachetTuristic1 = agentieFactory.createPachet(TipPachet.pachetTransport);
        pachetTuristic1.descriere();
    }
}
