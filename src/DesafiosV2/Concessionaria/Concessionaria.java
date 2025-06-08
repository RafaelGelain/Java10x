package DesafiosV2.Concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Carro> carroList = new ArrayList<Carro>();

    public void mostrarCarro(){
        for (Carro c : carroList) {
            System.out.println(c);
        }
    }

    public void adicionarCarro(Carro carro){
        carroList.add(carro);
    }

    public void removeCarro(String nome){
        carroList.removeIf(carro -> carro.getModelo().equalsIgnoreCase(nome));
    }

    public void alterarCarro(String nomeAntigo , Carro novoCarro){
        // for pra percorrer toda lista
        for (int i = 0; i < carroList.size(); i++) {
           if (carroList.get(i).getModelo().equalsIgnoreCase(nomeAntigo));{
               carroList.set(i, novoCarro);
               return;
            }
        }
        System.out.println("Nome nao encontrado");
    }
}
