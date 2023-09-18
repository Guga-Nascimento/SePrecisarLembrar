package triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AreaTriangulo x,y;
		x = new AreaTriangulo();
		y = new AreaTriangulo();
		
		System.out.println("Entre com a medidas do triangulo X ");
		x.setBase(sc.nextDouble());
		System.out.println("Insera a proxima medida");
		x.setLadoA(sc.nextDouble());
		System.out.println("Insera a proxima medida");
		x.setLadoB(sc.nextDouble());	
		
		System.out.println("Entre com a medidas do triangulo Y ");
		y.setBase(sc.nextDouble());
		System.out.println("Insera a proxima medida");
		y.setLadoA(sc.nextDouble());
		System.out.println("Insera a proxima medida");
		y.setLadoB(sc.nextDouble());			
		
		//calcularArea tem a formula RAIZQUADRADA.
		if(x.calcularArea() < y.calcularArea()) {
			System.out.println("O triângulo Y é maior " + String.format("%.3f ",y.calcularArea()));
			System.out.println("area X "+ String.format("%.3f ",x.calcularArea()));
			
		}else if(x.calcularArea() > y.calcularArea()) {
			System.out.println("O triângulo X é maior"+ String.format("%.3f",x.calcularArea()));
			System.out.println("area Y "+ String.format("%.3f ",y.calcularArea()));
		}else {
			System.out.println("Os triângulos são do mesmo tamanho");
		}		
		sc.close();
	}
}

/**
 * Ficou bastante claro o uso dos gets e sets que fiz com facilidade migrando um programa que tinha mais de 6
 * variáveis para um que usa a classe AreaTriangulo com apenas 2 variáveis x e y antes tinhamos baseX ladoAdeX 
 * ladoBdeX e igualmente com y. 
 * 
 * Ficou claro também como usar a formula correta para obter a raiz quadrada em JAVA.
 * 
 * Ficou claro também como criar um metodo retornando um double e como chama-lo e quando ele usa apenas os
 * parametros que ja estao na classe não precisa adicionar um argumento para o proprio.
 * */
