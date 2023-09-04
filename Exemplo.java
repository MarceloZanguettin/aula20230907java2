public class Exemplo {
    public static void main(String[] args){
        Pessoa pes = new Pessoa();
        pes.setNome("Marcelo Zanguettin");

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Fulano");
        pf.setCpf("1326132");

        System.out.println("Olá Mundo!!");
        System.out.println(pes.getNome());

        ExemploFor.execute();
        ExemploWhile.execute();
        ExemploCondicional.execute();
    }
}