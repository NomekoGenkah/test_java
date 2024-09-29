package proyecto;

/**
 *
 * @author pedro
 */

public class tester {
    TFpregunta pregunta = new TFpregunta(2, "hola?", true);

    void testear(){
        if(pregunta.buscar()){
            System.out.println("correcto");
        }else{
            System.out.println("mal");
        }
    }
}
