package actividad3.conversortemperaturas;

import java.util.Scanner;
public class Temperature_converter {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tWelcome to Temperature Converter\n");
	System.out.println("Escribe el valor que quieres cambiar : ");
	float value = scan.nextFloat();
	System.out.println("  Pulse 1 para Celsius a Fahrenheit");
	System.out.println("  Pulse 2 para Fahrenheit a Celsius");
	System.out.println("\nEscribe el valor   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("La conversion es "+value1+"�F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("La conversion es.. "+value3+"�C");
		}
	System.out.println("\n\tThank You!!..");
	}
}
