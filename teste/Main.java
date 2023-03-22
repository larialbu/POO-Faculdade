package teste;
public class Main {

    public static void main(String[]args){
    Teste t = new Teste();
    t.metodo2();
    System.out.println(t.atributo1);
    t.setAtributo2(5);
    System.out.println(t.getAtributo2());
    t.metodo3();
    System.out.println(t.atributo3);
    t.metodo4();
    System.out.println(t.atributo4); 
    }
}
