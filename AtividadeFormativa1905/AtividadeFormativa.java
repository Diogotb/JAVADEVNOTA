import java.util.Random;
import java.util.Scanner;

public class AtividadeFormativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random(0);

    //atividade 1 -  criar uma matriz com coluna e linhas(usuario)
    public void atividade1() {
        //solcitar para user a qtd de linhas e colunas
        System.out.println("Informe a Quantidade de Linhas");
        int linha = sc.nextInt();
        System.out.println("Informe a Quantidade de Colunas");
        int coluna = sc.nextInt();
        //criar a matriz
        int matriz[][] = new int [linha][coluna];
        //preencher a Matriz de forma random(aleatoria)
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j]=rd.nextInt(10);
            }
        }
        //imprimir a matriz em formato LxC
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        // substituir os valores pela regra de preenchimento
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                //condição
                if(i>j){ //se i>j valor = 1
                    matriz[i][j] = 1;
                } else if(i==j){ //se i==j valor = 0
                    matriz[i][j] = 0;
                } else{ //se i<j valor = 2
                    matriz[i][j] = 2;
                }
            }
        }
        //imprimir a matriz substituida
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    //atividade 2 - sortei de um nº
    public void atividade2() {
        int nSorteado = rd.nextInt(1000);//nº sorteado
        int cont = 1; // contador
        System.out.println("Digite um nº");
        int nDigitado = sc.nextInt(); // nº digitado
        while(nSorteado != nDigitado){//laço não contável
            System.out.println("Digite outro Nº");
            nDigitado = sc.nextInt();
            cont++;//acrescimo do contador
            //condição
            if(nDigitado==nSorteado){ 
                // vai sair do loop
            } else if(nDigitado>nSorteado){
                System.out.println("O nº é Maior que o Sorteado");
            } else{
                System.out.println("O nº é Menor que o Sorteado");
            }
        }
        System.out.println("Parabens vc Acertou!!");
        System.out.println("Em "+cont+" Tentativas");
    }
    public void atividade2ex() {
        int nSorteado = rd.nextInt(1000);//nº sorteado
        int cont = 1; // contador
        System.out.println("Digite um nº");
        int nDigitado = sc.nextInt(); // nº digitado
        while(nSorteado != nDigitado){//laço não contável
            System.out.println("Digite outro Nº");
            nDigitado = sc.nextInt();
            cont++;//acrescimo do contador
            //condição
            if(nDigitado>nSorteado){
                System.out.println("O nº é Maior que o Sorteado");
            }
            if(nDigitado<nSorteado){
                System.out.println("O nº é Menor que o Sorteado");
            }
        }
        System.out.println("Parabens vc Acertou!!");
        System.out.println("Em "+cont+" Tentativas");
    }
    //atividade3 - vetor
    public void atividade3() {
        //criar um vetor 100-1000 itens
        int vetor[]=new int[rd.nextInt(900)+100];
        //preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]=rd.nextInt(100)+1;
        }
        //procurar os nº Impares
        int contImparNaPar = 0;
        int contParNaImpar = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==1){//resto == 1
                System.out.println(vetor[i]);
                // se esta na cada par
                if(i%2==1){//casa par
                    contImparNaPar++;
                }
            }
        }
        //procurar os nº Pares
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==0){//resto == 0
                System.out.println(vetor[i]);
                if(i%2==0){//casa Impar
                    contParNaImpar++;
                }
            }
        }
        //contar os Impares na casa Par
        for (int i = 1; i < vetor.length; i+=2) {
            if (vetor[i]%2==1){
                contImparNaPar++;
            }
        }
        //contar os Pares na cas Impar
        for (int i = 0; i < vetor.length; i+=2) {
            if (vetor[i]%2==0){
                contParNaImpar++;
            }
        }
    }

}
