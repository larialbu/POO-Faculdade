package A3;

public class Telefone {
    private int DDD;
    private int numero;

    public Telefone(int ddd, int num){
        this.DDD = ddd;
        this.numero = num;
    }

    public int getDDD() {
        return DDD;

    }
    public void setDDD(int dDD) {
        DDD = dDD;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void alterarDDD(int ddd) {
        setDDD(ddd);
    }
    public void alterarNumero(int num) {
        setNumero(num);
    }
    
}
