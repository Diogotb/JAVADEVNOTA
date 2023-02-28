package ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);
    public void notaFrequencia() {
        System.out.println("Informe a Nota 1 do aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do aluno:");
        int nota2 = sc.nextInt();
<<<<<<< HEAD
        //double mediaAluno = (nota1+nota2)/2;
        double mediaAluno = nota1;
        mediaAluno += nota2;
        mediaAluno /=2;
        System.out.println("A média do aluno é "+mediaAluno);
        boolean mediaAprovado = mediaAluno>=50;
        System.out.println("O Aluno está aprovado por Nota?"+mediaAprovado);
        System.out.println("Informe a Frequencia do Aluno");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovada = frequenciaAluno>=75;
        System.out.println("O Aluno está aprovado por Frequencia? "+frequenciaAprovada);
        boolean aprovacaoFinal = (mediaAprovado==true)&&(frequenciaAprovada==true);
        System.out.println("o Aluno Está Aprovado no Curso? "+aprovacaoFinal);
=======
        // double mediaAluno = (nota1 + nota2)/2;
        double mediaAluno = nota1;
        mediaAluno += nota2;
        mediaAluno /= 2;
        System.out.println("A média do Aluno é "+mediaAluno);
        boolean mediaAprovado = mediaAluno >= 50;
        System.out.println("O Aluno Esta Aprovado por Nota? "+mediaAprovado);
        System.out.println("Informe a Fequência do Aluno:");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovado = frequenciaAluno >= 75;
        System.out.println("O Aluno Esta Aprovado por Frequencia? "+frequenciaAprovado);
        boolean aprovacaoFinal = (mediaAprovado==true)&&(frequenciaAprovado==true);
        System.out.println("O aluno Esta Aprovado no Curso? "+aprovacaoFinal );




>>>>>>> 0573b331e95db2a62f70187afa0b062403265ec3

    }
}