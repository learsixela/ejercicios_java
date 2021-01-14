package com.javaFun;

import java.lang.Math;

public class Pitagoras {
	
	// void -> no retorna nada, solo ejecuta, no recibe parametros
	public void calcular() {
		
	}
	// void -> no retorna nada, solo ejecuta, recibe 1 parametros de tipo int
	public void calcular2(int numero1) {
		if(numero1 > 0) {
			System.out.println("Es mayor a cero");
		}
	}
	
	//debe retornar un valor de tipo int, no recibe parametros 
	public double calcular3() {
		double four = 4.0;
		//Invocando el método estático sqrt de la clase. saca la raiz cuadrada
		double squareRoot = Math.sqrt(four); // 2.0
		//elevar al cuadrado
		double alcuadrado = Math.pow(four, 2);//16
		
		return alcuadrado;
	}
	
	//debe retornar un valor de tipo int, recibe parametros de tipo int
	public int calcular4(int numero2) {
		
		return numero2;
	}
	
	
    public double calcularteHypotenusa(int catetoA, int catetoB) {
        //La hipotenusa es el lado opuesto del ángulo recto.
        //Calcular el valor de c dados los valores catetoA y catetoB
    
    	double hypotenusa =  Math.sqrt( Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		
    	return hypotenusa;
    }

}
