package proyecto;

public class ExamDemo {

    public static void main(String args[]){
        String[] opciones = {"santiago", "abril", "pcausa"};
        

        Exam exam = new Exam();
        exam.agregarPregunta(new TFpregunta("La capital de Chile es Santiago", true, 1));
        exam.agregarPregunta(new Resp_Cortas_Pregunta("quien?", "queso", 3));
        exam.agregarPregunta(new Selec_Mul_Pregunta("que onda", opciones, 2, 2));
        int puntaje = exam.darExam();
        System.out.print(puntaje);


    }
    
}
