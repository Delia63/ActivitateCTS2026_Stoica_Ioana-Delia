package Restaurant.Facade.clase;

public class FacadeRestaurant {
    public String verificaDisponibilitateMasa(int nrMasa) {
        Receptioner receptioner = new Receptioner();

        if(receptioner.verificaMasaLibera(nrMasa)) {
            Chelner chelner = new Chelner();

            if(chelner.esteMasaCurata(nrMasa)) {
                if(chelner.areMasaServetele(nrMasa)) {
                    return "Masa este pregatita.";
                }
                else {
                    return "Masa are nevoie de servetele.";
                }
            }
            else {
                return "Masa trebuie debarasata.";
            }
        }
        else {
            return "Masa nu este libera.";
        }
    }
}
