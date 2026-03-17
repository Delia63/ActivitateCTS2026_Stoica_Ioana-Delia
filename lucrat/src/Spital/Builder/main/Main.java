package Spital.Builder.main;

import Spital.Builder.clase.Internare;
import Spital.Builder.clase.InternareBuilder;
import Spital.Builder.clase.InternareBuilderAbstract;
import Spital.Builder.clase.InternareBuilderAlternativ;

public class Main {
    public void main(String[] args) {
        Internare internare = new Internare(true, true, true,true, "Ion");
        Internare internare1 = new Internare(false,false,false,false,"Lucia");
//        System.out.println(internare.toString());
//        System.out.println(internare1.toString());

        InternareBuilder builder = new InternareBuilder("Luca");
        Internare internare2 = builder.build();

        Internare internare3 = builder.setNumePacient("Andrei").setPatRabatabil(true).setHalatInterior(true).build();

        System.out.println(internare2.toString());
        System.out.println(internare3.toString());
        System.out.println();

        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
        Internare internare101 = builderAlternativ.build("Mircea");
        Internare internare102 = builderAlternativ.build("Gigel");
        Internare internare103 = builderAlternativ.build("Gigica");

        System.out.println(internare101);
        System.out.println(internare102);
        System.out.println(internare103);
    }
}
