package A2;

public class Cliente {
    String nome;
    int cpf;
    Endereco end;
    Float saldo;

    public Cliente(String n, int c, Endereco end, float s) {

        this.nome = n;
        this.cpf = c;
        this.end = end;
        this.saldo = s;
    }

    public void Extrato() {

        System.out.println("Sre." + this.nome + "Cpf: " + this.cpf + " Endereco: "
                + this.end.cep + ", " + this.end.log + ", " + this.end.bairro + ", " + "Seu saldo atual é de: "
                + this.saldo);
    }

    public void Deposito(float val) {
        this.saldo = saldo + val;
        System.out.println(saldo);

    }

    public void Saque(float val) {
        this.saldo = saldo - val;
        System.out.println(saldo);

    }
}
