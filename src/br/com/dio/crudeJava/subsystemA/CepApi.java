package br.com.dio.crudeJava.subsystemA;

/**
 * CepApi class
 *
 * @author Wagner Maciel
 */
public class CepApi {
    private static CepApi cepApiInstance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getCepApiInstance() {
        return cepApiInstance;
    }

    public String getCity(String cep) {
        return "City A";
    }

    public String getState(String cep) {
        return "State A";
    }
}
