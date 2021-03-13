package calculadora;

import java.util.Scanner;

public class Calculadora_metodo {
    private static final String suma = "+";
    private static final String resta = "-";
    private static final String multiplica = "*";
    private static final String divivide = "/";

    private enum operation {
        suma, resta, multiplica, divide
    };
    private int solution;
    private int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int y;



    static Scanner operators;

    public Calculadora_metodo() {
        solution = 0;
        operators = new Scanner(System.in);

    }

    public int addition(int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        solution = x / y;
        return solution;
    }

    public static void main(String[] args) {
        Calculadora_metodo calc = new Calculadora_metodo();

        System.out.println("Inserte 2 numeros");

        System.out.println("Numero 1: ");

        calc.setX(Integer.parseInt(operators.next()));

        System.out.println("Numero 2: ");
        calc.setY(Integer.parseInt(operators.next()));

        System.out.println("What operation? ('suma', 'resta', 'multiplica', 'divide')");
        operation ttt = operation.valueOf(operators.next());
        int output = 0 ;
        switch(ttt){
        case suma:
            output = calc.addition(calc.getX(), calc.getY());

            break;
          case resta:
              output = calc.subtraction(calc.getX(), calc.getY());

            break;
          case multiplica:
              output = calc.multiplication(calc.getX(), calc.getY());

            break;
          case divide:
              output = calc.division(calc.getX(), calc.getY());

            break;
        }
        System.out.println("Resultado ="+output);
    }
}