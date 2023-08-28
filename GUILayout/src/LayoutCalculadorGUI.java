import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutCalculadorGUI {
    public LayoutCalculadorGUI() {
        //construir o Layout de uma calculadora
        JFrame janelaP = new JFrame("Layout Calculadora");
        JPanel painelB = new JPanel();//padrão FlowLayout
        janelaP.getContentPane().add(painelB);
        //set Layout do JPanel
        GridLayout grid = new GridLayout(4, 4);
        painelB.setLayout(grid);
        //Vetor com os texto dos botões
        String textBotoes[]={"C","9","8","7","/","6","5","4","*","3","2","1","-","+","0","="};
        for (int i = 0; i < textBotoes.length; i++) {
            painelB.add(new JButton(textBotoes[i]));
        }
        //set do Frame
        janelaP.setDefaultCloseOperation(2);
        janelaP.pack();
        janelaP.setVisible(true);

        
    }
}
