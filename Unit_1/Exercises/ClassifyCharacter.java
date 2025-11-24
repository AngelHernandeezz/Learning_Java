package Paquete_1;

//Introduce un caracter y indica según la tabla ASCII si es número, letra o ninguno

import java.util.Scanner;

public class C_es_letra_o_es_num {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduzca un caracter:");
		char caracter = teclado.next().charAt(0);

		if ((caracter >= 65 && caracter <= 90) || (caracter >= 97 && caracter <= 122)) {
			System.out.println("Es una letra");
		} else if (caracter >= 48 && caracter <= 57) {
			System.out.println("Es un número");
		} else {
			System.out.println("No es número ni letra");
		}
	}
}
