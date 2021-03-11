package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) 
	{
		//declaro variables
		
		int numero1=0;
		int numero2=0;
		char operador;
		double result = 0.0;

		//iniciamos el metodo utilizando Scanner
		Scanner scanObject = new Scanner(System.in);
		
		//solicitamos entradas y asignamos los valores
		System.out.println("Entra el primer numero");
		numero1 = scanObject.nextInt();
		System.out.println("Entra el segundo numero");
		numero2 = scanObject.nextInt();
		System.out.println("¿que operacion quieres hacer +,-,*,/?");
		operador = scanObject.next().charAt(0);
		
		//Instruccion switch que recibe la variable del operador.
		switch (operador) {
				case '+': result = numero1 + numero2;
				break;
				case '-': result = numero1 - numero2;
				break;
				case '*': result = numero1 * numero2;
				break;
				case '/': result = numero1 / numero2;
				break;
		
		}
		
		//Mostramos la salida de la calculadora
		System.out.println(numero1+" "+operador+" "+numero2+" = "+result);
		
	}

}
