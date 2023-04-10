package IteracaoWhile;

public class ExerciciosWhile {
    // resolvendo lista extra vetores
    public void exercicio1() { //vetorA = vetorB
        int vetorA[]=new int[]{3,5,7,11,13};
        int vetorB[]=new int[5];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=vetorA[i];
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;
        }
        
    }
    public void exercicio2() { //vetorB = vetorA*2
        int vetorA[]=new int[]{3,5,7,11,13,17,19,23};
        int vetorB[]=new int[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=vetorA[i]*2;
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;
        }
        
    }

    public void exercicio3() { //vetorB = vetorA*vetorA
        int vetorA[]=new int[]{3,5,7,11,13,17,19,23,27,37,43,47,53,59,67};
        int vetorB[]=new int[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=vetorA[i]*vetorA[i];
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;
        }
        
    }
    public void exercicio4() { //vetorB = sqrt(vetorA)
        int vetorA[]=new int[]{3,5,7,11,13,17,19,23,27,37,43,47,53,59,67};
        double vetorB[]=new double[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=Math.sqrt(vetorA[i]);
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;
        }
        
    }
    public void exercicio5() { //vetorB = vetorA*i
        int vetorA[]=new int[]{3,5,7,11,13,17,19,23,27,37,43,47,53,59,67};
        double vetorB[]=new double[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=vetorA[i]*i;
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;
        }
        
    }
    public void exercicio6() { //vetorC = vetorA+vetorB
        int vetorA[]=new int[]{3,5,7,11,13,17,19,23,27,37,43,47,53,59,67};
        int vetorB[]=new int[]{5,7,11,13,17,19,23,27,37,43,47,53,59,67,3};
        double vetorC[]=new double[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorC[i]=vetorA[i]+vetorB[i];
            System.out.println("VetorC["+i+"]="+vetorC[i]);
            i++;
        }
        
    }
}
