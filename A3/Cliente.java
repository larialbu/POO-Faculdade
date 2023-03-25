package A3;

public class Cliente {
    //Atributos
    private String nome;
    private  Telefone telefone;
    private int CPF;

    //Construtor
    Cliente(String n, int c, Telefone fone) {

        nome = n;
        CPF = c;
        this.telefone = fone;
    }

    //Metodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Telefone getTelefone() {
        return telefone;
    }
    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    public int getCPF() {
        return CPF;
    }

    public String toString() {
        return "Nome do cliente: " + nome + ", Telefone: (" + telefone.getDDD() +") "+telefone.getNumero() + ", CPF: " + CPF;
    }

    
}