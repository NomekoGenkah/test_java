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

    void darExam(){
        int puntaje = 0;
        
        for(Pregunta pregunta: preguntas){
            if(pregunta.buscar()){
                puntaje =+ pregunta.peso;
            }
        }

        System.out.println("puntaje obtenido = " + puntaje + "/10");
    }

}
