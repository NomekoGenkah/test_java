/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Scanner;



/**
 *
 * @author pedro
 */
public class TFpregunta extends Pregunta{
    boolean respuesta;
    
    TFpregunta(int peso, String pregunta, boolean respuesta){
        super(peso, pregunta);
        this.respuesta = respuesta;   
    }
    
    @Override
    boolean buscar(){
        String respuestaUsuario;
        
        Scanner teclado = new Scanner(System.in);
        //System.out.println(pregunta);
        System.out.println("Ingrese su respuesta: f | F | t | T :\n");
        respuestaUsuario = teclado.next();
        char letra = respuestaUsuario.charAt(0);
        
        
        
        return true;
    }
}
