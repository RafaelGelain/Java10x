package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {


    /*
    * Dados nao primitivos
    * Objetivo : Criar um ninja , Atribuir metodos a ele.
    * RESUMO : O TIPO NAO PRIMITIVO PODE SER ATRIBUIDO METODOS NAS CLASSES COMO .UPPER & .LOWER
    * */

    String nome = "Naruto Uzumaki";
    String nomeCaps= nome.toUpperCase();

    System.out.println("Nome Normal : " + nome);
    System.out.println("Nome Maiusculo : " + nomeCaps);
    }
}
