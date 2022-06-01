package br.com.dio.crudeJava.subsystemB;

/**
 * RegistryService class
 *
 * @author Wagner Maciel
 */
public class RegistryService {
    public RegistryService() {
        super();
    }

    public static void writeClient(String name, String cep, String city, String state) {
        System.out.println("Saved client:");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);
    }

}
