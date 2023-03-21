package A1;

public class Cliente {
    String nome;
    int rg;
    int cpf;
    Telefone fone;
    Data nasc;
    Endereco end;

    Cliente(String n, int r, int c, Telefone fone, Data nasc, Endereco end) {

        nome = n;
        rg = r;
        cpf = c;
        this.fone = fone;
        this.nasc = nasc;
        this.end = end;
    }
}