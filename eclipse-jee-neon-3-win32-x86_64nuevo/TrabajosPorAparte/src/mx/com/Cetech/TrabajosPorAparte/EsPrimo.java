package mx.com.Cetech.TrabajosPorAparte;

import java.util.Scanner;

public class EsPrimo {

	public static void main(String[] args) {
		
		int n1=0;
		int primo;

		Scanner sr = new Scanner(System.in);
		System.out.println("Ingres un numero");
		n1 = sr.nextInt();
		System.out.println(n1);
		if(n1 <= 0 && n1 >=100){
			System.out.println("n�mero no validao");
		}
		else{
			if(n1%2 == 1){
				System.out.println("Es primo");
			}else{
				System.out.println("No es primo.");
			}
		}
		

	}

}
