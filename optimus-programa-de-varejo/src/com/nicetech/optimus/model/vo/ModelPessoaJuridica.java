package com.nicetech.optimus.model.vo;

import com.nicetech.optimus.model.InterfaceModelContato;
import com.nicetech.optimus.model.InterfaceModelEndereco;
import com.nicetech.optimus.utils.GerarID;
import com.nicetech.optimus.utils.Regex;
import com.nicetech.optimus.utils.anotacao.RegularExpressionValidator;
import com.nicetech.optimus.utils.anotacao.RequiredValidation;
import com.nicetech.optimus.utils.jTable.Tabela;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

public class ModelPessoaJuridica implements InterfaceModelContato, InterfaceModelEndereco {

    private String id;
    private String nome;
    private String cnpj;
    private String setorDeAtuacao;
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;
    private String cep;
    private String telefone;
    private String email;
    private String site;

    public ModelPessoaJuridica() {
        this.id =  this.id = new GerarID().getId();
    }

    @RequiredValidation(Required = true, label = "NOME", MaximumValue = 50, MinimumValue = 1)
    @RegularExpressionValidator(ValidationExpression = Regex.QUALQUER_CARACTER, Label = "Nome", RegexErrorMessage = "Nome Inválido", EnableErrorMessage = true)
    @Tabela(Coluna = "Nome", Indice = 1)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    @RequiredValidation(Required = true, label = "CNPJ", MaximumValue = 50, MinimumValue = 1)
    @RegularExpressionValidator(ValidationExpression = Regex.CNPJ, Label = "CNPJ", RegexErrorMessage = "CNPJ Inválido - 99.999.999/9999-99 ", EnableErrorMessage = true)
    @Tabela(Coluna = "CNPJ", Indice = 0)
    public String getCnpj() {

        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (!cnpj.isEmpty()) {
            this.cnpj = cnpj;
        }
    }

    @Tabela(Coluna = "CNPJ", Indice = 2)
    public String getSetorDeAtuacao() {
        return setorDeAtuacao;
    }

    public void setSetorDeAtuacao(String setorDeAtuacao) {
        if (!setorDeAtuacao.isEmpty()) {
            this.setorDeAtuacao = setorDeAtuacao;
        }
    }

    @Tabela(Coluna = "ID", Indice = 13)
    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

 

    @RequiredValidation(Required = true, label = "E-MAIL", MaximumValue = 50, MinimumValue = 1)
    @RegularExpressionValidator(ValidationExpression = Regex.EMAIL, Label = "E-mail", RegexErrorMessage = "E-mail Inválido", EnableErrorMessage = true)
    @Tabela(Coluna = "E-Mail", Indice = 4)
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {

        this.email = email;

    }

    @Override
    public String getSite() {
        return this.site;
        //
    }

    @RequiredValidation(Required = true, label = "TELEFONE", MaximumValue = 50, MinimumValue = 1)
    @RegularExpressionValidator(ValidationExpression = Regex.TELEFONE, Label = "Telefone", RegexErrorMessage = "Telefone Inválido", EnableErrorMessage = true)
    @Tabela(Coluna = "Telefone", Indice = 3)
    @Override
    public String getTelefone() {
        return this.telefone;
        //
    }

    @Override
    public void setSite(String site) {
        this.site = site;
        //
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }

    @Tabela(Coluna = "Bairro", Indice = 8)
    @Override
    public String getBairro() {
        return this.bairro;
        //
    }

    @Tabela(Coluna = "CEP", Indice = 12)
    @Override
    public String getCep() {
        return this.cep;
        //
    }

    @Tabela(Coluna = "Cidade", Indice = 5)
    @Override
    public String getCidade() {

        return this.cidade;
        //
    }

    @Tabela(Coluna = "Complemento", Indice = 11)
    @Override
    public String getComplemento() {
        return this.complemento;
        //
    }

    @Tabela(Coluna = "Estado", Indice = 6)
    @Override
    public String getEstado() {
        return this.estado;
        //
    }

    @Tabela(Coluna = "Numero", Indice = 10)
    @Override
    public String getNumero() {
        return this.numero;

    }

    @Tabela(Coluna = "Pais", Indice = 7)
    @Override
    public String getPais() {
        return this.pais;

    }

    @Tabela(Coluna = "Rua", Indice = 9)
    @Override
    public String getRua() {
        return this.rua;

    }

    @Override
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public void setRua(String rua) {
        this.rua = rua;
    }
    private static final Logger LOG = getLogger(ModelPessoaJuridica.class.getName());
}
