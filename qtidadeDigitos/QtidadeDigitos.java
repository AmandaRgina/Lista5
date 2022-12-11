package qtidadeDigitos;

import java.util.Scanner;

public class QtidadeDigitos {

	public static void main(String[] args) {
		  quantidadeDigitos();
	       
	        
    }
    
    public static void quantidadeDigitos(){
    
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um numero ");
    int numero;
    numero = teclado.nextInt(); 
    teclado.close();       
    String quantidadeNumeros = Integer.toString(numero);
    System.out.println(quantidadeNumeros.length());
        
}
	}


