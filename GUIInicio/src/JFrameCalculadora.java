import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;

public class JFrameCalculadora extends JFrame{
    public JFrameCalculadora() {
        super("Calculadora");
        //colar dentro do frame 16 botoes
        this.setBounds(200, 200, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        this.add(painel);
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        for (int i = 1; i <=16 ; i++) {
            JButton but = new JButton(""+i);
            but.setSize(90, 90);
            this.add(but);
        }
    //     int m = 1;
    //     for (int i = 1; i <=4 ; i++) {
    //         JPanel painel = new JPanel();
    //         painel.setSize(400 , 100);
    //         this.setContentPane(painel);
    //         for (int j = 1; j <= 4; j++) {
    //             JButton but = new JButton(""+m);
    //             but.setSize(90, 90);
    //             painel.add(but);
    //             m++;
    //         }
            
    //     }
    //     this.setVisible(true);
    // }
    
}}

