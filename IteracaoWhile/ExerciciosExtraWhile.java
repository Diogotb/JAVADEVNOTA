package IteracaoWhile;

import java.util.Scanner;

public class ExerciciosExtraWhile {
    Scanner sc = new Scanner(System.in);

    public void exercicio4() {
        // lendo um vetor de string com lanço while
        // criar um vetor de 10 letras
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // iterador ou repetidor - elemento que servirá de contagem
        int i = 0;
        int cont = 0;// contador para as consoantes
        while (i < letras.length) {
            if (letras[i] == "a" || letras[i] == "e" || letras[i] == "i"
                    || letras[i] == "o" || letras[i] == "u") {

            } else {
                cont++;
                System.out.println(letras[i] + " é consoante");
            }
            i++;
        }
        System.out.println("o nº de consoantes é " + cont);
    }

    public void exercicio4sc() {
        // lendo um vetor de string com lanço while
        // criar um vetor de 10 letras
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // iterador ou repetidor - elemento que servirá de contagem
        int i = 0;
        int cont = 0;// contador para as consoantes
        while (i < letras.length) {
            switch (letras[i]) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
                default:
                    cont++;
                    System.out.println(letras[i] + " é Consoante");
            }
            i++;
        }
        System.out.println("o nº de consoantes é " + cont);
    }

    public void exercicio5() {
        int vetor[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 45, 80, 99,
                102, 203 };
        int i = 0;
        int contPar = 0;
        int contImpar = 0;
        while (i < vetor.length) {
            if (vetor[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            i++;
        }
        int vetorPar[] = new int[contPar];
        int vetorImpar[] = new int[contImpar];
        i = 0;
        contPar = 0;
        contImpar = 0;
        while (i < vetor.length) {
            if (vetor[i] % 2 == 0) {
                vetorPar[contPar] = vetor[i];
                contPar++;
            } else {
                vetorImpar[contImpar] = vetor[i];
                contImpar++;
            }
            i++;
        }
        i = 0;
        while (i < vetor.length) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
            i++;
        }
        i = 0;
        while (i < vetorPar.length) {
            System.out.println("vetorPar[" + i + "]=" + vetorPar[i]);
            i++;
        }
        i = 0;
        while (i < vetorImpar.length) {
            System.out.println("vetorImpar[" + i + "]=" + vetorImpar[i]);
            i++;
        }
    }

    public void exercicio5Extra() {
        int vetor[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 45, 80, 99,
                102, 203 };
        int vetorPar[] = new int[vetor.length];
        int vetorImpar[] = new int[vetor.length];

        int i = 0;
        
        while (i < vetor.length) {
            if (vetor[i] % 2 == 0) {
                vetorPar[i] = vetor[i];
            } else {
                vetorImpar[i] = vetor[i];
            }
            i++;
        }
        i = 0;
        while (i < vetor.length) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
            if(vetorPar[i]!=0){
            System.out.println("vetorPar[" + i + "]=" + vetorPar[i]);
            }
            if(vetorImpar[i]!=0){
            System.out.println("vetorImpar[" + i + "]=" + vetorImpar[i]);
            }
            i++;
        }
        
    }

}
