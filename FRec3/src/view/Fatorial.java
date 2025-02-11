package view;

import controller.RecursivaFatorial;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		int num, res;
		
		RecursivaFatorial rec = new RecursivaFatorial();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor para a função recursiva: ");
		num = scanner.nextInt();
		
		res = rec.Fatorial(num);
		
		System.out.println("Fatorial: " + res);
		
		scanner.close();
		
	}

}
