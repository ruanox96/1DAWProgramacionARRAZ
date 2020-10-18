package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio05 {

	public static void main(String[] args) {
		/*
		 *  Pedir al usuario cinco números, e imprimir posteriormente el mayor valor introducido y el menor valor introducido.
		 */
		
		String str = JOptionPane.showInputDialog("Introduce un número");
		int num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número");
		int num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número");
		int num3 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número");
		int num4 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número");
		int num5 = Integer.parseInt(str);

		//Comprobamos el mayor
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
		
		
		//Comprobamos el menor
		
		if (num1 < num2) {
			if (num1 < num3) {
				if (num1 < num4) {
					if (num1 < num5) {
						System.out.println("El numero menor es: " + num1);
					}}}}
		if (num2 < num1) {
			if (num2 < num3) {
				if (num2 < num4) {
					if (num2 < num5) {
						System.out.println("El numero menor es: " + num2);
						}}}}
		if (num3 < num1) {
			if (num3 < num2) {
				if (num3 < num4) {
					if (num3 < num5) {
						System.out.println("El numero menor es: " + num3);
						}}}}
		if (num4 < num1) {
			if (num4 < num2) {
				if (num4 < num3) {
					if (num4 < num5){
					System.out.println("El numero menor es: " + num4);
						}}}}
		if (num5 < num1) {
			if (num5 < num2) {
				if (num5 < num3) {
					if (num5 < num4){
					System.out.println("El numero menor es: " + num5);
						}}}}

	}

}
