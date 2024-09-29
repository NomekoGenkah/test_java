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
public class Resp_Cortas_Pregunta extends Pregunta {
    String respuesta;
    
    Resp_Cortas_Pregunta(int peso, String pregunta, String respuesta){
        super(peso, pregunta);
        this.respuesta = respuesta;
    }
    
    @Override
    boolean buscar(){
        Scanner teclado = new Scanner(System.in);
        String respuestaUsuario;

        System.out.print(super.text);
        System.out.println("Ingrese su respuesta: ");

        respuestaUsuario = teclado.nextLine();
        teclado.close();
        return this.respuesta.equalsIgnoreCase(respuestaUsuario);
    }
}
