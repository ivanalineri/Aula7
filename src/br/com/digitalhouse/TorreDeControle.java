package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {


    private List<Voador> voador = new ArrayList<>();

    public void voemTodos() {


        for(int i = 0; i< voador.size(); i++){
            voador.get(i).voar();
        }


    }

    public void adicionarVoador(Voador umVoador){
        voador.add(umVoador);

    }

    public TorreDeControle(){

    }

}
