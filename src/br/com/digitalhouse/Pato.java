package br.com.digitalhouse;

public class Pato implements Voador {

    public  int energia;

    public Pato(){

    }

    public Pato(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        System.out.println("Minha energia é: " + (energia - 5)  + "Estou voando como pato");

    }
}
