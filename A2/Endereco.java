package A2;

public class Endereco {
    int cep;
    String log;
    String bairro;

    public Endereco(int c, String l, String b) {
        cep = c;
        log = l;
        bairro = b;

    }

    public void ImprimeEnd() {

        System.out.println("o cep do cliente: " + cep + ", logradouro: " + log + " e bairro: " + bairro + ".");
    }

}
