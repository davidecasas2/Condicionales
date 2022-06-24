import java.util.Scanner;

/**
 * 5. Algoritmo que determine si un a�o dado es bisiesto o no, teniendo en cuenta 
 * que son a�os bisiestos los m�ltiplos de 4, excepto los que son tambi�n m�ltiplos 
 * de 100 pero no lo son de 400.
 * @author David
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el a�o: ");
		int a�o = entrada.nextInt();
		
		if ( (a�o%4) == 0 ) {
			if ( (a�o%100 ==0) && (a�o%400 != 0)) {
				System.out.println("El a�o NO es bisiesto");
			} else {
				System.out.println("El a�o es bisiesto");
			}
		} else {
			System.out.println("El a�o NO es bisiesto");
		}

	}

}
