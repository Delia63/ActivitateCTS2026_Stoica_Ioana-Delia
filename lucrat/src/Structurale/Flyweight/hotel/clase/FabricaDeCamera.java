package Structurale.Flyweight.hotel.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeCamera {
    private Map<Integer, ICamera> camere;

    public FabricaDeCamera() {
        this.camere = new HashMap<>();
    }

    public ICamera getCamera(int codCamera) {
        if(camere.containsKey(codCamera)) {
            return camere.get(codCamera);
        }
        else {
            ICamera camera = new Camera(codCamera, 2, 2, 4, 6);
            camere.put(codCamera, camera);
            return camera;
        }
    }
}
