import java.util.Scanner;

/**
 * 1. Algoritmo que pida dos enteros y que indique el
 * mayor y el menor, o si ambos son iguales. 
 * @author David
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introoduce un número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Introoduce otro número: ");
		int num2 = teclado.nextInt();
		
		if (num1==num2) { 
			System.out.println("Los numeros son iguales.");
		} else if (num1<num2) {
			System.out.printf("El menor es %d y el mayor es %d\n",num1,num2);
		} else {
			System.out.println("EL menor es "+num2+" el mayor es "+num1);
		}
		
		/*
		switch(Integer.compare(num1, num2)) {
		case 0: System.out.println("Los numeros son iguales."); break;
		case -1:System.out.printf("El menor es %d y el mayor es %d\n",num1,num2);break;
		case 1:System.out.println("EL menor es "+num2+" el mayor es "+num1);
		}*/
		
	}

}
