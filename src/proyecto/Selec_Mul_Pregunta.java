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
public class Selec_Mul_Pregunta extends Pregunta{
    private String[] opciones;
    int index;
    
    Selec_Mul_Pregunta(String pregunta, String[] opciones, int index, int peso){
        super(peso, pregunta);   
        this.opciones = opciones;
        this.index = index;
    }
    
    
    @Override
    boolean buscar(){
        int valorLetra = 97, opcionUsuario;
        Scanner teclado = new Scanner(System.in);

        System.out.println(super.text);
        for(String opcion: this.opciones){
            System.out.println((char) valorLetra + ".)" + opcion);
            valorLetra++;
        }

        opcionUsuario = teclado.nextInt();

        if(this.index == opcionUsuario){
            return true;
        }
        return false;
    } 
}
