package entities.agencia;

import java.io.Serial;
import java.io.Serializable;

public class Agencia implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    protected String cnpj;
    protected String razaoSocial;
    protected String nomeFantasia;
    protected Integer tamanhoMaximoDaFrota;

    public Agencia(String cnpj, String razaoSocial, String nomeFantasia) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

}
