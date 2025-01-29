package CalculadoraSimples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int op = 0;
		
		System.out.println("----------------------------------------");
		System.out.println("              CALCULADORA");
		System.out.println("----------------------------------------");
		
		while (op != 5) {
			
			System.out.printf("1. Adição          2. Subtração \n3. Miltiplicação   4. Divisão\n5. Sair\n\n");
			
			System.out.print("Selecione a operação que deseja fazer: ");
			op = scanner.nextInt();
			
			if (op == 5) {
				break;
			} else if (op <= 0 || op > 5) {
				System.out.printf("\nInsira um valor válido, apenas o número!\n");
				break;
			}
			
			System.out.print("Informe o primeiro valor: ");
			int val1 = scanner.nextInt();
			
			System.out.print("Informe o primeiro valor: ");
			int val2 = scanner.nextInt();
			
			switch (op) {
			case 1:
				System.out.printf("\nO resultado da adição é %d.\n\n", val1+val2);
				break;
			case 2:
				System.out.printf("\nO resultado da subtração é %d.\n\n", val1-val2);
				break;
			case 3:
				System.out.printf("\nO resultado da multiplicação é %d.\n\n", val1*val2);
				break;
			case 4:
				System.out.printf("\nO resultado da divisão é %d.\n\n", val1/val2);
				break;
			}
		}
		
		
	}

}
