package Creationale.SingletonRegistry.ex2.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistryDispozitive {
    private static Map<String, IDispozitiv> collection = new HashMap<>();

    private RegistryDispozitive() {
    }

    public static void register(String name, IDispozitiv value) throws Exception {
        if(collection.containsKey(name))
            throw new Exception("Key '" + name + "' is already registered.");
        else collection.put(name, value);
    }

    public static IDispozitiv getDispozitiv(String name) {
        return collection.get(name);
    }
}
