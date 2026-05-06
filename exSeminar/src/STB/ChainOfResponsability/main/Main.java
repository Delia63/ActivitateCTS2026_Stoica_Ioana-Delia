package STB.ChainOfResponsability.main;

import STB.ChainOfResponsability.clase.CalatorieHandler;
import STB.ChainOfResponsability.clase.handleriConcreti.CalatorieAutobuz;
import STB.ChainOfResponsability.clase.handleriConcreti.CalatorieMetrou;
import STB.ChainOfResponsability.clase.handleriConcreti.CalatorieTramvai;
import STB.ChainOfResponsability.clase.handleriConcreti.CalatorieTroleibuz;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setUrmatorul(calatorieAutobuz);
        calatorieAutobuz.setUrmatorul(calatorieTramvai);
        calatorieTramvai.setUrmatorul(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandaCalatorie(10));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(5));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(1));
    }
}
