package Creationale.SingletonRegistry.ex1.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistryEchipament {
    private static Map<String, IEchipament> collection = new HashMap<>();

    private RegistryEchipament() {
    }

    public static void register(String name, IEchipament value) throws Exception {
        if(collection.containsKey(name))
            throw new Exception("Key '"+ name + "' is already registered.");
        else collection.put(name, value);
    }

    public static IEchipament getEchipament(String name) {
        return collection.get(name);
    }

}
