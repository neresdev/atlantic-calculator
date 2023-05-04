package org.calculator.controller;

import org.calculator.service.CalculatorService;
import org.calculator.view.CalculatorView;

import java.awt.event.*;

public class CalculatorController implements IController {
    public static final String INVALID_A_FIELD_MESSAGE = "Campo A inválido!";

    public static final String INVALID_B_FIELD_MESSAGE = "Campo B inválido!";

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
            int valueA = 0;
            int valueB = 0;
            try{
                valueA = Integer.parseInt(view.getFieldA());
            }catch (NumberFormatException nfe){
                view.setRestult(INVALID_A_FIELD_MESSAGE);
                return;
            }

            try{
                valueB = Integer.parseInt(view.getFieldB());
            }catch (NumberFormatException nfe){
                view.setRestult(INVALID_B_FIELD_MESSAGE);
                return;
            }

            String result = String.valueOf(model.sum(valueA, valueB));
            view.setRestult(result);
        }
    }

    class SubListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int valueA = 0;
            int valueB = 0;
            try{
                valueA = Integer.parseInt(view.getFieldA());
            }catch (NumberFormatException nfe){
                view.setRestult(INVALID_A_FIELD_MESSAGE);
                return;
            }

            try{
                valueB = Integer.parseInt(view.getFieldB());
            }catch (NumberFormatException nfe){
                view.setRestult(INVALID_B_FIELD_MESSAGE);
                return;
            }

            String result = String.valueOf(model.sub(valueA, valueB));
            view.setRestult(result);
        }
    }

    public void start() {
        view.exibir();
    }
}
