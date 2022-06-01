package br.com.dio.crudeJava.facade;

import br.com.dio.crudeJava.subsystemA.CepApi;
import br.com.dio.crudeJava.subsystemB.RegistryService;

/**
 * Facade class
 *
 * @author Wagner Maciel
 */
public class Facade {
    private static Facade facadeInstance = new Facade();

    private Facade() {
        super();
    }

    public static Facade getFacadeInstance() {
        return facadeInstance;
    }

    public void migrateClient(String name, String cep) {
        String city = CepApi.getCepApiInstance().getCity(cep);
        String state = CepApi.getCepApiInstance().getState(cep);
        RegistryService.writeClient(name, cep, city, state);
    }
}
