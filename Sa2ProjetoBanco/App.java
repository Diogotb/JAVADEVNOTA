package Sa2ProjetoBanco;

import javax.swing.JOptionPane;

import Sa2ProjetoBanco.Conta.ContaPF;
import Sa2ProjetoBanco.Conta.ContaPJ;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        //criar os vetores de objetos
        ContaPF contasPf[] = new ContaPF[10];
        ContaPJ contasPj[] = new ContaPJ[10];
        //criar a aplicação do banco
        boolean aberta = true;
        int contPF = 0;
        int contaAtual = 0;
        while(aberta){
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha a ção desejada:"
                +"\n 1-Abrir Conta"
                +"\n 2-Acessar Conta"
                +"\n 3-Sair"
            ));
            if(acao ==1){//abrir conta PF
                //criar a conta
                //instanciar o objeto
                contasPf[contPF] = new ContaPF();//objeto criado
                //preencher as informações da conta
                contasPf[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPf[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                contasPf[contPF].setSaldo(0);
                contasPf[contPF].setnConta(1000+contPF);
                contPF++;
            }
            else if(acao==2){//buscar a conta já criada da PF
                for (int i = 0; i < contasPf.length; i++) {
                    //busca pelo nº da conta
                    int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"))
                    if(nContaBusca == contasPf[i].getnConta()){
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                    }
                }
                boolean acessar = true;
                while(acessar){
                    int acao2 = JOptionPane.showInputDialog("Ação desejada:"
                    +"\n 1- verificar saldo"
                    +"\n 2-Saque")
                }
            }

        }
        
    }
}