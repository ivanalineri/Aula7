package br.com.digitalhouse;

public class Aviao implements Voador {

    public float horasDeVoo;

    public Aviao(float horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    public Aviao() {

    }

    @Override
    public void voar() {
        System.out.println((horasDeVoo + 13) + "Voando como uma galinha!!!");

    }
}
