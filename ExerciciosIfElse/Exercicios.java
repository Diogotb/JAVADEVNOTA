package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O maior valor é " + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O maior valor é " + valor2);
        } else {
            System.out.println(valor1 + "Os valores são iguais" + valor2);
        }
    }

    public void exercicio4() {
        System.out.println("Informe o nº de Maçãs");
        int nMacas = sc.nextInt();
        double valorMacas=0;
        if (nMacas < 12) {
            valorMacas = 0.30;
        } 
        if(nMacas>=12){
            valorMacas = 0.25;
        }
        double valorCompra = nMacas * valorMacas;
        System.out.println("O valor da Compra é R$"
                + valorCompra);

    }
    public void exercicio5() {
        System.out.println("Informe o primeiro valor:");
        int n1 = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        int n2 = sc.nextInt();
        System.out.println("Informe o terceiro valor:");
        int n3 = sc.nextInt();
        //n1<n2<n3
        if(n1<n2 &&n2<n3){
            System.out.println(" A Ordem é "+n1+","+n2+","+n3);
        }else if(n1<n3 &&n3<n2){//n1<n3<n2
            System.out.println(" A Ordem é "+n1+","+n3+","+n2);
        }else if(n2<n1 &&n1<n3){//n2<n1<n3
            System.out.println(" A Ordem é "+n2+","+n1+","+n3);
        }else if(n2<n1 &&n3<n1){//n2<n3<n1
            System.out.println(" A Ordem é "+n2+","+n3+","+n1);
        }else if(n3<n1 &&n1<n2){//n3<n1<n2
            System.out.println(" A Ordem é "+n3+","+n1+","+n2);
        }else { //n3<n2<n1
            System.out.println(" A Ordem é "+n3+","+n2+","+n1);
        }
    }
    public void exercicio6() {
        System.out.println("Informe a altura");
        double altura = sc.nextDouble();
        System.out.println("Informe 1-para mulhe e 2- Para homem");
        int sexo = sc.nextInt();
        double pesoIdeal;
        if(sexo==1){
            pesoIdeal = 62.1*altura-44.7;
        }else {
            pesoIdeal = 72.7*altura-58;
        }
        System.out.println("o peso Ideal em kg é "+pesoIdeal);
    }
}
