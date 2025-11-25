package Practica_Evaluable;

import java.util.Scanner;

/*
 *Exito de un proyecto por teclado ((ENTRADAASSS)) -tendremos presupuesto en euros (>0), coste del proyecto en euros (>0 y <presupuesto) y tiempo en meses (>0)-
 *si algun dato es incorrecto no volver a pedirlo, luego tendríamos el iva (constante) y coste real (coste +iva), si >presupuesto ((SALIDAA)) -mostrar "El proyecto no es viable, no cubre los costes reales)- y acabará.
 *si es viable calcular beneficio mensual (presupuesto - coste real) / tiempo, si beneficio mensual es <1000 (((SALIDAAS)))- "Piensatelo, no ganarás mucho"
 * si >=1000 y <2000 "No está mal adelante", si >=2000 y <5000 "Buen negocio" y si >5000 "¡Que pelotazo!"-
 */

public class Practica_1 {

	private static Scanner teclado = new Scanner(System.in);

	private static final Double IVA = 0.21;
	private static final Integer LIMITE_DUDA = 1000;
	private static final Integer LIMITE_BUENO = 2000;
	private static final Integer LIMITE_PELOTAZO = 5000;

	// Si un dia llega mi cliente y dice que el con 2000 euros le parece que no es
	// muy rentable se cambia facil

	public static void main(String[] args) {

		double presupuesto;
		double costeProyecto;
		int tiempo;

		System.out.println("Bienveneido al simulador de viabilidad de proyectos:");

		// Empieza a pedir y datos y comprobar que sean correctos
		do {
			System.out.println("Introduzca el valor del presupuesto del proyecto para el cliente:");
			presupuesto = Double.parseDouble(teclado.nextLine());
			if (presupuesto <= 0) {
				System.out.println("Debe ser mayor que 0, vuelva a introducirlo:");
			}
		} while (presupuesto <= 0);

		do {
			System.out.println("Introduzca el coste del proyecto:");
			costeProyecto = Double.parseDouble(teclado.nextLine());
			if (costeProyecto > presupuesto || costeProyecto <= 0) {
				System.out.println("Debe ser mayor que 0 y menor que el presupuesto, vuelva a introducirlo:");
			}
		} while (costeProyecto > presupuesto || costeProyecto <= 0);

		do {
			System.out.println("Introduzca cuanto tiempo tardará en desarrollar el programa (en meses):");
			tiempo = Integer.parseInt(teclado.nextLine());
			if (tiempo <= 0) {
				System.out.println("Debe ser mayor que 0, vuelva a introducirlo:");
			}
		} while (tiempo <= 0);

		// Crea el coste real a partir de esos datos para verificar si es rentable
		double costeReal = costeProyecto + (costeProyecto * IVA);

		// Comprueba el presupuesto con el coste real, y si es mayor el coste termina el
		// programa
		if (costeReal >= presupuesto) {
			System.out.println("El proyecto no es viable, no cubre los costes reales.");
		} else {

			// Si es rentable ya si guarda cuantos beneficios tenemos, antes no tenia
			// sentido guardarlo
			double beneficioMensual = (double) ((presupuesto - costeReal) / tiempo);

			// Se hacen las comprobaciones de que tan rentable es mostrando el
			// correspondiente mensaje
			if (beneficioMensual < LIMITE_DUDA) {
				System.out.println("Piensatelo, no ganarás mucho.");
			} else if ((beneficioMensual >= LIMITE_DUDA) && (beneficioMensual < LIMITE_BUENO)) {
				System.out.println("No está mal, adelante.");
			} else if ((beneficioMensual >= LIMITE_BUENO) && (beneficioMensual < LIMITE_PELOTAZO)) {
				System.out.println("Buen negocio.");
			} else {
				System.out.println("¡QUE PELOTAZO!");
			}
		}
	}
}
