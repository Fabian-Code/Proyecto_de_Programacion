package checksbus;

import java.util.ArrayList;

public class TerminalBuses  {
    
    private String nombre_terminal;
    private String regiondelterminal;
    private String direccion;
    private ArrayList<Intinerario> itenirario;
    private ArrayList<Funcionarios> funcionarios;

    public TerminalBuses(String nombre_terminal, String regiondelterminal, String direccion) {
        this.nombre_terminal = nombre_terminal;
        this.regiondelterminal = regiondelterminal;
        this.direccion = direccion;
         itinerario=new ArrayList<Itinerario>();
 +       funcionarios = new ArrayList<Funcionarios>();
    }

    

    public String getNombre_terminal() {
        return nombre_terminal;
    }

    public void setNombre_terminal(String nombre_terminal) {
        this.nombre_terminal = nombre_terminal;
    }

    public String getRegiondelterminal() {
        return regiondelterminal;
    }

    public void setRegiondelterminal(String regiondelterminal) {
        this.regiondelterminal = regiondelterminal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre del terminal:" + nombre_terminal + ", region del terminal" + regiondelterminal + "\n direccion:" + direccion ;
    }    
}
