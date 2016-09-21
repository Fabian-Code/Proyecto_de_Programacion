
package checksbus;
import java.util.Scanner;

public class Checksbus {

    private static int opcion;

    public static void main(String[] args) {
        opcion =0;
        Scanner leer = new Scanner (System.in);
        do {
            menu();
            opcion = leer.nextInt();
        } while(opcion!=0);               
       
    }
        
    public static void menu(){
        TerminalesChile chile = new TerminalesChile();
        System.out.println("1 - Añadir terminal a la \"base de datos\"");
        System.out.println("2 - Eliminar terminal de la \"base de datos\"");
        System.out.println("3 - Buscar terminales por region");
        System.out.println("4 - Editar terminales");/// Accede al submenu editar terminal
        
        System.out.println("0 - Salir");        
    }   
    
    public static void editarTerminal(String terminal){//metodo en el cual se puede editar todo respecto un x terminal 
        //agregar funcionarios al terminal etc.
        System.out.println("1 - Editar nombre del terminal");
        System.out.println("2 - Editar direccion");
        System.out.println("3 - editar region");
        System.out.println("4 - Agregar funcionarios");
        System.out.println("5 - eliminar funcionarios");
        System.out.println("6 - buscar funcionario en el terminal");
        System.out.println("7 -  Editar itinnerario de los buses del terminal");/// Accede al sub sub menu para editar el itinnerario de los buses
    }
    
    public static void editarItinerario(){
        ////setear los parametros de la clase itinerario
    }
}
