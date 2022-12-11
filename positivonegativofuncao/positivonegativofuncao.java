package positivonegativofuncao;

public class positivonegativofuncao {

	public static void main(String[] args) {
		
		 char retorno = PositivoNegativo(23);
		
		System.out.println(retorno);

	}
	
	public static char PositivoNegativo (int valor) {
		
		if(valor>0) {
			
			return 'P';
			
		}
		
		else {
			
			
			return 'N';
		}
		
	}

}
