package exercicioMod13;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String situacaoCadastral;

    public java.lang.String getCnpj() {
        return cnpj;
    }

    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }

    public java.lang.String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(java.lang.String situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }
}
