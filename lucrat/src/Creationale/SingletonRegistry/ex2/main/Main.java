package Creationale.SingletonRegistry.ex2.main;

import Creationale.SingletonRegistry.ex2.clase.BecInteligent;
import Creationale.SingletonRegistry.ex2.clase.CameraSupraveghere;
import Creationale.SingletonRegistry.ex2.clase.IDispozitiv;
import Creationale.SingletonRegistry.ex2.clase.RegistryDispozitive;

public class Main {
    static void main(String[] args) {
        IDispozitiv becInteligent = new BecInteligent();
        IDispozitiv cameraSupraveghere = new CameraSupraveghere();

        try {
            RegistryDispozitive.register("LivingLight", becInteligent);
            IDispozitiv dispozitiv1 = RegistryDispozitive.getDispozitiv("LivingLight");
            dispozitiv1.actioneaza();

            RegistryDispozitive.register("MainGate", cameraSupraveghere);
            IDispozitiv dispozitiv2 = RegistryDispozitive.getDispozitiv("MainGate");
            dispozitiv2.actioneaza();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
