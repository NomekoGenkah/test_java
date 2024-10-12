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
        String opcionUsuario;
        int valorLetra = 97, intUsuario;
        // a = 97, z = 122
        int valorIndex = index + 97;
        int maxIndex = 96 + this.opciones.length;
        Scanner teclado = new Scanner(System.in);

        System.out.println(super.text);
        for(String opcion: this.opciones){
            System.out.println("\t" + (char) valorLetra + ". " + opcion);
            valorLetra++;
        }

        do{
            opcionUsuario = teclado.next();
            intUsuario = (int) opcionUsuario.charAt(0);

        }while(intUsuario < 97 && intUsuario > maxIndex);

        if(intUsuario == valorIndex){
            return true;
        }
        return false;
    } 
}
