/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author pedro
 */
public class Selec_Mul_Pregunta extends Pregunta{
    String[] opciones;
    int index;
    
    Selec_Mul_Pregunta(int peso, String pregunta){
        super(peso, pregunta);   
    }
    
    
    @Override
    boolean buscar(String pregunta, String respuesta){
        return true;   
    } 
}
