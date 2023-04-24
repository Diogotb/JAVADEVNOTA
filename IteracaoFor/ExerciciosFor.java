package IteracaoFor;

import java.util.Scanner;

public class ExerciciosFor {
    Scanner sc = new Scanner(System.in);
    public void exercicio7(){
        //vetor 5 nº , soma, multiplicação, numeros
        double vetor[]=new double[5];//vetor de tamnho 5
        //preencher o vetor de 5 posições
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor["+i+"]=");
            vetor[i]=sc.nextDouble();
        }
        //realizar as operações (Soma e Multiplicação)
        double soma=0;// inicia com 0 neutro p/ soma
        double mult=1;// inicia com 1 neutro p/ multiplicação
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            mult *= vetor[i];
        }
        System.out.println("o valor da soma entre os elementos é "+soma);
        System.out.println("o valor da mutiplicação entre os elementos é "+mult);
        //imprimir todos os nº
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor["+i+"]="+vetor[i]);
        }
    }
    public void exercicio8(){
        // ler idade e altura de 5 pessoas e imprmir na ordem inversa
        //criar os vetores para receber as informações
        int idade[] = new int[5];
        double altura[]= new double[5];
        //preencher os vetores
        for (int i = 0; i < altura.length; i++) {
            System.out.print("Informe a Idade da Pessoa "+(i+1)+" :");
            idade[i]=sc.nextInt();
            System.out.print("Informe a Altura da Pessoa "+(i+1)+" :");
            altura[i]=sc.nextDouble();
        }
        //imprimir na ordem inversa 4 -> 0
        for (int i = 4; i >=0; i--) {
            System.out.println("Informações da Pessoa "+(i+1)+" :");
            System.out.println("Idade:" +idade[i]);
            System.out.println("Altura: "+altura[i]);
        }
    }
    public void exercicio9(){
        // ler um vetor de 10 elementos e calcular a soma do quadrados
        int vetor[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        // calcular a soma dos quadrados
        int soma = 0; // acumular o valor
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i]*vetor[i];

        }
        System.out.println("A soma do Quadrado dos elementos do vetor é "
                        +soma);
    }
}

//encurtador.com.br/dopsD
