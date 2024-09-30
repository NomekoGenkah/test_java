package proyecto;

public class Exam {

    Pregunta[] preguntas = new Pregunta[10];
    int numeroPreguntas = 0;

    void agregarPregunta(Pregunta pregunta){
        if(this.numeroPreguntas == 9){
            return;
        }
        this.preguntas[this.numeroPreguntas] = pregunta;
        this.numeroPreguntas++;
    }

    int darExam(){
        int puntaje = 0;
        
        for(Pregunta pregunta: preguntas){
            if(pregunta == null){
                return puntaje;
            }

            if(pregunta.buscar()){
                puntaje = puntaje + pregunta.peso;
                System.out.print(puntaje);
            }
        }

        System.out.println("puntaje obtenido = " + puntaje + "/10");
        return puntaje;
    }

}
