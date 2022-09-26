package beans;

import java.sql.Date;

public class Servicio {
    private String ruta;
    private String placa;
    private Date fecha;
    private Date hora;
    private double valor;
    private int puestos;

    public Servicio(String ruta, String placa, Date fecha, Date hora, double valor, int puestos) {
        this.ruta = ruta;
        this.placa = placa;
        this.fecha = fecha;
        this.hora = hora;
        this.valor = valor;
        this.puestos = puestos;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    @Override
    public String toString() {
        return "servicio{" + "ruta=" + ruta + ", placa=" + placa + ", fecha=" + fecha + ", hora=" + hora + ", valor=" + valor + ", puestos=" + puestos + '}';
    }
    
    
}
