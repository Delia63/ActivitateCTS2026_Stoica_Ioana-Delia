package Structurale.Facade.hotel.clase;

public class Facade {
    public String verificaDisponibilitateCamera(int codCamera) {
        CamereLibere camereLibere = new CamereLibere();

        if(camereLibere.verificaCameraLibera(codCamera)) {
            Menajera menajera = new Menajera();

            if(menajera.esteCameraCurata(codCamera)) {
                return "Camera este gata";
            }
            else {
                return "Camera trebuie curatata.";
            }
        }
        else {
            return "Camera trebuie eliberata.";
        }
    }
}
