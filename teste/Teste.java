package teste;
public class Teste {
    public String atributo1;
    private int atributo2;
    protected String atributo3;
    double atributo4;

    public Teste(){}
    public int getAtributo2() {
        return atributo2;
    }
    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    /* public void metodo1() {
        atributo2 = 5;
        System.out.println(atributo2);
    } */
    public void metodo2(){
        atributo1 = "oinn";
    }
    public void metodo3(){
        atributo3 = "Larissa Azevedo";
    }
    public void metodo4(){
        atributo4 = 29.9;
    }
    
}