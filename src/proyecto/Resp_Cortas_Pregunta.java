package proyecto;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Resp_Cortas_Pregunta extends Pregunta {
    private String respuesta;
    
    Resp_Cortas_Pregunta(String pregunta, String respuesta, int peso){
        super(peso, pregunta);
        this.respuesta = respuesta;
    }
    
    @Override
    boolean buscar(){
        Scanner teclado = new Scanner(System.in);
        String respuestaUsuario;

        System.out.print(super.text);
        System.out.println(" Ingrese su respuesta: ");

        respuestaUsuario = teclado.nextLine();
        if(this.respuesta.equalsIgnoreCase(respuestaUsuario)){
            System.out.println("correcta!");
            return true;
        }
        System.out.println("no, la respuesta correcta es " + this.respuesta);
        return false;
    }
}
