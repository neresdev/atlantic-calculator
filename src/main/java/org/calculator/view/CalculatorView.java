package org.calculator.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame{

    public static final String DEFAULT_RESULT_MESSAGE = "O resultado é ";

    public static final String TITLE = "Calculadora";

    public static final String FIELD_A_LABEL = "Campo A";

    public static final String FIELD_B_LABEL = "Campo B";

    public static final String SUM_BUTTOM_LABEL = "Somar";

    public static final String SUB_BUTTOM_LABEL = "Subtrair";

    private JLabel labelFieldA, labelFieldB, labelResult;

    private JTextField fieldA, fieldB;

    private JButton sumButtom, subButtom;

    public CalculatorView() {
        super(TITLE);

        labelFieldA = new JLabel(FIELD_A_LABEL);

        fieldA = new JTextField(10);

        labelFieldB = new JLabel(FIELD_B_LABEL);

        fieldB = new JTextField(10);

        labelResult = new JLabel(DEFAULT_RESULT_MESSAGE);

        sumButtom = new JButton(SUM_BUTTOM_LABEL);
        subButtom = new JButton(SUB_BUTTOM_LABEL);

        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(5, 5, 5, 5);
        panel.add(labelFieldA, c);

        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(fieldA, c);

        c.gridx = 0;
        c.gridy = 1;
        c.anchor = GridBagConstraints.LINE_END;
        c.insets = new Insets(5, 5, 5, 5);
        panel.add(labelFieldB, c);

        c.gridx = 1;
        c.gridy = 1;
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(fieldB, c);

        c.gridx = 0;
        c.gridy = 2;
        c.anchor = GridBagConstraints.LINE_END;
        panel.add(labelResult, c);

        c.gridx = 2;
        c.gridy = 4;
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.NONE;
        panel.add(sumButtom, c);

        c.gridx = 1;
        c.gridy = 4;
        c.anchor = GridBagConstraints.LINE_START;
        panel.add(subButtom, c);

        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    public void addSumListener(ActionListener listener) {
        sumButtom.addActionListener(listener);
    }

    public void addSubListener(ActionListener listener) {
        subButtom.addActionListener(listener);
    }

    public String getFieldA() {
        return fieldA.getText();
    }

    public String getFieldB() {
        return fieldB.getText();
    }

    public void setRestult(int result) {
        labelResult.setText(DEFAULT_RESULT_MESSAGE + result);
    }

    public void exibir() {
        setVisible(true);
    }
}
