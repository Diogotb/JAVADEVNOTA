package ExerciciosIfElse;

import java.util.Scanner;

public class ExerciciosAlternativos {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        int valor2 = sc.nextInt();
        if(valor1>valor2){
            System.out.println("O primeiro é maior "+valor1);
        }
        if (valor2>valor1){
            System.out.println("O segundo é maior "+valor2);
        }
        if(valor1==valor2) {
            System.out.println("é igual");
        }
        
    }

    public void exercicio2() {
        
    }
}
