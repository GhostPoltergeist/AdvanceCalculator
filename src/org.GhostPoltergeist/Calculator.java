package org.GhostPoltergeist;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JPanel implements ActionListener {
    JFrame frame;
    JPanel panel;
    JTextField textField;
    JButton[] numberButton = new JButton[10];
    JButton addButton, subButton, mulButton, divButton, equalButton, decButton;
    JButton delButton, clrButton, refButton, convButton;
    JButton[] holder = new JButton[6];

    double numOne, numTwo, finalResult;
    char operators;

    protected Calculator() {
        textField = new JTextField();
        textField.setFocusable(false);
        textField.setPreferredSize(new Dimension(100, 60));
        textField.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
        textField.setEditable(false);
        textField.setVisible(true);

        for (int x = 0; x < numberButton.length; x++) {
            numberButton[x] = new JButton(String.valueOf(x));
            numberButton[x].setPreferredSize(new Dimension(50,50));
            numberButton[x].setFocusable(false);
            numberButton[x].setFont(new Font("JetBrains Mono", Font.BOLD, 15));
            numberButton[x].addActionListener(this);
            numberButton[x].setVisible(true);
        }

        addButton = new JButton("+");
        addButton.setFocusable(false);
        addButton.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        addButton.addActionListener(this);
        addButton.setVisible(true);
        addButton.setPreferredSize(new Dimension(60,50));

        subButton = new JButton("-");
        subButton.setFocusable(false);
        subButton.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        subButton.addActionListener(this);
        subButton.setPreferredSize(new Dimension(60,50));

        mulButton = new JButton("*");
        mulButton.setFocusable(false);
        mulButton.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        mulButton.addActionListener(this);
        mulButton.setVisible(true);
        mulButton.setPreferredSize(new Dimension(60,50));

        divButton = new JButton("/");
        divButton.setFocusable(false);
        divButton.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        divButton.addActionListener(this);
        divButton.setVisible(true);
        divButton.setPreferredSize(new Dimension(60,50));

        equalButton = new JButton("=");
        equalButton.setFocusable(false);
        equalButton.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        equalButton.addActionListener(this);
        equalButton.setVisible(true);
        equalButton.setPreferredSize(new Dimension(60,50));

        decButton = new JButton(".");
        decButton.setFocusable(false);
        decButton.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        decButton.addActionListener(this);
        decButton.setVisible(true);
        decButton.setPreferredSize(new Dimension(60,50));

        delButton = new JButton("del");
        delButton.setFocusable(false);
        delButton.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
        delButton.addActionListener(this);
        delButton.setVisible(true);
        delButton.setPreferredSize(new Dimension(60,50));

        clrButton = new JButton("clr");
        clrButton.setFocusable(false);
        clrButton.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
        clrButton.addActionListener(this);
        clrButton.setVisible(true);
        clrButton.setPreferredSize(new Dimension(60,50));

        refButton = new JButton("ref");
        refButton.setFocusable(false);
        refButton.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
        refButton.addActionListener(this);
        refButton.setVisible(true);
        refButton.setPreferredSize(new Dimension(60,50));

        convButton = new JButton("oth");
        convButton.setFocusable(false);
        convButton.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
        convButton.addActionListener(this);
        convButton.setVisible(true);
        convButton.setPreferredSize(new Dimension(50,50));

        holder[0] = addButton;
        holder[1] = subButton;
        holder[2] = mulButton;
        holder[3] = divButton;
        holder[4] = equalButton;
        holder[5] = decButton;

        panel = new JPanel();
        panel.setLayout(new GridLayout(5,5,5,5));
        panel.setVisible(true);

        panel.add(numberButton[0]);
        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(divButton);
        panel.add(mulButton);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(equalButton);
        panel.add(decButton);
        panel.add(delButton);
        panel.add(clrButton);
        panel.add(refButton);
        panel.add(convButton);

        frame = new JFrame();
        frame.setSize(420, 550);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout(5,0));
        frame.setLocation(495, 118);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {UIManager.setLookAndFeel(new FlatDarculaLaf());new Calculator();}
        catch (UnsupportedLookAndFeelException e) {throw new RuntimeException(e);}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      for (int x=0; x<numberButton.length; x++) {
          if (e.getSource() == numberButton[x]) {
              textField.setText(textField.getText().concat(String.valueOf(x)));
          }}
          if (e.getSource()==decButton) {
              textField.setText(textField.getText().concat("."));
          }
          if (e.getSource()==delButton) {
              String temp = textField.getText();
              textField.setText("");
              for (int x=0; x<temp.length()-1; x++) {
                  textField.setText(textField.getText() + temp.charAt(x));
              }
          }
          if (e.getSource()==clrButton) {textField.setText("");}
          if (e.getSource()==refButton) {
              try {UIManager.setLookAndFeel(new FlatDarculaLaf());new Formula();}
              catch (UnsupportedLookAndFeelException ex) {throw new RuntimeException(ex);}
          }

        if (e.getSource()==addButton) {
            numOne = Double.parseDouble(textField.getText());
            operators = '+';
            textField.setText("");
        }
        if (e.getSource()==subButton) {
            numOne = Double.parseDouble(textField.getText());
            operators = '-';
            textField.setText("");
        }
        if (e.getSource()==mulButton) {
            numOne = Double.parseDouble(textField.getText());
            operators = '*';
            textField.setText("");
        }
        if (e.getSource()==divButton) {
            numOne = Double.parseDouble(textField.getText());
            operators = '/';
            textField.setText("");
        }
        if (e.getSource()==equalButton) {
            numTwo = Double.parseDouble(textField.getText());

            switch (operators) {
                case '+':
                    finalResult = numOne + numTwo;
                break;
                case '-':
                    finalResult = numOne - numTwo;
                break;
                case '*':
                    finalResult = numOne * numTwo;
                break;
                case '/':
                    finalResult = numOne / numTwo;
                break;
                default:
                    textField.setText("Invalid");
            }
            textField.setText(String.valueOf(finalResult));
            numOne = finalResult;
        }
    }
}