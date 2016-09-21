
package checksbus;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Gustavo Huerta
 */
public class Intinerario {
    private String fecha;
    private String horaLlegadaBus;
    private String horaSalidaBus;
    private String empresa;
    private String destino;
    private String estadoBus;

    public Intinerario() {
        this.fecha = "";
        this.horaLlegadaBus = "";
        this.horaSalidaBus = "";
        this.empresa = "";
        this.destino = "";
        this.estadoBus = "";
    }

    public Intinerario(String fecha, String horaLlegadaBus, String horaSalidaBus, String empresa, String destino, String estadoBus) {
        this.fecha = fecha;
        this.horaLlegadaBus = horaLlegadaBus;
        this.horaSalidaBus = horaSalidaBus;
        this.empresa = empresa;
        this.destino = destino;
        this.estadoBus = estadoBus;
    }
    public boolean ValidarNombres(String nombre){
        Pattern pat = Pattern.compile("[A-Za-z]+");
         Matcher mac = pat.matcher(hora);
        return (mac.matches());
    }
    public String getEstadoBus() {
        return estadoBus;
    }

    public void setEstadoBus(String estadoBus) {
        this.estadoBus = estadoBus;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public boolean ValidarFecha(String fecha){
        Pattern pat = Pattern.compile("[\\d]{1,2}[-|/]{1}[\\d]{1,2}");
        Matcher mac = pat.matcher(fecha);
        return (mac.matches());
    }
    public String getHoraLlegadaBus() {
        return horaLlegadaBus;
    }

    public void setHoraLlegadaBus(String horaLlegadaBus) {
        this.horaLlegadaBus = horaLlegadaBus;
    }

    public String getHoraSalidaBus() {
        return horaSalidaBus;
    }

    public void setHoraSalidaBus(String hora_salida_bus) {
        this.horaSalidaBus = horaSalidaBus;
    }
    public boolean ValidarHora(String hora){
        Pattern pat = Pattern.compile("[\\d]{2,2}:[\\d]{2,2}");
        Matcher mac = pat.matcher(hora);
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
