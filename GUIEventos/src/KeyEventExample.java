import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventExample extends JFrame {

    public KeyEventExample() {
        super("Exercicio2");
        JPanel mainPanel = new JPanel();
        this.add(mainPanel);
        JLabel label = new JLabel("Texto Digitado: ");
        JTextField textField = new JTextField(20);
        mainPanel.add(label);
        mainPanel.add(textField);
        JLabel label2 = new JLabel();
        mainPanel.add(label2);

        // Registra um KeyListener para o campo de texto
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Este método é chamado quando uma tecla é digitada
                // Aqui, você pode capturar o caractere digitado e atualizar o rótulo
                char typedChar = e.getKeyChar();
                label.setText("Texto Digitado: " + typedChar);
                label2.setText(textField.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Este método é chamado quando uma tecla é pressionada
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Este método é chamado quando uma tecla é liberada
            }
        });
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
    }
}
