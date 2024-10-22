package proyecto;
/**
 *
 * @author Bastiaan
 */
public class Exam {
    private Pregunta[] preguntas;
    private int contadorPreguntas;

    public Exam() {
        this.preguntas= new Pregunta[10];
        this.contadorPreguntas= 0;
    }
    public void agregaPregunta(Pregunta pregunta) {
        if (contadorPreguntas < 10) {
            preguntas[contadorPreguntas] = pregunta;
            contadorPreguntas++;
        } else {
            System.out.println("no se pueden agregar mas de 10 preguntas");
        }
    }
    //para controlar el examen y calcular porcentajes de preguntas correctas
    public int darExam() {
        if (contadorPreguntas == 0) {
            System.out.println("no hay preguntas para responder");
            return 0;
        }
        int respuestasCorrectas= 0;
        for (int i = 0; i < contadorPreguntas; i++) {
            System.out.println("Pregunta " + (i + 1) + ":");
            if (preguntas[i].buscar()) {
                respuestasCorrectas++;
            }
        }
        double porcentaje = (double) respuestasCorrectas / contadorPreguntas * 100;
        System.out.println("Respuestas correctas: " + respuestasCorrectas + " de " + contadorPreguntas);
        System.out.printf("Porcentaje de aciertos: %.2f%%\n", porcentaje);
        return (int) porcentaje;
    }
    public Pregunta[] getPreguntas() {
        return this.preguntas;
    }
}

