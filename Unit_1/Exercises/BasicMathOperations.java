package Paquete_1;

import java.util.Scanner;

/*
 * Crea un programa que declare dos números enteros.
 * Dale valor (1-100) a los números directamente en el código.
 * Muestra la suma de los dos números en pantalla.
 * Sumale 1 al primer número y restale 1 al segundo número
 * Muestra la multiplicación de los dos números.
 * Guarda en una variable la división del primer numero entre el segundo.
 * Guarda la división anterior con decimales.
 * Muestra el resultado de comparar los dos números.
 */

public class Calculadora {

	private static Scanner teclado = new Scanner(System.in);
	// Hace posible una entrada de usuario

	public static void main(String[] args) {

		System.out.println("Introduce el primer número: ");
		int num1 = Integer.parseInt(teclado.nextLine());
		// Declara la variable y iguala a la entrada

		System.out.println("Introduce el segundo número: ");
		int num2 = Integer.parseInt(teclado.nextLine());
		// Declara la variable y iguala a la entrada

		System.out.println("La suma es: " + (num1 + num2));
		num1++;
		// Sumo uno al numero1
		num2--;
		// Resto uno al numero2

		System.out.println("La multiplicación de ambos números es: " + (num1 * num2));

		int div = num1 / num2;
		// Divide y almacena sin decimales
		double divDecimal = (double) num1 / num2;
		// Divide y almacena con decimales

		System.out.println("El resultado de comparar es: " + (div == divDecimal));
		// Compara los numeros y dicen si son iguales o no

		char caracter = (char) num2;
		System.out.println(caracter);
		// Convierte un entero en caracter correspondiente al ASCII
	}
}
