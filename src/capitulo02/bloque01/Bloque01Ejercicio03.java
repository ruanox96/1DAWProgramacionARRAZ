package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio03 {

	public static void main(String[] args) {
		/*
		 *  Repetir el ejercicio 1º de este bloque de ejercicios, pero pidiendo al usuario cinco variables.
		 *  Es decir, se pedirán al usuario cinco variables y se mostrará el mayor valor en pantalla.
		 */
		String str;
		str = JOptionPane.showInputDialog("Introduce un número");
		int num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número");
		int num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número");
		int num3 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número");
		int num4 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número");
		int num5 = Integer.parseInt(str);

		if (num1 > num2) {
			if (num1 > num3) {
				if (num1 > num4) {
					if (num1 > num5) {
						System.out.println("El numero mayor es: " + num1);
					}}}}
		if (num2 > num1) {
			if (num2 > num3) {
				if (num2 > num4) {
					if (num2 > num5) {
						System.out.println("El numero mayor es: " + num2);
						}}}}
		if (num3 > num1) {
			if (num3 > num2) {
				if (num3 > num4) {
					if (num3 > num5) {
						System.out.println("El numero mayor es: " + num3);
						}}}}
		if (num4 > num1) {
			if (num4 > num2) {
				if (num4 > num3) {
					if (num4 > num5){
					System.out.println("El numero mayor es: " + num4);
						}}}}
		if (num5 > num1) {
			if (num5 > num2) {
				if (num5 > num3) {
					if (num5 > num4){
					System.out.println("El numero mayor es: " + num5);
						}}}}
		
		
		
	}

}
