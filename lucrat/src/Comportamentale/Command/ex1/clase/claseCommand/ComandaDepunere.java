package Comportamentale.Command.ex1.clase.claseCommand;

import Comportamentale.Command.ex1.clase.ContBancar;

public class ComandaDepunere implements IComanda{
    private ContBancar contBancar;
    private double suma;

    public ComandaDepunere(ContBancar contBancar, double suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void executa() {
        this.contBancar.depundere(this.suma);
    }
}
