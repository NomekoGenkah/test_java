package proyecto;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class TFpregunta extends Pregunta{
    private boolean respuesta;
    
    TFpregunta(String pregunta, boolean respuesta, int peso){
        super(peso, pregunta);
        this.respuesta = respuesta;   
    }
    
    @Override
    boolean buscar(){
        String respuestaUsuario = "hola";
        char caracterRespuesta = 'c';
        Scanner teclado = new Scanner(System.in);

        System.out.println(super.text);
        do{
            System.out.println("(Ingrese T o F):");
            respuestaUsuario = teclado.next();
            caracterRespuesta = respuestaUsuario.charAt(0);
            
        }while(caracterRespuesta != 'f' && caracterRespuesta != 'F' && caracterRespuesta != 't' && caracterRespuesta != 'T');        
        if(caracterRespuesta == 'f' || caracterRespuesta == 'F'){
            if(!this.respuesta){
                return true;
            }else{
                return false;
            }
        }else{
            if(!this.respuesta){
                return false;
            }else{
                return true;
            }
        }        
    }
}
