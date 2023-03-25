package A3;

public class Main {
    public static void main(String[] args) {
        Telefone t1 = new Telefone(81, 99999999);
        Cliente c1 = new Cliente("larissa", 12345678, t1);
        System.out.println(c1.toString()); 

        t1.alterarDDD(51);

        t1.alterarNumero(123456789);

        System.out.println("===================================================================");

        c1.setNome("edivaldo");

        System.out.println(c1.toString());
        
    }
}
