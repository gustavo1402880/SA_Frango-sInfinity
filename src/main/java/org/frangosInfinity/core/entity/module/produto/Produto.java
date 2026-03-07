package org.frangosInfinity.core.entity.module.produto;

public class Produto {

    // Atributos

    private Long id;
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private double custo;
    private int tempoPreparoMinuto;
    private boolean disponivel;
    private String imagemUrl;
    private int vendasUltimos300dias;
    private double precoPendenteAprovacao;

    // Construtores

    public Produto() {};

    public Produto(String codigo, String nome, String descricao, double preco, double custo, int tempoPreparoMinuto, boolean disponivel, String imagemUrl, int vendasUltimos300dias, double precoPendenteAprovacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.custo = custo;
        this.tempoPreparoMinuto = tempoPreparoMinuto;
        this.disponivel = disponivel;
        this.imagemUrl = imagemUrl;
        this.vendasUltimos300dias = vendasUltimos300dias;
        this.precoPendenteAprovacao = precoPendenteAprovacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getTempoPreparoMinuto() {
        return tempoPreparoMinuto;
    }

    public void setTempoPreparoMinuto(int tempoPreparoMinuto) {
        this.tempoPreparoMinuto = tempoPreparoMinuto;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public int getVendasUltimos300dias() {
        return vendasUltimos300dias;
    }

    public void setVendasUltimos300dias(int vendasUltimos300dias) {
        this.vendasUltimos300dias = vendasUltimos300dias;
    }

    public double getPrecoPendenteAprovacao() {
        return precoPendenteAprovacao;
    }

    public void setPrecoPendenteAprovacao(double precoPendenteAprovacao) {
        this.precoPendenteAprovacao = precoPendenteAprovacao;
    }
}
