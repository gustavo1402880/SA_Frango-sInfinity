package org.frangosInfinity.core.entity.module.mesa;

public class IotConfig
{
    private String id;
    private String idMesa;
    private String ipDispositivo;
    private Integer porta;
    private String modelo;
    private Boolean online;
    private String versaoFirmware;

    public IotConfig(String idMesa, String ipDispositivo, int porta)
    {
        this.id = java.util.UUID.randomUUID().toString();
        this.idMesa = idMesa;
        this.ipDispositivo = ipDispositivo;
        this.porta = porta;
        this.modelo = "Simulador IoT v1.0";
        this.online = true;
        this.versaoFirmware = "1.0.0";
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getIdMesa()
    {
        return idMesa;
    }

    public void setIdMesa(String idMesa)
    {
        this.idMesa = idMesa;
    }

    public String getIpDispositivo()
    {
        return ipDispositivo;
    }

    public void setIpDispositivo(String ipDispositivo)
    {
        this.ipDispositivo = ipDispositivo;
    }

    public Integer getPorta()
    {
        return porta;
    }

    public void setPorta(Integer porta)
    {
        this.porta = porta;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public Boolean isOnline()
    {
        return online;
    }

    public void setOnline(Boolean online)
    {
        this.online = online;
    }

    public String getVersaoFirmware()
    {
        return versaoFirmware;
    }

    public void setVersaoFirmware(String versaoFirmware)
    {
        this.versaoFirmware = versaoFirmware;
    }

    public String enviarComando(String comando)
    {
        if (!online)
        {
            return "ERRO: Dispositivo offline";
        }

        System.out.println("📡 [IoT - Mesa " + idMesa + "] Comando enviado: " + comando);

        switch (comando)
        {
            case "GERAR_QR":
                return "QR_CODE_GERADO";
            case "STATUS":
                return "ONLINE|" + versaoFirmware;
            default:
                return "COMANDO_NAO_RECONHECIDO";
        }
    }

    public String toString()
    {
        return "IoTConfig [Mesa: " + idMesa + ", IP: " + ipDispositivo + ":" + porta +
                ", Online: " + online + "]";
    }
}
