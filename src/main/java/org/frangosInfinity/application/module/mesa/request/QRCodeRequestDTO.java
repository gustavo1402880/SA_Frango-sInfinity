package org.frangosInfinity.application.module.mesa.request;

public class QRCodeRequestDTO
{
    private String idMesa;
    private String tokenAcesso;
    private Integer tempoExpiracaoSgundos;

    public QRCodeRequestDTO() {}

    public QRCodeRequestDTO(String idMesa, String tokenAcesso)
    {
        this.idMesa = idMesa;
        this.tokenAcesso = tokenAcesso;
    }

    public String getIdMesa()
    {
        return idMesa;
    }

    public void setIdMesa(String idMesa)
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

    public Integer getTempoExpiracaoSgundos()
    {
        return tempoExpiracaoSgundos;
    }

    public void setTempoExpiracaoSgundos(Integer tempoExpiracaoSgundos)
    {
        this.tempoExpiracaoSgundos = tempoExpiracaoSgundos;
    }

    public Boolean isValid()
    {
        return idMesa != null && !idMesa.isEmpty() && tokenAcesso != null && !tokenAcesso.isEmpty();
    }
}
