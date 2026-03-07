package org.frangosInfinity.core.entity.module.mesa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Mesa
{
    private String id;
    private Integer numero;
    private Integer capacidade;
    private String localizacao;
    private Boolean disponivel;
    private Boolean ativa;
    private String idIotConfig;
    private List<String> historicoQRCodes;

    public Mesa(int numero, int capacidade, String localizacao)
    {
        this.id = UUID.randomUUID().toString();
        this.numero = numero;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
        this.disponivel = true;
        this.ativa = true;
        this.historicoQRCodes = new ArrayList<>();
    }

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

    public void setCapacidade(int capacidade)
    {
        this.capacidade = capacidade;
    }

    public String getLocalizacao()
    {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public Boolean isDisponivel()
    {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel)
    {
        this.disponivel = disponivel;
    }

    public Boolean isAtiva()
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

    public List<String> getHistoricoQRCodes()
    {
        return historicoQRCodes;
    }

    public void adicionarQRCodeHistorico(String idQRCode)
    {
        this.historicoQRCodes.add(idQRCode);
    }

    public void ocuparMesa()
    {
        this.disponivel = false;
    }

    public void liberarMesa()
    {
        this.disponivel = true;
    }

    public String toString()
    {
        return "Mesa " + numero + " (Capacidade: " + capacidade + ") - " +
                (disponivel ? "Disponível" : "Ocupada");
    }
}
