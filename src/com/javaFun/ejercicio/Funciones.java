package com.javaFun.ejercicio;

import java.util.ArrayList;
import java.util.Collections;

public class Funciones {

	public ArrayList<String> mesclarArreglo(String nombre){
		ArrayList<String> nuevaLista = new ArrayList<String>();
		nuevaLista.add("Isra");
		nuevaLista.add("Alexis");
		nuevaLista.add("Palma");
		nuevaLista.add("Quezada");
		
		Collections.sort(nuevaLista);//ordenar
		Collections.shuffle(nuevaLista);//desordenar
		
		for(String variable : nuevaLista ) {
			System.out.println(variable);
			if(variable.length() > 5) {
				
			}
		}
		
		for(int i=0;i< nuevaLista.size();i++ ) {
			//ArrayList.get(posicion)-> accedemos al elemento
			String variable = nuevaLista.get(i);
			
			//ArrayList.set(posicion,nuevo_valor) -> modificar el elemento
			nuevaLista.set(0,"Israel");
			
			//eliminar solo un elemento (se puede eliminar cualquier elemento)
			nuevaLista.remove(0);
			
			//eliminar los elementos del arrayList
			//nuevaLista.clear();	
		
		}
		
		return nuevaLista;
		
	}
}
