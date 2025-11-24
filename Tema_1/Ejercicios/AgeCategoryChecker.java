package Paquete_1;

//Introduce un número y muestra si eres joven (<30) o mayor

import java.util.Scanner;

public class Joven_O_Viejo {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Escriba su edad: ");
		int edad = Integer.parseInt(teclado.nextLine());

		if (edad < 30) {
			System.out.println("Eres joven");
		} else {
			System.out.println("Eres viejo");
		}
	}
}
