package org.frangosInfinity.core.entity.module.mesa;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.function.DoubleBinaryOperator;

public class QRCode
{
    private String id;
    private String codigo;
    private String urlAutenticacao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataExpiracao;
    private Boolean ativo;
    private Boolean utilizado;
    private Long idMesa;
    private String tokenAcesso;

    public QRCode()
    {
        this.id = UUID.randomUUID().toString();
        this.codigo = UUID.randomUUID().toString().substring(0,8).toUpperCase();
        this.dataCriacao = LocalDateTime.now();
        this.dataExpiracao = this.dataCriacao.plusMinutes(2);
        this.ativo = true;
        this.utilizado = false;
        this.tokenAcesso = UUID.randomUUID().toString();
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getUrlAutenticacao()
    {
        return urlAutenticacao;
    }

    public void setUrlAutenticacao(String urlAutenticacao)
    {
        this.urlAutenticacao = urlAutenticacao;
    }

    public LocalDateTime getDataCriacao()
    {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao)
    {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataExpiracao()
    {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDateTime dataExpiracao)
    {
        this.dataExpiracao = dataExpiracao;
    }

    public Boolean getAtivo()
    {
        return ativo;
    }

    public void setAtivo(Boolean ativo)
    {
        this.ativo = ativo;
    }

    public Boolean getUtilizado()
    {
        return utilizado;
    }

    public void setUtilizado(Boolean utilizado)
    {
        this.utilizado = utilizado;
    }

    public Long getIdMesa()
    {
        return idMesa;
    }

    public void setIdMesa(Long idMesa)
    {
        this.idMesa = idMesa;
    }

    public String getTokenAcesso()
    {
        return tokenAcesso;
    }

    public void setTokenAcesso(String tokenAcesso)
    {
        this.tokenAcesso = tokenAcesso;
    }

    public Boolean isExpirado()
    {
        return LocalDateTime.now().isAfter(dataExpiracao);
    }

    public Boolean podeSerUtilizado()
    {
        return ativo && !utilizado && !isExpirado();
    }

    public void utilizar()
    {
        if(!podeSerUtilizado())
        {
            throw new IllegalStateException("QR Code não pode ser utilizado");
        }

        this.utilizado = true;
        this.ativo = false;
    }

    public String toString()
    {
        return "QRCode{"+
                "codigo='" + codigo + '\'' +
                ", mesa=" + idMesa +
                ", expira=" + dataExpiracao +
                '}';
    }
}
