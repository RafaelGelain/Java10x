package NivelIntermediario.HerancaMultipla;

public class Uchiha extends NInja implements SharinganInterface{
    public Uchiha(String nome, String vila, int idade) {
        super(nome, vila, idade);
    }

    public void sharinganAtivado(){
        System.out.println(nome+": Ativou o Sharingan.");
    }
}
