package Creationale.SimpleFactory.curs.main;

import Creationale.SimpleFactory.curs.clase.PachetTuristic;
import Creationale.SimpleFactory.curs.factory.AgentieFactory;
import Creationale.SimpleFactory.curs.factory.TipPachet;

public class Main {
    public static void main(String[] args) throws Exception {
        AgentieFactory agentieFactory = new AgentieFactory();

        PachetTuristic pachetTuristic = agentieFactory.createPachet(TipPachet.pachetCazare);
        pachetTuristic.descriere();

        PachetTuristic pachetTuristic1 = agentieFactory.createPachet(TipPachet.pachetTransport);
        pachetTuristic1.descriere();
    }
}
