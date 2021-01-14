package com.javaFun;

import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {
		// Escribir un programa que tomará un entero y 
		//mostrará en pantalla Fizz si el número es divisible por 3, 
		//Buzz si el número es divisible por 5,
		//FizzBuzz si el número es divisible por 3 y 5 y 
		//para el resto de los casos mostrará el número que se ingresó.
		
		Scanner scan = new Scanner(System.in);
		
		Integer iNumero = 0;// definicion de variable de tipo Integer
		System.out.println("Ingrese un numero Entero");//imprimiendo por pantalla
		iNumero = scan.nextInt(); //almacenando lo ingresado por teclado
		fizzBuzz(iNumero);//llamado a la funcion
	

	}
	
	// funcion , que no retorna nada y que recibe un parametro de tipo integer
	public static void fizzBuzz (Integer iNumero) {
		
		if(iNumero % 3 == 0 && iNumero % 5 == 0) {
			System.out.println("FizzBuzz");
		}else if (iNumero % 3 == 0) {
			System.out.println("Fizz");
		}else if (iNumero % 5 == 0) {
			System.out.println("Buzz");
		}else {
			System.out.println(iNumero);
		}
		
	} 

}
