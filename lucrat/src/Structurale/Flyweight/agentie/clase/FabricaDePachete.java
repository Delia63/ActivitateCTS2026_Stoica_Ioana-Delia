package Structurale.Flyweight.agentie.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaDePachete {
    private Map<Integer, IPachetTuristic> pacheteTuristice;

    public FabricaDePachete() {
        this.pacheteTuristice = new HashMap<>();
    }

    public int getNumarPachete() {
        return pacheteTuristice.size();
    }

    public IPachetTuristic getPachetTuristic(int codPachet, String numeHotel, String destinatie) {
        IPachetTuristic pachetTuristic = pacheteTuristice.get(codPachet);

        if(pachetTuristic == null) {
            pachetTuristic = new PachetTuristic(codPachet, numeHotel ,destinatie, true);
            pacheteTuristice.put(codPachet, pachetTuristic);
        }
        return pachetTuristic;
    }
}
