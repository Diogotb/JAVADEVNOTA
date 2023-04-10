package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int iteracao = 0;
        while (iteracao < 1000) {
            iteracao += 1;
            System.out.println("essa é a iteracao de nº " + iteracao);
        }
    }

    public void exemplo2() {// jogo de adivinhação
        Random rd = new Random(); // função para escolher um nº aleatório
        int numeroAleatorio = rd.nextInt(10);
        boolean tenteNovamente = true;
        System.out.println("Aperte CTRL+C, a qualquer momento, paraparar.");
        // Enquanto tentarNovamente igual a true, itera novamente.
        while (tenteNovamente) {
            System.out.print("Tente adivinhar o número: ");
            int numero = sc.nextInt();
            if(numero==numeroAleatorio){
                System.out.println("Acertou Miseravi!!");
                tenteNovamente = false;
            } else{
                System.out.println("Errou!!! Tente novamente");
            }
        }
    }

    public void exemplo3() {
        // ler 5 nº inteiros e printar na ordem
        //criar um vetor com while
        int vetor[] = new int[5];
        int i = 0;
        while (i<5) {
            System.out.println("Digite o valor par ao vetor["+i+"]");
            vetor[i]=sc.nextInt();
            i++; 
        }
        i=0;
        while(i<5){
            System.out.println("o valor do vetor["+i+"] é "+vetor[i]);
            i++;
        }
    }
}
