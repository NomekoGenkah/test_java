package proyecto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public abstract class Pregunta {
    //comentario
    
    int peso;
    protected String text;
    
    Pregunta(int peso, String text){
        this.peso = peso;
        this.text = text;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public String getText(){
        return this.text;
    }

    abstract boolean buscar();
}
