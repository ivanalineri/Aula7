package br.com.digitalhouse;

public class Aviao implements Voador {
    private String tipoDeAsa;
    private int qtdAssentos;

    public String getTipoDeAsa() {
        return tipoDeAsa;
    }

    public void setTipoDeAsa(String tipoAsa) {
        tipoDeAsa = tipoAsa;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtd) {
        qtdAssentos = qtd;
    }

    public Aviao(String asa, int qtdDeAssentos) {
        tipoDeAsa = asa;
        qtdAssentos = qtdDeAssentos;
    }

    public Aviao() {

    }

    @Override
    public void voar() {
        System.out.println("Voando como uma galinha!!!");

    }
}
