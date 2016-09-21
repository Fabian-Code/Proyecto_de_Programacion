/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checksbus;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Fabian
 */
public class TerminalesChile {
    private static ArrayList <TerminalBuses> terminales = new ArrayList <TerminalBuses>() ;
    static Scanner leer = new Scanner(System.in);
    
    
    public static void añadirTerminal(){
	TerminalBuses terminal = new TerminalBuses();
	System.out.println("Nombre terminal");
	terminal.setNombre_terminal(leer.nextLine());			
        System.out.println("Region");
        terminal.setRegiondelterminal(leer.nextLine());
        System.out.println("Direccion");
        terminal.setDireccion(leer.nextLine());
        terminales.add(terminal);
    }
    
    public static void eliminarTerminal(){
        
    }
}
