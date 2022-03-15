package sar.game;

public class Main {

    public static void main(String[] args) {
	Calculator calculator = Calculator.instance.get();
    int a = calculator.plus.apply(4, 4);
    int b = calculator.minus.apply(a, 8);
    int c = calculator.devide.apply(a, b);
    calculator.println.accept(c);
    }
}
