package org.GhostPoltergeist;

import lombok.SneakyThrows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Formula extends JFrame implements ActionListener {
    static final double PI_VALUE = 3.14159265;
    String dataText, dataTextTwo;
    double dataOne, dataTwo, finalResult;

    JComboBox comboBox, comboBoxTwo;
    JButton[] arrayButtons = new JButton[12];
    JButton[] arrayRemoval = new JButton[6];
    JButton one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve;
    JButton conv, back, degree, gradian, radian, milliRadian, minuteArc, secondArc, retButton;
    JFrame frame;
    JPanel firstPanel, secondPanel, thirdPanel;
    JTextArea textArea;
    JTextField textField, textFieldTwo;
    JLabel label, secLabel;

    protected Formula() {
      one = new JButton("Num");
      one.setFocusable(false);
      one.addActionListener(this);
      one.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      one.setVisible(true);

      two = new JButton("Men");
      two.setFocusable(false);
      two.addActionListener(this);
      two.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      two.setVisible(true);

      three = new JButton("Alg");
      three.setFocusable(false);
      three.addActionListener(this);
      three.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      three.setVisible(true);

      four = new JButton("ArF");
      four.setFocusable(false);
      four.addActionListener(this);
      four.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      four.setVisible(true);

      five = new JButton("ArT");
      five.setFocusable(false);
      five.addActionListener(this);
      five.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      five.setVisible(true);

      six = new JButton("Equi");
      six.setFocusable(false);
      six.addActionListener(this);
      six.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      six.setVisible(true);

      seven = new JButton("Iso");
      seven.setFocusable(false);
      seven.addActionListener(this);
      seven.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      seven.setVisible(true);

      eight = new JButton("Peri");
      eight.setFocusable(false);
      eight.addActionListener(this);
      eight.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      eight.setVisible(true);

      nine = new JButton("3si");
      nine.setFocusable(false);
      nine.addActionListener(this);
      nine.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      nine.setVisible(true);

      ten = new JButton("2si");
      ten.setFocusable(false);
      ten.addActionListener(this);
      ten.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      ten.setVisible(true);

      eleven = new JButton("Inc");
      eleven.setFocusable(false);
      eleven.addActionListener(this);
      eleven.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      eleven.setVisible(true);

      twelve = new JButton("PeCo");
      twelve.setFocusable(false);
      twelve.addActionListener(this);
      twelve.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      twelve.setVisible(true);

      label = new JLabel();
      label.setBounds(50, 0, 450, 14);
      label.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      label.setVisible(true);

      textArea = new JTextArea();
      textArea.setBounds(25, 25, 800, 550);
      textArea.setFocusable(false);
      textArea.setEditable(true);
      textArea.setFont(new Font("JetBrains Mono", Font.BOLD, 13));
      textArea.setVisible(true);

      textField = new JTextField();
      textField.setBounds(625, 150, 200, 40);
      textField.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
      textField.setEditable(true);
      textField.setVisible(true);

      secLabel = new JLabel("=");
      secLabel.setBounds(721, 201, 450, 20);
      secLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
      secLabel.setVisible(true);

      textFieldTwo = new JTextField();
      textFieldTwo.setBounds(625, 230, 200, 40);
      textFieldTwo.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
      textFieldTwo.setEditable(true);
      textFieldTwo.setVisible(true);

      firstPanel = new JPanel();
      firstPanel.setBounds(20, 600, 400, 80);
      firstPanel.setLayout(new GridLayout(2, 2, 5, 15));
      firstPanel.setVisible(true);

      firstPanel.add(one);
      firstPanel.add(two);
      firstPanel.add(three);
      firstPanel.add(four);
      firstPanel.add(five);
      firstPanel.add(six);
      firstPanel.add(seven);
      firstPanel.add(eight);
      firstPanel.add(nine);
      firstPanel.add(ten);
      firstPanel.add(eleven);
      firstPanel.add(twelve);

      conv = new JButton("Conversion");
      conv.setFocusable(false);
      conv.addActionListener(this);
      conv.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      conv.setVisible(true);

      back = new JButton("Exit");
      back.setFocusable(false);
      back.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
      back.addActionListener(this);
      back.setVisible(true);
      back.setEnabled(false);

      arrayButtons[0] = one;
      arrayButtons[1] = two;
      arrayButtons[2] = three;
      arrayButtons[3] = four;
      arrayButtons[4] = five;
      arrayButtons[5] = six;
      arrayButtons[6] = seven;
      arrayButtons[7] = eight;
      arrayButtons[8] = nine;
      arrayButtons[9] = ten;
      arrayButtons[10] = eleven;
      arrayButtons[11] = twelve;

      arrayRemoval[0] = degree;
      arrayRemoval[1] = radian;
      arrayRemoval[2] = milliRadian;
      arrayRemoval[3] = minuteArc;
      arrayRemoval[4] = secondArc;
      arrayRemoval[5] = gradian;

      secondPanel = new JPanel();
      secondPanel.setBounds(625, 600, 200, 80);
      secondPanel.setLayout(new GridLayout(2, 2, 5, 10));
      secondPanel.setVisible(true);

      secondPanel.add(conv);
      secondPanel.add(back);

      degree = new JButton("Deg");
      degree.setFocusable(false);
      degree.setEnabled(false);
      degree.addActionListener(this);
      degree.setFont(new Font("JetBrains Mono", Font.BOLD, 12));

      gradian = new JButton("Gra");
      gradian.setFocusable(false);
      gradian.setEnabled(false);
      gradian.addActionListener(this);
      gradian.setFont(new Font("JetBrains Mono", Font.BOLD, 12));

      radian = new JButton("Rad");
      radian.setFocusable(false);
      radian.setEnabled(false);
      radian.addActionListener(this);
      radian.setFont(new Font("JetBrains Mono", Font.BOLD, 12));

      milliRadian = new JButton("MRad");
      milliRadian.setFocusable(false);
      milliRadian.setEnabled(false);
      milliRadian.addActionListener(this);
      milliRadian.setFont(new Font("JetBrains Mono", Font.BOLD, 12));

      minuteArc = new JButton("MiA");
      minuteArc.setFocusable(false);
      minuteArc.setEnabled(false);
      minuteArc.addActionListener(this);
      minuteArc.setFont(new Font("JetBrains Mono", Font.BOLD, 12));

      secondArc = new JButton("SeA");
      secondArc.setFocusable(false);
      secondArc.setEnabled(false);
      secondArc.addActionListener(this);
      secondArc.setFont(new Font("JetBrains Mono", Font.BOLD, 12));

      retButton = new JButton("clr");
      retButton.setFocusable(false);
      retButton.addActionListener(this);
      retButton.setFont(new Font("JetBrains Mono", Font.BOLD, 12));

      thirdPanel = new JPanel();
      thirdPanel.setBounds(625, 400, 200, 120);
      thirdPanel.setLayout(new GridLayout(3, 3, 4, 5));
      thirdPanel.setVisible(false);

      String[] dataPassing = {"Select", "Degree", "Radian", "Milliradian", "Gradian", "MinuteofArc", "SecondofArc"};

      comboBox = new JComboBox<>(dataPassing);
      comboBox.setBounds(625, 110, 100, 30);
      comboBox.setFocusable(false);
      comboBox.setEditable(false);
      comboBox.addActionListener(this);

      comboBoxTwo = new JComboBox<>(dataPassing);
      comboBoxTwo.setBounds(625, 280, 100, 30);
      comboBoxTwo.setFocusable(false);
      comboBoxTwo.setEditable(false);
      comboBoxTwo.addActionListener(this);

      thirdPanel.add(degree);
      thirdPanel.add(gradian);
      thirdPanel.add(radian);
      thirdPanel.add(milliRadian);
      thirdPanel.add(minuteArc);
      thirdPanel.add(secondArc);
      thirdPanel.add(retButton);

      frame = new JFrame();
      frame.pack();
      frame.setSize(1000, 900);
      frame.setResizable(false);
      frame.setLayout(null);
      frame.setLocation(215, 0);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.add(textArea);
      frame.add(firstPanel);
      frame.add(secondPanel);
      frame.add(thirdPanel);
      frame.add(comboBox);
      frame.add(comboBoxTwo);
      frame.add(textField);
      frame.add(textFieldTwo);
      frame.add(label);
      frame.add(secLabel);
    }

    @SneakyThrows
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == one) {
            textArea.setText("");
            label.setText("Number System Formulas");
            textArea.append("""
                    [Addition of integers is commutative]
                    Formula: a + b = b + a

                    [Addition of integers is associative]
                    Formula: a + ( b + c ) = ( a + b) + c

                    [0 is the identity element under addition]
                    Formula: a + 0 = 0 + a = a

                    [Multiplication of integers
                    is commutative.]
                    Formula: a x b = b x a

                    [1 is the identity element
                    under multiplication]
                    Formula: 1 x a = a x 1 = a

                    >>: √ab=√a√b
                    >>: √a/b=√a/√b
                    >>: (√a+√b)(√a−√b)=a−b
                    >>: (a+√b)(a−√b)=a^2−b
                    >>: (√a+√b)^2=a+2√ab+b
                    >>: a^pa^q=a^p+q
                    >>: (a^p)^q=a^pq
                    >>: a^p/a^q=a^p−q
                    >>: a^pb^p=(ab)^p""");
        }
        if (e.getSource() == two) {
            textArea.setText("");
            label.setText("Mensuration Formulas for Two dimensional Figures");
            textArea.append("2-Dimensional Figures Area (Sq.units) \nPerimeter (Units) \n\n>>: Square (side)2 4 x side\n\n>>: Triangle ½ ( b x h ) Sum of all sides\n\n>>: Rectangle length x breadth 2 \n(length + breadth)\n\n>>: Circle πr2 2πr");
        }
        if (e.getSource() == three) {
            textArea.setText("");
            label.setText("Basic Algebra Formula");
            textArea.setText(">>: x=−b±√b2−4ac/2a");
        }
        if (e.getSource() == four) {
            textArea.setText("");
            label.setText("Area Formulas");
            textArea.setText("""
                        \s
                         Rectangle      Area = l $\\ times$ w            l =  length
                                                                        w  = width
                                                                   \s
                         Square         Area  = $a^{2}$                 a = sides of square
                    \s
                         Triangle       Area = $\\ frac{1}{2}$bh         b = base
                                                                        h = height
                    \s
                         Circle         Area = $\\pi$$r^{2}$             r = radius of circle
                        \s
                         Trapezoid      Area =$\\ frac{1}{2}$(a + b)h    a = base 1
                                                                        b = base 2
                                                                        h = vertical height
                                                                       \s
                         Ellipse        Area = $\\pi$ab                  a = radius of major axis
                                                                        b = radius of minor axis""".indent(3));
        }
        if (e.getSource() == five) {
            textArea.setText("");
            label.setText("Area of a Triangle Formula");
            textArea.setText(">>: Area of a Triangle = A = ½ (b × h) square units");
        }
        if (e.getSource() == six) {
            textArea.setText("");
            label.setText("Area of a Right Triangle Formula");
            textArea.setText(">>: Area of a Right Triangle = A = ½ × Base × Height {Perpendicular distance}");
        }
        if (e.getSource() == seven) {
            textArea.setText("");
            label.setText("Area of an Equilateral Triangle");
            textArea.setText(">>: Area of an Equilateral Triangle = A = (√3)/4 × side2");
        }
        if (e.getSource() == eight) {
            textArea.setText("");
            label.setText("Area of an Isosceles Triangle");
            textArea.setText(">>: Area of an Isosceles Triangle = 1/4 b√(4a2 – b2)");
        }
        if (e.getSource() == nine) {
            textArea.setText("");
            label.setText("The perimeter of a triangle");
            textArea.setText(">>: The perimeter of a triangle = P = (a + b + c) unit");
        }
        if (e.getSource() == ten) {
            textArea.setText("");
            label.setText("Area of Triangle with Three Sides (Heron’s Formula)");
            textArea.setText(">>: Area = Square root of√s(s - a)(s - b)(s - c) where s is half the perimeter, or (a + b + c)/2.");
        }
        if (e.getSource() == eleven) {
            textArea.setText("");
            label.setText("Area of a Triangle Given Two Sides and the Included Angle(SAS)");
            textArea.setText("""

                    \s
                     Area (∆ABC) = ½ bc sin A
                    \s
                     Area (∆ABC) = ½ ab sin C
                    \s
                     Area (∆ABC) = ½ ca sin B
                    \s
                     These formulas are very easy to remember and also to calculate.
                    \s
                     For example, If, in ∆ABC,  A = 30° and b = 2, c = 4 in units. Then the area will be;
                    \s
                     Area (∆ABC) = ½ bc sin A
                    \s
                     = ½ (2) (4) sin 30
                    \s
                     = 4 x ½   (since sin 30 = ½)
                    \s
                     = 2 sq.unit.""".indent(3));
        }
        if (e.getSource() == twelve) {
            textArea.setText("");
            label.setText("Permutations & Combinations");
            textArea.setText("""
                    A permutation is an arrangement in a definite order of a number of\s
                    objects taken some or all at a time. Let us take 10 numbers: 0, 1, 2, 3, 4, 5,
                    6, 7, 8 and 9. The number of different 4-digit-PIN which can be formed
                    using these 10 numbers is 5040. P(10,4) = 5040. This is a simple
                    example of permutations. The permutations of 4 numbers taken from 10
                    numbers equal to the factorial of 10 divided by the factorial of the
                    difference of 10 and 4. The permutations is easily calculated using
                    nPr = n!/(n-r)!\s

                    A combination is all about grouping. The number of different groups\s
                    which can be formed from the available things can be calculated using
                    combinations. Let us try to understand this with a simple example. A
                    team of 2 is formed from 5 students(William, James, Noah, Logan, and
                    Oliver). This the combination of 'r' persons from the available 'n' persons
                    is given as nCr = n!/r!(n-r)! The combinations can happen in the following
                    10 ways by which the team of 2 could be formed.
                    """);
        }
        if (e.getSource() == retButton) {
            comboBox.setSelectedIndex(0);
            comboBoxTwo.setSelectedIndex(0);

            textField.setText("");
            textFieldTwo.setText("");

            radian.setFocusable(false);
            gradian.setFocusable(false);
            milliRadian.setFocusable(false);
            minuteArc.setFocusable(false);
            secondArc.setFocusable(false);
        }
        
        dataText = Objects.requireNonNull(comboBox.getSelectedItem()).toString();
        dataTextTwo = Objects.requireNonNull(comboBoxTwo.getSelectedItem()).toString();

        if (dataText.equals("Degree") & dataTextTwo.equals("Radian")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne * PI_VALUE;
            finalResult = dataTwo / 180;

            textFieldTwo.setText(finalResult + "rad");
        }
        if (dataText.equals("Degree") & dataTextTwo.equals("Gradian")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne * 200;
            finalResult = dataTwo / 180;

            textFieldTwo.setText(finalResult + "g");
        }
        if (dataText.equals("Degree") & dataTextTwo.equals("Milliradian")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = 1000 * PI_VALUE;
            dataTwo = dataOne * temp ;
            finalResult = dataTwo / 180;

            textFieldTwo.setText(finalResult + "mrad");
        }
        if (dataText.equals("Degree") & dataTextTwo.equals("MinuteofArc")) {
            dataOne = Double.parseDouble(textField.getText());
            finalResult = dataOne * 60;

            textFieldTwo.setText(String.valueOf(finalResult));
        }
        if (dataText.equals("Degree") & dataTextTwo.equals("SecondofArc")) {
            dataOne = Double.parseDouble(textField.getText());
            finalResult = dataOne * 3600;

            textFieldTwo.setText(String.valueOf(finalResult));
        }

        if (dataText.equals("Radian") & dataTextTwo.equals("Degree")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = 180 / PI_VALUE;
            dataTwo = dataOne * temp;
            finalResult = dataTwo;

            textFieldTwo.setText(finalResult + "°");
        }
        if (dataText.equals("Radian") & dataTextTwo.equals("Gradian")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne * 200;
            finalResult = dataTwo / PI_VALUE;

            textFieldTwo.setText(finalResult + "g");
        }
        if (dataText.equals("Radian") & dataTextTwo.equals("Milliradian")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne * 1000 ;
            finalResult = dataTwo;

            textFieldTwo.setText(String.valueOf(finalResult));
        }
        if (dataText.equals("Radian") & dataTextTwo.equals("MinuteofArc")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = (60 * 180) / PI_VALUE;
            dataTwo = dataOne * temp;
            finalResult = dataTwo;

            textFieldTwo.setText(String.valueOf(finalResult));
        }
        if (dataText.equals("Radian") & dataTextTwo.equals("SecondofArc")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = (3600 * 180) / PI_VALUE;
            dataTwo = dataOne * temp;
            finalResult = dataTwo;

            textFieldTwo.setText(String.valueOf(finalResult));
        }

        if (dataText.equals("Gradian") & dataTextTwo.equals("Degree")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne * 180 / 200;
            finalResult = dataTwo;

            textFieldTwo.setText(finalResult + "°");
        }
        if (dataText.equals("Gradian") & dataTextTwo.equals("Radian")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = PI_VALUE / 200;
            dataTwo = dataOne * temp;
            finalResult = dataTwo;

            textFieldTwo.setText(finalResult + "rad");
        }
        if (dataText.equals("Gradian") & dataTextTwo.equals("Milliradian")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = 1000 * PI_VALUE / 200;
            dataTwo = dataOne * temp;
            finalResult = dataTwo;

            textFieldTwo.setText((finalResult) + "mrad");
        }
        if (dataText.equals("Gradian") & dataTextTwo.equals("MinuteofArc")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne * 54;
            finalResult = dataTwo;

            textFieldTwo.setText(String.valueOf(finalResult));
        }
        if (dataText.equals("Gradian") & dataTextTwo.equals("SecondofArc")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne * 3240;
            finalResult = dataTwo;

            textFieldTwo.setText(String.valueOf(finalResult));
        }

        if (dataText.equals("Milliradian") & dataTextTwo.equals("Degree")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = 1000 * PI_VALUE;
            dataTwo = dataOne * 180 / temp;
            finalResult = dataTwo;

            textFieldTwo.setText(finalResult + "°");
        }
        if (dataText.equals("Milliradian") & dataTextTwo.equals("Radian")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne / 1000;
            finalResult = dataTwo;

            textFieldTwo.setText(String.valueOf(finalResult));
        }
        if (dataText.equals("Milliradian") & dataTextTwo.equals("Gradian")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = 1000 * PI_VALUE;
            dataTwo = dataOne * 200 / temp;
            finalResult = dataTwo;

            textFieldTwo.setText((finalResult) + "g");
        }
        if (dataText.equals("Milliradian") & dataTextTwo.equals("MinuteofArc")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = 1000 * PI_VALUE;
            dataTwo = dataOne * (60 * 180) / temp;
            finalResult = dataTwo;

            textFieldTwo.setText((finalResult) + "'");
        }
        if (dataText.equals("Milliradian") & dataTextTwo.equals("SecondofArc")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = 1000 * PI_VALUE;
            dataTwo = dataOne * 3600 * 180 / temp;
            finalResult = dataTwo;

            textFieldTwo.setText(((finalResult)) + "''");
        }

        if (dataText.equals("MinuteofArc") & dataTextTwo.equals("Degree")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne / 60;
            finalResult = dataTwo;

            textFieldTwo.setText(finalResult + "°");
        }
        if (dataText.equals("MinuteofArc") & dataTextTwo.equals("Radian")) {
            double temp = 60 * 180;
            dataTwo = dataOne * PI_VALUE / temp;
            finalResult = dataTwo;

            textFieldTwo.setText(String.valueOf(finalResult) + "rad");
        }
        if (dataText.equals("MinuteofArc") & dataTextTwo.equals("Gradian")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne / 54;
            finalResult = dataTwo;

            textFieldTwo.setText((finalResult) + "g");
        }
        if (dataText.equals("MinuteofArc") & dataTextTwo.equals("Milliradian")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = 1000 * PI_VALUE;
            dataTwo = dataOne * temp / (60 * 180);
            finalResult = dataTwo;

            textFieldTwo.setText((finalResult) + "mrad");
        }
        if (dataText.equals("MinuteofArc") & dataTextTwo.equals("SecondofArc")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne * 60;
            finalResult = dataTwo;

            textFieldTwo.setText(String.valueOf((finalResult)));
        }

        if (dataText.equals("SecondofArc") & dataTextTwo.equals("Degree")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne / 3600;
            finalResult = dataTwo;

            textFieldTwo.setText(finalResult + "°");
        }
        if (dataText.equals("SecondofArc") & dataTextTwo.equals("Radian")) {
            double temp = 180 * 3600;
            dataTwo = dataOne * PI_VALUE / temp;
            finalResult = dataTwo;

            textFieldTwo.setText(String.valueOf(finalResult) + "rad");
        }
        if (dataText.equals("SecondofArc") & dataTextTwo.equals("Gradian")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne / 3240;
            finalResult = dataTwo;

            textFieldTwo.setText((finalResult) + "g");
        }
        if (dataText.equals("SecondofArc") & dataTextTwo.equals("Milliradian")) {
            dataOne = Double.parseDouble(textField.getText());
            double temp = 1000 * PI_VALUE;
            dataTwo = dataOne * temp / (180 * 3600);
            finalResult = dataTwo;

            textFieldTwo.setText((finalResult) + "mrad");
        }
        if (dataText.equals("SecondofArc") & dataTextTwo.equals("MinuteofArc")) {
            dataOne = Double.parseDouble(textField.getText());
            dataTwo = dataOne / 60;
            finalResult = dataTwo;

            textFieldTwo.setText(String.valueOf((finalResult)));
        }

        if (e.getSource() == conv) {
            textField.setVisible(true);
            textFieldTwo.setVisible(true);
            secLabel.setVisible(true);
            comboBox.setVisible(true);
            comboBoxTwo.setVisible(true);
            retButton.setVisible(true);

            textArea.setText("");
            label.setText("");
            conv.setEnabled(false);
            back.setEnabled(true);
            for (JButton arrayButton : arrayButtons) {
                arrayButton.setEnabled(false);
            }
            textArea.setVisible(false);
            thirdPanel.setVisible(true);
        }
        if (e.getSource() == back) {
            textField.setVisible(false);
            textFieldTwo.setVisible(false);
            secLabel.setVisible(false);
            comboBox.setVisible(false);
            comboBoxTwo.setVisible(false);
            retButton.setVisible(false);

            comboBox.setSelectedIndex(0);
            comboBoxTwo.setSelectedIndex(0);

            textField.setText("");
            textFieldTwo.setText("");
            textArea.setText("");
            label.setText("");
            conv.setEnabled(true);
            back.setEnabled(false);
            textArea.setVisible(true);
            for (JButton arrayButton : arrayButtons) {
                arrayButton.setEnabled(true);
            }
            for (JButton jButton : arrayRemoval) {
                jButton.setVisible(false);
            }
        }
    }
}
