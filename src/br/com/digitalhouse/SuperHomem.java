package br.com.digitalhouse;

public class SuperHomem implements Voador {

    public int exeperiencia;

    public SuperHomem (){

    }

    public SuperHomem(int exeperiencia) {
        this.exeperiencia = exeperiencia;
    }

    @Override
    public void voar() {

        System.out.println((exeperiencia + 3) + "Estou voando como um campeão");

    }
}
