package proyecto;

public class ExamDemo {

    public static void main(String args[]){

        Exam exam = new Exam();
        exam.agregarPregunta(new TFpregunta("La capital de Chile es Santiago", true, 1));
        exam.agregarPregunta(new Resp_Cortas_Pregunta("quien?", "queso", 3));
        int puntaje = exam.darExam();
        System.out.print(puntaje);


    }
    
}
