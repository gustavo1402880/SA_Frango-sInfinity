package org.frangosInfinity.application.module.mesa.response;

public class MesaResponseDTO
{
    private String id;
    private Integer numero;
    private Integer capacidade;
    private String localizacao;
    private Boolean disponivel;
    private Boolean ativa;
    private String idIotConfig;
    private String mensagem;
    private Boolean sucesso;

    public MesaResponseDTO() {}

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Integer getNumero()
    {
        return numero;
    }

    public void setNumero(Integer numero)
    {
        this.numero = numero;
    }

    public Integer getCapacidade()
    {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade)
    {
        this.capacidade = capacidade;
    }

    public String getLocalizacao()
    {
        return localizacao;
    }

    public void setLocalizacao(String localizacao)
    {
        this.localizacao = localizacao;
    }

    public Boolean getDisponivel()
    {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel)
    {
        this.disponivel = disponivel;
    }

    public Boolean getAtiva()
    {
        return ativa;
    }

    public void setAtiva(Boolean ativa)
    {
        this.ativa = ativa;
    }

    public String getIdIotConfig()
    {
        return idIotConfig;
    }

    public void setIdIotConfig(String idIotConfig)
    {
        this.idIotConfig = idIotConfig;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public Boolean getSucesso()
    {
        return sucesso;
    }

    public void setSucesso(Boolean sucesso)
    {
        this.sucesso = sucesso;
    }
}
