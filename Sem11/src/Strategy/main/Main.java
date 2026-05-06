package Strategy.main;

import Strategy.clase.Student;
import Strategy.clase.strategii.Grila;
import Strategy.clase.strategii.ModSustinere;
import Strategy.clase.strategii.ProbaOrala;
import Strategy.clase.strategii.ProbaScrisa;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Robert");

        student.examinare();
        student.setModSustinere(new ProbaOrala());
        student.examinare();
    }
}
