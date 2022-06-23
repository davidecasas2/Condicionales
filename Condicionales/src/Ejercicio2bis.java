import java.util.Scanner;

public class Ejercicio2bis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		float num1 = entrada.nextFloat();
		
		System.out.println("Introduce un número: ");
		float num2 = entrada.nextFloat();
		
		System.out.println("Introduce un número: ");
		float num3 = entrada.nextFloat();
		
		if ((num1>=num2)&&(num1>=num3)) {
			System.out.println("el mayor es "+num1);
		} else if ((num2>=num1)&&(num2>=num3)) {
			System.out.println("el mayor es "+num2);
		}else {
			System.out.println("el mayor es "+num3);
		}
		
		if (num1 >num2) {
			if (num1>num3) {
				System.out.println("el mayor es "+num1);
			} else {
				System.out.println("el mayor es "+num3);
			}
		} else {
			if (num2>num3) {
				System.out.println("el mayor es "+num2);
			} else {
				System.out.println("el mayor es "+num3);
			}
		}

	}

}
