package kalkulator;

import java.util.Scanner;

public class CalculatorManager {

    Calculator calcManager(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumb = sc.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = sc.nextInt();
        Calculator calc = new Calculator();
        calc.Calculate(firstNumb,secondNumber);
        return calc;
    }
}
