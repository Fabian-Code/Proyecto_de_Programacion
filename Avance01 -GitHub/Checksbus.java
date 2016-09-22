/* Este programa protipo va a estar orientado a los funcionario unicamente , donde ingresa los datos de la clase funcionario 
y los datos de su terminal(el cual va estar validado su existencia en la Clase TerminalesChile), donde va agregar itinirario 
asociado a su terminal , modifcar itinirarios e iliminar itinirario  */
package checksbus;
import java.util.Scanner;

public class Checksbus {

       
private static Scanner leer = new Scanner (System.in);
private static TerminalesChile chile = new TerminalesChile();//Objeto donde se encuentran todos los terminales de chile
    public static void main(String[] args) {
        int opcion =0;        
        do {
            menu();
            opcion = leer.nextInt();
            accionesMenu(opcion);
        } while(opcion!=0);               
       
    }
        
    public static void menu(){        
        System.out.println("1 - Añadir terminal a la \"base de datos\"");
        System.out.println("2 - Eliminar terminal de la \"base de datos\"");
        System.out.println("3 - Buscar terminales");
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
        System.out.println("7 - Editar itinnerario de los buses del terminal");/// Accede al sub sub menu para editar el itinnerario de los buses
        System.out.println("0 - Volver");
    }
     
    public static void opcionesItinerario(){
        ////setear los parametros de la clase itinerario
        System.out.println("1 - Añadir un nuevo bus");
        System.out.println("2 - Eliminar bus ");
        System.out.println("3 - Buscar bus");
        System.out.println("4 - Mostrar bus");
        System.out.println("0 - Volver");
    }
     
    public static void accionesMenu(int x){
        
        switch(x){
            case 1: chile.añadirTerminal();
            break;
            
            case 2: chile.eliminarTerminal();
            break;
            
            case 3: chile.buscarTerminal("","","");
            break;
            
            case 4: 
                int op;
                do {
                    editarTerminal("");
                    op=leer.nextInt();
                    accionesSubMenu(op,"");
                } while (op!=0);
                
            break;
            
            default:break;
        }
    }           
    
    public static void accionesSubMenu(int i,String terminal){
        switch(i){        
            case 1: chile.cambiarNombre(terminal);
            break;
            
            case 2: chile.cambiarDireccion(terminal);
            break;
            
            case 3: chile.cambiarRegion(terminal);
            break;
            
            case 4: chile.añadirFuncionario(terminal);
            break;
            
            case 5: chile.eliminarFuncionario(terminal, leer.next());
            break;
            
            case 6: chile.buscarFuncionario(terminal,leer.next());
            break;
            
            case 7: int j;
                do {
                    opcionesItinerario();
                    j=leer.nextInt();
                    accionesItinerario(j);
                } while (j!=0);
                
            break;
        }
    
    }    
    
    public static void accionesItinerario(int j){
        switch(j){
            case 1: 
        }
    }
}
