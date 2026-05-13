package Comportamentale.Command.ex1.clase.claseCommand;

import Comportamentale.Command.ex1.clase.ContBancar;

public class ComandaRetragere implements IComanda{
    private ContBancar contBancar;
    private double suma;

    public ComandaRetragere(ContBancar contBancar, double suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void executa() {
        this.contBancar.retragere(this.suma);
    }
}
