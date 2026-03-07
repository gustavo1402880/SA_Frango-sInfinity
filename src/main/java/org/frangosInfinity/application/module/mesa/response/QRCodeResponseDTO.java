package org.frangosInfinity.application.module.mesa.response;

import org.frangosInfinity.core.entity.module.mesa.QRCode;

import java.time.LocalDateTime;

public class QRCodeResponseDTO
{
    private String id;
    private String codigo;
    private String urlAutenticacao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataExpiracao;
    private String idMesa;
    private String caminhoImagem;
    private String mensagem;
    private Boolean sucesso;

    public QRCodeResponseDTO() {}

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

    public String getIdMesa()
    {
        return idMesa;
    }

    public void setIdMesa(String idMesa)
    {
        this.idMesa = idMesa;
    }

    public String getCaminhoImagem()
    {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem)
    {
        this.caminhoImagem = caminhoImagem;
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

    public static QRCodeResponseDTO sucesso(QRCode qrCode, String caminhoImagem)
    {
        QRCodeResponseDTO dto = new QRCodeResponseDTO();
        dto.setId(qrCode.getId());
        dto.setCodigo(qrCode.getCodigo());
        dto.setUrlAutenticacao(qrCode.getUrlAutenticacao());
        dto.setDataCriacao(qrCode.getDataCriacao());
        dto.setDataExpiracao(qrCode.getDataExpiracao());
        dto.setIdMesa(qrCode.getIdMesa());
        dto.setCaminhoImagem(caminhoImagem);
        dto.setSucesso(true);
        dto.setMensagem("QR Code gerado com sucesso!");
        return dto;
    }

    public static QRCodeResponseDTO erro(String mensagem)
    {
        QRCodeResponseDTO dto = new QRCodeResponseDTO();
        dto.setSucesso(false);
        dto.setMensagem(mensagem);
        return dto;
    }
}
