package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);
    public void letra() {
        System.out.println("Informe uuma Letra");
        String letraDigitada = sc.nextLine();
        switch(letraDigitada){
            case "a":System.out.println(letraDigitada+" É vogal");
            break;
            case "e":System.out.println(letraDigitada+" É vogal");
            break;
            case "i":System.out.println(letraDigitada+" É vogal");
            break;
            case "o":System.out.println(letraDigitada+" É vogal");
            break;
            case "u":System.out.println(letraDigitada+" É vogal");
            break;
            default:System.out.println(letraDigitada+ " É Consoante");
            break;
        }
    }
    public void mes() {
        System.out.println("Informe um nº Ref. ao mês escolhido");
        int nMes = sc.nextInt();
        String nomeMes = "";
        switch(nMes){
            case 1: nomeMes = "Janeiro";
            break;
            case 2: nomeMes = "Fevereiro";
            break;
            case 3: nomeMes = "Março";
            break;
            case 4: nomeMes = "Abril";
            break;


            default: nomeMes = "Esse mês não Existe";
            break;
        }
        System.out.println("o Mês selecionado é "+nomeMes);
        
    }
}
