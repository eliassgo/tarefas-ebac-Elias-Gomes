package exercicioMod13;

public class Main {
    public static void main(String args[]){
        PessoaFisica pessoa1 = new PessoaFisica();
        PessoaJuridica pessoa2 = new PessoaJuridica();

        pessoa1.setIdade(22);
        pessoa1.setNome("Elias");
        pessoa1.setEndereco("Rua dois irmãos - Imperatriz/Ma");
        pessoa1.setCpf("111111111-11");

        pessoa2.setIdade(22);
        pessoa2.setNome("Name");
        pessoa2.setEndereco("Rua dois irmãos - Imperatriz/Ma");
        pessoa2.setCnpj("111111111-11");
        pessoa2.setSituacaoCadastral("Ativa");

        System.out.println("-------------- PESSOA FÍSICA --------------");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("cpf: " + pessoa1.getCpf());

        System.out.println("-------------- PESSOA JURÍDICA --------------");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("CNPJ: " + pessoa2.getCnpj());
        System.out.println("Situação Cadastral: " + pessoa2.getSituacaoCadastral());
    }
}
