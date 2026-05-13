package Comportamentale.Command.ex1.clase.claseCommand;

import Comportamentale.Command.ex1.clase.ContBancar;

public class ComandaConstituire implements IComanda{
    private ContBancar contBancar;
    private double sumaInitiala;

    public ComandaConstituire(ContBancar contBancar, double sumaInitiala) {
        this.contBancar = contBancar;
        this.sumaInitiala = sumaInitiala;
    }

    @Override
    public void executa() {
        this.contBancar.constituire(this.sumaInitiala);
    }
}
