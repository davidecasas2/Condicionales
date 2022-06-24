import java.util.Scanner;

/**
 * 6. Escribir un programa que implemente una peque�a calculadora con switch-case. 
 * El programa pedir� al usuario los operandos (a y b) y la operaci�n a realizar: 
 * suma, resta, multiplicaci�n y divisi�n. En funci�n de la opci�n seleccionada se
 * realizar� una de las operaciones aritm�ticas.
 * @author David
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Introduce el segundo n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Calculadora");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir y elevar al cuadrado");
		System.out.println("5. Eleva al cuadrado el primero");
		System.out.println("Introduce una opci�n (1-5): ");
		int opcion = entrada.nextInt();
		double res = 0;
		
		switch (opcion) {
		case 1: res = num1+num2;
		        break;
		case 2: res = num1-num2;
			    break;
		case 3: res = num1 * num2;
				break;
		case 4: res = num1 / num2;
				
		case 5: System.out.println("El n�mero al cuadrado es "+ num1*num1);
				break;
		default: System.out.println("Opci�n incorrecta. Debe elegir una opci�n entre 1 y 4");
		}

		if (opcion>=1 && opcion<=4) {
			System.out.println("El resultado es "+ res);
		}

	}

}
