package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        int valor2 = sc.nextInt();
        if(valor1>valor2){
            System.out.println("O maior valor é "+valor1);
        }else{
            System.out.println("O maior valor é "+valor2);
        }
    }

    public void exercicio2() {
        
    }
}
