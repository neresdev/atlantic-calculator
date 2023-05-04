package org.calculator.application;

import org.calculator.controller.CalculatorController;
import org.calculator.service.CalculatorService;
import org.calculator.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorService model = new CalculatorService();
        CalculatorController controller = new CalculatorController(view, model);

        controller.start();
    }
}