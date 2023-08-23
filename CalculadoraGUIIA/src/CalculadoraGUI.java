import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton equalsButton, clearButton;
    private JPanel panel;

    private double num1, num2, result;
    private char operator;

    public CalculadoraGUI() {
        this.setTitle("Calculadora");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 48));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
            numberButtons[i].addActionListener(this);
        }

        functionButtons = new JButton[4];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        for (JButton button : functionButtons) {
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(this);
        }

        equalsButton = new JButton("=");
        clearButton = new JButton("C");
        equalsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        clearButton.setFont(new Font("Arial", Font.PLAIN, 20));
        equalsButton.addActionListener(this);
        clearButton.addActionListener(this);

        panel.add(clearButton);
        for (int i = 7; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(divButton);
        for (int i = 4; i <= 6; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(mulButton);
        for (int i = 1; i <= 3; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(subButton);
        panel.add(numberButtons[0]);
        panel.add(addButton);
        panel.add(equalsButton);

        this.add(textField, BorderLayout.NORTH);
        this.add(panel);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        for (int i = 0; i < 10; i++) {
            if (source == numberButtons[i]) {
                textField.setText(textField.getText() + i);
                return;
            }
        }

        if (source == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        } else if (source == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        } else if (source == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        } else if (source == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        } else if (source == equalsButton) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
        } else if (source == clearButton) {
            textField.setText("");
        }
    }
}
