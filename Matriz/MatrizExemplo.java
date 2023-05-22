package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        //criar uma matriz 10x9, preencher, imprimir e manupular
        //declarar a matriz
        int matriz[][]=new int[10][9];//10 linhas x 9 colunas
        //preencher a minha matriz
        for(int i=0; i<10;i++){//laço referente a 1º dimensão
            for(int j=0;j<9;j++){//laço referente a 2º dimensão
                //System.out.print("matriz["+i+"]["+j+"]=");
                matriz[i][j]=rd.nextInt(9);
            }
        }
        //mostrar a minha matriz (imprimir)posição por posição
        for(int i=0;i<10;i++){
            for(int j=0;j<9;j++){
                System.out.println("matriz["+i+"]["+j+"]="
                +matriz[i][j]);
            }
        }
        //imprimir em formato de matriz
        for(int i=0;i<10;i++){
            System.out.print("| ");
            for(int j=0;j<9;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("|");
        }
        //somar todos os elementos da 4ª linha
        int somaLinha=0;
        for (int i = 0; i < 9; i++) {
            somaLinha += matriz[3][i];
        }
        System.out.println("+++++++++++++++++++");
        System.out.println("Soma da 4º Linha é "+somaLinha);

        //somar todos os elementos da 4ª coluna
        int somaColuna = 0 ;
        for (int i = 0; i < 10; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println("+++++++++++++++++++");
        System.out.println("Soma da 4º Coluna é "+somaColuna);
    }
    public void exercicio1() {
        //criar a matriz
        int matriz[][] = new int[5][5];
        //preencher a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j){matriz[i][j]=1;
                } else{matriz[i][j]=0;
                }
            }
        }
        //imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("|");
        }
        
}
}
