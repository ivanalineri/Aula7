package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        Pato pato = new Pato(20);
        Aviao aviao = new Aviao(20);
        SuperHomem superHomem = new SuperHomem(5);
        TorreDeControle torreDeControle = new TorreDeControle();

        torreDeControle.adicionarVoador(pato);
        torreDeControle.adicionarVoador(aviao);
        torreDeControle.adicionarVoador(superHomem);

        torreDeControle.voemTodos();

    }
}
