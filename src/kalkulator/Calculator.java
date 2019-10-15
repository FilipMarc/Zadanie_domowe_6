package kalkulator;

public class Calculator {

    int Calculate(int a, int b){
        int sum = 0;
        if (a >b){
            sum = a + b;
            System.out.println(sum);
        }else if (a < b){
            sum = a * b;
            System.out.println(sum);
        }else if (a == b){
            sum = a*a;
            System.out.println(sum);
        }
        return sum;
    }
}
