package Spital.Strategy.main;

import Spital.Strategy.clase.Pacient;
import Spital.Strategy.clase.strategii.Cash;

import java.lang.classfile.PseudoInstruction;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Mircea");
        pacient.platesteInternare(120);
        System.out.println();
        pacient.setModPlata(new Cash());
        pacient.platesteInternare(100);
    }
}
