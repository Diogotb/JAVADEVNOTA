package IteracaoFor;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio3() {
        //criar vetor para receber as notas
        double vetorNotas[] = new double[2];//vetor de 4 posições
        //preencher o vetor das notas
        for (int i = 0; i < vetorNotas.length; i++) {
           System.out.println("Informe a "+(i+1)+" do Aluno:" ); 
           vetorNotas[i]=sc.nextDouble();
        }
        //mostrar as notas e calcular a média
        double media=0;
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Nota "+(i+1)+"="+vetorNotas[i]);
            media += vetorNotas[i];
        }
        //dividir a media pelo nº de notas
        media /= vetorNotas.length;
        //imprimir a média
        System.out.println("A média do Aluno é "+media);
    }
    // ler 10 caracteres determinar de é consoante
    public void exercicio4() {
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        //ler o vetor letra por letra e verificar se é consoante e "contar"
        int contConsoante = 0;
        for (int i = 0; i < letras.length; i++) {
            if(letras[i]=="a" || letras[i]=="e" 
            || letras[i]=="i" || letras[i]=="o" || letras[i]=="u"){
                System.out.println(letras[i]+" é vogal");
            } else{
                System.out.println(letras[i]+" é consoante");
                contConsoante++;
            }
        }
        System.out.println("O nº de consoantes é "+contConsoante);
    }
    //Contando as consoantes de uma palavra
    public void exercicio4Ex() {
        System.out.println("Digite uma Palavra:");
        String letras = sc.next();
        letras = letras.toLowerCase();
        //ler a palavra letra por letra e verificar se é consoante e "contar"
        int contConsoante = 0;
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);
            if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u'){
                System.out.println(c+" é vogal");
            } else{
                System.out.println(c+" é consoante");
                contConsoante++;
            }
        }
        System.out.println("O nº de consoantes é "+contConsoante);
    }

    public void exercicio5() {
        //ler um vetor de 20 nº e determinar Impares e Pares
        //gardar dentro de outros vetores 
        int numeros[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int contPar=0;
        int contImpar=0;
        //contar o nº de Impares e Pares no vetor numeros
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                contPar++;
            } else{
                contImpar++;
            }
        }
        //Criar os vetores Par e Impar
        int nPar[]=new int[contPar];
        int nImpar[]=new int[contImpar];
        //preencher os vetores par e impar
        contPar=0;
        contImpar=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                nPar[contPar]=numeros[i];
                contPar++;//atribui elementos do vetor nº
                // a posição diferente no vetor nPar
            } else{
                nImpar[contImpar]=numeros[i];
                contImpar++;
            }
        }
        //imprimir vetor de numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("vetorNumero["+i+"]="+numeros[i]);
        }
        //imprimir vetor de pares
        for (int i = 0; i < nPar.length; i++) {
            System.out.println("vetorPar["+i+"]="+nPar[i]);
        }
        //Imprimir vetor de Impares
        for (int i = 0; i < nImpar.length; i++) {
            System.out.println("vetorImpar["+i+"]="+nImpar[i]);
        }
    }
}
