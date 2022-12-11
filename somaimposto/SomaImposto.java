package somaimposto;

import java.util.Scanner;

public class SomaImposto {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o custo da peça: ");
		
		float custo = input.nextFloat();
		
		float valorTotal = somaImposto(0,custo);
		
		System.out.println("O valor Total é: "  + valorTotal);
		
		input.close();

	}
	
	
	
	
	public static float somaImposto(float taxaImposto, float custo) {
		
	 taxaImposto = (float) (custo*0.15);	
	 
	 return taxaImposto + custo;
		
	}

}
