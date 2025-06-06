package DesafiosV2.Contatos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contatos> contatoLista = new ArrayList<>();

    public Agenda(List<Contatos> contatoLista) {
        this.contatoLista = contatoLista;
    }

    public Agenda() {
    }

    public void adicionarContato(Contatos contatos){
        contatoLista.add(contatos);
    }

    public void removerContato(String nome){
        contatoLista.stream()
                .filter(contatos -> contatos.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .ifPresent(contatos -> {
                    contatoLista.remove(contatos);
                    System.out.println("Contato removido com sucesso.");
                });
    }

    public void listarContatos(){
        contatoLista.forEach(contatos -> {
            System.out.println("Nome : "+ contatos.getNome());
            System.out.println("Telefone : "+ contatos.getEmail());
            System.out.println("Email : "+ contatos.getEmail());
            System.out.println("=-----=");
        });
    }

    public void buscarContato(String nome){
        contatoLista.stream()
                .filter(contatos -> contatos.getNome().equalsIgnoreCase(nome))
                .forEach(System.out::println);
    }
}
