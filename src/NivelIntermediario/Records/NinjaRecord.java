package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {

    /*
    * TODOS OS ATRIBUTOS SAO FINAL POR PADRAO
    * NAO TEM COMO ALTERAR OS ATRIBUTOS.
    * */
    //todo: quando usar ? ele e parecido com o enum , tem que usar quando voce tem certeza que vai ser um atributo final
    //todo: como : nomeDoFuncionario / idDoFuncionario , ou nomeDoCarro,  marcaDoCarro
    public String retornarEmail(){
        return email.toUpperCase();
    }

}
