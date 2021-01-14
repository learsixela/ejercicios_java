package com.javaFun.coding;

import java.util.Arrays;

public class Primer_programa {
/*	public static void main(String[] args) {
		int[] nums = {23,234,2345,-23,42};
		 int[] arreglo = {1,2,3,4,5,6,7,8,9,0};
		 System.out.println(mayorMenorProm(nums));
		System.out.println(mayorMenorProm(arreglo));	
	}
*/
	public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,0};
        int[] arreglo2 = {1,2,3,4,-5,-6,7,8,9,0};
        int[] nuevoarreglo;

    
        nuevoarreglo = mayorMenorProm(arreglo);
        System.out.println(Arrays.toString(nuevoarreglo));
	}
	
	public static int[] mayorMenorProm(int array[])
    {
        int suma = 0, mayor = 0, menor = array[0];
        int [] newarreglo = new int[3];

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < menor)
            {
                menor = array[i];
            }
            if(array[i] > mayor)
            {
                mayor = array[i];
            }
            suma += array[i];
        }

        newarreglo[0] = mayor;
        newarreglo[1] = menor;
        newarreglo[2] = suma / (array.length +1);

        return newarreglo;
    }

}