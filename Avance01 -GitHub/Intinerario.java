/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checksbus;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Gustavo Huerta
 */
public class Intinerario {
    private String fecha;
    private String hora_llegada_bus;
    private String hora_salida_bus;
    private String empresa;
    private String destino;
    private String estado_bus;

    public Intinerario() {
    }

    public Intinerario(String fecha, String hora_llegada_bus, String hora_salida_bus, String empresa, String destino, String estado_bus) {
        this.fecha = fecha;
        this.hora_llegada_bus = hora_llegada_bus;
        this.hora_salida_bus = hora_salida_bus;
        this.empresa = empresa;
        this.destino = destino;
        this.estado_bus = estado_bus;
    }
    public boolean ValidarNombres(String nombre){
        Pattern pat = Pattern.compile("[A-Za-z]+"); 
    }
    public String getEstado_bus() {
        return estado_bus;
    }

    public void setEstado_bus(String estado_bus) {
        this.estado_bus = estado_bus;
    }

    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora_llegada_bus() {
        return hora_llegada_bus;
    }

    public void setHora_llegada_bus(String hora_llegada_bus) {
        this.hora_llegada_bus = hora_llegada_bus;
    }

    public String getHora_salida_bus() {
        return hora_salida_bus;
    }

    public void setHora_salida_bus(String hora_salida_bus) {
        this.hora_salida_bus = hora_salida_bus;
    }
    public boolean ValidarHora(String hora){
        Pattern pat = Pattern.compile("[\\d]{2,2}:[\\d]{2,2}");
        Matcher mac = pat.Matcher(hora);
        return (mac.matches());
    } 
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
}
