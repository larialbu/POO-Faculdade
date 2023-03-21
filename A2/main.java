package A2;

public class main {
    public static void main(String[] args) {

        Endereco e = new Endereco(54280760, "rua do ó", " boa vista ");
        Cliente c = new Cliente("Estevão", 666666666, e, 3467);

        c.Extrato();
        System.out.println("\n\n");
        c.Deposito(1000);
        System.out.println("\n\n");
        c.Saque(500);
        System.out.println("\n");
    }
}
