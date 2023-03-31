package Sa1AvaliacaoIndividual;

import java.util.Scanner;

public class AtividadeIndividual {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite o Valor1");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o Valor2");
        double valor2 = sc.nextDouble();
        System.out.println("Informe a Operação Desejada:");
        System.out.println("1-Adição; 2-Subtração; 3-Multiplicação; 4-Divisão");
        int operacao = sc.nextInt();
        double resultado;
        if(operacao==1){
            resultado = valor1+valor2;
        } else if(operacao==2){
            resultado = valor1-valor2;
        } else if(operacao==3){
            resultado = valor1*valor2;
        } else if(operacao==4 && valor2!=0){
            resultado = valor1/valor2;
        } else if(operacao==4 && valor2==0){
            System.out.println("A Operação não pode ser Realizada");
            resultado=0;
        } else{
            System.out.println("Informe uma Operação Válida");
            resultado=0;
        }
        System.out.println("O Resultado da Operação é "+resultado);
    }

    public void exercicio2() {
        //1. entrar com o nº de maricula
        System.out.println("Informe o nº de Matrícula");
        int nMatricula = sc.nextInt();
        //2.escolher o time do aluno
        if(nMatricula%4==0){ //Time Cris - resto 0
            System.out.println("Você está no Time do Cris");
        } else if(nMatricula%4==1){
            System.out.println("Você está no Time do Greg");
        } else if(nMatricula%4==2){
            System.out.println("Você está no time do Carusso");
        } else{
            System.out.println("Você está no Time do Jerome");
        }
    }

    public void exercicio3() {
        //1. Ler a Quantidade de Produtos em Kg
        System.out.println("Informe a Quantidade de Morangos em KG:");
        double kgMorango = sc.nextDouble();
        System.out.println("Informe a Quantidade de Bananas em KG:");
        double kgBananas = sc.nextDouble();
        System.out.println("Informe a Quantidade de Maçãs em KG:");
        double kgMacas = sc.nextDouble();
        double pesoTotal = kgMorango+kgBananas+kgMacas;
        double precoTotal = kgMorango*2.5+kgBananas*1.3+kgMacas*1.8;
        double desconto = 0;
        if(pesoTotal>=8 || precoTotal>=25){
            desconto = 0.1;//10/100 ou 10%
        }
        double precoFinal = precoTotal - precoTotal*desconto;
        System.out.println(" O Preço da Compra é R$ "+precoFinal);
    }
}
