package org.calculator.controller;

import org.calculator.service.CalculatorService;
import org.calculator.view.CalculatorView;

import java.awt.event.*;

public class CalculatorController implements IController {
    private final CalculatorView view;

    private final CalculatorService model;

    public CalculatorController(CalculatorView view, CalculatorService model) {
        this.view = view;
        this.model = model;

        this.view.addSumListener(new SumListener());
        this.view.addSubListener(new SubListener());
    }

    class SumListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(view.getFieldA());
            int b = Integer.parseInt(view.getFieldB());
            int result = model.sum(a, b);
            view.setRestult(result);
        }
    }

    class SubListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(view.getFieldA());
            int b = Integer.parseInt(view.getFieldB());
            int result = model.sub(a, b);
            view.setRestult(result);
        }
    }

    public void start() {
        view.exibir();
    }
}
