/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author pedro
 */
public class Resp_Cortas_Pregunta extends Pregunta {
    String respuestaCorrecta;
    
    Resp_Cortas_Pregunta(int peso, String pregunta, String respuestaCorrecta){
        super(peso, pregunta);
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    @Override
    boolean buscar(String pregunta, String respuesta){
        return true;
    }
}
